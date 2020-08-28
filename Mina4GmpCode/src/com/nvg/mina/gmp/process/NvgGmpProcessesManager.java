/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgGmpProcessesManager.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.gmp.process 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 12, 2016 7:04:55 PM 
 * @version: V1.0   
 */
package com.nvg.mina.gmp.process;

import com.nvg.mina.core.NvgMinaServerLogger;
import com.nvg.mina.core.NvgMinaServerLoggerFactory;
import com.nvg.mina.process.NvgProcessesManager;

import java.util.HashMap;
import java.util.Map;
import com.gmp.gmph.GmpGmph;
import com.gmp.gmph.GmpGmphSemh;

import java.util.Map.Entry;

/** 
 * <!-- begin-UML-doc -->
 * <p>Gmp请求管理器</p><p></p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 13, 2016 1:09:41 PM 
 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgGmpProcessesManager extends NvgProcessesManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>semh 请求管理器</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: gmpSemhProcessInstancesMap
	 * @fieldType: NvgGmpProcess
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static Map<Integer, NvgGmpProcess> gmpSemhProcessInstancesMap = new HashMap<Integer, NvgGmpProcess>();

	/** 
	 * @return the gmpSemhProcessInstancesMap to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static Map<Integer, NvgGmpProcess> getGmpSemhProcessInstancesMap() {
		// begin-user-code
		return gmpSemhProcessInstancesMap;
		// end-user-code
	}

	/** 
	 * @param gmpSemhProcessInstancesMap the gmpSemhProcessInstancesMap to set
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGmpSemhProcessInstancesMap(
			Map<Integer, NvgGmpProcess> gmpSemhProcessInstancesMap) {
		// begin-user-code
		NvgGmpProcessesManager.gmpSemhProcessInstancesMap = gmpSemhProcessInstancesMap;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: gmpSemhProcessesMap
	 * @fieldType: String
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static Map<Integer, String> gmpSemhProcessesMap = new HashMap<Integer, String>();

	/** 
	 * @return the gmpSemhProcessesMap to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static Map<Integer, String> getGmpSemhProcessesMap() {
		// begin-user-code
		return gmpSemhProcessesMap;
		// end-user-code
	}

	/** 
	 * @param gmpSemhProcessesMap the gmpSemhProcessesMap to set
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGmpSemhProcessesMap(Map<Integer, String> gmpSemhProcessesMap) {
		// begin-user-code
		NvgGmpProcessesManager.gmpSemhProcessesMap = gmpSemhProcessesMap;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>the logger of this class</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: logger
	 * @fieldType: NvgMinaServerLogger
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static NvgMinaServerLogger logger = NvgMinaServerLoggerFactory
			.getLogger(NvgGmpProcessesManager.class);

	/** 
	 * @return the logger to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static NvgMinaServerLogger getLogger() {
		// begin-user-code
		return logger;
		// end-user-code
	}

	/** 
	 * @param logger the logger to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setLogger(NvgMinaServerLogger logger) {
		// begin-user-code
		NvgGmpProcessesManager.logger = logger;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgGmpProcess createProcessInstance(String className)
			throws Exception {
		// begin-user-code
		if (null == className) {
			return null;
		}
		Class<?> aClass = Class.forName(className);
		if (null == aClass) {
			return null;
		}
		return (NvgGmpProcess) aClass.newInstance();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static NvgGmpProcess getProcess(GmpGmph gmpGmph) {
		// begin-user-code
		if (null == gmpGmph) {
			return null;
		}
		/**
		 * get gmp semh process
		 */
		if (gmpGmph instanceof GmpGmphSemh) {
			GmpGmphSemh gmpGmphSemh = (GmpGmphSemh) gmpGmph;
			return NvgGmpProcessesManager.gmpSemhProcessInstancesMap
					.get(gmpGmphSemh.getCommand());
		}
		return null;
		// end-user-code
	}

	/** 
	 * (non Javadoc) 
	 * @Title: init
	 * @Description: TODO
	 * 
	 * @return
	 * @see NvgProcessesManagerInterface#init() 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean init() {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	 * (non Javadoc) 
	 * @Title: start
	 * @Description: TODO
	 * 
	 * @return
	 * @see NvgProcessesManagerInterface#start() 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean start() {
		// begin-user-code
		NvgGmpProcess gmpProcess = null;

		for (Entry<Integer, String> entry : gmpSemhProcessesMap.entrySet()) {
			try {
				String className = entry.getValue();
				if (null == className) {
					//not found className
					continue;
				}
				gmpProcess = this.createProcessInstance(className);
				if (null == gmpProcess) {
					//create processes instance
					continue;
				}
				gmpSemhProcessInstancesMap.put(entry.getKey(), gmpProcess);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
		// end-user-code
	}

	/** 
	 * (non Javadoc) 
	 * @Title: stop
	 * @Description: TODO
	 * 
	 * @return
	 * @see NvgProcessesManagerInterface#stop() 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean stop() {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}
}