package com.nvg.css.db.domain;

// Generated Jun 10, 2016 7:15:43 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TServer generated by hbm2java
 */
public class TServer implements java.io.Serializable {

	private String svrId;
	private TSystem TSystem;
	private TDeviceType TDeviceType;
	private String cssId;
	private String svrName;
	private Integer svrStatus;
	private String svrIp;
	private String svrNetwork;
	private String svrMac;
	private Integer svrUdpPort;
	private Integer svrTcpPort;
	private Date svrRegistTime;
	private String svrVersion;
	private Integer svrLimitDisk;
	private Integer svrLimitMemory;
	private Integer svrLimitCpu;
	private Integer svrLimitNetwork;
	private Set<TReGroupServer> TReGroupServers = new HashSet<TReGroupServer>(0);
	private Set<TRootResource> TRootResources = new HashSet<TRootResource>(0);
	private Set<TFontResource> TFontResources = new HashSet<TFontResource>(0);

	public TServer() {
	}

	public TServer(String svrId) {
		this.svrId = svrId;
	}

	public TServer(String svrId, TSystem TSystem, TDeviceType TDeviceType,
			String cssId, String svrName, Integer svrStatus, String svrIp,
			String svrNetwork, String svrMac, Integer svrUdpPort,
			Integer svrTcpPort, Date svrRegistTime, String svrVersion,
			Integer svrLimitDisk, Integer svrLimitMemory, Integer svrLimitCpu,
			Integer svrLimitNetwork, Set<TReGroupServer> TReGroupServers,
			Set<TRootResource> TRootResources, Set<TFontResource> TFontResources) {
		this.svrId = svrId;
		this.TSystem = TSystem;
		this.TDeviceType = TDeviceType;
		this.cssId = cssId;
		this.svrName = svrName;
		this.svrStatus = svrStatus;
		this.svrIp = svrIp;
		this.svrNetwork = svrNetwork;
		this.svrMac = svrMac;
		this.svrUdpPort = svrUdpPort;
		this.svrTcpPort = svrTcpPort;
		this.svrRegistTime = svrRegistTime;
		this.svrVersion = svrVersion;
		this.svrLimitDisk = svrLimitDisk;
		this.svrLimitMemory = svrLimitMemory;
		this.svrLimitCpu = svrLimitCpu;
		this.svrLimitNetwork = svrLimitNetwork;
		this.TReGroupServers = TReGroupServers;
		this.TRootResources = TRootResources;
		this.TFontResources = TFontResources;
	}

	public String getSvrId() {
		return this.svrId;
	}

	public void setSvrId(String svrId) {
		this.svrId = svrId;
	}

	public TSystem getTSystem() {
		return this.TSystem;
	}

	public void setTSystem(TSystem TSystem) {
		this.TSystem = TSystem;
	}

	public TDeviceType getTDeviceType() {
		return this.TDeviceType;
	}

	public void setTDeviceType(TDeviceType TDeviceType) {
		this.TDeviceType = TDeviceType;
	}

	public String getCssId() {
		return this.cssId;
	}

	public void setCssId(String cssId) {
		this.cssId = cssId;
	}

	public String getSvrName() {
		return this.svrName;
	}

	public void setSvrName(String svrName) {
		this.svrName = svrName;
	}

	public Integer getSvrStatus() {
		return this.svrStatus;
	}

	public void setSvrStatus(Integer svrStatus) {
		this.svrStatus = svrStatus;
	}

	public String getSvrIp() {
		return this.svrIp;
	}

	public void setSvrIp(String svrIp) {
		this.svrIp = svrIp;
	}

	public String getSvrNetwork() {
		return this.svrNetwork;
	}

	public void setSvrNetwork(String svrNetwork) {
		this.svrNetwork = svrNetwork;
	}

	public String getSvrMac() {
		return this.svrMac;
	}

	public void setSvrMac(String svrMac) {
		this.svrMac = svrMac;
	}

	public Integer getSvrUdpPort() {
		return this.svrUdpPort;
	}

	public void setSvrUdpPort(Integer svrUdpPort) {
		this.svrUdpPort = svrUdpPort;
	}

	public Integer getSvrTcpPort() {
		return this.svrTcpPort;
	}

	public void setSvrTcpPort(Integer svrTcpPort) {
		this.svrTcpPort = svrTcpPort;
	}

	public Date getSvrRegistTime() {
		return this.svrRegistTime;
	}

	public void setSvrRegistTime(Date svrRegistTime) {
		this.svrRegistTime = svrRegistTime;
	}

	public String getSvrVersion() {
		return this.svrVersion;
	}

	public void setSvrVersion(String svrVersion) {
		this.svrVersion = svrVersion;
	}

	public Integer getSvrLimitDisk() {
		return this.svrLimitDisk;
	}

	public void setSvrLimitDisk(Integer svrLimitDisk) {
		this.svrLimitDisk = svrLimitDisk;
	}

	public Integer getSvrLimitMemory() {
		return this.svrLimitMemory;
	}

	public void setSvrLimitMemory(Integer svrLimitMemory) {
		this.svrLimitMemory = svrLimitMemory;
	}

	public Integer getSvrLimitCpu() {
		return this.svrLimitCpu;
	}

	public void setSvrLimitCpu(Integer svrLimitCpu) {
		this.svrLimitCpu = svrLimitCpu;
	}

	public Integer getSvrLimitNetwork() {
		return this.svrLimitNetwork;
	}

	public void setSvrLimitNetwork(Integer svrLimitNetwork) {
		this.svrLimitNetwork = svrLimitNetwork;
	}

	public Set<TReGroupServer> getTReGroupServers() {
		return this.TReGroupServers;
	}

	public void setTReGroupServers(Set<TReGroupServer> TReGroupServers) {
		this.TReGroupServers = TReGroupServers;
	}

	public Set<TRootResource> getTRootResources() {
		return this.TRootResources;
	}

	public void setTRootResources(Set<TRootResource> TRootResources) {
		this.TRootResources = TRootResources;
	}

	public Set<TFontResource> getTFontResources() {
		return this.TFontResources;
	}

	public void setTFontResources(Set<TFontResource> TFontResources) {
		this.TFontResources = TFontResources;
	}

}