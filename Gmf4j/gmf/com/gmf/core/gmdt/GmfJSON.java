/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfJSON.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: gmf json type
 * @author: kitty   
 * @date: 2016年1月16日 下午4:26:40 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.gmf.core.Gmf;
import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.defined.GmfDefault;
import com.gmf.defined.GmfElementPrintFormat;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.defined.GmfGmdtLength;
import com.gmf.print.GmfWriteLog;
import com.gmf.util.PosByteUtil;
import com.gmf.util.PositionLengthByteUtil;

/**
 * @ClassName: GmfJSON
 * @Description: class of GmfJSON
 * @author: kitty
 * @date: 2016年1月16日 下午4:26:40
 */
public class GmfJSON extends GmfElement {
	private String value = "";

	public GmfJSON() {
		this.gmdt.setName("JS");
		this.gmdt.setMinLength(GmfGmdtLength.GMF_GMDT_LENGTH_JS);
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString(int format) {
		String retString = "";
		String valueString = "";
		if (this.value.length() <= 0) {
			valueString = "null";
		} else {
			valueString = GmfWriteLog.format("%d", this.value.length());
		}
		if (this.getErrno() == GmfErrorDefined.GMF_ERROR_CRITICAL) {
			retString = GmfWriteLog.format("[%d] %s", this.getErrno(), this.getErr());
		} else {
			switch (format) {
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY:
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY: {
					retString = GmfWriteLog.format("%s", valueString);
				}
					break;
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY:
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY: {
					retString = GmfWriteLog.format("(%s)%s", this.gmdt.getName(), valueString);
				}
					break;
				default: {
					retString = GmfWriteLog.format("(%s)%s", this.gmdt.getName(), valueString);
				}
			}
		}
		return retString;
	}
	@Override
	public int decode(Gmf gmf, byte[] data, int pos, int length) {
		int tmpPos = pos + GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH;
		int tmpLength = 0;
		tmpLength = PosByteUtil.getByteInt(data, tmpPos, length);
		if (tmpLength < 0) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL,
					"%s.%s() get string length error! return[%d] position[%d]", this.getClass().getName(), Thread
							.currentThread().getStackTrace()[2].getMethodName(), tmpLength, tmpPos);
			this.printGmfError();
			return -1;
		} else {
			tmpPos += 4;
			if (length - tmpPos < tmpLength) {
				this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL,
						"%s.%s() get string data error! surplus data length[%d] less than [%d]. position[%d]", this
								.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
						(length - tmpPos), tmpLength, tmpPos);
				this.printGmfError();
				return -2;
			}
			byte[] tmpByte = new byte[tmpLength];
			System.arraycopy(data, tmpPos, tmpByte, 0, tmpLength);
			this.value = new String(tmpByte);
			tmpPos += tmpLength;
		}
		return (tmpPos - pos);
	}
	@Override
	public byte[] encode(Gmf gmf) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int encode(Gmf gmf, byte[] dest, int pos, int length) {
		int retInt = 0;
		int tmpPos = pos;
		int tmpLength = this.value.length();
		dest[tmpPos++] = (byte) this.gmdt.getFlag();
		retInt = PositionLengthByteUtil.getBytes(tmpLength, dest, tmpPos, length);
		if (retInt < 0) {
			this.println(GmfErrorDefined.GMF_ERROR_CRITICAL, " get json string length failed.");
			return retInt;
		} else {
			tmpPos += retInt;
			byte[] tmpString = this.value.getBytes();
			System.arraycopy(tmpString, 0, dest, tmpPos, tmpLength);
			tmpPos += tmpLength;
		}
		return (tmpPos - pos);
	}
	@Override
	public boolean format(Object... args) {
		if (args.length < 1) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s args length < 1",
					this.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_MISSING.getErr());
			return false;
		}
		if (args[0] instanceof String) {
			this.setValue(((String) args[0]));
		} else if (args[0] instanceof Integer) {
			this.setValue(String.valueOf(((Integer) args[0]).intValue()));
		} else if (args[0] instanceof Short) {
			this.setValue(String.valueOf(((Short) args[0]).shortValue()));
		} else if (args[0] instanceof Long) {
			this.setValue(String.valueOf(((Long) args[0]).longValue()));
		} else if (args[0] instanceof Float) {
			this.setValue(String.valueOf(((Float) args[0]).floatValue()));
		} else if (args[0] instanceof Double) {
			this.setValue(String.valueOf(((Double) args[0]).doubleValue()));
		} else if (args[0] instanceof Boolean) {
			this.setValue(String.valueOf(((Boolean) args[0]).booleanValue()));
		} else if (args[0] instanceof Date) {
			Date d = (Date) args[0];
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			this.setValue(format.format(d));
		} else {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s ", this.getClass().getName(), Thread
					.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_UNSUPPORT.getErr());
			return false;
		}
		return true;
	}
	@Override
	public Object getObjectValue() {
		return this.getValue();
	}
}
