/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaServerManager.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.core 
 * @Description: TODO
 * @author: Administrator fangzhenmu@novigo.com.cn     
 * @date: Feb 28, 2016 8:49:55 PM 
 * @version: V1.0   
 */
package com.nvg.mina.core;

import java.util.ArrayList;
import java.util.List;

import com.nvg.mina.core.acceptor.NvgMinaIoAcceptor;
import com.nvg.mina.process.NvgProcessesManager;

/** 
 * <!-- begin-UML-doc -->
 * <p>mina server manager</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgMinaServerManager {
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
			.getLogger(NvgMinaServerManager.class);

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
		NvgMinaServerManager.logger = logger;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>ioAcceptor list</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: ioAcceptorList
	 * @fieldType: NvgMinaIoAcceptor
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private List<NvgMinaIoAcceptor> ioAcceptorList = new ArrayList<NvgMinaIoAcceptor>();

	/** 
	 * @return the ioAcceptorList to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<NvgMinaIoAcceptor> getIoAcceptorList() {
		// begin-user-code
		return ioAcceptorList;
		// end-user-code
	}

	/** 
	 * @param ioAcceptorList the ioAcceptorList to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIoAcceptorList(List<NvgMinaIoAcceptor> ioAcceptorList) {
		// begin-user-code
		this.ioAcceptorList = ioAcceptorList;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: processesManager
	 * @fieldType: NvgProcessesManager
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private NvgProcessesManager processesManager;

	/** 
	 * @return the processesManager to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgProcessesManager getProcessesManager() {
		// begin-user-code
		return processesManager;
		// end-user-code
	}

	/** 
	 * @param processesManager the processesManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setProcessesManager(NvgProcessesManager processesManager) {
		// begin-user-code
		this.processesManager = processesManager;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean init() {
		// begin-user-code
		return true;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean start() {
		// begin-user-code
		for (int i = 0; i < ioAcceptorList.size(); i++) {
			if (ioAcceptorList.get(i).bind()) {
				logger.info("%s successed!", ioAcceptorList.get(i)
						.toPrintString());
			} else {
				logger.info("%s failed!", ioAcceptorList.get(i).toPrintString());
			}
		}
		return true;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean stop() {
		// begin-user-code
		for (int i = 0; i < ioAcceptorList.size(); i++) {
			if (ioAcceptorList.get(i).unbind()) {
				logger.info("%s successed!", ioAcceptorList.get(i)
						.toPrintString());
			} else {
				logger.info("%s failed!", ioAcceptorList.get(i).toPrintString());
			}
		}
		return true;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>add ioAcceptor</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean add(NvgMinaIoAcceptor ioAcceptor) {
		// begin-user-code
		if (null == ioAcceptor) {
			return false;
		}
		return ioAcceptorList.add(ioAcceptor);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean remove(NvgMinaIoAcceptor ioAcceptor) {
		// begin-user-code
		for (int i = 0; i < ioAcceptorList.size(); i++) {
			if (ioAcceptor == ioAcceptorList.get(i)) {
				ioAcceptorList.remove(i);
				break;
			}
		}
		return true;
		// end-user-code
	}
}