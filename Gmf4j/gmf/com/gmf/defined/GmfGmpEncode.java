/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfGmpEncode.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.defined 
 * @Description: encode information
 * @author: kitty   
 * @date: 2016年1月10日 下午5:59:49 
 * @version: V0.1.0   
 */
package com.gmf.defined;

import java.util.HashMap;

/**
 * @ClassName: GmfGmpEncode
 * @Description: GmfGmpEncode
 * @author: kitty
 * @date: 2016年1月10日 下午5:59:49
 */
final public class GmfGmpEncode {
	private static HashMap<Byte, String> encode = null;

	private GmfGmpEncode() {
	}

	static {
		encode = new HashMap<Byte, String>();
		encode.put((byte) 0, "ASCII");
		encode.put((byte) 1, "UTF-8");
		encode.put((byte) 64, "GB2312");
		encode.put((byte) 65, "GBK");
	}

	/**
	 * @Title: getEncode
	 * @Description: get gmp encode name
	 * @param index 
	 * @return String
	 */
	public static String getEncode(Byte index) {
		return encode.get(index);
	}
}
