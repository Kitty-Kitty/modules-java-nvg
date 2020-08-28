/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaServerLoggerFactory.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.core 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 19, 2016 5:35:03 PM 
 * @version: V1.0   
 */
package com.nvg.mina.core;

import org.slf4j.LoggerFactory;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgMinaServerLoggerFactory {

	/** 
	 * <!-- begin-UML-doc -->
	 * Return&nbsp;a&nbsp;logger&nbsp;named&nbsp;according&nbsp;to&nbsp;the&nbsp;name&nbsp;parameter&nbsp;using&nbsp;the&nbsp;statically<br>bound&nbsp;{@link&nbsp;ILoggerFactory}&nbsp;instance.<br><br>@param&nbsp;name&nbsp;The&nbsp;name&nbsp;of&nbsp;the&nbsp;logger.<br>@return&nbsp;logger
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static NvgMinaServerLogger getLogger(String name) {
		// begin-user-code
		return new NvgMinaServerLogger(LoggerFactory.getLogger(name));
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * Return&nbsp;a&nbsp;logger&nbsp;named&nbsp;corresponding&nbsp;to&nbsp;the&nbsp;class&nbsp;passed&nbsp;as&nbsp;parameter,&nbsp;using<br>the&nbsp;statically&nbsp;bound&nbsp;{@link&nbsp;ILoggerFactory}&nbsp;instance.<br><br><p>In&nbsp;case&nbsp;the&nbsp;the&nbsp;<code>clazz</code>&nbsp;parameter&nbsp;differs&nbsp;from&nbsp;the&nbsp;name&nbsp;of<br>the&nbsp;caller&nbsp;as&nbsp;computed&nbsp;internally&nbsp;by&nbsp;SLF4J,&nbsp;a&nbsp;logger&nbsp;name&nbsp;mismatch&nbsp;warning&nbsp;will&nbsp;be&nbsp;<br>printed&nbsp;but&nbsp;only&nbsp;if&nbsp;the&nbsp;<code>slf4j.detectLoggerNameMismatch</code>&nbsp;system&nbsp;property&nbsp;is&nbsp;<br>set&nbsp;to&nbsp;true.&nbsp;By&nbsp;default,&nbsp;this&nbsp;property&nbsp;is&nbsp;not&nbsp;set&nbsp;and&nbsp;no&nbsp;warnings&nbsp;will&nbsp;be&nbsp;printed<br>even&nbsp;in&nbsp;case&nbsp;of&nbsp;a&nbsp;logger&nbsp;name&nbsp;mismatch.<br><br>@param&nbsp;clazz&nbsp;the&nbsp;returned&nbsp;logger&nbsp;will&nbsp;be&nbsp;named&nbsp;after&nbsp;clazz<br>@return&nbsp;logger<br><br><br>@see&nbsp;<a&nbsp;href="http://www.slf4j.org/codes.html#loggerNameMismatch">Detected&nbsp;logger&nbsp;name&nbsp;mismatch</a>&nbsp;
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static NvgMinaServerLogger getLogger(Class<?> clazz) {
		// begin-user-code
		return new NvgMinaServerLogger(LoggerFactory.getLogger(clazz));
		// end-user-code
	}
}