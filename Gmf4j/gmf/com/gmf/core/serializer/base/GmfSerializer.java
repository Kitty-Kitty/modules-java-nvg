/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.base 
 * @Description: super class of all GmfSerializer
 * @author: kitty   
 * @date: 2016年1月18日 下午3:12:31 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.base;

import java.lang.reflect.Field;

import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.core.gmdt.base.GmfElementManager;
import com.gmf.core.gmdu.GmfGmdu;
import com.gmf.core.serializer.util.GmfSerializerUtil;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfSerializer
 * @Description: super class of all GmfSerializer
 * @author: kitty
 * @date: 2016年1月18日 下午3:12:31
 */
public abstract class GmfSerializer implements GmfSerializerInterface {
	/**
	 * @Title: getStackInformation
	 * @Description: get stack information
	 * @return String stack string
	 */
	public final String getStackInformation() {
		return GmfWriteLog.format("%s.%s() ", this.getClass().getName(),
				Thread.currentThread().getStackTrace()[2].getMethodName());
	}
	/**
	 * @Title: println
	 * @Description: print log information
	 * @param gsc GmfSerializerConfigure information
	 * @param code log level
	 * @param format format string
	 * @param args arguments
	 */
	public final void println(GmfSerializerConfigure gsc, int code, String format, Object... args) {
		if (code >= gsc.getPrintLogLevel()) {
			GmfWriteLog.println(code, getStackInformation() + format, args);
		}
	}
	/**
	 * @Title: printGmfError
	 * @Description: print GmfElement error information
	 * @param gsc GmfSerializerConfigure information
	 */
	public final void printGmfError(GmfSerializerConfigure gsc) {
		if (gsc.getPrintLogLevel() > 0) {
			GmfWriteLog.println(gsc.getErrno(), getStackInformation() + "%s", gsc.getErr());
		}
	}
	/**
	 * @Title: formatFieldString
	 * @Description: format field information to string
	 * @param src source object
	 * @param f field data
	 * @return String
	 */
	public final String formatFieldString(Object src, Field f) {
		String tmpString = null;
		try {
			tmpString = GmfWriteLog.format("Field[%s %s %s %s]", f.getModifiers(), f.getType().getSimpleName(),
					f.getName(), f.get(src));
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			tmpString = e.toString();
		}
		return tmpString;
	}
	@Override
	public boolean check(GmfSerializerConfigure gsc, Object src, Field f) {
		/**
		 * check cycle reference
		 */
		if (null != src) {
			Object tmpObject = gsc.objectStackMap.get(src);
			if (null == tmpObject) {
				gsc.objectStackMap.put(src, src);
			} else {
				GmfWriteLog.printLog("%s object[%s] %s is cycle reference.", this.getStackInformation(),
						src.toString(), this.formatFieldString(src, f));
				return false;
			}
		}
		return true;
	}
	@Override
	public boolean begin(GmfSerializerConfigure gsc, Object src, Field f) {
		// this.currentGmfGmdu = gsc.gmf.getCurrentGmfGmdu();
		return true;
	}
	/**
	 * @Title: getGmfBytes
	 * @Description: getGmfBytes
	 * @param gsc GmfSerializerConfigure information
	 * @param src source object
	 * @param f field data
	 * @return boolean
	 */
	public boolean serializerObject(GmfSerializerConfigure gsc, Object src, Field f) {
		boolean retBoolean = false;
		retBoolean = check(gsc, src, f);
		if (!retBoolean) {
			printGmfError(gsc);
			return retBoolean;
		}
		retBoolean = begin(gsc, src, f);
		if (!retBoolean) {
			printGmfError(gsc);
			return retBoolean;
		}
		retBoolean = serializer(gsc, src, f);
		if (!retBoolean) {
			printGmfError(gsc);
			return retBoolean;
		}
		retBoolean = end(gsc, src, f);
		if (!retBoolean) {
			printGmfError(gsc);
			return retBoolean;
		}
		return retBoolean;
	}
	@Override
	public boolean end(GmfSerializerConfigure gsc, Object src, Field f) {
		/**
		 * remove object
		 */
		gsc.objectStackMap.remove(src);
		println(gsc, GmfErrorDefined.GMF_ERROR_NONE, "%s\tserializer %s successed!", getStackInformation(),
				formatFieldString(src, f));
		return true;
	}
	/**
	 * @Title: getFieldName
	 * @Description: get field name
	 * @param gsc GmfSerializerConfigure information
	 * @param object source object
	 * @param f field data
	 * @return String 
	 */
	public final String getFieldName(GmfSerializerConfigure gsc, Object object, Field f) {
		// return GmfSerializerUtil.captureName(f.getName());
		// return f.getName();
		if (gsc.isFirstUpperCase()) {
			return GmfSerializerUtil.firstUpperCase(f.getName());
		} else {
			return f.getName();
		}
	}
	/**
	 * @Title: getCurrentElement
	 * @Description: get current element by gsc
	 * @param gsc GmfSerializerConfigure information
	 * @return Object
	 */
	public Object getCurrentElement(GmfSerializerConfigure gsc) {
		return gsc.gmf.getCurrentGmfGmdu();
	}
	/**
	 * @Title: setCurrentElement
	 * @Description: set current element
	 * @param gsc GmfSerializerConfigure information
	 * @param object field data
	 * @return boolean
	 */
	public boolean setCurrentElement(GmfSerializerConfigure gsc, Object object) {
		gsc.gmf.setCurrentGmfGmdu((GmfGmdu) object);
		return true;
	}
	/**
	 * @Title: addElement
	 * @Description: add element to current GmfGmdu
	 * @param gsc GmfSerializerConfigure information
	 * @param element 
	 * @return boolean
	 */
	public boolean addElement(GmfSerializerConfigure gsc, Object element) {
		return gsc.gmf.getCurrentGmfGmdu().addGmfGmdu((GmfGmdu) element);
	}
	/**
	 * @Title: addChildElement
	 * @Description:  add child element to current GmfGmdu
	 * @param gsc GmfSerializerConfigure information
	 * @param element
	 * @return boolean
	 */
	public boolean addChildElement(GmfSerializerConfigure gsc, Object element) {
		return gsc.gmf.getCurrentGmfGmdu().addChildGmfGmdu((GmfGmdu) element);
	}
	/**
	 * @Title: addChildElement
	 * @Description: TODO
	 * @param gsc GmfSerializerConfigure information
	 * @param key key GmfElement
	 * @param value  value GmfElement
	 * @return boolean
	 */
	public boolean addChildElement(GmfSerializerConfigure gsc, Object key, Object value) {
		return gsc.gmf.getCurrentGmfGmdu().addChildGmfGmdu(this.createGmfGmdu(key, value));
	}
	/**
	 * @Title: createGmfElement
	 * @Description: create GmfElement by object
	 * @param object
	 * @return GmfElement
	 */
	public GmfElement createGmfElement(Object object) {
		int tmpFlag = 0;
		GmfElement tmpGmfElement = null;
		tmpFlag = GmfElementFlagAdapter.getGmfElementFlag(object);
		if (tmpFlag < 0) {
			/**
			 * unknow Type adapter to GmfElement Type
			 */
			return null;
		}
		try {
			tmpGmfElement = GmfElementManager.createGmfElement(tmpFlag);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null == tmpGmfElement) {
				return null;
			}
		}
		if (!tmpGmfElement.format(object)) {
			return null;
		}
		return tmpGmfElement;
	}
	/**
	 * @Title: createGmfGmdu
	 * @Description: create GmfGmdu by key and value
	 * @param key key object
	 * @param value value object
	 * @return GmfGmdu
	 */
	public GmfGmdu createGmfGmdu(Object key, Object value) {
		GmfElement gmfElementKey = null;
		GmfElement gmfElementValue = null;
		
		
		/**
		 * 
		 */
		gmfElementKey = createGmfElement(key);
		gmfElementValue = createGmfElement(value);
		if (null == gmfElementKey) {
			gmfElementKey = createGmfElement(null);
		}
		if (null == gmfElementValue) {
			gmfElementValue = createGmfElement(null);
		}
		return GmfGmdu.createGmfGmdu(gmfElementKey, gmfElementValue);
	}
}
