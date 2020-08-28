/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpHost.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.base 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:46:34 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.base;

import java.util.List;
import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <p>host node</p>
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpHost {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>host id</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String ID;

	/** 
	 * @return the ID
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getID() {
		// begin-user-code
		return ID;
		// end-user-code
	}

	/** 
	 * @param ID the ID to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setID(String ID) {
		// begin-user-code
		this.ID = ID;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>device name</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String name;

	/** 
	 * @return the name
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getName() {
		// begin-user-code
		return name;
		// end-user-code
	}

	/** 
	 * @param name the name to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setName(String name) {
		// begin-user-code
		this.name = name;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>device version</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String version;

	/** 
	 * @return the version
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getVersion() {
		// begin-user-code
		return version;
		// end-user-code
	}

	/** 
	 * @param version the version to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setVersion(String version) {
		// begin-user-code
		this.version = version;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>device type</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte type;

	/** 
	 * @return the type
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getType() {
		// begin-user-code
		return type;
		// end-user-code
	}

	/** 
	 * @param type the type to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setType(byte type) {
		// begin-user-code
		this.type = type;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>device status</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int status;

	/** 
	 * @return the status
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getStatus() {
		// begin-user-code
		return status;
		// end-user-code
	}

	/** 
	 * @param status the status to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setStatus(int status) {
		// begin-user-code
		this.status = status;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>heartbeat times</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int heartbeatTimes;

	/** 
	 * @return the heartbeatTimes
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getHeartbeatTimes() {
		// begin-user-code
		return heartbeatTimes;
		// end-user-code
	}

	/** 
	 * @param heartbeatTimes the heartbeatTimes to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHeartbeatTimes(int heartbeatTimes) {
		// begin-user-code
		this.heartbeatTimes = heartbeatTimes;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>heartbeat interval</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int heartbeatInterval;

	/** 
	 * @return the heartbeatInterval
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getHeartbeatInterval() {
		// begin-user-code
		return heartbeatInterval;
		// end-user-code
	}

	/** 
	 * @param heartbeatInterval the heartbeatInterval to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHeartbeatInterval(int heartbeatInterval) {
		// begin-user-code
		this.heartbeatInterval = heartbeatInterval;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>device interfaces list</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private List<GmpInterface> Interfaces = new ArrayList<GmpInterface>();

	/** 
	 * @return the Interfaces
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public List<GmpInterface> getInterfaces() {
		// begin-user-code
		return Interfaces;
		// end-user-code
	}

	/** 
	 * @param Interfaces the Interfaces to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setInterfaces(List<GmpInterface> Interfaces) {
		// begin-user-code
		this.Interfaces = Interfaces;
		// end-user-code
	}
}