/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaServerLogger.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.core 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Feb 28, 2016 12:39:48 PM 
 * @version: V1.0   
 */
package com.nvg.mina.core;

import org.slf4j.Logger;
import org.apache.mina.core.session.IoSession;

/** 
 * <!-- begin-UML-doc -->
 * <p>server logger of mina</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgMinaServerLogger {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: logger
	 * @fieldType: Logger
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Logger logger;

	/** 
	 * @return the logger to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Logger getLogger() {
		// begin-user-code
		return logger;
		// end-user-code
	}

	/** 
	 * @param logger the logger to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLogger(Logger logger) {
		// begin-user-code
		this.logger = logger;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @Title :NvgMinaServerLogger
	 * @Description :TODO 
	 * @param logger 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgMinaServerLogger(Logger logger) {
		// begin-user-code
		this.logger = logger;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static final String format(String format, Object... args) {
		// begin-user-code
		return String.format(format, args);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String sessionFormat(IoSession session, String format) {
		// begin-user-code
		String tmpString = "";
		if (null != session) {
			tmpString = NvgMinaServerLogger.format(
					"remote[%s] -- local[%s] : ", session.getRemoteAddress()
							.toString(), session.getLocalAddress().toString());
		}
		return NvgMinaServerLogger.format("%s%s", tmpString, format);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void error(IoSession session, Throwable t, String format,
			Object... args) {
		// begin-user-code
		if (this.logger.isErrorEnabled()) {
			if (null != t) {
				this.logger.error(
						NvgMinaServerLogger.format(
								this.sessionFormat(session, format), args), t);
			} else {
				this.logger.error(NvgMinaServerLogger.format(
						this.sessionFormat(session, format), args));
			}
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void warn(IoSession session, Throwable t, String format,
			Object... args) {
		// begin-user-code
		if (this.logger.isWarnEnabled()) {
			if (null != t) {
				this.logger.warn(
						NvgMinaServerLogger.format(
								this.sessionFormat(session, format), args), t);
			} else {
				this.logger.warn(NvgMinaServerLogger.format(
						this.sessionFormat(session, format), args));
			}
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void info(String format, Object... args) {
		// begin-user-code
		if (this.logger.isInfoEnabled()) {
			this.logger.info(NvgMinaServerLogger.format(format, args));
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void info(IoSession session, Throwable t, String format,
			Object... args) {
		// begin-user-code
		if (this.logger.isInfoEnabled()) {
			if (null != t) {
				this.logger.info(
						NvgMinaServerLogger.format(
								this.sessionFormat(session, format), args), t);
			} else {
				this.logger.info(NvgMinaServerLogger.format(
						this.sessionFormat(session, format), args));
			}
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void debug(String format, Object... args) {
		// begin-user-code
		if (this.logger.isDebugEnabled()) {
			this.logger.debug(NvgMinaServerLogger.format(format, args));
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void debug(IoSession session, Throwable t, String format,
			Object... args) {
		// begin-user-code
		if (this.logger.isDebugEnabled()) {
			if (null != t) {
				this.logger.debug(
						NvgMinaServerLogger.format(
								this.sessionFormat(session, format), args), t);
			} else {
				this.logger.debug(NvgMinaServerLogger.format(
						this.sessionFormat(session, format), args));
			}
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void trace(String format, Object... args) {
		// begin-user-code
		if (this.logger.isTraceEnabled()) {
			this.logger.trace(NvgMinaServerLogger.format(format, args));
		}
		// end-user-code
	}
}