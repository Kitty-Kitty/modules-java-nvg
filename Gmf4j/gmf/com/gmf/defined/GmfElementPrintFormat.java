/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfElementPrintFormat.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.defined 
 * @Description: GmfElementPrintFormat
 * @author: kitty   
 * @date: 2016年1月16日 下午4:55:03 
 * @version: V0.1.0   
 */
package com.gmf.defined;

import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfElementPrintFormat
 * @Description: GmfElementPrintFormat
 * @author: kitty
 * @date: 2016年1月28日 下午6:17:59
 */
public interface GmfElementPrintFormat {
	/**
	 * @fieldName: GMF_ELEMENT_PRINT_FORMAT_TAB
	 * @fieldType: String
	 * @Description: tab string
	 */
	public static final String GMF_ELEMENT_PRINT_FORMAT_TAB = GmfWriteLog.format("    ");
	/**
	 * @fieldName: GMF_ELEMENT_PRINT_LAYER_NUMBER
	 * @fieldType: int
	 * @Description: print layer number
	 */
	public static final int GMF_ELEMENT_PRINT_LAYER_NUMBER = 2;
	/**
	 * print gmf element value to string. example: gmfInt 1 to string: 1
	 */
	public static final int GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY = 0;
	/**
	 * print gmf element value to pritty string. example: gmfInt 1 to string: (IN)1
	 */
	public static final int GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY = 1;
	/**
	 * print gmf object element all value to string. example: gmfObject element(2) to string:
	 * element1Key : element1Value element2Key : element2Value
	 */
	public static final int GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_ONLY = 2;
	/**
	 * print gmf object element all value to string. example: gmfObject element(2) to string:
	 * (String)element1Key : (String)element1Value (String)element2Key : (String)element2Value
	 */
	public static final int GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_PRITTY = 3;
	/**
	 * print gmf object element all value to string. example: gmfObject element(2) to string:
	 * element1Key : element1Value element2Key : element2Value
	 */
	public static final int GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY = 4;
	/**
	 * print gmf object element all value to string. example: gmfObject element(2) to string:
	 * (String)element1Key : (String)element1Value (String)element2Key : (String)element2Value
	 */
	public static final int GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY = 5;
}
