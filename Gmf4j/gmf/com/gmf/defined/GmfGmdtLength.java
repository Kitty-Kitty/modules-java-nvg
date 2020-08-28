/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfGmdtLength.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.defined 
 * @Description: GmfElement min length
 * @author: kitty   
 * @date: 2016年1月16日 下午4:55:03 
 * @version: V0.1.0   
 */
package com.gmf.defined;

public interface GmfGmdtLength {
	/**
	 * general gmf element
	 */
	public static final int GMF_GMDT_LENGTH_B = 2;				//gmdt Boolen
	public static final int GMF_GMDT_LENGTH_C = 2;				//gmdt Char
	public static final int GMF_GMDT_LENGTH_UC = 2;				//gmdt Unsigned Char
	public static final int GMF_GMDT_LENGTH_S = 3;				//gmdt Short
	public static final int GMF_GMDT_LENGTH_US = 3;				//gmdt Unsigned Short
	public static final int GMF_GMDT_LENGTH_IN = 5;				//gmdt Int
	public static final int GMF_GMDT_LENGTH_UIN = 5;			//gmdt Unsigned Int
	public static final int GMF_GMDT_LENGTH_L = 9;				//gmdt Long
	public static final int GMF_GMDT_LENGTH_UL = 9;				//gmdt Unsigned Long
	public static final int GMF_GMDT_LENGTH_F = 5;				//gmdt Float
	public static final int GMF_GMDT_LENGTH_UF = 5;				//gmdt Unsigned float
	public static final int GMF_GMDT_LENGTH_D = 9;				//gmdt Double
	public static final int GMF_GMDT_LENGTH_UD = 9;				//gmdt Unsigned double
	public static final int GMF_GMDT_LENGTH_N = 1;				//gmdt Null
	public static final int GMF_GMDT_LENGTH_T = 2;				//gmdt Type
	
	
	/**
	 * container gmf element
	 */
	public static final int GMF_GMDT_LENGTH_A = 5;				//gmdt Array
	public static final int GMF_GMDT_LENGTH_O = 5;				//gmdt Object
	
	
	
	/**
	 * data gmf element
	 */
	public static final int GMF_GMDT_LENGTH_X = 5;				//gmdt XML
	public static final int GMF_GMDT_LENGTH_JS = 5;				//gmdt JSON
	public static final int GMF_GMDT_LENGTH_IOB = 5;			//gmdt IOBuffer
	
	
	
	/**
	 * extend gmf element
	 */
	public static final int GMF_GMDT_LENGTH_ST = 5;				//gmdt String
	public static final int GMF_GMDT_LENGTH_R = 17;				//gmdt Rect
	public static final int GMF_GMDT_LENGTH_RP = 33;			//gmdt RectPair
}
