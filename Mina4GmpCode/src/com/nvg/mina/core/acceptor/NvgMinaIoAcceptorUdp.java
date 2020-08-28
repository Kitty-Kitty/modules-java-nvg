/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaIoAcceptorUdp.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.core.acceptor 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Feb 29, 2016 9:11:29 PM 
 * @version: V1.0   
 */
package com.nvg.mina.core.acceptor;

import org.apache.mina.transport.socket.nio.NioDatagramAcceptor;

import com.nvg.mina.defined.NvgMinaDefinedIoAcceptorType;

/** 
 * <!-- begin-UML-doc -->
 * <p>mina acceptor of udp</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgMinaIoAcceptorUdp extends NvgMinaIoAcceptor {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @Title :NvgMinaIoAcceptorUdp
	 * @Description :TODO  
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgMinaIoAcceptorUdp() {
		// begin-user-code
		super.setIoAcceptor(new NioDatagramAcceptor());
		super.setType(NvgMinaDefinedIoAcceptorType.NVG_MINA_DEFINED_IO_ACCEPTOR_TYPE_UDP);
		// end-user-code
	}
}