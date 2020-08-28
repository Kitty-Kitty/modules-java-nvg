/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgTestMinaSpringServer.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.test.spring 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 5, 2016 10:37:44 AM 
 * @version: V1.0   
 */
package com.nvg.mina.test.spring;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nvg.mina.core.NvgMinaServerManager;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgTestMinaSpringServer {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String... args) throws IOException {
		// begin-user-code
		PropertyConfigurator
				.configure("D:/IBM/rationalsdp/workspace/Mina4GmpCode/src/com/nvg/mina/test/log/log4j.properties");
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] {
						"com/nvg/mina/test/spring/CssCenterProcessApplicationContext.xml",
						"com/nvg/mina/test/spring/NvgMinaServerManagerApplicationContext.xml" });
		NvgMinaServerManager ps = (NvgMinaServerManager) ac
				.getBean("nvgMinaServerManager");

		while (true) {
			try {
				Thread.sleep(24000);
				System.out.println(ps);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// end-user-code
	}
}