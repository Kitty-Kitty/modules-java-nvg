/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgGmpConnector.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.gmp.connector 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 9, 2016 9:30:04 AM 
 * @version: V1.0   
 */
package com.nvg.mina.gmp.connector;

import com.nvg.mina.connector.NvgConnector;
import com.nvg.mina.gmp.decoder.NvgGmpDecoderInformation;
import com.nvg.mina.gmp.decoder.NvgGmpProtocolCodecFactory;
import com.nvg.mina.gmp.decoder.NvgGmpServerIoHandler;
import java.net.SocketAddress;

/** 
 * <!-- begin-UML-doc -->
 * <p>gmp decoder information</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgGmpConnector extends NvgConnector {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: ngdi
	 * @fieldType: NvgGmpDecoderInformation
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private NvgGmpDecoderInformation ngdi = new NvgGmpDecoderInformation();

	/** 
	 * @return the ngdi to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgGmpDecoderInformation getNgdi() {
		// begin-user-code
		return ngdi;
		// end-user-code
	}

	/** 
	 * @param ngdi the ngdi to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setNgdi(NvgGmpDecoderInformation ngdi) {
		// begin-user-code
		this.ngdi = ngdi;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>set handler</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHandler(NvgGmpServerIoHandler handler) {
		// begin-user-code
		super.setHandler(handler);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHandler() {
		// begin-user-code
		NvgGmpServerIoHandler ioHandlerClass = new NvgGmpServerIoHandler();
		this.setHandler(ioHandlerClass);
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
		super.createDatagramConnector();
		super.setProtocolCodecFactory(new NvgGmpProtocolCodecFactory());
		this.setHandler();
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
		super.createSocketConnector();
		super.setProtocolCodecFactory(new NvgGmpProtocolCodecFactory());
		this.setHandler();
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
		super.connect(remoteAddress);
		NvgGmpDecoderInformation.set(this.getSession(), ngdi);
		NvgGmpServerIoHandler.setConnector(this.getSession(), this);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void write(Object message, SocketAddress destination) {
		// begin-user-code
		if (null == this.getSession()) {
			this.connect(destination);
		}
		super.write(message, destination);
		// end-user-code
	}

	/** 
	 * (non Javadoc) 
	 * @Title: setAttribute
	 * @Description: TODO
	 * 
	 * @param key
	 * @param value 
	 * @see NvgConnectorInterface#setAttribute(Object key, Object value) 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setAttribute(java.lang.Object key, java.lang.Object value) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * (non Javadoc) 
	 * @Title: getAttribute
	 * @Description: TODO
	 * 
	 * @param key
	 * @return
	 * @see NvgConnectorInterface#getAttribute(Object key) 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public java.lang.Object getAttribute(java.lang.Object key) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	 * (non Javadoc) 
	 * @Title: removeAttribute
	 * @Description: TODO
	 * 
	 * @param key 
	 * @see NvgConnectorInterface#removeAttribute(Object key) 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void removeAttribute(java.lang.Object key) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * (non Javadoc) 
	 * @Title: read
	 * @Description: TODO
	 * 
	 * @param message 
	 * @see NvgConnectorInterface#read(Object message) 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void read(java.lang.Object message) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}