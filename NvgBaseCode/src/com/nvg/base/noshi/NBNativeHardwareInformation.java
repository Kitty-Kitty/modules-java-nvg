/**
 * @title : NBNativeHardwareInformation.java
 * @package : com.nvg.base.noshi
 * @discription : TODO在此输入一句话描述此文件的作用
 * @author : fangzhenmu
 * @created : Sep 29, 20163:12:30 PM
 * @version : V1.0  
 * tags
 * see_to_target
 */
package com.nvg.base.noshi;

import java.io.File;

import com.nvg.base.core.NvgBaseCore;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @title : NBNativeHardwareInformation.java
 * @description : TODO(用一句话描述该类型的作用)
 * @author : fangzhenmu
 * @created : Sep 29, 20167:56:40 PM
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NBNativeHardwareInformation extends NvgBaseCore {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>system information</p>
	 * <!-- end-UML-doc -->
	 * @fields si: TODO(@author : fangzhenmu)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private SystemInfo si = new SystemInfo();

	/** 
	 * @author : fangzhenmu
	 * @created : Sep 29, 20167:56:40 PM
	 * @return : si
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SystemInfo getSi() {
		// begin-user-code
		return si;
		// end-user-code
	}

	/** 
	 * @author : fangzhenmu
	 * @created : Sep 29, 20167:56:40 PM
	 * @param : si the si to set 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setSi(SystemInfo si) {
		// begin-user-code
		this.si = si;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>get current memoty  load of native hardware information</p>
	 * <!-- end-UML-doc -->
	 * @discription : TODO在此输入一句话描述作用
	 * @author : fangzhenmu
	 * @created : Sep 29, 20167:56:40 PM
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public double getNativeMemoryUsedLoad() {
		// begin-user-code
		HardwareAbstractionLayer hal = si.getHardware();

		return 1.0 - ((double) hal.getMemory().getAvailable() / (double) (hal
				.getMemory().getTotal()));
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>get  string insformtion of operation system</p>
	 * <!-- end-UML-doc -->
	 * @discription : TODO在此输入一句话描述作用
	 * @author : fangzhenmu
	 * @created : Sep 29, 20167:56:40 PM
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getOperatingSystemInformation() {
		// begin-user-code
		OperatingSystem os = si.getOperatingSystem();
		return os.toString();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>get current cpu load of native hardware information</p>
	 * <!-- end-UML-doc -->
	 * @discription : TODO在此输入一句话描述作用
	 * @author : fangzhenmu
	 * @created : Sep 29, 20167:56:40 PM
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public double getNativeCpuUsedLoad() {
		// begin-user-code

		double retCpuLoad = 0.0;
		CentralProcessor p = si.getHardware().getProcessor();

		/*
		 * get all Processor Cpu load
		 */
		//		for(double tmpLoad : p.getProcessorCpuLoadBetweenTicks()) {
		//			retCpuLoad += tmpLoad;
		//		}
		try {
			Thread.sleep(NBNativeHardwareConst.NB_NATIVE_HARDWARE_CONST_CPU_LOAD_INTERVAL);
			retCpuLoad = p.getSystemCpuLoad();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retCpuLoad;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>get current disk  load of native hardware information</p>
	 * <!-- end-UML-doc -->
	 * @discription : TODO在此输入一句话描述作用
	 * @author : fangzhenmu
	 * @created : Sep 29, 20167:56:40 PM
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public double getNativeDiskUsedLoad() {
		// begin-user-code
		long tmpTotalSpace = 0;
		long tmpTotalFreeSpace = 0;
		double retLoad = 0.5;

		File[] rootfs = File.listRoots();
		for (File file : rootfs) {
			tmpTotalFreeSpace += file.getFreeSpace();
			tmpTotalSpace += file.getTotalSpace();
		}

		if (tmpTotalSpace > 0 && tmpTotalSpace > tmpTotalFreeSpace) {
			retLoad = (double) (tmpTotalSpace - tmpTotalFreeSpace)
					/ (double) tmpTotalSpace;
		}
		return retLoad;
		// end-user-code
	}
}