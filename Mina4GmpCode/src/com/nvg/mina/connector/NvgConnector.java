/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgConnector.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.connector 
 * @Description: TODO
 * @author: Administrator fangzhenmu@novigo.com.cn     
 * @date: Mar 8, 2016 10:13:04 PM 
 * @version: V1.0   
 */
package com.nvg.mina.connector;

import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.service.IoConnector;
import com.nvg.mina.process.NvgProcess;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.filter.codec.ProtocolCodecFilter;

import java.net.SocketAddress;
import com.nvg.mina.core.decoder.NvgProtocolCodecFactory;
import com.nvg.mina.defined.NvgMinaDefined;

import org.apache.mina.transport.socket.nio.NioDatagramConnector;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class NvgConnector implements NvgConnectorInterface {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: session
	 * @fieldType: IoSession
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IoSession session;

	/** 
	 * @return the session to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IoSession getSession() {
		// begin-user-code
		return session;
		// end-user-code
	}

	/** 
	 * @param session the session to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setSession(IoSession session) {
		// begin-user-code
		session.getRemoteAddress();
		session.getLocalAddress();
		this.session = session;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: connector
	 * @fieldType: IoConnector
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IoConnector connector;

	/** 
	 * @return the connector to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IoConnector getConnector() {
		// begin-user-code
		return connector;
		// end-user-code
	}

	/** 
	 * @param connector the connector to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setConnector(IoConnector connector) {
		// begin-user-code
		this.connector = connector;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>callback handler</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: callbackHandler
	 * @fieldType: NvgProcess
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private NvgProcess callbackHandler;

	/** 
	 * @return the callbackHandler to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgProcess getCallbackHandler() {
		// begin-user-code
		return callbackHandler;
		// end-user-code
	}

	/** 
	 * @param callbackHandler the callbackHandler to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCallbackHandler(NvgProcess callbackHandler) {
		// begin-user-code
		this.callbackHandler = callbackHandler;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>logging filter</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: loggingFilter
	 * @fieldType: LoggingFilter
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private LoggingFilter loggingFilter = new LoggingFilter();

	/** 
	 * @return the loggingFilter to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public LoggingFilter getLoggingFilter() {
		// begin-user-code
		return loggingFilter;
		// end-user-code
	}

	/** 
	 * @param loggingFilter the loggingFilter to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLoggingFilter(LoggingFilter loggingFilter) {
		// begin-user-code
		this.loggingFilter = loggingFilter;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>idle time</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: connectTimeoutMillis
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int connectTimeoutMillis = NvgMinaDefined.NVG_MINA_DEFINED_CONNECTOR_TIMEOUT;

	/** 
	 * @return the connectTimeoutMillis to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getConnectTimeoutMillis() {
		// begin-user-code
		return connectTimeoutMillis;
		// end-user-code
	}

	/** 
	 * @param connectTimeoutMillis the connectTimeoutMillis to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setConnectTimeoutMillis(int connectTimeoutMillis) {
		// begin-user-code
		this.connectTimeoutMillis = connectTimeoutMillis;
		if (null != this.connector) {
			this.connector.setConnectTimeoutMillis(this.connectTimeoutMillis);
		}

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>create a udp connector</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void createDatagramConnector() {
		// begin-user-code
		this.setConnector(new NioDatagramConnector());
		this.connector.setConnectTimeoutMillis(this.connectTimeoutMillis);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>set handler</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHandler(IoHandler handler) {
		// begin-user-code
		if (null == this.getConnector()) {
			throw new NullPointerException("IoConnector is null");
		}

		if (null == handler) {
			throw new IllegalArgumentException("handler is null");
		}

		this.getConnector().setHandler(handler);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>create tcp connector</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void createSocketConnector() {
		// begin-user-code
		this.setConnector(new NioSocketConnector());
		this.connector.setConnectTimeoutMillis(this.connectTimeoutMillis);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>connect remote address by tcp of udp</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void connect(SocketAddress remoteAddress) {
		// begin-user-code
		/**
		 * connect remote address
		 */
		this.connector.getFilterChain().addLast("logging", this.loggingFilter);
		ConnectFuture connFuture = this.getConnector().connect(remoteAddress);
		connFuture.awaitUninterruptibly();
		this.setSession(connFuture.getSession());
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void close(boolean immediately) {
		// begin-user-code
		this.session.close(immediately);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SocketAddress getRemoteAddress() {
		// begin-user-code
		return this.session.getRemoteAddress();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public SocketAddress getLocalAddress() {
		// begin-user-code
		return this.session.getLocalAddress();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setProtocolCodecFactory(
			NvgProtocolCodecFactory protocolCodecFactory) {
		// begin-user-code
		this.connector.getFilterChain().addLast("codec",
				new ProtocolCodecFilter(protocolCodecFactory));
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void write(Object message) {
		// begin-user-code
		if (null == this.session) {
			throw new IllegalArgumentException(
					"session is null. try to connect");
		}

		this.session.write(message);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void write(Object message, SocketAddress destination) {
		// begin-user-code
		if (null == this.session) {
			//			throw new IllegalArgumentException(
			//					"session is null. try to connect");
			this.connect(destination);
		}

		this.session.write(message);
		// end-user-code
	}
}