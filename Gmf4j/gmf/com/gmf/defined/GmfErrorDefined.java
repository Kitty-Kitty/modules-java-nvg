/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfErrorDefined.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.defined 
 * @Description: gmf error defined
 * @author: kitty   
 * @date: 2016年1月16日 下午4:55:03 
 * @version: V0.1.0   
 */
package com.gmf.defined;



/** 
 * @ClassName: GmfErrorDefined 
 * @Description: defined something about error
 * @author: kitty
 * @date: 2016年1月28日 下午6:19:03  
 */
public interface GmfErrorDefined {
	/** 
	 * @ClassName: GmfErrorInformation 
	 * @Description: error string
	 * @author: kitty
	 * @date: 2016年1月28日 下午6:19:21  
	 */
	public enum GmfErrorInformation {
		GMF_ERROR_STRING_CONTENT(0, "content error."), 
		GMF_ERROR_STRING_LENGTH(1, "data length error."),
		GMF_ERROR_STRING_GMDT(2, "unknow gmdt flag error."),
		GMF_ERROR_STRING_GMDT_BROKEN(3, "get gmdt information error."),
		GMF_ERROR_STRING_GMDT_ARGS_MISSING(4, "gmdt args missing."),
		GMF_ERROR_STRING_GMDT_ARGS_UNSUPPORT(5, "gmdt unsupport args type."),
		GMF_ERROR_STRING_GMDT_ARGS_ERROR(5, "gmdt args value error."),
		GMF_ERROR_STRING_CREATE_GMFELEMENT(6, "create GmfElement error."),
		GMF_ERROR_STRING_CHECK_GMFELEMENT(7, "GmfElement check error."),
		GMF_ERROR_STRING_GMDU_CHECK(8, "create gmdu error. check() failed."),
		GMF_ERROR_STRING_GMDU_BROKEN(9, "gmdu broken."),
		GMF_ERROR_STRING_GMDU_WHOLE_OBJECT(10, "gmdu key/value whole object element."),
		GMF_ERROR_STRING_GMDU_EXISTED(11, "gmdu existed."),
		GMF_ERROR_STRING_GMDU_NULL(12, "gmdu null."),
		GMF_ERROR_STRING_GMDU_KEY_NULL(13, "key is null."),
		GMF_ERROR_STRING_GMDU_VALUE_NULL(14, "value is null.");
		
		private int errno;
		private String err;
		
	    /** 
	     * @Title:GmfErrorInformation
	     * @Description:constructor of GmfErrorInformation enum
	     * @param errno error number
	     * @param err  error description
	     */
	    private GmfErrorInformation(int errno, String err) {
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
	 * @ClassName: GmfErrorLevel 
	 * @Description: defined error level
	 * @author: kitty
	 * @date: 2016年1月28日 下午6:20:19  
	 */
	public enum GmfErrorLevel {
		GMF_ERROR_LEVEL_NONE(GMF_ERROR_NONE, "none"), 
		GMF_ERROR_LEVEL_NOTICE(GMF_ERROR_NOTICE, "notice"),
		GMF_ERROR_LEVEL_WARNING(GMF_ERROR_WARNING, "warning"),
		GMF_ERROR_LEVEL_CRITICAL(GMF_ERROR_CRITICAL, "critical");
		
		private int level;
		private String description;
		
	    /** 
	     * @Title:GmfErrorLevel
	     * @Description:constructor of GmfErrorLevel
	     * @param level
	     * @param description 
	     */
	    private GmfErrorLevel(int level, String description) {
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
	
	
	public static final int GMF_ERROR_NONE = 0;
	public static final int GMF_ERROR_NOTICE = 200;
	public static final int GMF_ERROR_WARNING = 300;
	public static final int GMF_ERROR_CRITICAL = 400;
	

	public static final boolean GMF_DEBUG_INFORMATION = false;
	public static final String GMF_ERROR_GMDU_KEY = "ERROR_GMDU";
	
}
