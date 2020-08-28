/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.base 
 * @Description: super class of all deserializer
 * @author: kitty   
 * @date: 2016年1月23日 下午8:38:40 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.base;

import java.lang.reflect.Field;

import com.gmf.core.deserializer.util.GmfDeserializerUtil;
import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.core.gmdu.GmfGmdu;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfDeserializer
 * @Description: super class of all deserializer
 * @author: kitty
 * @date: 2016年1月23日 下午8:38:40
 */
public abstract class GmfDeserializer implements GmfDeserializerInterface {
	/**
	 * @Title: getStackInformation
	 * @Description: get current stack information
	 * @return String String of stack information
	 */
	public final String getStackInformation() {
		return GmfWriteLog.format("%s.%s() ", this.getClass().getName(),
				Thread.currentThread().getStackTrace()[2].getMethodName());
	}
	/**
	 * @Title: println
	 * @Description: print log information
	 * @param gdc GmfDeserializerConfigure information
	 * @param code level of log
	 * @param format format string
	 * @param args arguments
	 */
	public final void println(GmfDeserializerConfigure gdc, int code, String format, Object... args) {
		if (code >= gdc.getPrintLogLevel()) {
			GmfWriteLog.println(code, getStackInformation() + format, args);
		}
	}
	/**
	 * @Title: printGmfError
	 * @Description: print GmfDeserializerConfigure error information
	 * @param gdc GmfDeserializerConfigure information
	 */
	public final void printGmfError(GmfDeserializerConfigure gdc) {
		if (gdc.getPrintLogLevel() > 0) {
			GmfWriteLog.println(gdc.getErrno(), getStackInformation() + "%s", gdc.getErr());
		}
	}
	/**
	 * @Title: formatFieldString
	 * @Description: Format Field String
	 * @param src source Object
	 * @param f current Field
	 * @return String return Field format String
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
	public boolean check(GmfDeserializerConfigure gdc, Object object, Field f) {
		return true;
	}
	@Override
	public boolean begin(GmfDeserializerConfigure gdc, Object object, Field f) {
		return true;
	}
	/** 
	 * @Title: deserializerObject 
	 * @Description: TODO
	 * @param gdc GmfDeserializerConfigure information
	 * @param object destination Object
	 * @param f current filed information
	 * @return boolean 
	 */
	public boolean deserializerObject(GmfDeserializerConfigure gdc, Object object, Field f) {
		boolean retBoolean = false;
		retBoolean = check(gdc, object, f);
		if (!retBoolean) {
			printGmfError(gdc);
			return retBoolean;
		}
		retBoolean = begin(gdc, object, f);
		if (!retBoolean) {
			printGmfError(gdc);
			return retBoolean;
		}
		retBoolean = deserializer(gdc, object, f);
		if (!retBoolean) {
			printGmfError(gdc);
			return retBoolean;
		}
		retBoolean = end(gdc, object, f);
		if (!retBoolean) {
			printGmfError(gdc);
			return retBoolean;
		}
		return retBoolean;
	}
	@Override
	public boolean end(GmfDeserializerConfigure gdc, Object object, Field f) {
		println(gdc, GmfErrorDefined.GMF_ERROR_NONE, "%s\tdeserializer %s successed!", getStackInformation(),
				formatFieldString(object, f));
		return true;
	}
	/**
	 * @Title: getFieldName
	 * @Description: get field name
	 * @param gdc GmfDeserializerConfigure information
	 * @param object source object
	 * @param f current field
	 * @return String format field string
	 */
	public final String getFieldName(GmfDeserializerConfigure gdc, Object object, Field f) {
		// return GmfDeserializerUtil.captureName(f.getName());
		// return f.getName();
		if (gdc.isFirstUpperCase()) {
			return GmfDeserializerUtil.firstUpperCase(f.getName());
		} else {
			return f.getName();
		}
	}
	/**
	 * @Title: getElement
	 * @Description: get element by field
	 * @param gdc GmfDeserializerConfigure information
	 * @param object source object
	 * @param f current field
	 * @return Object gmf object
	 */
	public final Object getElement(GmfDeserializerConfigure gdc, Object object, Field f) {
		return gdc.gmf.getCurrentGmfGmdu().findChildGmfGmdu(getFieldName(gdc, object, f));
	}
	/**
	 * @Title: getKey
	 * @Description: get object key of current gmfgmdu children element by field
	 * @param gdc GmfDeserializerConfigure information
	 * @param object source object
	 * @param f current field
	 * @return Object value of gmfgmdu key element
	 */
	public final Object getKey(GmfDeserializerConfigure gdc, Object object, Field f) {
		GmfGmdu gg = gdc.gmf.getCurrentGmfGmdu().findChildGmfGmdu(getFieldName(gdc, object, f));
		if (null != gg) {
			return gg.getKey().getObjectValue();
		}
		return null;
	}
	/**
	 * @Title: getValue
	 * @Description: get object value of current gmfgmdu children  element by field
	 * @param gdc GmfDeserializerConfigure information
	 * @param object source object
	 * @param f current field
	 * @return Object value of gmfgmdu value element
	 */
	public final Object getValue(GmfDeserializerConfigure gdc, Object object, Field f) {
		GmfGmdu gg = gdc.gmf.getCurrentGmfGmdu().findChildGmfGmdu(getFieldName(gdc, object, f));
		if (null != gg) {
			return gg.getValue().getObjectValue();
		}
		return null;
	}
	/**
	 * @Title: getKey
	 * @Description: get key element value of GmfGmdu
	 * @param gg source of GmfGmdu object
	 * @return Object return key element value
	 */
	public final Object getKey(Object gg) {
		GmfGmdu tmpGg = (GmfGmdu) gg;
		if (null != tmpGg) {
			if (null != tmpGg.getKey()) {
				return tmpGg.getKey().getObjectValue();
			}
		}
		return null;
	}
	/**
	 * @Title: getKeyObject
	 * @Description: get key elment of GmfGmdu
	 * @param gg source of GmfGmdu object
	 * @return Object return key element value
	 */
	public final Object getKeyObject(Object gg) {
		GmfGmdu tmpGg = (GmfGmdu) gg;
		if (null != tmpGg) {
			return tmpGg.getKey();
		}
		return null;
	}
	/**
	 * @Title: getValue
	 * @Description: get value element value of GmfGmdu
	 * @param gg source of GmfGmdu object
	 * @return Object return value element value
	 */
	public final Object getValue(Object gg) {
		GmfGmdu tmpGg = (GmfGmdu) gg;
		if (null != tmpGg) {
			if (null != tmpGg.getValue()) {
				return tmpGg.getValue().getObjectValue();
			}
		}
		return null;
	}
	/**
	 * @Title: getValueObject
	 * @Description: get value elment of GmfGmdu
	 * @param gg source of GmfGmdu object
	 * @return Object return value element value
	 */
	public final Object getValueObject(Object gg) {
		GmfGmdu tmpGg = (GmfGmdu) gg;
		if (null != tmpGg) {
			return tmpGg.getValue();
		}
		return null;
	}
	/**
	 * @Title: getNoNullValue
	 * @Description: get not null elment of GmfGmdu, is key element of value element
	 * @param gg source of GmfGmdu object
	 * @return Object return not null element
	 */
	public final Object getNoNullValue(Object gg) {
		GmfGmdu tmpGg = (GmfGmdu) gg;
		if (null != tmpGg) {
			if (null != tmpGg.getKey() && !tmpGg.getKey().isEmpty()) {
				return tmpGg.getKey().getObjectValue();
			} else {
				return tmpGg.getValue().getObjectValue();
			}
		}
		return null;
	}
	/**
	 * @Title: isContainerGmfGmdu
	 * @Description: check GmfGmdu is container GmfGmdu or not
	 * @param object source of GmfGmdu object
	 * @return boolean true of false
	 */
	public final boolean isContainerGmfGmdu(Object object) {
		GmfGmdu gg = (GmfGmdu) object;
		if (null != gg.getKey() && gg.getKey().isGmfContainerElement()) {
			return true;
		}
		if (null != gg.getValue() && gg.getValue().isGmfContainerElement()) {
			return true;
		}
		return false;
	}
	/**
	 * @Title: isContainerGmfElement
	 * @Description: check GmfElement is container GmfElement or not
	 * @param object source of GmfGmdu object
	 * @return boolean true of false
	 */
	public final boolean isContainerGmfElement(Object object) {
		return ((GmfElement) object).isGmfContainerElement();
	}
	/**
	 * @Title: getCurrentElement
	 * @Description: get current GmfGmdu
	 * @param gdc GmfDeserializerConfigure information
	 * @return Object GmfGmdu object
	 */
	public Object getCurrentElement(GmfDeserializerConfigure gdc) {
		return gdc.gmf.getCurrentGmfGmdu();
	}
	/**
	 * @Title: setCurrentElement
	 * @Description: set current GmfGmdu
	 * @param gdc GmfDeserializerConfigure information
	 * @param object source GmfGmdu
	 * @return boolean true of false
	 */
	public boolean setCurrentElement(GmfDeserializerConfigure gdc, Object object) {
		gdc.gmf.setCurrentGmfGmdu((GmfGmdu) object);
		return true;
	}
}
