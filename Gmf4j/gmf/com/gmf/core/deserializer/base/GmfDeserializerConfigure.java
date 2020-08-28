/**   
 * Copyright 漏 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDeserializerConfigure.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.base 
 * @Description: deserializer configure
 * @author: kitty   
 * @date: 2016骞��鏃� 涓嬪崍5:50:03 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.base;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.gmf.core.Gmf;
import com.gmf.core.GmfError;
import com.gmf.core.deserializer.GmfUserObjectDeserializer;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfDeserializerConfigure
 * @Description: deserializer configure information
 * @author: kitty
 * @date: 2016骞��鏃� 涓嬪崍5:50:03
 */
public class GmfDeserializerConfigure extends GmfError {
	/**
	 * @fieldName: gmf
	 * @fieldType: Gmf
	 * @Description: gmf data
	 */
	public Gmf gmf = new Gmf();
	/**
	 * @fieldName: printLogLevel
	 * @fieldType: int
	 * @Description: print log level
	 */
	private int printLogLevel = GmfErrorDefined.GMF_ERROR_CRITICAL;
	/**
	 * @fieldName: isFirstUpperCase
	 * @fieldType: boolean
	 * @Description: is set first word upper case
	 */
	private boolean isFirstUpperCase = true;

	/**
	 * @return the gmf
	 */
	public Gmf getGmf() {
		return gmf;
	}
	/**
	 * @param gmf the gmf to set
	 */
	public void setGmf(Gmf gmf) {
		this.gmf = gmf;
	}
	/**
	 * @return the printLogLevel
	 */
	public int getPrintLogLevel() {
		return printLogLevel;
	}
	/**
	 * @param printLogLevel the printLogLevel to set
	 */
	public void setPrintLogLevel(int printLogLevel) {
		this.printLogLevel = printLogLevel;
	}
	/**
	 * @return the isFirstUpperCase
	 */
	public boolean isFirstUpperCase() {
		return isFirstUpperCase;
	}
	/**
	 * @param isFirstUpperCase the isFirstUpperCase to set
	 */
	public void setFirstUpperCase(boolean isFirstUpperCase) {
		this.isFirstUpperCase = isFirstUpperCase;
	}
	
	/** 
	 * @Title: getObject 
	 * @Description: getObject
	 * @param data gmf format byte[]
	 * @param clazz object class name
	 * @return Object
	 */
	public Object getObject(byte[] data, Class<?> clazz) {
		return getObject(data, 0, data.length, clazz);
	}
	
	/** 
	 * @Title: getObject 
	 * @Description: getObject
	 * @param data data gmf format byte[]
	 * @param pos position of input byte[]
	 * @param clazz object class name
	 * @return Object
	 */
	public Object getObject(byte[] data, int pos, Class<?> clazz) {
		return getObject(data, pos, data.length, clazz);
	}
	
	/**
	 * @Title: getObject
	 * @Description: deserialzie gmf format byte[] to a clazz object
	 * @param data gmf format byte[]
	 * @param pos position of input byte[]
	 * @param length length of gmf format byte[]
	 * @param clazz object class name
	 * @return Object
	 */
	public Object getObject(byte[] data, int pos, int length, Class<?> clazz) {
		boolean retBoolean = false;
		int decodeLength = 0;
		Object object = null;
		try {
			object = clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null == object) {
				GmfWriteLog.printLog("%s : %s deserializer failed. instance object [%s] failed.", 
						this.getClass().getName(), 
						Thread.currentThread().getStackTrace()[2].getMethodName(), 
						clazz.getName());
				return null;
			}
		}
		decodeLength = this.gmf.decode(data, pos, length);
		if (decodeLength < 0) {
			GmfWriteLog.printLog("%s : %s deserializer failed. decode bytes failed.", 
					this.getClass().getName(), 
					Thread.currentThread().getStackTrace()[2].getMethodName());
			GmfWriteLog.printLog("decode gmf data: %s", 
					this.gmf.toPrintAllPrittyString());
		} else {
			GmfWriteLog.printLog("%s : %s deserializer successed. decode bytes successed.", 
					this.getClass().getName(),
					Thread.currentThread().getStackTrace()[2].getMethodName());
			GmfWriteLog.printLog("decode gmf data: %s", 
					this.gmf.toPrintAllPrittyString());
		}
		retBoolean = deserializerObject(object);
		if (retBoolean) {
			return object;
		}
		return null;
	}
	/**
	 * @Title: deserializerObject
	 * @Description: deserialize object data
	 * @param object source object
	 * @return boolean true of false
	 */
	public boolean deserializerObject(Object object) {
		boolean 	retBoolean = false;
		boolean 	retTempBoolean = false;
		Field 		fs = null;	//get current fields
		List<Field> fieldList = new ArrayList<Field>();
		
		
		getFieldList(fieldList, object.getClass());
		for(int i = 0; fieldList.size() > i; i++) {
			fs = fieldList.get(i);
			if (!fs.isAccessible()) {
				fs.setAccessible(true);
			}
			GmfDeserializer gs;
			Class<?> clazz = fs.getType();
			/**
			 * get deserializer
			 */
			gs = GmfDeserializerManager.getGmfDeserializer(clazz);
			if (null == gs) {
				GmfWriteLog.printLog("%s : %s unsupport type[%s] deserializer. deserializer [%s %s %s] failed.", this
						.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(), fs
						.getType().toString(), fs.getModifiers(), fs.getType().getSimpleName(), fs.getName());
				GmfWriteLog
						.printLog(
								"%s : %s unsupport type[%s] deserializer. used default deserializer[GmfUserObjectDeserializer()] deserialized [%s %s %s].",
								this.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(),
								fs.getType().toString(), fs.getModifiers(), fs.getType().getSimpleName(),
								fs.getName());
				/**
				 * used default deserializer
				 */
				gs = GmfDeserializerManager.getGmfDeserializer(GmfUserObjectDeserializer.class);
			}
			/**
			 * used deserializer
			 */
			retTempBoolean = gs.deserializerObject(this, object, fs);
			if (retTempBoolean) {
				/**
				 * a field successed. true
				 */
				retBoolean = true;
			}
		}
		return retBoolean;
	}
	/**
	 * @Title: setObject
	 * @Description: set field value
	 * @param object destination object
	 * @param f current field
	 * @param value field value object
	 * @return boolean true of false
	 */
	public static boolean setObject(Object object, Field f, Object value) {
		try {
			f.set(object, value);
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		} finally {
		}
		return true;
	}
	/** 
	 * @Title: getFieldList 
	 * @Description: TODO
	 *
	 * @param fieldList
	 * @param clazz void
	 *
	 * @return: void
	 * @exception
	 */
	public static void getFieldList(List<Field> fieldList, Class<?> clazz) {
		if (null == clazz || Object.class.isPrimitive()) {
			return;
		}
		Field[] fs = clazz.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			fieldList.add(fs[i]);
		}
		getFieldList(fieldList, clazz.getSuperclass());
	}
}
