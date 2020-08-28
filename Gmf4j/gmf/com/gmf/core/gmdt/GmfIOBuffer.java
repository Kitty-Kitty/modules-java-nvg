/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfIOBuffer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: gmf iobuffer type
 * @author: kitty   
 * @date: 2016年1月16日 下午4:28:31 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt;

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
 * @ClassName: GmfIOBuffer
 * @Description: class of GmfIOBuffer
 * @author: kitty
 * @date: 2016年1月16日 下午4:28:31
 */
public class GmfIOBuffer extends GmfElement {
	private byte[] value = null;

	public GmfIOBuffer() {
		this.gmdt.setName("IOB");
		this.gmdt.setMinLength(GmfGmdtLength.GMF_GMDT_LENGTH_IOB);
	}
	/**
	 * @return the value
	 */
	public byte[] getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(byte[] value) {
		this.value = value;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getEncodeLength() {
		return (this.gmdt.getMinLength() + value.length);
	}
	@Override
	public String toString(int format) {
		String retString = "";
		String valueString = "";
		if (null == this.value) {
			valueString = "null";
		} else {
			valueString = GmfWriteLog.format("%d", this.value.length);
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
					"%s.%s() get byte[] length error! return[%d] position[%d]", this.getClass().getName(), Thread
							.currentThread().getStackTrace()[2].getMethodName(), tmpLength, tmpPos);
			this.printGmfError();
			return -1;
		} else {
			tmpPos += 4;
			if (length - tmpPos < tmpLength) {
				this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL,
						"%s.%s() get byte[] data error! surplus data length[%d] less than [%d]. position[%d]", this
								.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
						(length - tmpPos), tmpLength, tmpPos);
				this.printGmfError();
				return -2;
			}
			this.value = new byte[tmpLength];
			System.arraycopy(data, tmpPos, this.value, 0, tmpLength);
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
		int tmpLength = this.value.length;
		dest[tmpPos++] = (byte) this.gmdt.getFlag();
		retInt = PositionLengthByteUtil.getBytes(tmpLength, dest, tmpPos, length);
		if (retInt < 0) {
			this.println(GmfErrorDefined.GMF_ERROR_CRITICAL, " get byte[] length failed.");
			return retInt;
		} else {
			tmpPos += retInt;
			System.arraycopy(this.value, 0, dest, tmpPos, tmpLength);
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
			String tmpString = ((String) args[0]);
			byte[] tmpData = new byte[tmpString.length()];
			System.arraycopy(tmpString.getBytes(), 0, tmpData, 0, tmpString.length());
			this.setValue(tmpData);
		} else if (args[0] instanceof byte[]) {
			byte[] tmpBytes = (byte[]) args[0];
			byte[] tmpData = new byte[tmpBytes.length];
			System.arraycopy(tmpBytes, 0, tmpData, 0, tmpBytes.length);
			this.setValue(tmpData);
		} else if (args[0] instanceof Integer) {
			this.setValue(PosByteUtil.getBytes(((Integer) args[0]).intValue()));
		} else if (args[0] instanceof Short) {
			this.setValue(PosByteUtil.getBytes(((Short) args[0]).shortValue()));
		} else if (args[0] instanceof Long) {
			this.setValue(PosByteUtil.getBytes(((Long) args[0]).longValue()));
		} else if (args[0] instanceof Float) {
			this.setValue(PosByteUtil.getBytes(((Float) args[0]).floatValue()));
		} else if (args[0] instanceof Double) {
			this.setValue(PosByteUtil.getBytes(((Double) args[0]).doubleValue()));
		} else if (args[0] instanceof Boolean) {
			boolean b = ((Boolean) args[0]).booleanValue();
			byte[] tmpData = new byte[1];
			if (b) {
				tmpData[0] = (byte) GmfDefault.GMF_DEFAULT_BOOLEAN_INT_TRUE;
			} else {
				tmpData[0] = (byte) GmfDefault.GMF_DEFAULT_BOOLEAN_INT_FALSE;
			}
			this.setValue(tmpData);
		} else if (args[0] instanceof Date) {
			Date d = (Date) args[0];
			this.setValue(PosByteUtil.getBytes(d.getTime()));
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
