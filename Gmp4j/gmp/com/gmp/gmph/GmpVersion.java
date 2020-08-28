/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpGmphVersion.java 
 * @Prject: Gmp4j
 * @Package: com.gmp.gmph 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 15, 2016 1:20:12 PM 
 * @version: V1.0   
 */
package com.gmp.gmph;

/** 
 * @ClassName: GmpGmphVersion 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 15, 2016 1:20:12 PM 
 * 
 */
public class GmpVersion {
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
	private String name = "Gmp";
	/**
	 * @return the version to get
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
	 * @return the versionString to get
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
	 * @return the name to get
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
	 * @Description: TODO
	 *
	 * @param format
	 * @return String
	 *
	 * @return: String
	 * @exception
	 */
	public String toString(int format) {
		return String.format("%s/%s(%d)", this.name, this.versionString, this.version);
	}
}
