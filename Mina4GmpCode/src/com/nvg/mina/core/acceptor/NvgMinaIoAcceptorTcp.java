/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaIoAcceptorTcp.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.core.acceptor 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Feb 29, 2016 9:11:29 PM 
 * @version: V1.0   
 */
package com.nvg.mina.core.acceptor;

import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import com.nvg.mina.defined.NvgMinaDefinedIoAcceptorType;

/** 
 * <!-- begin-UML-doc -->
 * <p>mina acceptor of tcp</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgMinaIoAcceptorTcp extends NvgMinaIoAcceptor {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @Title :NvgMinaIoAcceptorTcp
	 * @Description :TODO  
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgMinaIoAcceptorTcp() {
		// begin-user-code
		super.setIoAcceptor(new NioSocketAcceptor());
		super.setType(NvgMinaDefinedIoAcceptorType.NVG_MINA_DEFINED_IO_ACCEPTOR_TYPE_TCP);
		// end-user-code
	}
}