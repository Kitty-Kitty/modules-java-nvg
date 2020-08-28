/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfGmdtFlag.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.defined 
 * @Description: gmf element flag
 * @author: kitty   
 * @date: 2016年1月16日 下午4:55:03 
 * @version: V0.1.0   
 */
package com.gmf.defined;

/**
 * @ClassName: GmfGmdtFlag
 * @Description: defined gmf element flag
 * @author: kitty
 * @date: 2016年1月28日 下午6:21:34
 */
public interface GmfGmdtFlag {
	/**
	 * general gmf element
	 */
	public static final int GMF_GMDT_B = 0x00;
	public static final int GMF_GMDT_C = 0x01;
	public static final int GMF_GMDT_UC = 0x02;
	public static final int GMF_GMDT_S = 0x03;
	public static final int GMF_GMDT_US = 0x04;
	public static final int GMF_GMDT_IN = 0x05;
	public static final int GMF_GMDT_UIN = 0x06;
	public static final int GMF_GMDT_L = 0x07;
	public static final int GMF_GMDT_UL = 0x08;
	public static final int GMF_GMDT_F = 0x09;
	public static final int GMF_GMDT_UF = 0x0A;
	public static final int GMF_GMDT_D = 0x0B;
	public static final int GMF_GMDT_UD = 0x0C;
	public static final int GMF_GMDT_N = 0x0D;
	public static final int GMF_GMDT_T = 0x0E;
	/**
	 * container gmf element
	 */
	public static final int GMF_GMDT_A = 0x40;
	public static final int GMF_GMDT_O = 0x41;
	/**
	 * data gmf element
	 */
	public static final int GMF_GMDT_X = 0x42;
	public static final int GMF_GMDT_JS = 0x43;
	public static final int GMF_GMDT_IOB = 0x44;
	/**
	 * extend gmf element
	 */
	public static final int GMF_GMDT_ST = 0x80;
	public static final int GMF_GMDT_R = 0x81;
	public static final int GMF_GMDT_RP = 0x82;
}
