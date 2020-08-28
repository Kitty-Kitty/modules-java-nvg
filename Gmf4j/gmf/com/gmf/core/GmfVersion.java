/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfRectBean.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.beans 
 * @Description: version information
 * @author: kitty   
 * @date: 2016年1月16日 下午4:33:08 
 * @version: V0.1.0   
 */
package com.gmf.core;

import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfVersion
 * @Description: version information
 * @author: kitty
 * @date: 2016年1月25日 下午3:10:21
 */
public class GmfVersion {
	/**
	 * @fieldName: version
	 * @fieldType: int
	 * @Description: version number
	 */
	private int version = 1000;
	/**
	 * @fieldName: versionString
	 * @fieldType: String
	 * @Description: version string
	 */
	private String versionString = "0.1.0";
	/**
	 * @fieldName: name
	 * @fieldType: String
	 * @Description: gmf parser name
	 */
	private String name = "GMF";
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	/**
	 * @return the versionString
	 */
	public String getVersionString() {
		return versionString;
	}
	/**
	 * @param versionString the versionString to set
	 */
	public void setVersionString(String versionString) {
		this.versionString = versionString;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @Title: toString
	 * @Description: format version information to string
	 * @param format format string information
	 * @return String return version string
	 */
	public String toString(int format) {
		return GmfWriteLog.format("%s/%s(%d)", this.name, this.versionString, this.version);
	}
}
