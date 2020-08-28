/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpGmphWriteLog.java 
 * @Prject: gmp
 * @Package: com.gmp.gmph.print
 * @Description: logger writer of gmp
 * @author: kitty   
 * @date: 2016年1月13日 上午9:34:07 
 * @version: V0.1.0   
 */
package com.gmp.gmph.print;

/**
 * @ClassName: GmpGmphWriteLog
 * @Description: GmpGmphWriteLog
 * @author: kitty
 * @date: 2016年1月13日 上午9:34:07
 */
public class GmpGmphWriteLog {
	/**
	 * @Title: println
	 * @Description: print log
	 * @param level
	 * @param format
	 * @param args
	 */
	public static void println(int level, String format, Object... args) {
		switch (level) {
			case GmpGmphErrorDefined.GMP_GMPH_ERROR_NONE: {
				System.out.printf(GmpGmphErrorDefined.GmpGmphErrorLevel.GMP_GMPH_ERROR_LEVEL_NONE.getDescription() + "---" + format
						+ "\n", args);
			}
				break;
			case GmpGmphErrorDefined.GMP_GMPH_ERROR_NOTICE: {
				System.out.printf(GmpGmphErrorDefined.GmpGmphErrorLevel.GMP_GMPH_ERROR_LEVEL_NOTICE.getDescription() + "---"
						+ format + "\n", args);
			}
				break;
			case GmpGmphErrorDefined.GMP_GMPH_ERROR_WARNING: {
				System.out.printf(GmpGmphErrorDefined.GmpGmphErrorLevel.GMP_GMPH_ERROR_LEVEL_WARNING.getDescription() + "---"
						+ format + "\n", args);
			}
				break;
			case GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL: {
				System.out.printf(GmpGmphErrorDefined.GmpGmphErrorLevel.GMP_GMPH_ERROR_LEVEL_CRITICAL.getDescription() + "---"
						+ format + "\n", args);
			}
				break;
			default: {
				System.out.printf(GmpGmphErrorDefined.GmpGmphErrorLevel.GMP_GMPH_ERROR_LEVEL_NONE.getDescription() + "---" + format
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
		println(GmpGmphErrorDefined.GMP_GMPH_ERROR_NONE, format, args);
	}
	/** 
	 * @Title: printLog 
	 * @Description: print log
	 * @param format
	 * @param args
	 */
	public static void printLog(String format, Object... args) {
		if (GmpGmphErrorDefined.GMP_GMPH_DEBUG_INFORMATION) {
			println(GmpGmphErrorDefined.GMP_GMPH_ERROR_NONE, format, args);
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
