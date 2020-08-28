/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfRectPair.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: gmf rect pair type
 * @author: kitty   
 * @date: 2016年1月16日 下午5:07:34 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt;

import java.util.Date;

import com.gmf.core.Gmf;
import com.gmf.core.beans.GmfRectBean;
import com.gmf.core.beans.GmfRectPairBean;
import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.defined.GmfDefault;
import com.gmf.defined.GmfElementPrintFormat;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.defined.GmfGmdtLength;
import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfRectPair
 * @Description: class of GmfRectPair
 * @author: kitty
 * @date: 2016年1月16日 下午5:07:34
 */
public class GmfRectPair extends GmfElement {
	private GmfRectPairBean value = new GmfRectPairBean();

	public GmfRectPair() {
		this.gmdt.setName("RP");
		this.gmdt.setMinLength(GmfGmdtLength.GMF_GMDT_LENGTH_RP);
	}
	/**
	 * @return the value
	 */
	public GmfRectPairBean getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(GmfRectPairBean value) {
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
		GmfRectBean grb = null;
		int tmpPos = pos + GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH;
		grb = GmfRect.decodeRect(gmf, data, tmpPos, length);
		if (null == grb) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() decodeRect() source rect error! position[%d]",
					this.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(), tmpPos);
			this.printGmfError();
			return -1;
		} else {
			this.value.setSource(grb);
			tmpPos += GmfGmdtLength.GMF_GMDT_LENGTH_R - GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH;
			grb = GmfRect.decodeRect(gmf, data, tmpPos, length);
			if (null == grb) {
				this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL,
						"%s.%s() decodeRect() destination rect error! position[%d]", this.getClass().getName(), Thread
								.currentThread().getStackTrace()[2].getMethodName(), tmpPos);
				this.printGmfError();
				return -2;
			} else {
				this.value.setDestination(grb);
			}
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
		retInt = GmfRect.encodeRect(this.gmfPosition.getGmf(), this.value.getSource(), dest, tmpPos, length);
		if (retInt < 0) {
			this.println(GmfErrorDefined.GMF_ERROR_CRITICAL, " encodeRect source data failed.");
			return retInt;
		} else {
			tmpPos += retInt;
			retInt = GmfRect.encodeRect(this.gmfPosition.getGmf(), this.value.getDestination(), dest, tmpPos, length);
			if (retInt < 0) {
				this.println(GmfErrorDefined.GMF_ERROR_CRITICAL, " encodeRect destination data failed.");
				return retInt;
			} else {
				tmpPos += retInt;
			}
		}
		return (tmpPos - pos);
	}
	@Override
	public boolean format(Object... args) {
		int argsNumber = 1;
		int[] tmpInt = { 0, 0, 0, 0, 0, 0, 0, 0 };
		if (args.length < argsNumber) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s args length < %d", this.getClass()
					.getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_MISSING.getErr(), argsNumber);
			return false;
		} else {
			if (args.length > 1) {
				if (args[0] instanceof GmfRectPairBean) {
					GmfRectPairBean grpb = ((GmfRectPairBean) args[0]);
					this.setValue(grpb);
					return true;
				}
			}
			if (args.length >= 2) {
				if (args[0] instanceof GmfRectBean && args[1] instanceof GmfRectBean) {
					GmfRectBean tmpGrbSource = ((GmfRectBean) args[0]);
					GmfRectBean tmpGrbDestination = ((GmfRectBean) args[1]);
					this.value.setSource(tmpGrbSource);
					this.value.setDestination(tmpGrbDestination);
					return true;
				}
			}
			argsNumber = 8;
			if (args.length < argsNumber) {
				this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s args length < %d", this.getClass()
						.getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
						GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_MISSING.getErr(), argsNumber);
				return false;
			}
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
		GmfRectBean grbSource = new GmfRectBean();
		GmfRectBean grbDestination = new GmfRectBean();
		grbSource.setLeft(tmpInt[0]);
		grbSource.setTop(tmpInt[1]);
		grbSource.setRight(tmpInt[2]);
		grbSource.setBottom(tmpInt[3]);
		grbDestination.setLeft(tmpInt[4]);
		grbDestination.setTop(tmpInt[5]);
		grbDestination.setRight(tmpInt[6]);
		grbDestination.setBottom(tmpInt[7]);
		this.value.setSource(grbSource);
		this.value.setDestination(grbDestination);
		return true;
	}
	@Override
	public Object getObjectValue() {
		return this.getValue();
	}
}
