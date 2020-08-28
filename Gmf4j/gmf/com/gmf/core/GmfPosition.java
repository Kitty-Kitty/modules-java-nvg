/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfGmduPosition.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.defined 
 * @Description: gmfElement or GmfGmdu position
 * @author: kitty   
 * @date: 2016年1月10日 下午9:02:51 
 * @version: V0.1.0   
 */
package com.gmf.core;

import com.gmf.core.gmdu.GmfGmdu;
import com.gmf.defined.GmfElementPrintFormat;

/**
 * @ClassName: GmfGmduPosition
 * @Description: gmfPostion
 * @author: kitty
 * @date: 2016年1月10日 下午9:02:51
 */
public class GmfPosition {
	/**
	 * @fieldName: layer
	 * @fieldType: int
	 * @Description: current layer of gmf
	 */
	private int layer = 0;
	/**
	 * @fieldName: position
	 * @fieldType: int
	 * @Description: position of input byte[]
	 */
	private int position = 0;
	/**
	 * @fieldName: parentGmdu
	 * @fieldType: GmfGmdu
	 * @Description: parent gmdu
	 */
	private GmfGmdu parentGmdu = null;
	/**
	 * @fieldName: gmf
	 * @fieldType: Gmf
	 * @Description: current gmf
	 */
	private Gmf gmf = null;
	/**
	 * @return the layer
	 */
	public int getLayer() {
		return layer;
	}
	/**
	 * @param layer the layer to set
	 */
	public void setLayer(int layer) {
		this.layer = layer;
	}
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	/**
	 * @return the parentGmdu
	 */
	public GmfGmdu getParentGmdu() {
		return parentGmdu;
	}
	/**
	 * @param parentGmdu the parentGmdu to set
	 */
	public void setParentGmdu(GmfGmdu parentGmdu) {
		this.parentGmdu = parentGmdu;
	}
	/**
	 * @return the gmf
	 */
	public Gmf getGmf() {
		return gmf;
	}
	/**
	 * @param gmf the gmf to set
	 */
	public void setGmf(Gmf gmf) {
		this.gmf = gmf;
	}
	/**
	 * @Title: makeTabString
	 * @Description: make tab string by layer information
	 * @return String string of tab
	 */
	public String makeTabString() {
		String tabString = "";
		int tmpLayer = 0;
		if (null != this.gmf) {
			tmpLayer = this.gmf.getPrintLayer();
		} else {
			tmpLayer = this.layer;
		}
		for (int i = 0; i < tmpLayer; i++) {
			tabString += GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_TAB;
		}
		return tabString;
	}
	/**
	 * @Title: addPrintLayer
	 * @Description: add one layer
	 */
	public void addPrintLayer() {
		if (null != this.gmf) {
			this.gmf.setPrintLayer(this.gmf.getPrintLayer() + 1);
		}
	}
	/**
	 * @Title: divPrintLayer
	 * @Description: div one layer
	 */
	public void divPrintLayer() {
		if (null != this.gmf) {
			this.gmf.setPrintLayer(this.gmf.getPrintLayer() - 1);
		}
	}
}
