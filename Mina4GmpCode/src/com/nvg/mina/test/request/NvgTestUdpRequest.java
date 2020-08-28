/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgTestUdpRequest.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.test.request 
 * @Description: TODO
 * @author: Administrator fangzhenmu@novigo.com.cn     
 * @date: Mar 23, 2016 9:13:33 PM 
 * @version: V1.0   
 */
package com.nvg.mina.test.request;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.log4j.PropertyConfigurator;

import com.nvg.css.center.gmp.request.beans.base.CssGmpHost;
import com.nvg.mina.gmp.process.NvgSendGmpUdpRequestProcess;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgTestUdpRequest {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String... args) throws IOException {
		// begin-user-code
		PropertyConfigurator
				.configure("D:/IBM/rationalsdp/workspace/Mina4GmpCode/src/com/nvg/mina/test/log/log4j.properties");
		CssGmpHost cgh = new CssGmpHost();
		NvgSendGmpUdpRequestProcess nsgtrq = new NvgSendGmpUdpRequestProcess();
		try {
			nsgtrq.write_semh(10002, cgh, new InetSocketAddress(
					"192.168.1.101", 9132));
		} catch (Exception e) {
			System.out.printf("客户端链接异常...");
			e.printStackTrace();
		}

		// end-user-code
	}
}