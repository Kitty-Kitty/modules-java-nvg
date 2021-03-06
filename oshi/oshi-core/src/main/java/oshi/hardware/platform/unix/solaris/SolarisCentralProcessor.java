/**
 * Oshi (https://github.com/dblock/oshi)
 *
 * Copyright (c) 2010 - 2016 The Oshi Project Team
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Maintainers:
 * dblock[at]dblock[dot]org
 * widdis[at]gmail[dot]com
 * enrico.bianchi[at]gmail[dot]com
 *
 * Contributors:
 * https://github.com/dblock/oshi/graphs/contributors
 */
package oshi.hardware.platform.unix.solaris;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import oshi.hardware.common.AbstractCentralProcessor;
import oshi.jna.platform.linux.Libc;
import oshi.jna.platform.unix.solaris.LibKstat.Kstat;
import oshi.util.ExecutingCommand;
import oshi.util.ParseUtil;
import oshi.util.platform.unix.solaris.KstatUtil;

/**
 * A CPU
 *
 * @author widdis[at]gmail[dot]com
 */
public class SolarisCentralProcessor extends AbstractCentralProcessor {

    private static final long serialVersionUID = 1L;

    private static final Logger LOG = LoggerFactory.getLogger(SolarisCentralProcessor.class);

    private static final Pattern PSRINFO = Pattern.compile(".*physical processor has (\\d+) virtual processors.*");

    /**
     * Create a Processor
     */
    public SolarisCentralProcessor() {
        super();
        // Initialize class variables
        initVars();
        // Initialize tick arrays
        initTicks();

        LOG.debug("Initialized Processor");
    }

    private void initVars() {
        // Get first result
        Kstat ksp = KstatUtil.kstatLookup("cpu_info", -1, null);
        // Set values
        if (ksp != null && KstatUtil.kstatRead(ksp)) {
            setVendor(KstatUtil.kstatDataLookupString(ksp, "vendor_id"));
            setName(KstatUtil.kstatDataLookupString(ksp, "brand"));
            setStepping(KstatUtil.kstatDataLookupString(ksp, "stepping"));
            setModel(KstatUtil.kstatDataLookupString(ksp, "model"));
            setFamily(KstatUtil.kstatDataLookupString(ksp, "family"));
        }
        setCpu64("64".equals(ExecutingCommand.getFirstAnswer("isainfo -b").trim()));
    }

    /**
     * Updates logical and physical processor counts from psrinfo
     */
    @Override
    protected void calculateProcessorCounts() {
        this.logicalProcessorCount = 0;
        this.physicalProcessorCount = 0;
        // Get number of logical processors
        for (String cpu : ExecutingCommand.runNative("psrinfo -pv")) {
            Matcher m = PSRINFO.matcher(cpu.trim());
            if (m.matches()) {
                this.physicalProcessorCount++;
                this.logicalProcessorCount += ParseUtil.parseIntOrDefault(m.group(1), 0);
            }
        }
        if (this.logicalProcessorCount < 1) {
            LOG.error("Couldn't find logical processor count. Assuming 1.");
            this.logicalProcessorCount = 1;
        }
        if (this.physicalProcessorCount < 1) {
            LOG.error("Couldn't find physical processor count. Assuming 1.");
            this.physicalProcessorCount = 1;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized long[] getSystemCpuLoadTicks() {
        long[] ticks = new long[TickType.values().length];
        // Average processor ticks
        long[][] procTicks = getProcessorCpuLoadTicks();
        for (int i = 0; i < ticks.length; i++) {
            for (long[] procTick : procTicks) {
                ticks[i] += procTick[i];
            }
            ticks[i] /= procTicks.length;
        }
        return ticks;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double[] getSystemLoadAverage(int nelem) {
        if (nelem < 1 || nelem > 3) {
            throw new IllegalArgumentException("Must include from one to three elements.");
        }
        double[] average = new double[nelem];
        int retval = Libc.INSTANCE.getloadavg(average, nelem);
        if (retval < nelem) {
            for (int i = Math.max(retval, 0); i < average.length; i++) {
                average[i] = -1d;
            }
        }
        return average;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long[][] getProcessorCpuLoadTicks() {
        long[][] ticks = new long[this.logicalProcessorCount][TickType.values().length];
        int cpu = -1;
        for (Kstat ksp : KstatUtil.kstatLookupAll("cpu", -1, "sys")) {
            // This is a new CPU
            if (++cpu >= ticks.length) {
                // Shouldn't happen
                break;
            }
            if (KstatUtil.kstatRead(ksp)) {
                ticks[cpu][TickType.IDLE.getIndex()] = KstatUtil.kstatDataLookupLong(ksp, "cpu_ticks_idle");
                ticks[cpu][TickType.SYSTEM.getIndex()] = KstatUtil.kstatDataLookupLong(ksp, "cpu_ticks_kernel");
                ticks[cpu][TickType.USER.getIndex()] = KstatUtil.kstatDataLookupLong(ksp, "cpu_ticks_user");
            }
        }
        return ticks;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getSystemUptime() {
        Kstat ksp = KstatUtil.kstatLookup("unix", 0, "system_misc");
        if (ksp == null) {
            return 0L;
        }
        // Snap Time is in nanoseconds; divide for seconds
        return ksp.ks_snaptime / 1000000000L;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSystemSerialNumber() {
        if (this.cpuSerialNumber == null) {
            String marker = "Serial Number:";
            for (String checkLine : ExecutingCommand.runNative("smbios -t SMB_TYPE_SYSTEM")) {
                if (checkLine.contains(marker)) {
                    this.cpuSerialNumber = checkLine.split(marker)[1].trim();
                    break;
                }
            }
            // if that didn't work, try...
            if (this.cpuSerialNumber == null) {
                // If they've installed STB (Sun Explorer) this should work
                this.cpuSerialNumber = ExecutingCommand.getFirstAnswer("sneep");
            }
            // if that didn't work, try...
            if (this.cpuSerialNumber.isEmpty()) {
                marker = "chassis-sn:";
                for (String checkLine : ExecutingCommand.runNative("prtconf -pv")) {
                    if (checkLine.contains(marker)) {
                        String[] temp = checkLine.split(marker)[1].split("'");
                        // Format: '12345' (string)
                        this.cpuSerialNumber = temp.length > 0 ? temp[1] : "";
                        break;
                    }
                }
            }
            if (this.cpuSerialNumber.isEmpty()) {
                this.cpuSerialNumber = "unknown";
            }
        }
        return this.cpuSerialNumber;
    }
}
