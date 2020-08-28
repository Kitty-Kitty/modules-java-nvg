/**
 * 
 */
package com.nvg.css.system.device;

import com.nvg.css.system.core.CssBaseInfo;
import java.io.Serializable;
import com.nvg.css.system.platform.CssPlatform;
import java.util.Date;

/** 
 * <!-- begin-UML-doc -->
 * TSystem&nbsp;generated&nbsp;by&nbsp;hbm2java
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssDevice extends CssBaseInfo implements Serializable {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssPlatform platform;

	/** 
	 * @return the platform
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssPlatform getPlatform() {
		// begin-user-code
		return platform;
		// end-user-code
	}

	/** 
	 * @param platform the platform to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPlatform(CssPlatform platform) {
		// begin-user-code
		this.platform = platform;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String ip;

	/** 
	 * @return the ip
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getIp() {
		// begin-user-code
		return ip;
		// end-user-code
	}

	/** 
	 * @param ip the ip to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIp(String ip) {
		// begin-user-code
		this.ip = ip;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String network;

	/** 
	 * @return the network
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getNetwork() {
		// begin-user-code
		return network;
		// end-user-code
	}

	/** 
	 * @param network the network to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setNetwork(String network) {
		// begin-user-code
		this.network = network;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String mac;

	/** 
	 * @return the mac
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getMac() {
		// begin-user-code
		return mac;
		// end-user-code
	}

	/** 
	 * @param mac the mac to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setMac(String mac) {
		// begin-user-code
		this.mac = mac;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String udpPort;

	/** 
	 * @return the udpPort
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getUdpPort() {
		// begin-user-code
		return udpPort;
		// end-user-code
	}

	/** 
	 * @param udpPort the udpPort to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setUdpPort(String udpPort) {
		// begin-user-code
		this.udpPort = udpPort;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String tcpPort;

	/** 
	 * @return the tcpPort
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getTcpPort() {
		// begin-user-code
		return tcpPort;
		// end-user-code
	}

	/** 
	 * @param tcpPort the tcpPort to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTcpPort(String tcpPort) {
		// begin-user-code
		this.tcpPort = tcpPort;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date registtime;

	/** 
	 * @return the registtime
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Date getRegisttime() {
		// begin-user-code
		return registtime;
		// end-user-code
	}

	/** 
	 * @param registtime the registtime to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setRegisttime(Date registtime) {
		// begin-user-code
		this.registtime = registtime;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer limitPlayCount;

	/** 
	 * @return the limitPlayCount
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getLimitPlayCount() {
		// begin-user-code
		return limitPlayCount;
		// end-user-code
	}

	/** 
	 * @param limitPlayCount the limitPlayCount to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitPlayCount(Integer limitPlayCount) {
		// begin-user-code
		this.limitPlayCount = limitPlayCount;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer limitLayerCount;

	/** 
	 * @return the limitLayerCount
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getLimitLayerCount() {
		// begin-user-code
		return limitLayerCount;
		// end-user-code
	}

	/** 
	 * @param limitLayerCount the limitLayerCount to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitLayerCount(Integer limitLayerCount) {
		// begin-user-code
		this.limitLayerCount = limitLayerCount;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer limitDisk;

	/** 
	 * @return the limitDisk
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getLimitDisk() {
		// begin-user-code
		return limitDisk;
		// end-user-code
	}

	/** 
	 * @param limitDisk the limitDisk to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitDisk(Integer limitDisk) {
		// begin-user-code
		this.limitDisk = limitDisk;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer limitMemory;

	/** 
	 * @return the limitMemory
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getLimitMemory() {
		// begin-user-code
		return limitMemory;
		// end-user-code
	}

	/** 
	 * @param limitMemory the limitMemory to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitMemory(Integer limitMemory) {
		// begin-user-code
		this.limitMemory = limitMemory;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer limitCpu;

	/** 
	 * @return the limitCpu
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getLimitCpu() {
		// begin-user-code
		return limitCpu;
		// end-user-code
	}

	/** 
	 * @param limitCpu the limitCpu to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitCpu(Integer limitCpu) {
		// begin-user-code
		this.limitCpu = limitCpu;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer limitNetwork;

	/** 
	 * @return the limitNetwork
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getLimitNetwork() {
		// begin-user-code
		return limitNetwork;
		// end-user-code
	}

	/** 
	 * @param limitNetwork the limitNetwork to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLimitNetwork(Integer limitNetwork) {
		// begin-user-code
		this.limitNetwork = limitNetwork;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean init() {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean start() {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean stop() {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}
}