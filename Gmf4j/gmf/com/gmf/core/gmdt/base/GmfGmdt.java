/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfGmdt.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt.base 
 * @Description: GmfGmdt
 * @author: kitty   
 * @date: 2016年1月12日 下午5:23:47 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt.base;

/**
 * @ClassName: GmfGmdt
 * @Description: Class of GmfGmdt
 * @author: kitty
 * @date: 2016年1月28日 下午5:02:55
 */
public class GmfGmdt {
	/**
	 * @fieldName: flag
	 * @fieldType: int
	 * @Description: GmfElement flag
	 */
	private int flag;
	/**
	 * @fieldName: minLength
	 * @fieldType: int
	 * @Description: GmfElement minLength
	 */
	private int minLength;
	/**
	 * @fieldName: name
	 * @fieldType: String
	 * @Description: GmfElement name
	 */
	private String name;

	/**
	 * @return the flag
	 */
	public int getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(int flag) {
		this.flag = flag;
	}
	/**
	 * @return the minLength
	 */
	public int getMinLength() {
		return minLength;
	}
	/**
	 * @param minLength the minLength to set
	 */
	public void setMinLength(int minLength) {
		this.minLength = minLength;
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
}
