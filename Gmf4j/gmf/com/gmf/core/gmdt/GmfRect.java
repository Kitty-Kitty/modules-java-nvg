/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfRect.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: gmf rect type
 * @author: kitty   
 * @date: 2016年1月16日 下午4:31:14 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt;

import java.util.Date;

import com.gmf.core.Gmf;
import com.gmf.core.beans.GmfRectBean;
import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.defined.GmfDefault;
import com.gmf.defined.GmfElementPrintFormat;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.defined.GmfGmdtLength;
import com.gmf.print.GmfWriteLog;
import com.gmf.util.PosByteUtil;
import com.gmf.util.PositionLengthByteUtil;

/**
 * @ClassName: GmfRect
 * @Description: class of GmfRect
 * @author: kitty
 * @date: 2016年1月16日 下午4:31:14
 */
public class GmfRect extends GmfElement {
	private GmfRectBean value = new GmfRectBean();

	public GmfRect() {
		this.gmdt.setName("R");
		this.gmdt.setMinLength(GmfGmdtLength.GMF_GMDT_LENGTH_R);
	}
	/**
	 * @return the value
	 */
	public GmfRectBean getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(GmfRectBean value) {
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
				retString = GmfWriteLog.format("%s", this.value.toGmfString());
			}
				break;
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY:
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY: {
				retString = GmfWriteLog.format("(%s)%s", this.gmdt.getName(), this.value.toGmfString());
			}
				break;
			default: {
				retString = GmfWriteLog.format("(%s)%s", this.gmdt.getName(), this.value.toGmfString());
			}
		}
		return retString;
	}
	@Override
	public int decode(Gmf gmf, byte[] data, int pos, int length) {
		int tmpPos = pos + GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH;
		this.value = decodeRect(gmf, data, tmpPos, length);
		if (null == this.value) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() decodeRect() error! position[%d]", this
					.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(), tmpPos);
			this.printGmfError();
			return -1;
		}
		return this.gmdt.getMinLength();
	}
	public static GmfRectBean decodeRect(Gmf gmf, byte[] data, int pos, int length) {
		if (length - pos < (GmfGmdtLength.GMF_GMDT_LENGTH_R - GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH)) {
			return null;
		} else {
			int tmpPos = pos;
			GmfRectBean grb = new GmfRectBean();
			grb.setLeft(PosByteUtil.getByteInt(data, tmpPos, length));
			tmpPos += GmfDefault.GMF_DEFAULT_INT_LENGTH;
			grb.setTop(PosByteUtil.getByteInt(data, tmpPos, length));
			tmpPos += GmfDefault.GMF_DEFAULT_INT_LENGTH;
			grb.setRight(PosByteUtil.getByteInt(data, tmpPos, length));
			tmpPos += GmfDefault.GMF_DEFAULT_INT_LENGTH;
			grb.setBottom(PosByteUtil.getByteInt(data, tmpPos, length));
			tmpPos += GmfDefault.GMF_DEFAULT_INT_LENGTH;
			return grb;
		}
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
		retInt = encodeRect(this.gmfPosition.getGmf(), this.value, dest, tmpPos, length);
		if (retInt < 0) {
			this.println(GmfErrorDefined.GMF_ERROR_CRITICAL, " encodeRect data failed.");
			return retInt;
		} else {
			tmpPos += retInt;
		}
		return (tmpPos - pos);
	}
	/**
	 * @Title: encodeRect
	 * @Description: TODO
	 * @param gmf
	 * @param grb
	 * @param data
	 * @param pos
	 * @param length
	 * @return
	 */
	public static int encodeRect(Gmf gmf, GmfRectBean grb, byte[] data, int pos, int length) {
		if (length - pos < (GmfGmdtLength.GMF_GMDT_LENGTH_R - GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH)) {
			return -1;
		} else {
			int tmpPos = pos;
			int retInt = 0;
			retInt = PositionLengthByteUtil.getBytes(grb.getLeft(), data, tmpPos, length);
			if (retInt < 0) {
				return retInt;
			}
			tmpPos += retInt;
			retInt = PositionLengthByteUtil.getBytes(grb.getTop(), data, tmpPos, length);
			if (retInt < 0) {
				return retInt;
			}
			tmpPos += retInt;
			retInt = PositionLengthByteUtil.getBytes(grb.getRight(), data, tmpPos, length);
			if (retInt < 0) {
				return retInt;
			}
			tmpPos += retInt;
			retInt = PositionLengthByteUtil.getBytes(grb.getBottom(), data, tmpPos, length);
			if (retInt < 0) {
				return retInt;
			} else {
				tmpPos += retInt;
			}
			return (tmpPos - pos);
		}
	}
	@Override
	public boolean format(Object... args) {
		int argsNumber = 1;
		int[] tmpInt = { 0, 0, 0, 0 };
		if (args.length < argsNumber) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s args length < %d", this.getClass()
					.getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_MISSING.getErr(), argsNumber);
			return false;
		} else {
			if (args.length > 1 && args.length < 4) {
				if (args[0] instanceof GmfRectBean) {
					GmfRectBean grb = ((GmfRectBean) args[0]);
					this.setValue(grb);
					return true;
				} else {
					this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() arg number[%d] %s ", this.getClass()
							.getName(), Thread.currentThread().getStackTrace()[2].getMethodName(), args.length,
							GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_UNSUPPORT.getErr());
					return false;
				}
			}
		}
		argsNumber = 4;
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
		this.value.setLeft(tmpInt[0]);
		this.value.setTop(tmpInt[1]);
		this.value.setRight(tmpInt[2]);
		this.value.setBottom(tmpInt[3]);
		return true;
	}
	@Override
	public Object getObjectValue() {
		return this.getValue();
	}
}
