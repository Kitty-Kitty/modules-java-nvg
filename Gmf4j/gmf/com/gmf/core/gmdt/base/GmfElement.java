/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfElement.java
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt.base
 * @Description: super class of all gmf element 
 * @author: kitty   
 * @date: 2016年1月13日 下午3:15:34 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt.base;

import com.gmf.core.Gmf;
import com.gmf.core.GmfError;
import com.gmf.core.GmfPosition;
import com.gmf.defined.GmfElementPrintFormat;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.defined.GmfGmdtFlag;
import com.gmf.print.GmfWriteLog;
import com.gmf.util.ByteUtil;

/**
 * @ClassName: GmfElement
 * @Description: GmfElement
 * @author: kitty
 * @date: 2016年1月28日 下午4:43:53
 */
public abstract class GmfElement extends GmfError implements GmfElementInterface {
	/**
	 * @fieldName: gmdt
	 * @fieldType: GmfGmdt
	 * @Description: gmdt information of GmfElement
	 */
	public GmfGmdt gmdt = new GmfGmdt();
	/**
	 * @fieldName: gmfPosition
	 * @fieldType: GmfPosition
	 * @Description: position information of GmfElement
	 */
	public GmfPosition gmfPosition = new GmfPosition();
	/**
	 * @fieldName: length
	 * @fieldType: int
	 * @Description: data length of GmfElement
	 */
	private int length = 0;

	/**
	 * @Title: getLength
	 * @Description: get gmf element byte[] data length
	 * @return: int
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @Title: setLength
	 * @Description: set gmf element byte[] data length
	 * @param length
	 * @return: void
	 */
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public int size() {
		return this.gmdt.getMinLength();
	}
	@Override
	public int getEncodeLength() {
		return this.gmdt.getMinLength();
	}
	/*
	 * (non Javadoc)
	 * @Title: isObjectGmfElement
	 * @Description: TODO
	 * @return
	 * @see com.gmf.core.gmdt.GmfElementImpl#isObjectGmfElement()
	 */
	public final boolean isGmfContainerElement() {
		if (this.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_A || this.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_O) {
			return true;
		}
		return false;
	}
	/**
	 * @Title: println
	 * @Description: print GmfElement log information
	 * @param code log level number
	 * @param format format string
	 * @param args arguments
	 */
	public final void println(int code, String format, Object... args) {
		if (gmfPosition.getGmf().isPrintDebugInforamtion()) {
			String tmpFormat = GmfWriteLog.format("%s.%s() ", 
					this.getClass().getName(), 
					Thread.currentThread().getStackTrace()[2].getMethodName());
			GmfWriteLog.println(code, tmpFormat + format, args);
		}
	}
	/**
	 * @Title: printGmfError
	 * @Description: print GmfElement error information
	 */
	public final void printGmfError() {
		if (gmfPosition.getGmf().isPrintDebugInforamtion()) {
			String tmpFormat = GmfWriteLog.format("%s.%s() ", 
					this.getClass().getName(), 
					Thread.currentThread().getStackTrace()[2].getMethodName());
			GmfWriteLog.println(this.getErrno(), tmpFormat + "%s", this.getErr());
		}
	}
	/**
	 * @Title: toPrintString
	 * @Description: to print string
	 * @return String
	 */
	public final String toPrintString() {
		return this.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY);
	}
	/**
	 * @Title: toPrintAllString
	 * @Description: to print all string with object element, and this object element has children.
	 *               other element likely toPrintString()
	 * @return String
	 */
	public final String toPrintAllString() {
		return this.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY);
	}
	/**
	 * @Title: toPrintPrittyString
	 * @Description: to print pritty string
	 * @return String
	 */
	public final String toPrintPrittyString() {
		return this.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY);
	}
	/**
	 * @Title: toPrintAllString
	 * @Description: to print all string with object element, and this object element has children.
	 *               other element likely toPrintPrittyString()
	 * @return String
	 */
	public final String toPrintAllPrittyString() {
		return this.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY);
	}
	/*
	 * (non Javadoc)
	 * @Title: check
	 * @Description: TODO
	 * @param gmf
	 * @param data
	 * @param pos
	 * @param length
	 * @return
	 * @see com.gmf.core.gmdt.GmfElementImpl#check(com.gmf.core.Gmf, byte[], int, int)
	 */
	public boolean check(Gmf gmf, byte[] data, int pos, int length) {
		int lastLength = length - pos;
		this.gmfPosition.setGmf(gmf);
		if (lastLength < this.gmdt.getMinLength()) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s length[%d] < min length[%d] error!", this
					.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_LENGTH.getErr(), lastLength, this.gmdt
							.getMinLength());
			return false;
		}
		this.gmdt.setFlag(ByteUtil.getByteInt(data[pos]));
		return true;
	}
	/*
	 * (non Javadoc)
	 * @Title: begin
	 * @Description: TODO
	 * @param gmf
	 * @param data
	 * @param pos
	 * @param length
	 * @return
	 * @see com.gmf.core.gmdt.GmfElementImpl#begin(com.gmf.core.Gmf, byte[], int, int)
	 */
	public final int begin(Gmf gmf, byte[] data, int pos, int length) {
		this.gmfPosition.setPosition(pos);
		this.gmfPosition.setLayer(gmf.getLayer());
		this.gmfPosition.setParentGmdu(gmf.getCurrentGmfGmdu());
		return 0;
	}
	/*
	 * (non Javadoc)
	 * @Title: end
	 * @Description: TODO
	 * @param gmf
	 * @param data
	 * @param pos
	 * @param length
	 * @return
	 * @see com.gmf.core.gmdt.GmfElementImpl#end(com.gmf.core.Gmf, byte[], int, int)
	 */
	public final int end(Gmf gmf, byte[] data, int pos, int length) {
		println(GmfErrorDefined.GMF_ERROR_NOTICE, "decode gmf element[(%s)%d] successed. used data length[%d].\t%s",
				this.gmdt.getName(), this.gmdt.getFlag(), (pos - this.gmfPosition.getPosition()),
				toPrintAllPrittyString());
		return 0;
	}
	/**
	 * @Title: format
	 * @Description: format data to GmfElement
	 * @param format GmfElement type name
	 * @param args GmfElement data arguments
	 * @return GmfElement return a GmfElement
	 */
	public static GmfElement format(String format, Object... args) {
		return GmfElementFormat.format(format, args);
	}
}
