/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgSendGmpRequestProcess.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.gmp.process 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 13, 2016 10:38:36 AM 
 * @version: V1.0   
 */
package com.nvg.mina.gmp.process;

import com.gmp.gmph.GmpGmphSemh;
import com.nvg.mina.gmp.connector.NvgGmpConnector;
import java.net.SocketAddress;

/** 
 * <!-- begin-UML-doc -->
 * <p>send gmp request process</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class NvgSendGmpRequestProcess extends NvgGmpProcess {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: connector
	 * @fieldType: NvgGmpConnector
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private NvgGmpConnector connector = new NvgGmpConnector();

	/** 
	 * @return the connector to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgGmpConnector getConnector() {
		// begin-user-code
		return connector;
		// end-user-code
	}

	/** 
	 * @param connector the connector to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setConnector(NvgGmpConnector connector) {
		// begin-user-code
		this.connector = connector;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void write_semh(int command, Object message,
			SocketAddress destination) {
		// begin-user-code
		GmpGmphSemh semh = new GmpGmphSemh();
		semh.setCommand(command);
		this.connector.getNgdi().setGmpGmph(semh);
		this.write(message, destination);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @Title :NvgSendGmpRequestProcess
	 * @Description :TODO  
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgSendGmpRequestProcess() {
		// begin-user-code
		this.connector.setCallbackHandler(this);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void write(Object message, SocketAddress destination) {
		// begin-user-code
		this.getConnector().write(message, destination);
		// end-user-code
	}
}