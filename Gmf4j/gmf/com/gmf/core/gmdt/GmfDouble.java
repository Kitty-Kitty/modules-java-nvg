/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDouble.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: gmf double type
 * @author: kitty   
 * @date: 2016年1月16日 下午4:18:40 
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
 * @ClassName: GmfDouble
 * @Description: class of GmfDouble
 * @author: kitty
 * @date: 2016年1月16日 下午4:18:40
 */
public class GmfDouble extends GmfElement {
	private double value = 0;

	public GmfDouble() {
		this.gmdt.setName("D");
		this.gmdt.setMinLength(GmfGmdtLength.GMF_GMDT_LENGTH_D);
	}
	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
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
		if (this.getErrno() == GmfErrorDefined.GMF_ERROR_CRITICAL) {
			retString = GmfWriteLog.format("[%d] %s", this.getErrno(), this.getErr());
		} else {
			switch (format) {
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY:
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY: {
					retString = GmfWriteLog.format("%f", this.value);
				}
					break;
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY:
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY: {
					retString = GmfWriteLog.format("(%s)%f", this.gmdt.getName(), this.value);
				}
					break;
				default: {
					retString = GmfWriteLog.format("(%s)%f", this.gmdt.getName(), this.value);
				}
			}
		}
		return retString;
	}
	@Override
	public int decode(Gmf gmf, byte[] data, int pos, int length) {
		int tmpPos = pos + GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH;
		this.value = PosByteUtil.getDouble(data, tmpPos, length);
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
			this.println(GmfErrorDefined.GMF_ERROR_CRITICAL, " get double data failed.");
			return retInt;
		} else {
			tmpPos += retInt;
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
		if (args[0] instanceof Integer) {
			this.setValue(((Integer) args[0]).intValue());
		} else if (args[0] instanceof Short) {
			this.setValue(((Short) args[0]).shortValue());
		} else if (args[0] instanceof Long) {
			this.setValue(((Long) args[0]).longValue());
		} else if (args[0] instanceof Float) {
			this.setValue(((Float) args[0]).floatValue());
		} else if (args[0] instanceof Double) {
			this.setValue(((Double) args[0]).doubleValue());
		} else if (args[0] instanceof Boolean) {
			boolean b = ((Boolean) args[0]).booleanValue();
			if (b) {
				this.setValue(GmfDefault.GMF_DEFAULT_BOOLEAN_INT_TRUE);
			} else {
				this.setValue(GmfDefault.GMF_DEFAULT_BOOLEAN_INT_FALSE);
			}
		} else if (args[0] instanceof String) {
			this.setValue(Double.parseDouble(((String) args[0])));
		} else if (args[0] instanceof Date) {
			Date d = (Date) args[0];
			this.setValue(d.getTime());
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
		return Double.valueOf(value);
	}
}
