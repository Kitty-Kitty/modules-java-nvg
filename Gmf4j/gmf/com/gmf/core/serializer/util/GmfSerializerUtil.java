/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDeserializerUtil.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.util 
 * @Description: serializer util 
 * @author: kitty   
 * @date: 2016年1月24日 下午6:26:06 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.util;

/**
 * @ClassName: GmfDeserializerUtil
 * @Description: GmfSerializerUtil
 * @author: kitty
 * @date: 2016年1月24日 下午6:26:06
 */
public class GmfSerializerUtil {
	/**
	 * @Title: captureName
	 * @Description: a~z(97~122)
	 * @param str 
	 * @return String 
	 */
	public final static String captureName(String str) {
		char[] cs = str.toCharArray();
		if (cs[0] >= 97 && cs[0] <= 122) {
			cs[0] -= 32;
		}
		return String.valueOf(cs);
	}
	/**
	 * @Title: firstUpperCase
	 * @Description: upper case first char
	 * @param str
	 * @return String
	 */
	public final static String firstUpperCase(String str) {
		return str.replaceFirst(str.substring(0, 1), str.substring(0, 1).toUpperCase());
	}
}
