/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDeserializerManager.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.base 
 * @Description: deserializer manager save all deserializers
 * @author: kitty   
 * @date: 2016年1月23日 下午8:40:18 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.base;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.gmf.core.deserializer.GmfUserObjectDeserializer;
import com.gmf.print.GmfWriteLog;
import com.gmf.util.IdentityHashMap;

/**
 * @ClassName: GmfDeserializerManager
 * @Description: deserializer manager
 * @author: kitty
 * @date: 2016年1月23日 下午8:40:18
 */
public class GmfDeserializerManager {
	/**
	 * @fieldName: gmfDeserializerMap
	 * @fieldType: IdentityHashMap<Type,GmfDeserializer>
	 * @Description: gmf deserializer mapping 
	 */
	private static IdentityHashMap<Type, GmfDeserializer> gmfDeserializerMap = new IdentityHashMap<Type, GmfDeserializer>();
	
	/**
	 * @fieldName: gmfDeserializerClassMap
	 * @fieldType: HashMap<Type,String>
	 * @Description: gmf deserializer class mapping
	 */
	private static HashMap<Type, String> gmfDeserializerClassMap = new HashMap<Type, String>() {
		/**
		 * @fieldName: serialVersionUID
		 * @fieldType: long
		 * @Description: serialVersionUID
		 */
		private static final long serialVersionUID = 3588877979139734107L;
		{
			put(Boolean.class, "com.gmf.core.deserializer.GmfBooleanDeserializer");
			put(Boolean.TYPE, "com.gmf.core.deserializer.GmfBooleanDeserializer");
			put(Character.class, "com.gmf.core.deserializer.GmfCharacterDeserializer");
			put(Character.TYPE, "com.gmf.core.deserializer.GmfCharacterDeserializer");
			put(Byte.class, "com.gmf.core.deserializer.GmfByteDeserializer");
			put(Byte.TYPE, "com.gmf.core.deserializer.GmfByteDeserializer");
			put(Short.class, "com.gmf.core.deserializer.GmfShortDeserializer");
			put(Short.TYPE, "com.gmf.core.deserializer.GmfShortDeserializer");
			put(Integer.class, "com.gmf.core.deserializer.GmfIntegerDeserializer");
			put(Integer.TYPE, "com.gmf.core.deserializer.GmfIntegerDeserializer");
			put(Long.class, "com.gmf.core.deserializer.GmfLongDeserializer");
			put(Long.TYPE, "com.gmf.core.deserializer.GmfLongDeserializer");
			put(Float.class, "com.gmf.core.deserializer.GmfFloatDeserializer");
			put(Float.TYPE, "com.gmf.core.deserializer.GmfFloatDeserializer");
			put(Double.class, "com.gmf.core.deserializer.GmfDoubleDeserializer");
			put(Double.TYPE, "com.gmf.core.deserializer.GmfDoubleDeserializer");
			// put(BigDecimal.class, "com.gmf.core.deserializer.GmfMapDeserializer");
			// put(BigInteger.class, "com.gmf.core.deserializer.GmfMapDeserializer");
			put(String.class, "com.gmf.core.deserializer.GmfStringDeserializer");
			put(StringBuffer.class, "com.gmf.core.deserializer.GmfStringBufferDeserializer");
			put(List.class, "com.gmf.core.deserializer.GmfListDeserializer");
			put(Map.class, "com.gmf.core.deserializer.GmfMapDeserializer");
			put(byte[].class, "com.gmf.core.deserializer.array.GmfByteArrayDeserializer");
			put(Byte[].class, "com.gmf.core.deserializer.array.GmfByteArrayDeserializer");
			put(short[].class, "com.gmf.core.deserializer.array.GmfShortArrayDeserializer");
			put(Short[].class, "com.gmf.core.deserializer.array.GmfShortArrayDeserializer");
			put(int[].class, "com.gmf.core.deserializer.array.GmfIntegerArrayDeserializer");
			put(Integer[].class, "com.gmf.core.deserializer.array.GmfIntegerArrayDeserializer");
			put(long[].class, "com.gmf.core.deserializer.array.GmfLongArrayDeserializer");
			put(Long[].class, "com.gmf.core.deserializer.array.GmfLongArrayDeserializer");
			put(float[].class, "com.gmf.core.deserializer.array.GmfFloatArrayDeserializer");
			put(Float[].class, "com.gmf.core.deserializer.array.GmfFloatArrayDeserializer");
			put(double[].class, "com.gmf.core.deserializer.array.GmfDoubleArrayDeserializer");
			put(Double[].class, "com.gmf.core.deserializer.array.GmfDoubleArrayDeserializer");
			put(boolean[].class, "com.gmf.core.deserializer.array.GmfBooleanArrayDeserializer");
			put(Boolean[].class, "com.gmf.core.deserializer.array.GmfBooleanArrayDeserializer");
			put(char[].class, "com.gmf.core.deserializer.array.GmfCharArrayDeserializer");
			put(String[].class, "com.gmf.core.deserializer.array.GmfStringArrayDeserializer");
			put(Array.class, "com.gmf.core.deserializer.array.GmfObjectArrayDeserializer");
			/*
			 * put(Array.class, "com.gmf.core.deserializer.array.GmfObjectArrayDeserializer");
			 */
			put(GmfUserObjectDeserializer.class, "com.gmf.core.deserializer.GmfUserObjectDeserializer");
		}
	};

	private GmfDeserializerManager() {
	}

	/**
	 * init all gmf deserializer
	 */
	static {
		if (gmfDeserializerClassMap.size() <= 0) {
			GmfWriteLog.printLog("init GmfDeserializerManager failed. not defined GmfDeserializer. size[%d]",
					gmfDeserializerClassMap.size());
		} else {
			for (Entry<Type, String> entry : gmfDeserializerClassMap.entrySet()) {
				try {
					String className = entry.getValue();
					if (null == className) {
						GmfWriteLog.printLog("GmfDeserializerManager not found class name of type[%s]", 
								entry.getKey().toString());
						continue;
					}
					Class<?> aClass = Class.forName(className);
					if (null == aClass) {
						GmfWriteLog.printLog(
								"GmfDeserializerManager Class.forName(%s) failed, type[%s] return null class.",
								className, 
								entry.getKey().toString());
						continue;
					}
					GmfDeserializer gs = (GmfDeserializer) aClass.newInstance();
					if (null == gs) {
						GmfWriteLog.printLog(
										"GmfDeserializerManager newInstance() of class(%s) failed, type[%s] return null class.",
										className, 
										entry.getKey().toString());
						continue;
					} else {
						gmfDeserializerMap.put(entry.getKey(), gs);
						GmfWriteLog.printLog(
								"%d.GmfDeserializerManager newInstance() of class(%s) successed.  type[%s].",
								gmfDeserializerMap.size(), 
								className, 
								entry.getKey().toString());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @Title: getGmfDeserializer
	 * @Description: get a gmf deserializer by type
	 * @param t data type information
	 * @return GmfDeserializer
	 */
	public final static GmfDeserializer getGmfDeserializer(Type t) {
		if (null == t) {
			return gmfDeserializerMap.get(t);
		}
		if (Map.class.isAssignableFrom((Class<?>) t)) {
			return gmfDeserializerMap.get(Map.class);
		} else if (List.class.isAssignableFrom((Class<?>) t)) {
			return gmfDeserializerMap.get(List.class);
		} else if (((Class<?>) t).isArray()) {
			GmfDeserializer gs = gmfDeserializerMap.get(t);
			if (null != gs) {
				return gs;
			} else {
				return gmfDeserializerMap.get(Array.class);
			}
		} else {
			return gmfDeserializerMap.get(t);
		}
	}
}
