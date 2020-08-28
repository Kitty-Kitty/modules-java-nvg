/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfSerializerDefined.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.defined 
 * @Description: defined constant data
 * @author: kitty   
 * @date: 2016年1月18日 下午4:15:01 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.defined;

/** 
 * @ClassName: GmfSerializerDefined 
 * @Description: GmfSerializerDefined
 * @author: kitty
 * @date: 2016年1月18日 下午4:15:01  
 */
public interface GmfSerializerDefined {
	/**
	 * @fieldName: GMF_SERIALIZER_DEFAULT_GMFBYTE_LENGTH
	 * @fieldType: int
	 * @Description: default gmf byte length for serizlizer configure
	 */
	public final static int GMF_SERIALIZER_DEFAULT_GMFBYTE_LENGTH = 1024;
	
	/**
	 * @fieldName: GMF_SERIALIZER_DEFAULT_KEY_NAME
	 * @fieldType: String
	 * @Description: if key and value whole container object, set key to this value
	 */
	public final static String GMF_SERIALIZER_DEFAULT_KEY_NAME = "$ref";
}
