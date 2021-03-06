package com.nvg.css.db.domain;

// Generated Jun 10, 2016 7:15:43 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * TResource generated by hbm2java
 */
public class TResource implements java.io.Serializable {

	private String rsId;
	private TRootResource TRootResource;
	private Integer rsType;
	private String rsParent;
	private String rsName;
	private String rsShowName;
	private String rsIp;
	private String rsAddr;
	private Integer rsStatus;
	private Integer rsFps;
	private Integer rsBps;
	private Set<TReResourcePermission> TReResourcePermissions = new HashSet<TReResourcePermission>(
			0);
	private Set<TVideoPlay> TVideoPlays = new HashSet<TVideoPlay>(0);

	public TResource() {
	}

	public TResource(String rsId) {
		this.rsId = rsId;
	}

	public TResource(String rsId, TRootResource TRootResource, Integer rsType,
			String rsParent, String rsName, String rsShowName, String rsIp,
			String rsAddr, Integer rsStatus, Integer rsFps, Integer rsBps,
			Set<TReResourcePermission> TReResourcePermissions,
			Set<TVideoPlay> TVideoPlays) {
		this.rsId = rsId;
		this.TRootResource = TRootResource;
		this.rsType = rsType;
		this.rsParent = rsParent;
		this.rsName = rsName;
		this.rsShowName = rsShowName;
		this.rsIp = rsIp;
		this.rsAddr = rsAddr;
		this.rsStatus = rsStatus;
		this.rsFps = rsFps;
		this.rsBps = rsBps;
		this.TReResourcePermissions = TReResourcePermissions;
		this.TVideoPlays = TVideoPlays;
	}

	public String getRsId() {
		return this.rsId;
	}

	public void setRsId(String rsId) {
		this.rsId = rsId;
	}

	public TRootResource getTRootResource() {
		return this.TRootResource;
	}

	public void setTRootResource(TRootResource TRootResource) {
		this.TRootResource = TRootResource;
	}

	public Integer getRsType() {
		return this.rsType;
	}

	public void setRsType(Integer rsType) {
		this.rsType = rsType;
	}

	public String getRsParent() {
		return this.rsParent;
	}

	public void setRsParent(String rsParent) {
		this.rsParent = rsParent;
	}

	public String getRsName() {
		return this.rsName;
	}

	public void setRsName(String rsName) {
		this.rsName = rsName;
	}

	public String getRsShowName() {
		return this.rsShowName;
	}

	public void setRsShowName(String rsShowName) {
		this.rsShowName = rsShowName;
	}

	public String getRsIp() {
		return this.rsIp;
	}

	public void setRsIp(String rsIp) {
		this.rsIp = rsIp;
	}

	public String getRsAddr() {
		return this.rsAddr;
	}

	public void setRsAddr(String rsAddr) {
		this.rsAddr = rsAddr;
	}

	public Integer getRsStatus() {
		return this.rsStatus;
	}

	public void setRsStatus(Integer rsStatus) {
		this.rsStatus = rsStatus;
	}

	public Integer getRsFps() {
		return this.rsFps;
	}

	public void setRsFps(Integer rsFps) {
		this.rsFps = rsFps;
	}

	public Integer getRsBps() {
		return this.rsBps;
	}

	public void setRsBps(Integer rsBps) {
		this.rsBps = rsBps;
	}

	public Set<TReResourcePermission> getTReResourcePermissions() {
		return this.TReResourcePermissions;
	}

	public void setTReResourcePermissions(
			Set<TReResourcePermission> TReResourcePermissions) {
		this.TReResourcePermissions = TReResourcePermissions;
	}

	public Set<TVideoPlay> getTVideoPlays() {
		return this.TVideoPlays;
	}

	public void setTVideoPlays(Set<TVideoPlay> TVideoPlays) {
		this.TVideoPlays = TVideoPlays;
	}

}
