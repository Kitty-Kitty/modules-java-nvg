/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgLog.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.test.log 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 16, 2016 5:03:32 PM 
 * @version: V1.0   
 */
package com.nvg.mina.test.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class NvgLog {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: logger
	 * @fieldType: Logger
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static Logger logger;

	/** 
	 * @return the logger to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static Logger getLogger() {
		// begin-user-code
		return logger;
		// end-user-code
	}

	/** 
	 * @param logger the logger to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setLogger(Logger logger) {
		// begin-user-code
		NvgLog.logger = logger;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void debug(String format) {
		// begin-user-code
		if (null == logger) {
			logger = LoggerFactory.getLogger(NvgMinaServerManager.class);
		}
		logger.debug("test {}", format, new IllegalArgumentException(
				"argument exception"));
		// end-user-code
	}
}