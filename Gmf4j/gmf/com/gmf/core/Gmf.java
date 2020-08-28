/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfRectBean.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.beans 
 * @Description: process whole data of gmf
 * @author: kitty   
 * @date: 2016年1月16日 下午4:33:08 
 * @version: V0.1.0   
 */
package com.gmf.core;

import com.gmf.core.gmdt.base.GmfElementManager;
import com.gmf.core.gmdu.GmfGmdu;
import com.gmf.defined.GmfElementPrintFormat;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.defined.GmfGmdtFlag;
import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: Gmf
 * @Description: gmf class
 * @author: kitty
 * @date: 2016年1月25日 下午3:09:31
 */
public class Gmf {
	/**
	 * @fieldName: gmfVersion
	 * @fieldType: GmfVersion
	 * @Description: defined a gmf version
	 */
	private GmfVersion gmfVersion = new GmfVersion();
	/**
	 * @fieldName: gmfGmph
	 * @fieldType: GmfGmph
	 * @Description: defined a gmph of gmf
	 */
	private GmfGmph gmfGmph = new GmfGmph();
	/**
	 * @fieldName: gmfError
	 * @fieldType: GmfError
	 * @Description: defined a error information of gmf
	 */
	private GmfError gmfError = new GmfError();
	/**
	 * @fieldName: rootGmfGmdu
	 * @fieldType: GmfGmdu
	 * @Description: defined a root gmfgmdu of gmf
	 */
	private GmfGmdu rootGmfGmdu = null;
	/**
	 * @fieldName: currentGmfGmdu
	 * @fieldType: GmfGmdu
	 * @Description: defined a current gmfgmdu of gmf
	 */
	private GmfGmdu currentGmfGmdu = null;
	/**
	 * @fieldName: layer
	 * @fieldType: int
	 * @Description: current layers of gmf data
	 */
	private int layer = 0;
	/**
	 * @fieldName: maxLayer
	 * @fieldType: int
	 * @Description: max layers of this gmf
	 */
	private int maxLayer = 0;
	/**
	 * @fieldName: printLayer
	 * @fieldType: int
	 * @Description: current print layer
	 */
	private int printLayer = 0;
	/**
	 * @fieldName: length
	 * @fieldType: int
	 * @Description: gmf data length (format byte[])
	 */
	private int length = 0;
	/**
	 * @fieldName: isPrintDebugInforamtion
	 * @fieldType: boolean
	 * @Description: is print debug information
	 */
	private boolean isPrintDebugInforamtion = GmfErrorDefined.GMF_DEBUG_INFORMATION;

	public Gmf() {
		try {
			this.rootGmfGmdu = GmfGmdu.createGmfGmdu(GmfElementManager.createGmfElement(GmfGmdtFlag.GMF_GMDT_O),
					GmfElementManager.createGmfElement(GmfGmdtFlag.GMF_GMDT_N));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.rootGmfGmdu.getGmfPosition().setGmf(this);
		this.rootGmfGmdu.getGmfPosition().setLayer(this.layer);
		this.rootGmfGmdu.getGmfPosition().setParentGmdu(this.rootGmfGmdu);
		this.rootGmfGmdu.updateGmfGmduKeyAndValueInfo();
		this.currentGmfGmdu = this.rootGmfGmdu;
		this.setLength(this.rootGmfGmdu.getEncodeLength() + this.gmfGmph.getEncodeLength());
	}
	/**
	 * @Title: getGmfVersion
	 * @Description: get gmf version information
	 * @return GmfVersion version object
	 */
	public GmfVersion getGmfVersion() {
		return gmfVersion;
	}
	/**
	 * @Title: setGmfVersion
	 * @Description: set gmf version information
	 * @param gmfVersion version Object
	 */
	public void setGmfVersion(GmfVersion gmfVersion) {
		this.gmfVersion = gmfVersion;
	}
	/**
	 * @Title: getGmfGmph
	 * @Description: get header of gmf information, called GmfGmph
	 * @return GmfGmph GmfGmph Object
	 */
	public GmfGmph getGmfGmph() {
		return gmfGmph;
	}
	/**
	 * @Title: setGmfGmph
	 * @Description: set header of gmf information, called GmfGmph
	 * @param gmfGmph GmfGmph Object
	 */
	public void setGmfGmph(GmfGmph gmfGmph) {
		this.gmfGmph = gmfGmph;
	}
	/**
	 * @Title: getGmfError
	 * @Description: get error information of gmf
	 * @return GmfError Object
	 */
	public GmfError getGmfError() {
		return gmfError;
	}
	public void setGmfError(GmfError gmfError) {
		this.gmfError = gmfError;
	}
	/**
	 * @return the rootGmfGmdu
	 */
	public GmfGmdu getRootGmfGmdu() {
		return rootGmfGmdu;
	}
	/**
	 * @param rootGmfGmdu the rootGmfGmdu to set
	 */
	public void setRootGmfGmdu(GmfGmdu rootGmfGmdu) {
		this.rootGmfGmdu = rootGmfGmdu;
	}
	/**
	 * @return the currentGmfGmdu
	 */
	public GmfGmdu getCurrentGmfGmdu() {
		return currentGmfGmdu;
	}
	/**
	 * @param currentGmfGmdu the currentGmfGmdu to set
	 */
	public void setCurrentGmfGmdu(GmfGmdu currentGmfGmdu) {
		this.currentGmfGmdu = currentGmfGmdu;
	}
	public int getLayer() {
		return layer;
	}
	public void setLayer(int layer) {
		if (this.maxLayer < layer) {
			this.maxLayer = this.layer;
		}
		this.layer = layer;
	}
	public int getMaxLayer() {
		return maxLayer;
	}
	public void setMaxLayer(int maxLayer) {
		this.maxLayer = maxLayer;
	}
	public int getPrintLayer() {
		return printLayer;
	}
	public void setPrintLayer(int printLayer) {
		this.printLayer = printLayer;
	}
	public boolean isPrintDebugInforamtion() {
		return isPrintDebugInforamtion;
	}
	public void setPrintDebugInforamtion(boolean isPrintDebugInforamtion) {
		this.isPrintDebugInforamtion = isPrintDebugInforamtion;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @Title: toPrintAllString
	 * @Description: to print gmf data
	 * @return String
	 */
	public String toPrintAllString() {
		this.setPrintLayer(GmfElementPrintFormat.GMF_ELEMENT_PRINT_LAYER_NUMBER);
		this.gmfGmph.setBodySize(this.getLength() - this.gmfGmph.getEncodeLength());
		return GmfWriteLog.format("%s :\n%s\n\n%s\n",
				this.gmfVersion.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY),
				this.gmfGmph.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY),
				this.rootGmfGmdu.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY));
	}
	/**
	 * @Title: toPrintAllString
	 * @Description: to print gmf data
	 * @return String
	 */
	public String toPrintAllPrittyString() {
		this.setPrintLayer(GmfElementPrintFormat.GMF_ELEMENT_PRINT_LAYER_NUMBER);
		this.gmfGmph.setBodySize(this.getLength() - this.gmfGmph.getEncodeLength());
		return GmfWriteLog.format("%s :\n%s\n\n%s\n",
				this.gmfVersion.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY),
				this.gmfGmph.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY),
				this.rootGmfGmdu.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY));
	}
	/**
	 * @Title: decodeGmph
	 * @Description: decode gmfGmph information
	 * @param data output buffer
	 * @param length data buffer length
	 * @return int used buffer length
	 */
	public int decodeGmph(byte[] data, int pos, int length) {
		return this.gmfGmph.decode(this, data, pos, length);
	}
	/**
	 * @Title: decode
	 * @Description: decode all of gmf element data
	 * @param data input buffer
	 * @return int used buffer length
	 */
	public int decode(byte[] data) {
		return decode(data, 0, data.length);
	}
	/**
	 * @Title: decode
	 * @Description: decode all of gmf element data
	 * @param data input buffer
	 * @param pos position of input buffer
	 * @return int used buffer length
	 */
	public int decode(byte[] data, int pos) {
		return decode(data, pos, data.length);
	}
	/**
	 * @Title: decode
	 * @Description: decode all of gmf element data
	 * @param data input buffer
	 * @param pos position of input buffer
	 * @param length input buffer length
	 * @return int used buffer length
	 */
	public int decode(byte[] data, int pos, int length) {
		int retGmphLength = 0;
		int retGmfbLength = 0;
		// decode gmph information
		retGmphLength = decodeGmph(data, pos, length);
		if (retGmphLength <= 0) {
			return retGmphLength;
		} else {
			// check gmph flag
			if (!this.gmfGmph.checkFlag()) {
				this.gmfError.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, GmfWriteLog.format(
						"%s.%s() %s gmph flag[%s] error!", this.getClass().getName(), Thread.currentThread()
								.getStackTrace()[2].getMethodName(),
						GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_CHECK_GMFELEMENT.getErr(), this.gmfGmph
								.getFlag()));
				return -2;
			}
			// check gmph size length
			if (this.gmfGmph.getBodySize() > (length - pos - retGmphLength)) {
				this.gmfError.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, GmfWriteLog.format(
						"%s.%s() %s gmph flag[%s] error!", this.getClass().getName(), Thread.currentThread()
								.getStackTrace()[2].getMethodName(),
						GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_CONTENT.getErr(), this.gmfGmph.getFlag()));
				return -3;
			}
			// decode gmdu data
			retGmfbLength = rootGmfGmdu.decode(this, data, pos + retGmphLength, length);
			if (retGmfbLength < 0) {
				return retGmfbLength;
			} else {
				this.setLength(this.getGmfGmph().getEncodeLength() + this.getGmfGmph().getBodySize());
				this.setCurrentGmfGmdu(rootGmfGmdu);
			}
		}
		return (retGmphLength + retGmfbLength);
	}
	/**
	 * @Title: encode
	 * @Description: encode all of gmf element data
	 * @return byte[] output buffer of encode gmf element
	 */
	public byte[] encode() {
		int retInt = 0;
		int tmpPos = 0;
		int tmpEncodeGmfGmphLength = this.gmfGmph.getEncodeLength();
		int tmpEncodeGmfGmduLength = this.getRootGmfGmdu().getEncodeLength();
		int tmpEncodeLength = tmpEncodeGmfGmphLength + tmpEncodeGmfGmduLength;
		this.setLength(tmpEncodeLength);
		if (tmpEncodeLength < 0) {
			return null;
		} else {
			byte[] data = new byte[tmpEncodeLength];
			this.getGmfGmph().setBodySize(tmpEncodeGmfGmduLength);
			retInt = this.getGmfGmph().encode(this, data, tmpPos, tmpEncodeLength);
			if (retInt < 0) {
				this.getGmfError().setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, " decode GmfGmph failed.");
				return null;
			} else {
				tmpPos += retInt;
				if (null == rootGmfGmdu) {
					this.getGmfError().setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, " rootGmfGmdu is null.");
					return null;
				} else {
					retInt = rootGmfGmdu.encode(this, data, tmpPos, tmpEncodeLength);
					if (retInt < 0) {
						this.getGmfError()
								.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, " decode rootGmfGmdu failed.");
						return null;
					} else {
						tmpPos += retInt;
					}
				}
			}

			return data;
		}
	}
}
