/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfWriteLog.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core 
 * @Description: logger writer of gmf
 * @author: kitty   
 * @date: 2016年1月13日 上午9:34:07 
 * @version: V0.1.0   
 */
package com.gmf.print;

import com.gmf.defined.GmfErrorDefined;

/**
 * @ClassName: GmfWriteLog
 * @Description: GmfWriteLog
 * @author: kitty
 * @date: 2016年1月13日 上午9:34:07
 */
public class GmfWriteLog {
	/**
	 * @Title: println
	 * @Description: print log
	 * @param level
	 * @param format
	 * @param args
	 */
	public static void println(int level, String format, Object... args) {
		switch (level) {
			case GmfErrorDefined.GMF_ERROR_NONE: {
				System.out.printf(GmfErrorDefined.GmfErrorLevel.GMF_ERROR_LEVEL_NONE.getDescription() + "---" + format
						+ "\n", args);
			}
				break;
			case GmfErrorDefined.GMF_ERROR_NOTICE: {
				System.out.printf(GmfErrorDefined.GmfErrorLevel.GMF_ERROR_LEVEL_NOTICE.getDescription() + "---"
						+ format + "\n", args);
			}
				break;
			case GmfErrorDefined.GMF_ERROR_WARNING: {
				System.out.printf(GmfErrorDefined.GmfErrorLevel.GMF_ERROR_LEVEL_WARNING.getDescription() + "---"
						+ format + "\n", args);
			}
				break;
			case GmfErrorDefined.GMF_ERROR_CRITICAL: {
				System.out.printf(GmfErrorDefined.GmfErrorLevel.GMF_ERROR_LEVEL_CRITICAL.getDescription() + "---"
						+ format + "\n", args);
			}
				break;
			default: {
				System.out.printf(GmfErrorDefined.GmfErrorLevel.GMF_ERROR_LEVEL_NONE.getDescription() + "---" + format
						+ "\n", args);
			}
				break;
		}
	}
	/**
	 * @Title: println
	 * @Description: print
	 * @param format
	 * @param args
	 */
	public static void println(String format, Object... args) {
		println(GmfErrorDefined.GMF_ERROR_NONE, format, args);
	}
	/** 
	 * @Title: printLog 
	 * @Description: print log
	 * @param format
	 * @param args
	 */
	public static void printLog(String format, Object... args) {
		if (GmfErrorDefined.GMF_DEBUG_INFORMATION) {
			println(GmfErrorDefined.GMF_ERROR_NONE, format, args);
		}
	}
	/**
	 * @Title: format
	 * @Description: format
	 * @param format
	 * @param args
	 * @return String
	 */
	public static String format(String format, Object... args) {
		return String.format(format, args);
	}
}
