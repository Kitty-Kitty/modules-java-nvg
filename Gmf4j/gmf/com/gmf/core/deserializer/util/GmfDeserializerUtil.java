/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDeserializerUtil.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.util 
 * @Description: deserializer util
 * @author: kitty   
 * @date: 2016年1月24日 下午6:26:06 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.util;

/**
 * @ClassName: GmfDeserializerUtil
 * @Description: deserializer util
 * @author: kitty
 * @date: 2016年1月24日 下午6:26:06
 */
public class GmfDeserializerUtil {
	/**
	 * @Title: captureName
	 * @Description: a~z(97~122)
	 * @param str source string
	 * @return String return string
	 */
	public static String captureName(String str) {
		char[] cs = str.toCharArray();
		if (cs[0] >= 97 && cs[0] <= 122) {
			cs[0] -= 32;
		}
		return String.valueOf(cs);
	}
	/**
	 * @Title: firstUpperCase
	 * @Description: upper case first char
	 * @param str source string
	 * @return String return string
	 */
	public static String firstUpperCase(String str) {
		return str.replaceFirst(str.substring(0, 1), str.substring(0, 1).toUpperCase());
	}
}
