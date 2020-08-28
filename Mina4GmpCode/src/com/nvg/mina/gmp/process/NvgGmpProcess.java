/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgGmpProcess.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.gmp.process 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 9, 2016 4:42:13 PM 
 * @version: V1.0   
 */
package com.nvg.mina.gmp.process;

import com.nvg.mina.process.NvgProcess;
import com.nvg.mina.connector.NvgConnector;
import com.nvg.mina.connector.NvgIdleStatus;

/** 
 * <!-- begin-UML-doc -->
 * <p>set receive message type</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class NvgGmpProcess extends NvgProcess {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>set receive message type</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: gmpBeanName
	 * @fieldType: String
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String gmpBeanName;

	/** 
	 * @return the gmpBeanName to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getGmpBeanName() {
		// begin-user-code
		return gmpBeanName;
		// end-user-code
	}

	/** 
	 * @param gmpBeanName the gmpBeanName to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGmpBeanName(String gmpBeanName) {
		// begin-user-code
		if (null == gmpBeanName) {
			throw new IllegalArgumentException("bean name is null");
		}
		this.gmpBeanName = gmpBeanName;
		try {
			this.gmpBeanClazz = Class.forName(gmpBeanName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: gmpBeanClazz
	 * @fieldType: Class
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Class<?> gmpBeanClazz;

	/** 
	 * @return the gmpBeanClazz to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Class<?> getGmpBeanClazz() {
		// begin-user-code
		return gmpBeanClazz;
		// end-user-code
	}

	/** 
	 * @param gmpBeanClazz the gmpBeanClazz to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGmpBeanClazz(Class<?> gmpBeanClazz) {
		// begin-user-code
		this.gmpBeanClazz = gmpBeanClazz;
		this.gmpBeanName = gmpBeanClazz.getName();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>exception caught</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void exceptionCaught(NvgConnector connector, Throwable throwable) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>message caught</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void messageReceived(NvgConnector connector, Object message) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>message sent</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void messageSent(NvgConnector connector, Object message) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>session closed</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionClosed(NvgConnector connector) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>session create</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionCreated(NvgConnector connector) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>session idle</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionIdle(NvgConnector connector, NvgIdleStatus idleStatus) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>session opened</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionOpened(NvgConnector connector) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}