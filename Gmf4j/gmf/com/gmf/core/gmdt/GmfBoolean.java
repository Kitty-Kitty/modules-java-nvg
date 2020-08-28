/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfArray.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: gmf boolea type
 * @author: kitty   
 * @date: 2016年1月11日 下午8:49:45 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt;

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
 * @ClassName: GmfBoolean
 * @Description: class of GmfBoolean
 * @author: kitty
 * @date: 2016年1月28日 下午4:25:10
 */
public class GmfBoolean extends GmfElement {
	private boolean value = false;

	public GmfBoolean() {
		this.gmdt.setName("B");
		this.gmdt.setMinLength(GmfGmdtLength.GMF_GMDT_LENGTH_B);
	}
	/**
	 * @return the value
	 */
	public boolean isValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(boolean value) {
		this.value = value;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int size() {
		return this.gmdt.getMinLength();
	}
	@Override
	public int getEncodeLength() {
		return this.gmdt.getMinLength();
	}
	@Override
	public String toString(int format) {
		String retString = "";
		if (this.getErrno() == GmfErrorDefined.GMF_ERROR_CRITICAL) {
			retString = GmfWriteLog.format("[%d] %s", this.getErrno(), this.getErr());
		} else {
			switch (format) {
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY:
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY: {
					retString = GmfWriteLog.format("%s", this.value);
				}
					break;
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY:
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY: {
					retString = GmfWriteLog.format("(%s)%s", this.gmdt.getName(), this.value);
				}
					break;
				default: {
					retString = GmfWriteLog.format("(%s)%s", this.gmdt.getName(), this.value);
				}
			}
		}
		return retString;
	}
	@Override
	public int decode(Gmf gmf, byte[] data, int pos, int length) {
		int tmpInt = PosByteUtil.getByteInt(data[pos + GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH]);
		if (0 == tmpInt) {
			this.value = false;
		} else {
			this.value = true;
		}
		return this.gmdt.getMinLength();
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
		dest[tmpPos++] = (byte) this.gmdt.getFlag();
		retInt = PositionLengthByteUtil.getBytes(this.value, dest, tmpPos, length);
		if (retInt < 0) {
			this.println(GmfErrorDefined.GMF_ERROR_CRITICAL, " get boolean data failed.");
			return retInt;
		} else {
			++tmpPos;
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
		int tmpInt = 0;
		if (args[0] instanceof Integer) {
			tmpInt = ((Integer) args[0]).intValue();
		} else if (args[0] instanceof Short) {
			tmpInt = (int) (((Short) args[0]).shortValue());
		} else if (args[0] instanceof Long) {
			tmpInt = (int) (((Long) args[0]).longValue());
		} else if (args[0] instanceof Float) {
			tmpInt = (int) (((Float) args[0]).floatValue());
		} else if (args[0] instanceof Double) {
			tmpInt = (int) (((Double) args[0]).doubleValue());
		} else if (args[0] instanceof Boolean) {
			this.value = ((Boolean) args[0]).booleanValue();
			return true;
		} else if (args[0] instanceof String) {
			if (((String) args[0]).equals(GmfDefault.GMF_DEFAULT_BOOLEAN_STRING_TRUE)) {
				this.value = true;
			} else if (((String) args[0]).equals(GmfDefault.GMF_DEFAULT_BOOLEAN_STRING_FALSE)) {
				this.value = false;
			} else {
				this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s ", this.getClass().getName(), Thread
						.currentThread().getStackTrace()[2].getMethodName(),
						GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_ERROR.getErr());
				return false;
			}
		} else {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s ", this.getClass().getName(), Thread
					.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_UNSUPPORT.getErr());
			return false;
		}
		if (0 == tmpInt) {
			this.value = false;
		} else {
			this.value = true;
		}
		return true;
	}
	@Override
	public Object getObjectValue() {
		return Boolean.valueOf(value);
	}
}
