/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfElementFormat.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: GmfElementFormat
 * @author: kitty   
 * @date: 2016年1月12日 下午5:23:47 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt.base;

import java.util.HashMap;
import java.util.Map.Entry;

import com.gmf.defined.GmfErrorDefined;
import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfElementFormat
 * @Description: class of GmfElementFormat
 * @author: kitty
 * @date: 2016年1月12日 下午5:23:47
 */
public class GmfElementFormat {
	public static HashMap<String, Integer> gmfElementFlagMap = new HashMap<String, Integer>();
	public static int flagMinLength = 1;
	public static int flagMaxLength = 0;

	private GmfElementFormat() {
	}

	static {
		HashMap<Integer, String> gmfElementMap = GmfElementManager.getGmfElementMap();
		if (gmfElementMap.size() > 0) {
			for (Entry<Integer, String> entry : gmfElementMap.entrySet()) {
				GmfElement ge;
				try {
					ge = GmfElementManager.createGmfElement(entry.getKey());
					if (null == ge) {
						GmfWriteLog.printLog("Class GmfElementFormat process warning. flag[%d] %s", entry.getKey(),
								GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_CREATE_GMFELEMENT.getErr());
						continue;
					}
					if (!ge.gmdt.getName().isEmpty()) {
						// count name length
						if (ge.gmdt.getName().length() > flagMaxLength) {
							flagMaxLength = ge.gmdt.getName().length();
						}
						// input flag and name into flagMap
						gmfElementFlagMap.put(ge.gmdt.getName(), ge.gmdt.getFlag());
						GmfWriteLog.printLog("GmfElementFormat add gmf element flag. [ %3s  -  0x%02X (%3d) ]",
								ge.gmdt.getName(), ge.gmdt.getFlag(), ge.gmdt.getFlag());
					} else {
						GmfWriteLog.printLog("Class GmfElementFormat process warning. flag[%d] %s", entry.getKey(),
								GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_BROKEN.getErr());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			GmfWriteLog
					.printLog("Class GmfElementFormat process warning. not found gmf element from GmfElementManager.");
		}
	}

	/**
	 * @Title: getGmfElementFlag
	 * @Description: get GmfElement flag by format
	 * @param format GmfElement flag name
	 * @return int number of GmfElement flag
	 */
	private static int getGmfElementFlag(String format) {
		int tmpIndex = format.indexOf("%");
		int i = flagMaxLength;
		int tmpMaxLength = flagMaxLength;
		Integer retFlag = 0;
		String tmpName = null;
		if (tmpIndex < 0) {
			return -1;
		} else {
			++tmpIndex;
		}
		tmpName = format.substring(tmpIndex);
		if (tmpName.length() < flagMaxLength) {
			tmpMaxLength = tmpName.length();
		}
		for (i = tmpMaxLength; i >= tmpMaxLength; i--) {
			tmpName = format.substring(tmpIndex, (tmpIndex + i));
			if (!tmpName.isEmpty()) {
				retFlag = gmfElementFlagMap.get(tmpName);
				if (null != retFlag) {
					return retFlag;
				}
			}
		}
		return -1;
	}
	/**
	 * @Title: format
	 * @Description: format a GmfElement Object
	 * @param format GmfElement flag name
	 * @param args GmfElement value
	 * @return GmfElement
	 */
	public static GmfElement format(String format, Object... args) {
		int retFlag = getGmfElementFlag(format);
		if (retFlag < 0) {
			GmfWriteLog.printLog("Class GmfElementFormat process warning. name undefined flag[%d] %s", retFlag,
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_CREATE_GMFELEMENT.getErr());
			return null;
		}
		try {
			GmfElement ge = GmfElementManager.createGmfElement(retFlag);
			if (null == ge) {
				GmfWriteLog.printLog("Class GmfElementFormat process warning. flag[%d] %s", retFlag,
						GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_CREATE_GMFELEMENT.getErr());
				return null;
			}
			if (!ge.format(args)) {
				GmfWriteLog.printLog("GmfElementFormat format %s(%s) gmf element failed! %s reason: %s", ge.getClass()
						.getName(), ge.gmdt.getName(), format, ge.getErr());
			}
			return ge;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
