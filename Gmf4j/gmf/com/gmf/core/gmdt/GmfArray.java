/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfArray.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: gmf array type
 * @author: kitty   
 * @date: 2016年1月11日 下午8:49:45 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gmf.core.Gmf;
import com.gmf.core.gmdt.base.GmfContainerElement;
import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.core.gmdu.GmfGmdu;
import com.gmf.defined.GmfDefault;
import com.gmf.defined.GmfElementPrintFormat;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.defined.GmfGmdtFlag;
import com.gmf.defined.GmfGmdtLength;
import com.gmf.print.GmfWriteLog;
import com.gmf.util.PosByteUtil;
import com.gmf.util.PositionLengthByteUtil;

/**
 * @ClassName: GmfArray
 * @Description: class of GmfArray
 * @author: kitty
 * @date: 2016年1月11日 下午8:49:45
 */
public class GmfArray extends GmfContainerElement {
	private int value = 0;
	private ArrayList<GmfGmdu> attributesList = null;

	public GmfArray() {
		this.gmdt.setName("A");
		this.gmdt.setMinLength(GmfGmdtLength.GMF_GMDT_LENGTH_A);
		attributesList = new ArrayList<GmfGmdu>();
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the attributesList
	 */
	public ArrayList<GmfGmdu> getAttributesList() {
		return attributesList;
	}
	/**
	 * @param attributesList the attributesList to set
	 */
	public void setAttributesList(ArrayList<GmfGmdu> attributesList) {
		this.attributesList = attributesList;
	}
	/**
	 * @param value the attributesList to set
	 */
	public boolean setValue(Object value) {
		return true;
	}
	@Override
	public boolean isEmpty() {
		if (this.size() <= 0) {
			return true;
		}
		return false;
	}
	@Override
	public int size() {
		return attributesList.size();
	}
	@Override
	public int getEncodeLength() {
		int tmpChildrenLength = 0;
		GmfGmdu gg = null;
		this.value = this.attributesList.size();
		for (int i = 0; i < this.value; i++) {
			gg = this.attributesList.get(i);
			if (null != gg) {
				tmpChildrenLength += gg.getEncodeLength();
			}
		}
		return (this.gmdt.getMinLength() + tmpChildrenLength);
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
					retString = GmfWriteLog.format("%d", this.attributesList.size());
				}
					break;
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY:
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY: {
					retString = GmfWriteLog.format("(%s)%d", this.gmdt.getName(), this.attributesList.size());
				}
					break;
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_ONLY:
				case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_PRITTY: {
				}
					break;
				default: {
					retString = GmfWriteLog.format("(%s)%d", this.gmdt.getName(), this.attributesList.size());
				}
			}
			if (format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY
					|| format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY
					|| format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_ONLY
					|| format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_PRITTY) {
				if (format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_ONLY) {
					format = GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY;
				}
				if (format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_PRITTY) {
					format = GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY;
				}
				this.gmfPosition.addPrintLayer();
				for (int i = 0; i < attributesList.size(); i++) {
					retString += attributesList.get(i).toString(format);
				}
				this.gmfPosition.divPrintLayer();
			}
		}
		return retString;
	}
	@Override
	public int decode(Gmf gmf, byte[] data, int pos, int length) {
		int tmpPos = pos + GmfDefault.GMF_DEFAULT_GMDT_FLAG_LENGTH;
		value = PosByteUtil.getInt(data, tmpPos, length);
		return this.gmdt.getMinLength();
	}
	public int decodeChildren(Gmf gmf, byte[] data, int pos, int length) {
		int i = 0;
		int retNumber = 0;
		int tmpPos = pos;
		boolean retBool = false;
		gmf.setLayer(gmf.getLayer() + 1);
		for (i = 0; i < this.value; i++) {
			GmfGmdu gmdu = new GmfGmdu();
			attributesList.add(gmdu);
			retBool = gmdu.check(gmf, data, tmpPos, length);
			if (!retBool) {
				// check gmdu failed
				return -1;
			}
			retNumber = gmdu.begin(gmf, data, tmpPos, length);
			if (retNumber < 0) {
				// begin to decode gmdu failed
				return -2;
			}
			tmpPos += retNumber;
			retNumber = gmdu.decode(gmf, data, tmpPos, length);
			if (retNumber < 0) {
				// begin to decode gmdu failed
				return -3;
			}
			tmpPos += retNumber;
			retNumber = gmdu.end(gmf, data, tmpPos, length);
			if (retNumber < 0) {
				// begin to decode gmdu failed
				return -4;
			}
			tmpPos += retNumber;
		}
		gmf.setLayer(gmf.getLayer() - 1);
		return (tmpPos - pos);
	}
	@Override
	public byte[] encode(Gmf gmf) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int encode(Gmf gmf, byte[] dest, int pos, int length) {
		int tmpPos = pos;
		int retInt = 0;
		dest[tmpPos++] = (byte) this.gmdt.getFlag();
		retInt = PositionLengthByteUtil.getBytes(attributesList.size(), dest, tmpPos, length);
		if (retInt < 0) {
			println(GmfErrorDefined.GMF_ERROR_NOTICE, "%s.%s() failed! return [%d]", this.getClass().getName(), Thread
					.currentThread().getStackTrace()[2].getMethodName(), retInt);
			return retInt;
		} else {
			tmpPos += retInt;
		}
		return (tmpPos - pos);
	}
	@Override
	public int encodeChildren(Gmf gmf, byte[] dest, int pos, int length) {
		int tmpSize = attributesList.size();
		int retInt = 0;
		int tmpPos = pos;
		GmfGmdu gmfGmdu = null;
		for (int i = 0; i < tmpSize; i++) {
			gmfGmdu = attributesList.get(i);
			if (null == gmfGmdu) {
				this.println(GmfErrorDefined.GMF_ERROR_CRITICAL,
						GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDU_NULL.getErr());
				return -1;
			} else {
				retInt = gmfGmdu.encode(gmf, dest, tmpPos, length);
				if (retInt < 0) {
					this.println(GmfErrorDefined.GMF_ERROR_CRITICAL, " GmfGmdu encode failed. %s", gmfGmdu.getErr());
					return -1;
				} else {
					tmpPos += retInt;
				}
			}
		}
		return (tmpPos - pos);
	}
	@Override
	public boolean format(Object... args) {
		if (args.length < 1) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s args length < 1",
					this.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_MISSING.getErr(), args);
			return false;
		}
		if (args[0] instanceof Integer) {
			this.setValue(((Integer) args[0]).intValue());
		} else if (args[0] instanceof Short) {
			this.setValue((int) (((Short) args[0]).shortValue()));
		} else if (args[0] instanceof Long) {
			this.setValue((int) (((Long) args[0]).longValue()));
		} else if (args[0] instanceof Float) {
			this.setValue((int) (((Float) args[0]).floatValue()));
		} else if (args[0] instanceof Double) {
			this.setValue((int) (((Double) args[0]).doubleValue()));
		} else if (args[0] instanceof Boolean) {
			boolean b = ((Boolean) args[0]).booleanValue();
			if (b) {
				this.setValue(GmfDefault.GMF_DEFAULT_BOOLEAN_INT_TRUE);
			} else {
				this.setValue(GmfDefault.GMF_DEFAULT_BOOLEAN_INT_FALSE);
			}
		} else if (args[0] instanceof String) {
			this.setValue(Integer.parseInt(((String) args[0])));
		} else if (args[0] instanceof Date) {
			Date d = (Date) args[0];
			this.setValue((int) d.getTime());
		} else {
			Class<?> clazz = args[0].getClass();
			if (List.class.isAssignableFrom(clazz)) {
				List<?> list = (List<?>) args[0];
				this.setValue(list.size());
			} else {
				this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s ", this.getClass().getName(), Thread
						.currentThread().getStackTrace()[2].getMethodName(),
						GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDT_ARGS_UNSUPPORT.getErr());
				return false;
			}
		}
		return true;
	}
	@Override
	public boolean addChildGmfGmdu(GmfGmdu gmfGmdu) {
		if (!GmfGmdu.checkGmfGmdu(gmfGmdu)) {
			return false;
		}
		this.attributesList.add(gmfGmdu);
		return true;
	}
	@Override
	public boolean deleteChildGmfGmdu(GmfGmdu gmfGmdu) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public GmfGmdu findChildGmfGmdu(String key) {
		GmfGmdu tmpGmfGmdu = null;
		GmfElement tmpGmfElement = null;
		int tmpSize = attributesList.size();
		for (int i = 0; i < tmpSize; i++) {
			tmpGmfGmdu = attributesList.get(i);
			tmpGmfElement = tmpGmfGmdu.getKey();
			if (null != tmpGmfElement) {
				if (GmfGmdtFlag.GMF_GMDT_ST == tmpGmfElement.gmdt.getFlag()) {
					GmfString gs = (GmfString) tmpGmfElement;
					if (key.equals(gs.getValue())) {
						return tmpGmfGmdu;
					}
				}
			}
		}
		return null;
	}
	@Override
	public GmfGmdu findChildGmfGmdu(GmfElement key) {
		GmfGmdu tmpGmfGmdu = null;
		GmfElement tmpGmfElement = null;
		int tmpSize = attributesList.size();
		for (int i = 0; i < tmpSize; i++) {
			tmpGmfGmdu = attributesList.get(i);
			tmpGmfElement = tmpGmfGmdu.getKey();
			if (null != tmpGmfElement) {
				if (key.gmdt.getFlag() == tmpGmfElement.gmdt.getFlag()) {
					if (key.toPrintString().equals(tmpGmfElement.toPrintString())) {
						return tmpGmfGmdu;
					}
				}
			}
		}
		return null;
	}
	@Override
	public boolean updateChildGmfGmdu(GmfGmdu gmfGmdu) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object getObjectValue() {
		return this.attributesList;
	}
}
