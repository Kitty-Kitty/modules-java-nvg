/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaIoAcceptorInterface.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.core 
 * @Description: TODO
 * @author: Administrator fangzhenmu@novigo.com.cn     
 * @date: Feb 28, 2016 8:49:55 PM 
 * @version: V1.0   
 */
package com.nvg.mina.core.acceptor;

import com.nvg.mina.core.NvgMinaServerIoHandler;
import com.nvg.mina.core.decoder.NvgProtocolCodecFactory;

/** 
 * <!-- begin-UML-doc -->
 * <p>Mina IoAcceptor class interface</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract interface NvgMinaIoAcceptorInterface {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHandler(NvgMinaServerIoHandler ioHandler);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean bind();

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>unbind acceptor</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean unbind();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String toPrintString();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHandler(String ioHandler);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setProtocolCodecFactory(
			NvgProtocolCodecFactory protocolCodecFactory);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setProtocolCodecFactory(String protocolCodecFactory);
}