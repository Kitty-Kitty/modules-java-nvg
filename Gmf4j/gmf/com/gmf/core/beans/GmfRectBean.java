/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfRectBean.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.beans 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月16日 下午4:33:08 
 * @version: V0.1.0   
 */
package com.gmf.core.beans;

/**
 * @ClassName: GmfRectBean
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月16日 下午4:33:08
 */
public class GmfRectBean {
	/**
	 * @fieldName: top
	 * @fieldType: int
	 * @Description: rect top
	 */
	private int top = 0;
	/**
	 * @fieldName: left
	 * @fieldType: int
	 * @Description: rect left
	 */
	private int left = 0;
	/**
	 * @fieldName: right
	 * @fieldType: int
	 * @Description: rect right
	 */
	private int right = 0;
	/**
	 * @fieldName: bottom
	 * @fieldType: int
	 * @Description: rect bottom
	 */
	private int bottom = 0;

	/**
	 * @return the top
	 */
	public int getTop() {
		return top;
	}
	/**
	 * @param top the top to set
	 */
	public void setTop(int top) {
		this.top = top;
	}
	/**
	 * @return the left
	 */
	public int getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(int left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public int getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(int right) {
		this.right = right;
	}
	/**
	 * @return the bottom
	 */
	public int getBottom() {
		return bottom;
	}
	/**
	 * @param bottom the bottom to set
	 */
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	/**
	 * @Title: toGmfString
	 * @Description: format rect data to gmf string
	 * @return String return rect string
	 */
	public String toGmfString() {
		return String.format("[(%d,%d),(%d,%d)]", this.left, this.top, this.right, this.bottom);
	}
}
