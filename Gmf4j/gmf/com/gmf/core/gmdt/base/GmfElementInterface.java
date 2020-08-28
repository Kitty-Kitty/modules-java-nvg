/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfElementInterface.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt.base 
 * @Description: GmfElementInterface
 * @author: kitty   
 * @date: 2016年1月12日 下午5:23:47 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt.base;

import com.gmf.core.Gmf;


/** 
 * @ClassName: GmfElementInterface 
 * @Description: interface of GmfElement
 * @author: kitty
 * @date: 2016年1月28日 下午4:54:29  
 */
public interface GmfElementInterface {
	/**
	 * @Title: isEmpty
	 * @Description: check gmf element is empty. true : empty; false : not empty
	 * @return: boolean
	 */
	public boolean isEmpty();
	/**
	 * @Title: size
	 * @Description: Container element has children size
	 * @return int Container element return Container size; Uncontainer element return encode length
	 */
	public int size();
	/**
	 * @Title: getEncodeLength
	 * @Description: used byte length of encode gmf element
	 * @return int used byte length
	 */
	public int getEncodeLength();
	/**
	 * @Title: isObjectGmfElement
	 * @Description: check object gmf element;
	 * @return boolean GmfArray/GmfObject return true; other return false;
	 */
	public boolean isGmfContainerElement();
	/**
	 * @Title: toPrintString
	 * @Description: to print string
	 * @return String
	 */
	public String toPrintString();
	/**
	 * @Title: toPrintAllString
	 * @Description: to print all string with object element, and this object element has children.
	 *               other element likely toPrintString()
	 * @return String
	 */
	public String toPrintAllString();
	/**
	 * @Title: toPrintPrittyString
	 * @Description: to print pritty string
	 * @return String
	 */
	public String toPrintPrittyString();
	/**
	 * @Title: toPrintAllString
	 * @Description: to print all string with object element, and this object element has children.
	 *               other element likely toPrintPrittyString()
	 * @return String
	 */
	public String toPrintAllPrittyString();
	/**
	 * @Title: toString
	 * @Description: base to string
	 * @param format format type
	 * @return String
	 */
	public String toString(int format);
	/**
	 * @Title: check
	 * @Description: check data before process
	 * @param gmf Gmf Object
	 * @param data deserialize output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return: boolean
	 */
	public boolean check(Gmf gmf, byte[] data, int pos, int length);
	/**
	 * @Title: begin
	 * @Description: beging to decode data
	 * @param gmf Gmf Object
	 * @param data deserialize output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int used data length
	 */
	public int begin(Gmf gmf, byte[] data, int pos, int length);
	/**
	 * @Title: decode
	 * @Description: decode data
	 * @param gmf Gmf Object
	 * @param data deserialize output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int used data length
	 */
	public int decode(Gmf gmf, byte[] data, int pos, int length);
	/**
	 * @Title: end
	 * @Description: end decode data
	 * @param gmf Gmf Object
	 * @param data deserialize output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int used data length
	 */
	public int end(Gmf gmf, byte[] data, int pos, int length);
	/**
	 * @Title: encode
	 * @Description: encode gmf for byte[]
	 * @param gmf
	 * @return byte[]
	 */
	public byte[] encode(Gmf gmf);
	/**
	 * @Title: encode
	 * @Description: encode to buffer
	 * @param gmf Gmf Object
	 * @param dest output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int
	 */
	public int encode(Gmf gmf, byte[] dest, int pos, int length);
	/**
	 * @Title: format
	 * @Description: format GmfElement data
	 * @param args arguments
	 * @return boolean
	 */
	public boolean format(Object... args);
	/**
	 * @Title: getObjectValue
	 * @Description: get get object value
	 * @return Object
	 */
	public Object getObjectValue();
}
