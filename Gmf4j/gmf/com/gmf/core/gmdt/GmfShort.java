/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfShort.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: gmf short type
 * @author: kitty   
 * @date: 2016年1月16日 下午4:02:10 
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
 * @ClassName: GmfShort
 * @Description: class of GmfShort
 * @author: kitty
 * @date: 2016年1月16日 下午4:02:10
 */
public class GmfShort extends GmfElement {
	private short value = 0;

	public GmfShort() {
		this.gmdt.setName("S");
		this.gmdt.setMinLength(GmfGmdtLength.GMF_GMDT_LENGTH_S);
	}
	/**
	 * @return the value
	 */
	public Short getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Short value) {
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
		switch (format) {
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY:
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY: {
				retString = GmfWriteLog.format("%d", this.getValue());
			}
				break;
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY:
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY: {
				retString = GmfWriteLog.format("(%s)%d", this.gmdt.getName(), this.getValue());
			}
				break;
			default: {
				retString = GmfWriteLog.format("(%s)%d", this.gmdt.getName(), this.getValue());
			}
		}
		return retString;
	}
	@Override
	public int decode(Gmf gmf, byte[] data, int pos, int length) {
		int tmpPos = pos + GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH;
		this.value = (short) PosByteUtil.getShort(data, tmpPos, length);
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
			this.println(GmfErrorDefined.GMF_ERROR_CRITICAL, " get short data failed.");
			return retInt;
		} else {
			tmpPos += retInt;
		}
		return (tmpPos - pos);
	}
	@Override
	public boolean format(Object... args) {
		int argsNumber = 1;
		int[] tmpInt = { 0 };
		if (args.length < argsNumber) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s args length < %d", this.getClass()
					.getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_MISSING.getErr(), argsNumber);
			return false;
		}
		for (int i = 0; i < argsNumber; i++) {
			if (args[0] instanceof Integer) {
				tmpInt[i] = ((Integer) args[0]).intValue();
			} else if (args[0] instanceof Short) {
				tmpInt[i] = (int) (((Short) args[0]).shortValue());
			} else if (args[0] instanceof Long) {
				tmpInt[i] = (int) (((Long) args[0]).longValue());
			} else if (args[0] instanceof Float) {
				tmpInt[i] = (int) (((Float) args[0]).floatValue());
			} else if (args[0] instanceof Double) {
				tmpInt[i] = (int) (((Double) args[0]).doubleValue());
			} else if (args[0] instanceof Boolean) {
				boolean b = ((Boolean) args[0]).booleanValue();
				if (b) {
					tmpInt[i] = GmfDefault.GMF_DEFAULT_BOOLEAN_INT_TRUE;
				} else {
					tmpInt[i] = GmfDefault.GMF_DEFAULT_BOOLEAN_INT_FALSE;
				}
			} else if (args[0] instanceof String) {
				tmpInt[i] = Integer.parseInt(((String) args[0]));
			} else if (args[0] instanceof Date) {
				Date d = (Date) args[0];
				tmpInt[i] = (int) d.getTime();
			} else {
				this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() args[%d] %s ", this.getClass().getName(),
						Thread.currentThread().getStackTrace()[2].getMethodName(), i,
						GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_UNSUPPORT.getErr());
				return false;
			}
		}
		this.setValue((short) tmpInt[0]);
		return true;
	}
	@Override
	public Object getObjectValue() {
		return Short.valueOf(value);
	}
}
