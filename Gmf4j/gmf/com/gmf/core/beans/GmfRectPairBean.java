/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfRectPairBean.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.beans 
 * @Description: defined rect pair bean
 * @author: kitty   
 * @date: 2016年1月16日 下午4:35:20 
 * @version: V0.1.0   
 */
package com.gmf.core.beans;

/**
 * @ClassName: GmfRectPairBean
 * @Description: rect pair bean
 * @author: kitty
 * @date: 2016年1月16日 下午4:35:20
 */
public class GmfRectPairBean {
	/**
	 * @fieldName: source
	 * @fieldType: GmfRectBean
	 * @Description: source rect information
	 */
	private GmfRectBean source = new GmfRectBean();
	/**
	 * @fieldName: destination
	 * @fieldType: GmfRectBean
	 * @Description: destination rect information
	 */
	private GmfRectBean destination = new GmfRectBean();

	/**
	 * @return the source
	 */
	public GmfRectBean getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(GmfRectBean source) {
		this.source = source;
	}
	/**
	 * @return the destination
	 */
	public GmfRectBean getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(GmfRectBean destination) {
		this.destination = destination;
	}
	/**
	 * @Title: toGmfString
	 * @Description: format rect pair to gmf string
	 * @return String return rect pair string
	 */
	public String toGmfString() {
		return String.format("S%s D%s", this.source.toGmfString(), this.destination.toGmfString());
	}
}
