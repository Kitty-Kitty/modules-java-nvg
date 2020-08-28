/**
 * 
 */
package com.nvg.css.system.platform;

import com.nvg.css.system.core.CssBaseInfo;
import com.nvg.css.system.core.CssSystem;
import java.util.Date;
import com.nvg.css.system.manager.platform.resource.CssControllerManager;
import com.nvg.css.system.manager.platform.resource.CssGroupManager;
import com.nvg.css.system.manager.platform.resource.CssServerManager;
import com.nvg.css.system.manager.platform.resource.CssGatewayManager;
import com.nvg.css.system.manager.platform.resource.CssMonitorManager;
import com.nvg.css.system.manager.group.resource.CssVideoPlayManager;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssPlatform extends CssBaseInfo {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssSystem system;

	/** 
	 * @return the system
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssSystem getSystem() {
		// begin-user-code
		return system;
		// end-user-code
	}

	/** 
	 * @param system the system to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setSystem(CssSystem system) {
		// begin-user-code
		this.system = system;
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
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssControllerManager controllerManager = null;

	/** 
	 * @return the controllerManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssControllerManager getControllerManager() {
		// begin-user-code
		return controllerManager;
		// end-user-code
	}

	/** 
	 * @param controllerManager the controllerManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setControllerManager(CssControllerManager controllerManager) {
		// begin-user-code
		this.controllerManager = controllerManager;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssGroupManager groupManager;

	/** 
	 * @return the groupManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssGroupManager getGroupManager() {
		// begin-user-code
		return groupManager;
		// end-user-code
	}

	/** 
	 * @param groupManager the groupManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGroupManager(CssGroupManager groupManager) {
		// begin-user-code
		this.groupManager = groupManager;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssServerManager serverManager = null;

	/** 
	 * @return the serverManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssServerManager getServerManager() {
		// begin-user-code
		return serverManager;
		// end-user-code
	}

	/** 
	 * @param serverManager the serverManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setServerManager(CssServerManager serverManager) {
		// begin-user-code
		this.serverManager = serverManager;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssGatewayManager gatewayManager = null;

	/** 
	 * @return the gatewayManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssGatewayManager getGatewayManager() {
		// begin-user-code
		return gatewayManager;
		// end-user-code
	}

	/** 
	 * @param gatewayManager the gatewayManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGatewayManager(CssGatewayManager gatewayManager) {
		// begin-user-code
		this.gatewayManager = gatewayManager;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssMonitorManager monitorManager = null;

	/** 
	 * @return the monitorManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssMonitorManager getMonitorManager() {
		// begin-user-code
		return monitorManager;
		// end-user-code
	}

	/** 
	 * @param monitorManager the monitorManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setMonitorManager(CssMonitorManager monitorManager) {
		// begin-user-code
		this.monitorManager = monitorManager;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssVideoPlayManager videoPlayManager = null;

	/** 
	 * @return the videoPlayManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssVideoPlayManager getVideoPlayManager() {
		// begin-user-code
		return videoPlayManager;
		// end-user-code
	}

	/** 
	 * @param videoPlayManager the videoPlayManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setVideoPlayManager(CssVideoPlayManager videoPlayManager) {
		// begin-user-code
		this.videoPlayManager = videoPlayManager;
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