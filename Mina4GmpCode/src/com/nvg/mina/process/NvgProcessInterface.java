/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgProcessInterface.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.process 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 10, 2016 5:30:17 PM 
 * @version: V1.0   
 */
package com.nvg.mina.process;

import com.nvg.mina.connector.NvgConnector;
import com.nvg.mina.connector.NvgIdleStatus;
import java.net.SocketAddress;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface NvgProcessInterface {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>exception caught</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void exceptionCaught(NvgConnector connector, Throwable throwable);

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>message caught</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void messageReceived(NvgConnector connector, Object message);

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>message sent</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void messageSent(NvgConnector connector, Object message);

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>session closed</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionClosed(NvgConnector connector);

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>session create</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionCreated(NvgConnector connector);

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>session idle</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionIdle(NvgConnector connector, NvgIdleStatus idleStatus);

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>session opened</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionOpened(NvgConnector connector);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void write(Object message, SocketAddress destination);
}