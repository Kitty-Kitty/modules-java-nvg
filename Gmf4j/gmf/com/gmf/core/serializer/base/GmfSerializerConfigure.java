/**   
 * Copyright 漏 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfSerializerConfigure.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: serializer configure
 * @author: kitty   
 * @date: 2016骞��鏃� 涓嬪崍2:48:32 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.base;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

import com.gmf.core.Gmf;
import com.gmf.core.GmfError;
import com.gmf.core.serializer.GmfUserObjectSerializer;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfSerializerConfigure
 * @Description: GmfSerializerConfigure
 * @author: kitty
 * @date: 2016骞��鏃� 涓嬪崍2:48:32
 */
public class GmfSerializerConfigure extends GmfError {
	/**
	 * @fieldName: objectStackMap
	 * @fieldType: HashMap<Integer,Object>
	 * @Description: process cycle reference object exception
	 */
	public IdentityHashMap<Object, Object> objectStackMap = new IdentityHashMap<Object, Object>();
	/**
	 * @fieldName: gmf
	 * @fieldType: Gmf
	 * @Description: gmf data
	 */
	public Gmf gmf = new Gmf();
	/**
	 * @fieldName: printLogLevel
	 * @fieldType: int
	 * @Description: print leve log
	 */
	private int printLogLevel = GmfErrorDefined.GMF_ERROR_CRITICAL;
	/**
	 * @fieldName: isFirstUpperCase
	 * @fieldType: boolean
	 * @Description: is upper case first char
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
	 * @Title: getGmfBytes
	 * @Description: serializer object to byte[] of gmf format
	 * @param object to serializer object
	 * @return byte[] gmf format byte array
	 */
	public byte[] getGmfBytes(Object object) {
		boolean retBoolean = false;
		retBoolean = serializerObject(object);
		if (retBoolean) {
			return this.gmf.encode();
		}
		return null;
	}
	/**
	 * @Title: serializerObject
	 * @Description: serializer a object
	 * @param object to serializer object
	 * @return boolean serialize success or failed. true:successed; false:failed
	 */
	public boolean serializerObject(Object object) {
		boolean retBoolean = false;
		Field 		fs = null;	//get current fields
		List<Field> fieldList = new ArrayList<Field>();
		
		
		getFieldList(fieldList, object.getClass());
		for(int i = 0; fieldList.size() > i; i++) {
			fs = fieldList.get(i);
			if (!fs.isAccessible()) {
				fs.setAccessible(true);
			}
			GmfSerializer gs;
			Class<?> clazz = fs.getType();
			/**
			 * get serializer
			 */
			gs = GmfSerializerManager.getGmfSerializer(clazz);
			if (null == gs) {
				GmfWriteLog.printLog("%s : %s unsupport type[%s] serializer. serializer [%s %s %s] failed.", this
						.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(), fs
						.getType().toString(), fs.getModifiers(), fs.getType().getSimpleName(), fs.getName());
				if (clazz.isPrimitive()) {
					GmfWriteLog.printLog("%s : %s unsupport type[%s] serializer. serializer [%s %s %s] failed.", this
							.getClass().getName(), Thread.currentThread().getStackTrace()[2].getMethodName(), fs
							.getType().toString(), fs.getModifiers(), fs.getType().getSimpleName(), fs
							.getName());
					return false;
				} else {
					GmfWriteLog
							.printLog(
									"%s : %s unsupport type[%s] serializer. used default serializer[GmfUserObjectSerializer()] serialized [%s %s %s].",
									this.getClass().getName(), Thread.currentThread().getStackTrace()[2]
											.getMethodName(), fs.getType().toString(), fs.getModifiers(), fs
											.getType().getSimpleName(), fs.getName());
					/**
					 * used default serializer
					 */
					gs = GmfSerializerManager.getGmfSerializer(GmfUserObjectSerializer.class);
				}
			}
			/**
			 * used serializer
			 */
			retBoolean = gs.serializerObject(this, object, fs);
		}
		return retBoolean;
	}
	/**
	 * @Title: getObject
	 * @Description: TODO
	 * @param object
	 * @param f
	 * @return
	 */
	public static Object getObject(Object object, Field f) {
		Object obj = null;
		try {
			obj = f.get(object);
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return obj;
	}
	/**
	 * @Title: getFieldMap
	 * @Description: TODO
	 * @param object
	 * @return
	 */
	public static HashMap<Integer, Field> getFieldMap(Object object) {
		if (null == object) {
			return null;
		}
		HashMap<Integer, Field> map = new HashMap<Integer, Field>();
		Field[] fs = object.getClass().getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			map.put(i, fs[i]);
		}
		return map;
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
