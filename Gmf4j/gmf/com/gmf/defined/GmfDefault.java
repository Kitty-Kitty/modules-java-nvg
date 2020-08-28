/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDataDefined.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.defined 
 * @Description: gmf defined
 * @author: kitty   
 * @date: 2016年1月16日 下午4:55:03 
 * @version: V0.1.0   
 */
package com.gmf.defined;

/**
 * @ClassName: GmfDataDefined
 * @Description: GmfDefault
 * @author: kitty
 * @date: 2016年1月16日 下午4:55:03
 */
public interface GmfDefault {
	/**
	 * @fieldName: GMF_DEFAULT_SHORT_LENGTH
	 * @fieldType: int
	 * @Description: short data length
	 */
	public static final int GMF_DEFAULT_SHORT_LENGTH = 0x02;
	/**
	 * @fieldName: GMF_DEFAULT_INT_LENGTH
	 * @fieldType: int
	 * @Description: int data length
	 */
	public static final int GMF_DEFAULT_INT_LENGTH = 0x04;
	/**
	 * @fieldName: GMF_DEFAULT_GMDT_FLAG_LENGTH
	 * @fieldType: int
	 * @Description: gmf flag data length
	 */
	public static final int GMF_DEFAULT_GMDT_FLAG_LENGTH = 0x01;
	/**
	 * @fieldName: GMF_DEFAULT_BOOLEAN_TRUE
	 * @fieldType: String
	 * @Description: boolean true string
	 */
	public static final String GMF_DEFAULT_BOOLEAN_STRING_TRUE = "true";
	/**
	 * @fieldName: GMF_DEFAULT_BOOLEAN_FALSE
	 * @fieldType: String
	 * @Description: boolean false string
	 */
	public static final String GMF_DEFAULT_BOOLEAN_STRING_FALSE = "false";
	/**
	 * @fieldName: GMF_DEFAULT_BOOLEAN_INT_TRUE
	 * @fieldType: int
	 * @Description: boolean true int
	 */
	public static final int GMF_DEFAULT_BOOLEAN_INT_TRUE = 1;
	/**
	 * @fieldName: GMF_DEFAULT_BOOLEAN_INT_FALSE
	 * @fieldType: String
	 * @Description: boolean false int
	 */
	public static final int GMF_DEFAULT_BOOLEAN_INT_FALSE = 0;
}
