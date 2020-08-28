/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgLogTest.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.test.log 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 16, 2016 2:49:09 PM 
 * @version: V1.0   
 */
package com.nvg.mina.test.log;

import org.apache.log4j.PropertyConfigurator;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgLogTest {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String[] args) {
		// begin-user-code
		PropertyConfigurator
				.configure("D:/IBM/rationalsdp/workspace/Mina4GmpCode/src/com/nvg/mina/test/log/log4j.properties");
		NvgLogParent nvgLogParent = new NvgLogParent();
		NvgLogParent nvgLogParent2 = new NvgLogParent();
		NvgLogParent2 nvgLogParent3 = new NvgLogParent2();
		nvgLogParent.printf();
		nvgLogParent2.printf();
		nvgLogParent3.printf();

		// end-user-code
	}
}