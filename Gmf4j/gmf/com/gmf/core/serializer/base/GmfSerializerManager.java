/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfSerializerManager.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: serializer manager
 * @author: kitty   
 * @date: 2016年1月18日 下午2:47:24 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.base;

import java.util.List;
import java.lang.reflect.Array;
//import java.io.File;
//import java.lang.ref.SoftReference;
//import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
//import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.net.Inet4Address;
//import java.net.Inet6Address;
//import java.net.InetAddress;
//import java.net.InetSocketAddress;
//import java.net.URI;
//import java.net.URL;
//import java.nio.charset.Charset;
//import java.text.SimpleDateFormat;
//import java.util.Currency;
import java.util.HashMap;
//import java.util.Locale;
import java.util.Map;
//import java.util.TimeZone;
//import java.util.UUID;
import java.util.Map.Entry;
//import java.util.concurrent.atomic.AtomicBoolean;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.concurrent.atomic.AtomicIntegerArray;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.concurrent.atomic.AtomicLongArray;
//import java.util.concurrent.atomic.AtomicReference;
//import java.util.regex.Pattern;

import com.gmf.core.serializer.GmfUserObjectSerializer;
import com.gmf.print.GmfWriteLog;
import com.gmf.util.IdentityHashMap;

/**
 * @ClassName: GmfSerializerManager
 * @Description: GmfSerializerManager
 * @author: kitty
 * @date: 2016年1月18日 下午3:57:33
 */
public class GmfSerializerManager {
	/**
	 * @fieldName: gmfSerializerMap
	 * @fieldType: IdentityHashMap<Type,GmfSerializer>
	 * @Description: GmfSerializerMapping
	 */
	private static IdentityHashMap<Type, GmfSerializer> gmfSerializerMap = new IdentityHashMap<Type, GmfSerializer>();
	/**
	 * @fieldName: gmfSerializerClassMap
	 * @fieldType: HashMap<Type,String>
	 * @Description: GmfSerializer register
	 */
	private static HashMap<Type, String> gmfSerializerClassMap = new HashMap<Type, String>() {
		/**
		 * @fieldName: serialVersionUID
		 * @fieldType: long
		 * @Description: serialVersionUID
		 */
		private static final long serialVersionUID = 3588877979139734107L;
		{
			put(Boolean.class, "com.gmf.core.serializer.GmfBooleanSerializer");
			put(Boolean.TYPE, "com.gmf.core.serializer.GmfBooleanSerializer");
			put(Character.class, "com.gmf.core.serializer.GmfCharacterSerializer");
			put(Character.TYPE, "com.gmf.core.serializer.GmfCharacterSerializer");
			put(Byte.class, "com.gmf.core.serializer.GmfByteSerializer");
			put(Byte.TYPE, "com.gmf.core.serializer.GmfByteSerializer");
			put(Short.class, "com.gmf.core.serializer.GmfShortSerializer");
			put(Short.TYPE, "com.gmf.core.serializer.GmfShortSerializer");
			put(Integer.class, "com.gmf.core.serializer.GmfIntegerSerializer");
			put(Integer.TYPE, "com.gmf.core.serializer.GmfIntegerSerializer");
			put(Long.class, "com.gmf.core.serializer.GmfLongSerializer");
			put(Long.TYPE, "com.gmf.core.serializer.GmfLongSerializer");
			put(Float.class, "com.gmf.core.serializer.GmfFloatSerializer");
			put(Float.TYPE, "com.gmf.core.serializer.GmfFloatSerializer");
			put(Double.class, "com.gmf.core.serializer.GmfDoubleSerializer");
			put(Double.TYPE, "com.gmf.core.serializer.GmfDoubleSerializer");
			// put(BigDecimal.class, "com.gmf.core.serializer.GmfMapSerializer");
			// put(BigInteger.class, "com.gmf.core.serializer.GmfMapSerializer");
			put(String.class, "com.gmf.core.serializer.GmfStringSerializer");
			put(StringBuffer.class, "com.gmf.core.serializer.GmfStringBufferSerializer");
			put(Map.class, "com.gmf.core.serializer.GmfMapSerializer");
			put(List.class, "com.gmf.core.serializer.GmfListSerializer");
			put(byte[].class, "com.gmf.core.serializer.array.GmfByteArraySerializer");
			put(short[].class, "com.gmf.core.serializer.array.GmfShortArraySerializer");
			put(int[].class, "com.gmf.core.serializer.array.GmfIntegerArraySerializer");
			put(long[].class, "com.gmf.core.serializer.array.GmfLongArraySerializer");
			put(float[].class, "com.gmf.core.serializer.array.GmfFloatArraySerializer");
			put(double[].class, "com.gmf.core.serializer.array.GmfDoubleArraySerializer");
			put(boolean[].class, "com.gmf.core.serializer.array.GmfBooleanArraySerializer");
			put(char[].class, "com.gmf.core.serializer.array.GmfCharArraySerializer");
			put(Array.class, "com.gmf.core.serializer.array.GmfObjectArraySerializer");
			put(GmfUserObjectSerializer.class, "com.gmf.core.serializer.GmfUserObjectSerializer");
	
		}
	};

	private GmfSerializerManager() {
	}

	/**
	 * init all gmf serializer
	 */
	static {
		if (gmfSerializerClassMap.size() <= 0) {
			GmfWriteLog.printLog("init GmfSerializerManager failed. not defined GmfSerializer. size[%d]",
					gmfSerializerClassMap.size());
		} else {
			for (Entry<Type, String> entry : gmfSerializerClassMap.entrySet()) {
				try {
					String className = entry.getValue();
					if (null == className) {
						GmfWriteLog.printLog("GmfSerializerManager not found class name of type[%s]", 
								entry.getKey().toString());
						continue;
					}
					Class<?> aClass = Class.forName(className);
					if (null == aClass) {
						GmfWriteLog.printLog(
								"GmfSerializerManager Class.forName(%s) failed, type[%s] return null class.",
								className, entry.getKey().toString());
						continue;
					}
					GmfSerializer gs = (GmfSerializer) aClass.newInstance();
					if (null == gs) {
						GmfWriteLog.printLog(
								"GmfSerializerManager newInstance() of class(%s) failed, type[%s] return null class.",
								className, entry.getKey().toString());
						continue;
					} else {
						gmfSerializerMap.put(entry.getKey(), gs);
						GmfWriteLog.printLog(
								"%d.GmfSerializerManager newInstance() of class(%s) successed.  type[%s].",
								gmfSerializerMap.size(), className, entry.getKey().toString());
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @Title: getGmfSerializer
	 * @Description: get a gmf serializer by type
	 * @param t data type information
	 * @return GmfSerializer
	 */
	public final static GmfSerializer getGmfSerializer(Type t) {
		if (null == t) {
			return gmfSerializerMap.get(t);
		}
		if (Map.class.isAssignableFrom((Class<?>) t)) {
			return gmfSerializerMap.get(Map.class);
		} else if (List.class.isAssignableFrom((Class<?>) t)) {
			return gmfSerializerMap.get(List.class);
		} else if (((Class<?>) t).isArray()) {
			GmfSerializer gs = gmfSerializerMap.get(t);
			if (null != gs) {
				return gs;
			} else {
				return gmfSerializerMap.get(Array.class);
			}
		} else {
			return gmfSerializerMap.get(t);
		}
	}
}
