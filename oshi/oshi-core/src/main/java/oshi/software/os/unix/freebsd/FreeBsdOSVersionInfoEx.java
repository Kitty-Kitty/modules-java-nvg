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
package oshi.software.os.unix.freebsd;

import oshi.software.common.AbstractOSVersionInfoEx;
import oshi.util.platform.unix.freebsd.BsdSysctlUtil;

public class FreeBsdOSVersionInfoEx extends AbstractOSVersionInfoEx {

    private static final long serialVersionUID = 1L;

    public FreeBsdOSVersionInfoEx() {
        setVersion(BsdSysctlUtil.sysctl("kern.osrelease", ""));
        String versionInfo = BsdSysctlUtil.sysctl("kern.version", "");
        String osType = BsdSysctlUtil.sysctl("kern.ostype", "FreeBSD");
        setBuildNumber(versionInfo.split(":")[0].replace(osType, "").replace(getVersion(), "").trim());
        setCodeName("");
    }
}
