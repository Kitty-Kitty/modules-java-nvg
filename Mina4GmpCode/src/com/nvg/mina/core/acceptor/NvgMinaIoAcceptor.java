/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaIoAcceptor.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.core 
 * @Description: TODO
 * @author: Administrator fangzhenmu@novigo.com.cn     
 * @date: Feb 28, 2016 8:49:55 PM 
 * @version: V1.0   
 */
package com.nvg.mina.core.acceptor;

import java.io.IOException;
import java.net.InetSocketAddress;
import org.apache.mina.core.service.IoAcceptor;

import com.nvg.mina.defined.NvgMinaDefinedIoAcceptor;
import com.nvg.mina.defined.NvgMinaDefinedIoAcceptorType;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.logging.LogLevel;
import org.apache.mina.filter.logging.LoggingFilter;
import com.nvg.mina.core.NvgMinaServerIoHandler;
import com.nvg.mina.core.decoder.NvgProtocolCodecFactory;
import com.nvg.mina.util.NvgMinaInstanceFactory;

/** 
 * <!-- begin-UML-doc -->
 * <p>mina acceptor class</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class NvgMinaIoAcceptor implements NvgMinaIoAcceptorInterface {

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>ioAcceptor information</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: ioAcceptor
	 * @fieldType: IoAcceptor
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IoAcceptor ioAcceptor = null;

	/** 
	 * @return the ioAcceptor to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IoAcceptor getIoAcceptor() {
		// begin-user-code
		return ioAcceptor;
		// end-user-code
	}

	/** 
	 * @param ioAcceptor the ioAcceptor to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIoAcceptor(IoAcceptor ioAcceptor) {
		// begin-user-code
		this.ioAcceptor = ioAcceptor;
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
	 * @fieldName: idleTime
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int idleTime = NvgMinaDefinedIoAcceptor.NVG_MINA_DEFINED_IO_ACCEPTOR_IDLE_TIME;

	/** 
	 * @return the idleTime to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getIdleTime() {
		// begin-user-code
		return idleTime;
		// end-user-code
	}

	/** 
	 * @param idleTime the idleTime to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIdleTime(int idleTime) {
		// begin-user-code
		this.idleTime = idleTime;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: readBufferSize
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int readBufferSize = NvgMinaDefinedIoAcceptor.NVG_MINA_DEFINED_IO_ACCEPTOR_READ_BUFFER_SIZE;

	/** 
	 * @return the readBufferSize to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getReadBufferSize() {
		// begin-user-code
		return readBufferSize;
		// end-user-code
	}

	/** 
	 * @param readBufferSize the readBufferSize to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setReadBufferSize(int readBufferSize) {
		// begin-user-code
		this.readBufferSize = readBufferSize;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>ip address</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: ipAddress
	 * @fieldType: String
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String ipAddress = null;

	/** 
	 * @return the ipAddress to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getIpAddress() {
		// begin-user-code
		return ipAddress;
		// end-user-code
	}

	/** 
	 * @param ipAddress the ipAddress to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIpAddress(String ipAddress) {
		// begin-user-code
		this.ipAddress = ipAddress;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>port</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: port
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int port = 0;

	/** 
	 * @return the port to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getPort() {
		// begin-user-code
		return port;
		// end-user-code
	}

	/** 
	 * @param port the port to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPort(int port) {
		// begin-user-code
		this.port = port;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>type of acceptor </p>
	 * <!-- end-UML-doc -->
	 * @fieldName: type
	 * @fieldType: NvgMinaDefinedIoAcceptorType
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private NvgMinaDefinedIoAcceptorType type = NvgMinaDefinedIoAcceptorType.NVG_MINA_DEFINED_IO_ACCEPTOR_TYPE_NONE;

	/** 
	 * @return the type to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgMinaDefinedIoAcceptorType getType() {
		// begin-user-code
		return type;
		// end-user-code
	}

	/** 
	 * @param type the type to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setType(NvgMinaDefinedIoAcceptorType type) {
		// begin-user-code
		this.type = type;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHandler(NvgMinaServerIoHandler ioHandler) {
		// begin-user-code
		this.ioAcceptor.setHandler(ioHandler);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHandler(String ioHandler) {
		// begin-user-code
		NvgMinaServerIoHandler ioHandlerClass = (NvgMinaServerIoHandler) NvgMinaInstanceFactory
				.newInstance(ioHandler);

		if (null == ioHandlerClass) {
			try {
				throw new Exception("get class error.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		this.ioAcceptor.setHandler(ioHandlerClass);
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
		this.ioAcceptor.getFilterChain().addLast("codec",
				new ProtocolCodecFilter(protocolCodecFactory));
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setProtocolCodecFactory(String protocolCodecFactory) {
		// begin-user-code
		NvgProtocolCodecFactory protocolCodecFactoryClass = (NvgProtocolCodecFactory) NvgMinaInstanceFactory
				.newInstance(protocolCodecFactory);

		if (null == protocolCodecFactoryClass) {
			try {
				throw new Exception("get class error.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		this.setProtocolCodecFactory(protocolCodecFactoryClass);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initLoggingFilter() {
		// begin-user-code
		this.loggingFilter.setMessageReceivedLogLevel(LogLevel.DEBUG);
		this.loggingFilter.setMessageSentLogLevel(LogLevel.DEBUG);
		this.loggingFilter.setSessionClosedLogLevel(LogLevel.DEBUG);
		this.loggingFilter.setSessionCreatedLogLevel(LogLevel.DEBUG);
		this.loggingFilter.setSessionIdleLogLevel(LogLevel.DEBUG);
		this.loggingFilter.setSessionOpenedLogLevel(LogLevel.DEBUG);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean bind() {
		// begin-user-code
		try {
			if (!this.ioAcceptor.isActive()) {
				if (this.readBufferSize > 0) {
					this.readBufferSize = NvgMinaDefinedIoAcceptor.NVG_MINA_DEFINED_IO_ACCEPTOR_READ_BUFFER_SIZE;
				}
				this.ioAcceptor.getSessionConfig().setReadBufferSize(
						this.readBufferSize);
				this.initLoggingFilter();
				this.ioAcceptor.getFilterChain().addLast("logging",
						this.loggingFilter);
				if (null == this.getIpAddress()) {
					InetSocketAddress isa = new InetSocketAddress(
							this.getPort());
					this.setIpAddress(isa.getAddress().toString());
					this.ioAcceptor.bind(isa);
				} else {
					this.ioAcceptor.bind(new InetSocketAddress(this
							.getIpAddress(), this.getPort()));
				}
			}
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>unbind acceptor</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean unbind() {
		// begin-user-code
		if (this.ioAcceptor.isActive()) {
			this.ioAcceptor.unbind();
		}
		return true;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String toPrintString() {
		// begin-user-code
		String tmpIoAcceptorType;

		if (NvgMinaDefinedIoAcceptorType.NVG_MINA_DEFINED_IO_ACCEPTOR_TYPE_NONE == this
				.getType()) {
			tmpIoAcceptorType = "NONE";
		} else if (NvgMinaDefinedIoAcceptorType.NVG_MINA_DEFINED_IO_ACCEPTOR_TYPE_UDP == this
				.getType()) {
			tmpIoAcceptorType = "UDP";
		} else if (NvgMinaDefinedIoAcceptorType.NVG_MINA_DEFINED_IO_ACCEPTOR_TYPE_TCP == this
				.getType()) {
			tmpIoAcceptorType = "TCP";
		} else if (NvgMinaDefinedIoAcceptorType.NVG_MINA_DEFINED_IO_ACCEPTOR_TYPE_SERIAL == this
				.getType()) {
			tmpIoAcceptorType = "SERIAL";
		} else {
			tmpIoAcceptorType = "Unknow";
		}
		if (this.getIoAcceptor().isActive()) {
			return String.format("%s IoAcceptor [%s:%d] [binded]",
					tmpIoAcceptorType, this.getIpAddress(), this.getPort());
		} else {
			return String.format("%s IoAcceptor [%s:%d] [unbind]",
					tmpIoAcceptorType, this.getIpAddress(), this.getPort());
		}
		// end-user-code
	}
}