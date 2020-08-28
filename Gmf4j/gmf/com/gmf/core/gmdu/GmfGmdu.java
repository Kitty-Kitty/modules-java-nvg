/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfGmdt.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdu
 * @Description: GmfGmdu
 * @author: kitty   
 * @date: 2016年1月12日 下午5:23:47 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdu;

import com.gmf.core.Gmf;
import com.gmf.core.GmfError;
import com.gmf.core.GmfPosition;
import com.gmf.core.gmdt.base.GmfContainerElement;
import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.core.gmdt.base.GmfElementManager;
import com.gmf.defined.GmfElementPrintFormat;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.defined.GmfGmdtFlag;
import com.gmf.print.GmfWriteLog;
import com.gmf.util.PosByteUtil;

/**
 * @ClassName: GmfGmdu
 * @Description: Class GmfGmdu
 * @author: kitty
 * @date: 2016年1月28日 上午11:59:13
 */
public class GmfGmdu extends GmfError implements GmfGmduInterface, GmfGmduOperationInterface {
	private GmfElement key;
	private GmfElement value;
	private GmfPosition gmfPosition = new GmfPosition();

	/**
	 * @return the key
	 */
	public GmfElement getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(GmfElement key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public GmfElement getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(GmfElement value) {
		this.value = value;
	}
	/**
	 * @return the gmfPosition
	 */
	public GmfPosition getGmfPosition() {
		return gmfPosition;
	}
	/**
	 * @param gmfPosition the gmfPosition to set
	 */
	public void setGmfPosition(GmfPosition gmfPosition) {
		this.gmfPosition = gmfPosition;
	}
	@Override
	public boolean isEmpty() {
		if (null == this.key || null == this.value) {
			return true;
		}
		return false;
	}
	@Override
	public int size() {
		GmfContainerElement gce = GmfGmdu.getContainerGmfElement(this);
		if (null == gce) {
			return 0;
		} else {
			return gce.size();
		}
	}
	@Override
	public int getEncodeLength() {
		if (null == this.key || null == this.value) {
			return 0;
		} else {
			return (this.key.getEncodeLength() + this.value.getEncodeLength());
		}
	}
	/**
	 * @Title: println
	 * @Description: print log information
	 * @param code log level number
	 * @param format format string
	 * @param args arguments
	 */
	public void println(int code, String format, Object... args) {
		if (gmfPosition.getGmf().isPrintDebugInforamtion()) {
			String tmpFormat = GmfWriteLog.format("%s.%s() ", this.getClass().getName(), Thread.currentThread()
					.getStackTrace()[2].getMethodName());
			GmfWriteLog.println(code, tmpFormat + format, args);
		}
	}
	/**
	 * @Title: printGmfError
	 * @Description: print GmfElement error information
	 */
	public void printGmfError() {
		if (gmfPosition.getGmf().isPrintDebugInforamtion()) {
			String tmpFormat = GmfWriteLog.format("%s.%s() ", this.getClass().getName(), Thread.currentThread()
					.getStackTrace()[2].getMethodName());
			GmfWriteLog.println(this.getErrno(), tmpFormat + "%s", this.getErr());
		}
	}
	/**
	 * @Title: getGmfElementString
	 * @Description: get GmfElement String
	 * @param gmfElement GmfElement Object
	 * @param format format type
	 * @return String
	 */
	public String getGmfElementString(GmfElement gmfElement, int format) {
		String retString = null;
		if (null != gmfElement) {
			if (format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY
					|| format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY) {
				retString = gmfElement.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY);
			} else {
				retString = gmfElement.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY);
			}
		}
		return retString;
	}
	/**
	 * @Title: getGmfElementChildrenString
	 * @Description: get GmfElement Childen String
	 * @param gmfElement GmfElement Object
	 * @param format format type
	 * @return String
	 */
	public String getGmfElementChildrenString(GmfElement gmfElement, int format) {
		String retString = null;
		if (null == gmfElement) {
			return retString;
		} else {
			if (gmfElement.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_O
					|| gmfElement.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_A) {
				if (format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY
						|| format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_ONLY) {
					retString = gmfElement
							.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_ONLY);
				}
				if (format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY
						|| format == GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_PRITTY) {
					retString = gmfElement
							.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_CHILDREN_ELEMENT_VALUE_PRITTY);
				}
			}
		}
		return retString;
	}
	@Override
	public String toString(int format) {
		String retString = null;
		String tmpKey = null;
		String tmpValue = null;
		String tmpChildren = null;
		String tabString = this.gmfPosition.makeTabString();
		if (null == tabString) {
			tabString = "";
		}
		tmpKey = getGmfElementString(key, format);
		if (null == key) {
			tmpKey = GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDU_KEY_NULL.getErr();
		}
		tmpValue = getGmfElementString(value, format);
		if (null == value) {
			tmpValue = GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDU_VALUE_NULL.getErr();
		}
		switch (format) {
			default: {
				retString = GmfWriteLog.format("%s%s : %s\n", tabString, tmpKey, tmpValue);
			}
		}
		tmpChildren = getGmfElementChildrenString(key, format);
		if (null != tmpChildren) {
			retString += tmpChildren;
		} else {
			tmpChildren = getGmfElementChildrenString(value, format);
			if (null != tmpChildren) {
				retString += tmpChildren;
			}
		}
		return retString;
	}
	/**
	 * @Title: toPrintString
	 * @Description: to print string
	 * @return String
	 */
	public String toPrintString() {
		return this.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY);
	}
	/**
	 * @Title: toPrintAllString
	 * @Description: to print all string with object element, and this object element has children.
	 *               other element likely toPrintString()
	 * @return String
	 */
	public String toPrintAllString() {
		return this.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY);
	}
	/**
	 * @Title: toPrintPrittyString
	 * @Description: to print pritty string
	 * @return String
	 */
	public String toPrintPrittyString() {
		return this.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY);
	}
	/**
	 * @Title: toPrintAllString
	 * @Description: to print all string with object element, and this object element has children.
	 *               other element likely toPrintPrittyString()
	 * @return String
	 */
	public String toPrintAllPrittyString() {
		return this.toString(GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY);
	}
	@Override
	public GmfElement createGmfElement(Gmf gmf, byte[] data, int pos, int length) throws Exception {
		boolean retBool = false;
		int retInt = 0;
		int tmpPos = pos;
		int flag = PosByteUtil.getByteInt(data, pos, length);
		GmfElement ge = null;
		ge = GmfElementManager.createGmfElement(flag);
		if (null == ge) {
			gmf.getGmfError().setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s flag[%d] position[%d]",
					this.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_CREATE_GMFELEMENT.getErr(), flag, pos);
			return null;
		}
		retBool = ge.check(gmf, data, pos, length);
		if (!retBool) {
			gmf.getGmfError().setErrInfo(ge.getErrno(), ge.getErr());
			return null;
		}
		retInt = ge.begin(gmf, data, pos, length);
		if (retInt < 0) {
			gmf.getGmfError().setErrInfo(ge.getErrno(), ge.getErr());
			return null;
		} else {
			tmpPos += retInt;
		}
		retInt = ge.decode(gmf, data, tmpPos, length);
		if (retInt < 0) {
			gmf.getGmfError().setErrInfo(ge.getErrno(), ge.getErr());
			return null;
		} else {
			tmpPos += retInt;
		}
		retInt = ge.end(gmf, data, tmpPos, length);
		if (retInt < 0) {
			gmf.getGmfError().setErrInfo(ge.getErrno(), ge.getErr());
			return null;
		} else {
			tmpPos += retInt;
		}
		ge.setLength(tmpPos - pos);
		return ge;
	}
	@Override
	public boolean check(Gmf gmf, byte[] data, int pos, int length) {
		return true;
	}
	@Override
	public int begin(Gmf gmf, byte[] data, int pos, int length) {
		return 0;
	}
	@Override
	public int decode(Gmf gmf, byte[] data, int pos, int length) {
		int tmpPos = pos;
		int retInt = 0;
		
		
		/**
		 * set position information
		 */
		this.gmfPosition.setGmf(gmf);
		this.gmfPosition.setPosition(pos);
		
		/**
		 * process key GmfElement 
		 */
		try {
			/**
			 * create key GmfElement
			 */
			key = createGmfElement(gmf, data, tmpPos, length);
			if (null == key) {
				this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, gmf.getGmfError().getErr());
				return -1;
			}
		} catch (Exception e) {
			if (gmf.isPrintDebugInforamtion()) {
				e.printStackTrace();
			}
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "create gmdu key[%d] position[%d] exception: %s",
					PosByteUtil.getByteInt(data, tmpPos, length), tmpPos, e.getStackTrace().toString());
			this.printGmfError();
			return -1;
		}
		tmpPos += key.getLength();
		if (tmpPos >= length) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s.%s() %s value is null. position[%d]", this
					.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDU_BROKEN.getErr(), tmpPos);
			this.printGmfError();
			return -2;
		}
		/**
		 * process value GmfElement 
		 */
		try {
			/**
			 * create value GmfElement
			 */
			value = createGmfElement(gmf, data, tmpPos, length);
			if (null == value) {
				this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, gmf.getGmfError().getErr());
				return -1;
			}
		} catch (Exception e) {
			if (gmf.isPrintDebugInforamtion()) {
				e.printStackTrace();
			}
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "create gmdu value[%d] exception: %s",
					PosByteUtil.getByteInt(data, tmpPos, length), e.getStackTrace().toString());
			this.printGmfError();
			return -1;
		}
		tmpPos += value.getLength();
		if ((key.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_O || key.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_A)
				&& (value.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_O || value.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_A)) {
			this.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL,
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDU_WHOLE_OBJECT.getErr());
			this.printGmfError();
			return -2;
		} else {
			/**
			 * decode children GmfElement
			 */
			if (this.key.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_O || this.key.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_A) {
				retInt = decodeChildrenElement(gmf, key, data, tmpPos, length);
			} else {
				retInt = decodeChildrenElement(gmf, value, data, tmpPos, length);
			}
			if (retInt < 0) {
				return retInt;
			} else {
				tmpPos += retInt;
			}
		}
		
		/**
		 * set position other information
		 */
		this.gmfPosition.setLayer(gmf.getLayer());
		this.gmfPosition.setParentGmdu(gmf.getCurrentGmfGmdu());
		
		return (tmpPos - pos);
	}
	/**
	 * @Title: decodeChildrenElement
	 * @Description: decode children GmfElement
	 * @param gmf Gmf Object
	 * @param gmfElement GmfElement Object
	 * @param data output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int
	 */
	private int decodeChildrenElement(Gmf gmf, GmfElement gmfElement, byte[] data, int pos, int length) {
		int tmpPos = pos;
		if (gmfElement.gmdt.getFlag() != GmfGmdtFlag.GMF_GMDT_O && gmfElement.gmdt.getFlag() != GmfGmdtFlag.GMF_GMDT_A) {
			return 0;
		} else {
			GmfContainerElement gce = (GmfContainerElement) gmfElement;
			tmpPos += gce.decodeChildren(gmf, data, tmpPos, length);
		}
		return (tmpPos - pos);
	}
	/*
	 * (non Javadoc)
	 * @Title: encode
	 * @Description: TODO
	 * @param gmf
	 * @param dest
	 * @param pos
	 * @param length
	 * @return
	 * @see com.gmf.core.gmdu.GmfGmduImpl#encode(com.gmf.core.Gmf, byte[], int, int)
	 */
	@Override
	public int encode(Gmf gmf, byte[] dest, int pos, int length) {
		int tmpPos = pos;
		int retInt = 0;
		retInt = key.encode(gmf, dest, tmpPos, length);
		if (retInt < 0) {
			return retInt;
		} else {
			tmpPos += retInt;
			retInt = value.encode(gmf, dest, tmpPos, length);
			if (retInt < 0) {
				return retInt;
			} else {
				tmpPos += retInt;
				if (key.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_O || key.gmdt.getFlag() == GmfGmdtFlag.GMF_GMDT_A) {
					retInt = encodeChildrenElement(gmf, key, dest, tmpPos, length);
				} else {
					retInt = encodeChildrenElement(gmf, value, dest, tmpPos, length);
				}
				if (retInt < 0) {
					return retInt;
				} else {
					tmpPos += retInt;
				}
			}
		}
		return (tmpPos - pos);
	}
	/**
	 * @Title: encodeChildrenElement
	 * @Description: encode children GmfElement
	 * @param gmf Gmf Object
	 * @param gmfElement GmfElement Object
	 * @param data output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int
	 */
	private int encodeChildrenElement(Gmf gmf, GmfElement gmfElement, byte[] data, int pos, int length) {
		int tmpPos = pos;
		if (gmfElement.gmdt.getFlag() != GmfGmdtFlag.GMF_GMDT_O && gmfElement.gmdt.getFlag() != GmfGmdtFlag.GMF_GMDT_A) {
			return 0;
		} else {
			GmfContainerElement gce = (GmfContainerElement) gmfElement;
			tmpPos += gce.encodeChildren(gmf, data, tmpPos, length);
		}
		return (tmpPos - pos);
	}
	/**
	 * @Title: createGmfGmdu
	 * @Description: create a new GmfGmdu by GmfElement
	 * @param key GmfGmdu key GmfElement
	 * @param value GmfGmdu value GmfElement
	 * @return GmfGmdu 
	 */
	public static GmfGmdu createGmfGmdu(GmfElement key, GmfElement value) {
		GmfGmdu gg = new GmfGmdu();
		gg.setKey(key);
		gg.setValue(value);
		return gg;
	}
	@Override
	public int end(Gmf gmf, byte[] data, int pos, int length) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public byte[] encode(Gmf gmf) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean addGmfGmdu(GmfElement key, GmfElement value) {
		if (null == key || null == value) {
			return false;
		}
		return addGmfGmdu(GmfGmdu.createGmfGmdu(key, value));
	}
	@Override
	public boolean addGmfGmdu(GmfGmdu gmfGmdu) {
		if (null == gmfGmdu) {
			return false;
		}
		return this.gmfPosition.getParentGmdu().addChildGmfGmdu(gmfGmdu);
	}
	@Override
	public boolean addChildGmfGmdu(GmfElement key, GmfElement value) {
		if (null == key || null == value) {
			return false;
		}
		return addChildGmfGmdu(GmfGmdu.createGmfGmdu(key, value));
	}
	@Override
	public boolean addChildGmfGmdu(GmfGmdu gmfGmdu) {
		GmfContainerElement gce = getContainerGmfElement(this);
		if (null == gce) {
			return false;
		} else {
			/**
			 * update gmfGmdu information
			 */
			updateGmfGmduInfo(gmfGmdu);
			return gce.addChildGmfGmdu(gmfGmdu);
		}
	}
	@Override
	public boolean deleteGmfGmdu() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteGmfGmdu(GmfGmdu gmfGmdu) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteGmfGmdu(GmfElement key) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteChildGmfGmdu() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteChildGmfGmdu(GmfGmdu gmfGmdu) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteChildGmfGmdu(GmfElement key) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public GmfGmdu findGmfGmdu(String key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GmfGmdu findGmfGmdu(GmfGmdu gmfGmdu) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GmfGmdu findGmfGmdu(GmfElement key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GmfGmdu findChildGmfGmdu(String key) {
		GmfContainerElement gce = getContainerGmfElement(this);
		if (null != gce) {
			return gce.findChildGmfGmdu(key);
		}
		return null;
	}
	@Override
	public GmfGmdu findChildGmfGmdu(GmfGmdu gmfGmdu) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public GmfGmdu findChildGmfGmdu(GmfElement key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateGmfGmdu(GmfGmdu gmfGmdu) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * @Title: updateGmfGmduInfo
	 * @Description: update GmfGmdu information
	 * @param gmfGmdu 
	 * @return boolean
	 */
	private final boolean updateGmfGmduInfo(GmfGmdu gmfGmdu) {
		gmfGmdu.getGmfPosition().setGmf(this.gmfPosition.getGmf());
		gmfGmdu.getGmfPosition().setParentGmdu(this);
		gmfGmdu.getGmfPosition().setLayer(this.gmfPosition.getLayer() + 1);
		this.gmfPosition.getGmf().setLength(this.gmfPosition.getGmf().getLength() + gmfGmdu.getEncodeLength());
		/**
		 * update GmfGmdu key and value
		 */
		updateGmfGmduKeyAndValueInfo();
		return true;
	}
	/**
	 * @Title: updateGmfGmduKeyAndValue
	 * @Description: update GmfGmdu and GmfElement information
	 * @return boolean
	 */
	public final boolean updateGmfGmduKeyAndValueInfo() {
		GmfElement ge = null;
		/**
		 * set key GmfElement postion
		 */
		ge = this.getKey();
		if (null != ge) {
			ge.gmfPosition.setGmf(this.gmfPosition.getGmf());
			ge.gmfPosition.setParentGmdu(this);
			ge.gmfPosition.setLayer(this.gmfPosition.getLayer() + 1);
		}
		/**
		 * set key GmfElement postion
		 */
		ge = this.getValue();
		if (null != ge) {
			ge.gmfPosition.setGmf(this.gmfPosition.getGmf());
			ge.gmfPosition.setParentGmdu(this);
			ge.gmfPosition.setLayer(this.gmfPosition.getLayer() + 1);
		}
		return true;
	}
	/**
	 * @Title: checkGmfGmdu
	 * @Description: check GmfGmdu is null
	 * @param gmfGmdu GmfGmdu Object
	 * @return boolean
	 */
	public final static boolean checkGmfGmdu(GmfGmdu gmfGmdu) {
		if (null == gmfGmdu) {
			return false;
		} else {
			if (null == gmfGmdu.getKey() || null == gmfGmdu.getValue()) {
				gmfGmdu.setErrInfo(GmfErrorDefined.GMF_ERROR_CRITICAL, "%s key or value is null.",
						GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDU_BROKEN.getErr());
				return false;
			}
		}
		return true;
	}
	/**
	 * @Title: getObjectGmfElement
	 * @Description: get containerGmfElement form GmfGmdu
	 * @param gmfGmdu GmfGmdu Object
	 * @return GmfContainerElement
	 */
	public static GmfContainerElement getContainerGmfElement(GmfGmdu gmfGmdu) {
		if (!checkGmfGmdu(gmfGmdu)) {
			return null;
		} else {
			if (gmfGmdu.getKey().isGmfContainerElement()) {
				return (GmfContainerElement) gmfGmdu.getKey();
			} else if (gmfGmdu.getValue().isGmfContainerElement()) {
				return (GmfContainerElement) gmfGmdu.getValue();
			} else {
				return null;
			}
		}
	}
	@Override
	public void outGmfGmdu() {
		this.gmfPosition.getGmf().setCurrentGmfGmdu(this.gmfPosition.getParentGmdu());
	}
}
