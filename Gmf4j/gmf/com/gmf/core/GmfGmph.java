/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfRectBean.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.beans 
 * @Description: gmfgmph is header of gmf
 * @author: kitty   
 * @date: 2016年1月16日 下午4:33:08 
 * @version: V0.1.0   
 */
package com.gmf.core;

import com.gmf.defined.GmfElementPrintFormat;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.defined.GmfGmpDefined;
import com.gmf.defined.GmfGmpEncode;
import com.gmf.print.GmfWriteLog;
import com.gmf.util.PosByteUtil;
import com.gmf.util.PositionLengthByteUtil;

/**
 * @ClassName: GmfGmph
 * @Description: process gmfgmph information
 * @author: kitty
 * @date: 2016年1月25日 下午3:10:02
 */
public class GmfGmph {
	/**
	 * @fieldName: flag
	 * @fieldType: String
	 * @Description: defined gmfgmph flag string
	 */
	private String flag = "GMFT";
	/**
	 * @fieldName: version
	 * @fieldType: int
	 * @Description: version number
	 */
	private byte version = GmfGmpDefined.GMF_GMPH_VERSION;
	/**
	 * @fieldName: endian
	 * @fieldType: int
	 * @Description: endian type
	 */
	private byte endian = GmfGmpDefined.GMF_GMPH_ENDIAN;
	/**
	 * @fieldName: encode
	 * @fieldType: int
	 * @Description: encode type
	 */
	private byte encode = GmfGmpDefined.GMF_GMPH_ENCODE;
	/**
	 * @fieldName: bodySize
	 * @fieldType: int
	 * @Description: gmf body size
	 */
	private int bodySize = 0;

	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public int getVersion() {
		return version;
	}
	/**
	 * @return the endian
	 */
	public byte getEndian() {
		return endian;
	}
	/**
	 * @param endian the endian to set
	 */
	public void setEndian(byte endian) {
		this.endian = endian;
	}
	/**
	 * @return the encode
	 */
	public byte getEncode() {
		return encode;
	}
	/**
	 * @param encode the encode to set
	 */
	public void setEncode(byte encode) {
		this.encode = encode;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(byte version) {
		this.version = version;
	}
	public int getBodySize() {
		return bodySize;
	}
	public void setBodySize(int bodySize) {
		this.bodySize = bodySize;
	}
	/**
	 * @Title: getEncodeLength
	 * @Description: encode length of gmfgmph
	 * @return int length of gmfgmph encode
	 */
	public int getEncodeLength() {
		return GmfGmpDefined.GMF_GMPH_LENGTH;
	}
	/**
	 * @Title: toString
	 * @Description: gmf gmph to string
	 * @param format format type
	 * @return String return format string
	 */
	public String toString(int format) {
		return GmfWriteLog.format("%s[Flag\tVersion\tEndian\tEncode\tBodySize]\n%s[%s\t0x%02X\t0x%02X\t0x%02X\t%d]",
				GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_TAB, GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_TAB,
				this.flag, this.version, this.endian, this.encode, this.bodySize);
	}
	/**
	 * @Title: checkFlag
	 * @Description: check gmfgmph flag
	 * @return boolean right flag return true; other return false;
	 */
	public boolean checkFlag() {
		return this.flag.equals(GmfGmpDefined.GMF_GMPH_GMFT);
	}
	/**
	 * @Title: decode
	 * @Description: decode gmfgmph data
	 * @param gmf current gmf
	 * @param data input buffer to decode
	 * @param pos position of input buffer
	 * @param length input buffer data length
	 * @return int used buffer length
	 */
	public int decode(Gmf gmf, byte[] data, int pos, int length) {
		if (length < GmfGmpDefined.GMF_GMPH_LENGTH) {
			gmf.getGmfError().setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s length[%d] error!",
					this.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_LENGTH.getErr(), length);
			return 0;
		} else {
			int tmpPos = pos;
			int flagLength = GmfGmpDefined.GMF_GMPH_GMFT.length();
			// prase gmph header
			this.flag = PosByteUtil.subBytesToString(data, tmpPos, 0, flagLength, GmfGmpEncode.getEncode(this.encode));
			tmpPos += flagLength;
			this.version = data[tmpPos++];
			this.endian = data[tmpPos++];
			this.encode = data[tmpPos++];
			this.bodySize = PosByteUtil.getInt(data, tmpPos, length);
			tmpPos += Integer.SIZE / 8;
			return (tmpPos - pos);
		}
	}
	/**
	 * @Title: encode
	 * @Description: encode gmfgmph data to byte[]
	 * @param gmf current gmf
	 * @param dest output buffer
	 * @param pos position of output buffer to used
	 * @param length total length of output buffer
	 * @return int used length of output buffer
	 */
	public int encode(Gmf gmf, byte[] dest, int pos, int length) {
		int tmpPos = pos;
		int retInt = 0;
		System.arraycopy(this.flag.getBytes(), 0, dest, tmpPos, this.flag.length());
		tmpPos += 4;
		retInt = PositionLengthByteUtil.getBytes(this.version, dest, tmpPos, length);
		if (retInt < 0) {
			return retInt;
		} else {
			tmpPos += 1;
			retInt = PositionLengthByteUtil.getBytes(this.endian, dest, tmpPos, length);
			if (retInt < 0) {
				return retInt;
			}
			tmpPos += 1;
			retInt = PositionLengthByteUtil.getBytes(this.encode, dest, tmpPos, length);
			if (retInt < 0) {
				return retInt;
			}
			tmpPos += 1;
			retInt = PositionLengthByteUtil.getBytes(this.bodySize, dest, tmpPos, length);
			if (retInt < 0) {
				return retInt;
			} else {
				tmpPos += 4;
			}
		}

		return (tmpPos - pos);
	}
}
