/**
 * 
 */
package com.nvg.css.system.test;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nvg.css.system.core.CssSystem;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgTestCssSystem {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param args
	 * @throws IOException
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String... args) throws IOException {
		// begin-user-code
		PropertyConfigurator
		.configure("D:/IBM/rationalsdp/workspace/CssCenterCode/src/com/nvg/css/system/test/log4j.properties");
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] {
						"com/nvg/css/system/spring/ApplicationContext.xml",
						"com/nvg/css/system/spring/CssSystemApplicationContext.xml" });
		
		CssSystem cs = (CssSystem) ac.getBean("cssSystem");
		
		
		
		// end-user-code
	}
}