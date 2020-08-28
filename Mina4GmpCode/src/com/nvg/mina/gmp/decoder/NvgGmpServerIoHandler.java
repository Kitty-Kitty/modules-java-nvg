/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgGmpServerIoHandler.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.gmp.decoder 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 9, 2016 9:30:04 AM 
 * @version: V1.0   
 */
package com.nvg.mina.gmp.decoder;

import com.gmf.core.deserializer.base.GmfDeserializerConfigure;
import com.gmp.gmph.GmpGmph;
import com.nvg.mina.connector.NvgIdleStatus;
import com.nvg.mina.core.NvgMinaServerIoHandler;
import com.nvg.mina.core.NvgMinaServerLogger;
import com.nvg.mina.core.NvgMinaServerLoggerFactory;

import com.nvg.mina.defined.NvgMinaDefined;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IdleStatus;
import com.nvg.mina.gmp.connector.NvgGmpConnector;
import com.nvg.mina.gmp.process.NvgGmpProcess;
import com.nvg.mina.gmp.process.NvgGmpProcessesManager;

/** 
 * <!-- begin-UML-doc -->
 * <p>gmp server io handler</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgGmpServerIoHandler extends NvgMinaServerIoHandler {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>the logger of this class</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: logger
	 * @fieldType: NvgMinaServerLogger
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static NvgMinaServerLogger logger = NvgMinaServerLoggerFactory
			.getLogger(NvgGmpServerIoHandler.class);

	/** 
	 * @return the logger to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static NvgMinaServerLogger getLogger() {
		// begin-user-code
		return logger;
		// end-user-code
	}

	/** 
	 * @param logger the logger to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setLogger(NvgMinaServerLogger logger) {
		// begin-user-code
		NvgGmpServerIoHandler.logger = logger;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>exception caught</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void exceptionCaught(IoSession session, Throwable throwable)
			throws Exception {
		// begin-user-code
		NvgGmpConnector connector = this.getConnector(session);
		NvgGmpProcess process = (NvgGmpProcess) connector.getCallbackHandler();
		/**
		 * process exception caught information
		 */
		if (null == process) {
			//print exception information
			logger.error(session, throwable,
					"session exception and not found process.");
		} else {
			process.exceptionCaught(connector, throwable);
		}
		System.out.println(throwable);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		// begin-user-code
		NvgGmpConnector connector = this.getConnector(session);
		NvgGmpProcess process = (NvgGmpProcess) connector.getCallbackHandler();
		NvgGmpDecoderInformation ngdi = connector.getNgdi();
		GmpGmph gmpGmph = null;
		/**
		 * process message received
		 */
		if (null == ngdi) {
			//ngdi is null error
			logger.error(session, null, "ngdi is null error.");
			return;
		}
		/**
		 * get gmp gmph
		 */
		gmpGmph = ngdi.getGmpGmph();
		if (null == gmpGmph) {
			//gmp gmph is null error
			logger.error(session, null, "gmp gmph is null error.");
			return;
		}
		/**
		 * get process
		 */
		if (null == process) {
			//get process by command
			process = NvgGmpProcessesManager.getProcess(gmpGmph);
			if (null == process) {
				//not found semh process
				logger.error(session, null, "not found process. gmph %s",
						gmpGmph.toString());
				return;
			}
			//return message received
		}
		/**
		 * deserializer gmf data
		 */
		if (null == process.getGmpBeanName()) {
			//process message type is null, return byte[]
			logger.warn(session, null, "get %s. not found bean name",
					gmpGmph.toPrintString());
			process.messageReceived(connector, message);
		} else {
			//deserializer gmp data
			byte[] bytes = (byte[]) message;
			GmfDeserializerConfigure gdc = new GmfDeserializerConfigure();
			//gdc.setPrintLogLevel(GmfErrorDefined.GMF_ERROR_NONE);
			Object gmpBean = gdc.getObject(bytes, ngdi.getGmpGmph().length(),
					process.getGmpBeanClazz());
			if (null == gmpBean) {
				logger.error(session, null,
						"decode bean[%s] data error.\r\n%s\r\n%s", process
								.getGmpBeanName(), gmpGmph.toPrintString(), gdc
								.getGmf().toPrintAllPrittyString());
				return;
			}
			logger.info(session, null, "receive gmp data.\r\n%s\r\n%s", gmpGmph
					.toPrintString(), gdc.getGmf().toPrintAllPrittyString());
			process.messageReceived(connector, gmpBean);
		}
		NvgGmpDecoderInformation.set(session, null);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void messageSent(IoSession session, Object message) throws Exception {
		// begin-user-code
		NvgGmpConnector connector = this.getConnector(session);
		NvgGmpProcess process = (NvgGmpProcess) connector.getCallbackHandler();
		/**
		 * process message sent
		 */
		if (null == process) {
			//print exception information
			logger.debug(session, null,
					"session message sent but not found process.");
		} else {
			process.messageSent(connector, message);
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionClosed(IoSession session) throws Exception {
		// begin-user-code
		NvgGmpConnector connector = this.getConnector(session);
		NvgGmpProcess process = (NvgGmpProcess) connector.getCallbackHandler();
		/**
		 * process session closed
		 */
		if (null == process) {
			//print exception information
			logger.debug(session, null, "session closed but not found process.");
		} else {
			process.sessionClosed(connector);
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionCreated(IoSession session) throws Exception {
		// begin-user-code
		NvgGmpConnector connector = this.getConnector(session);
		NvgGmpProcess process = (NvgGmpProcess) connector.getCallbackHandler();
		/**
		 * process session created
		 */
		if (null == process) {
			//print exception information
			logger.debug(session, null,
					"session created but not found process.");
		} else {
			process.sessionCreated(connector);
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		// begin-user-code
		NvgGmpConnector connector = this.getConnector(session);
		NvgGmpProcess process = (NvgGmpProcess) connector.getCallbackHandler();
		/**
		 * process session idle
		 */
		if (null == process) {
			session.close(false);
			logger.warn(session, null,
					"time out. not found process function and session close now.");
			//print exception information
		} else {
			NvgIdleStatus nvgIdleStatus = new NvgIdleStatus();
			nvgIdleStatus.setIdleStatus(status);
			process.sessionIdle(connector, nvgIdleStatus);
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionOpened(IoSession session) throws Exception {
		// begin-user-code
		NvgGmpConnector connector = this.getConnector(session);
		NvgGmpProcess process = (NvgGmpProcess) connector.getCallbackHandler();
		/**
		 * process session opened
		 */
		if (null == process) {
			logger.debug(session, null, "session opened but not found process.");
		} else {
			process.sessionOpened(connector);
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>当前的IoSession信息</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private NvgGmpConnector getConnector(IoSession session) {
		// begin-user-code
		NvgGmpConnector connector;
		NvgGmpDecoderInformation ngdi = null;
		/**
		 * get connector object
		 */
		connector = (NvgGmpConnector) session
				.getAttribute(NvgMinaDefined.NVG_MINA_DEFINED_CONNECTOR);
		if (null == connector) {
			connector = new NvgGmpConnector();
			session.setAttribute(NvgMinaDefined.NVG_MINA_DEFINED_CONNECTOR,
					connector);
			/**
			 * set session information to connector
			 */
			connector.setSession(session);
		}
		/**
		 * get decoder information
		 */
		ngdi = NvgGmpDecoderInformation.get(session);
		if (null == ngdi) {
			/**
			 * if null,create new decoder information
			 */
			ngdi = new NvgGmpDecoderInformation();
			NvgGmpDecoderInformation.set(session, ngdi);
		}
		connector.setNgdi(ngdi);
		return connector;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static boolean setConnector(IoSession session,
			NvgGmpConnector connector) {
		// begin-user-code
		session.setAttribute(NvgMinaDefined.NVG_MINA_DEFINED_CONNECTOR,
				connector);
		return true;
		// end-user-code
	}
}