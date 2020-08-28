/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpGmphErrorDefined.java 
 * @Prject: gmp
 * @Package: com.gmp.gmph.print
 * @Description: gmp gmph error defined
 * @author: kitty   
 * @date: 2016年1月16日 下午4:55:03 
 * @version: V0.1.0   
 */
package com.gmp.gmph.print;



/** 
 * @ClassName: GmpGmphErrorDefined 
 * @Description: defined something about error
 * @author: kitty
 * @date: 2016年1月28日 下午6:19:03  
 */
public interface GmpGmphErrorDefined {
	/** 
	 * @ClassName: GmpGmphErrorInformation 
	 * @Description: error string
	 * @author: kitty
	 * @date: 2016年1月28日 下午6:19:21  
	 */
	public enum GmpGmphErrorInformation {
		GMP_GMPH_ERROR_STRING_VERSION(0, "gmph version error."),
		GMP_GMPH_ERROR_STRING_EMHT(1, "gmph emht error."),
		GMP_GMPH_ERROR_STRING_LENGTH(2, "data length error."),
		GMP_GMPH_ERROR_STRING_ENCODE(3, "encode error.");
		
		private int errno;
		private String err;
		
	    /** 
	     * @Title:GmpGmphErrorInformation
	     * @Description:constructor of GmpGmphErrorInformation enum
	     * @param errno error number
	     * @param err  error description
	     */
	    private GmpGmphErrorInformation(int errno, String err) {
	        this.errno = errno;
	        this.err = err;
	    }

		/**
		 * @return the errno
		 */
		public int getErrno() {
			return errno;
		}

		/**
		 * @param errno the errno to set
		 */
		public void setErrno(int errno) {
			this.errno = errno;
		}

		/**
		 * @return the err
		 */
		public String getErr() {
			return err;
		}

		/**
		 * @param err the err to set
		 */
		public void setErr(String err) {
			this.err = err;
		}
	}
	
	
	/** 
	 * @ClassName: GmpGmphErrorLevel 
	 * @Description: defined error level
	 * @author: kitty
	 * @date: 2016年1月28日 下午6:20:19  
	 */
	public enum GmpGmphErrorLevel {
		GMP_GMPH_ERROR_LEVEL_NONE(GMP_GMPH_ERROR_NONE, "none"), 
		GMP_GMPH_ERROR_LEVEL_NOTICE(GMP_GMPH_ERROR_NOTICE, "notice"),
		GMP_GMPH_ERROR_LEVEL_WARNING(GMP_GMPH_ERROR_WARNING, "warning"),
		GMP_GMPH_ERROR_LEVEL_CRITICAL(GMP_GMPH_ERROR_CRITICAL, "critical");
		
		private int level;
		private String description;
		
	    /** 
	     * @Title:GmpGmphErrorLevel
	     * @Description:constructor of GmpGmphErrorLevel
	     * @param level
	     * @param description 
	     */
	    private GmpGmphErrorLevel(int level, String description) {
	        this.level = level;
	        this.description = description;
	    }

		/**
		 * @return the level
		 */
		public int getLevel() {
			return level;
		}

		/**
		 * @param level the level to set
		 */
		public void setLevel(int level) {
			this.level = level;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}
	}
	
	
	public static final int GMP_GMPH_ERROR_NONE = 0;
	public static final int GMP_GMPH_ERROR_NOTICE = 200;
	public static final int GMP_GMPH_ERROR_WARNING = 300;
	public static final int GMP_GMPH_ERROR_CRITICAL = 400;
	

	public static final boolean GMP_GMPH_DEBUG_INFORMATION = false;
}
