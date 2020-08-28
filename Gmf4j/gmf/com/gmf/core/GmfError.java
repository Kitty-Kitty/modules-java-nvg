/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfRectBean.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.beans 
 * @Description: collect error information
 * @author: kitty   
 * @date: 2016年1月16日 下午4:33:08 
 * @version: V0.1.0   
 */
package com.gmf.core;

import com.gmf.defined.GmfErrorDefined;
import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfError
 * @Description: gmf error class
 * @author: kitty
 * @date: 2016年1月25日 下午3:09:51
 */
public class GmfError {
	/**
	 * @fieldName: errno
	 * @fieldType: int
	 * @Description: number of error. or level of error
	 */
	private int errno = GmfErrorDefined.GMF_ERROR_NONE;
	/**
	 * @fieldName: err
	 * @fieldType: String
	 * @Description: error description
	 */
	private String err = "";
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
	/**
	 * @Title: setErrInfo
	 * @Description: set a gmfError
	 * @param errno number of errno
	 * @param err description of error
	 */
	public void setErrInfo(int errno, String err) {
		this.errno = errno;
		this.err = err;
	}
	/**
	 * @Title: setErrInfo
	 * @Description: set a gmfError and format error description
	 * @param errno number of error
	 * @param format format string
	 * @param args all arguments
	 */
	public void setErrInfo(int errno, String format, Object... args) {
		setErrInfo(errno, GmfWriteLog.format(format, args));
	}
}
