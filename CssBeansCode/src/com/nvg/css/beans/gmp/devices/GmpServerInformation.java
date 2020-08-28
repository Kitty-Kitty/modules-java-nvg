/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpServerInformation.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.devices 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:46:34 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.devices;

import com.nvg.css.beans.gmp.base.GmpInformation;

/** 
 * <!-- begin-UML-doc -->
 * <p>server information</p>
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpServerInformation extends GmpInformation {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte limitDisk;

	/** 
	 * @return the limitDisk
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getLimitDisk() {
		// begin-user-code
		return limitDisk;
		// end-user-code
	}

	/** 
	 * @param limitDisk the limitDisk to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitDisk(byte limitDisk) {
		// begin-user-code
		this.limitDisk = limitDisk;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int limitConnect;

	/** 
	 * @return the limitConnect
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getLimitConnect() {
		// begin-user-code
		return limitConnect;
		// end-user-code
	}

	/** 
	 * @param limitConnect the limitConnect to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitConnect(int limitConnect) {
		// begin-user-code
		this.limitConnect = limitConnect;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte limitMemory;

	/** 
	 * @return the limitMemory
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getLimitMemory() {
		// begin-user-code
		return limitMemory;
		// end-user-code
	}

	/** 
	 * @param limitMemory the limitMemory to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitMemory(byte limitMemory) {
		// begin-user-code
		this.limitMemory = limitMemory;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte limitCPU;

	/** 
	 * @return the limitCPU
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getLimitCPU() {
		// begin-user-code
		return limitCPU;
		// end-user-code
	}

	/** 
	 * @param limitCPU the limitCPU to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitCPU(byte limitCPU) {
		// begin-user-code
		this.limitCPU = limitCPU;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte limitNetWork;

	/** 
	 * @return the limitNetWork
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getLimitNetWork() {
		// begin-user-code
		return limitNetWork;
		// end-user-code
	}

	/** 
	 * @param limitNetWork the limitNetWork to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitNetWork(byte limitNetWork) {
		// begin-user-code
		this.limitNetWork = limitNetWork;
		// end-user-code
	}
}