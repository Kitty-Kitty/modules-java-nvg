/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDeserializerConstructor.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.base 
 * @Description: deserializer constructor
 * @author: kitty   
 * @date: 2016年1月27日 上午10:01:54 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.base;

import java.util.List;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: GmfDeserializerConstructor
 * @Description: class of deserializer constructor
 * @author: kitty
 * @date: 2016年1月27日 上午10:01:54
 */
public class GmfDeserializerConstructor {
	private final static HashMap<Type, Type> gmfDeserializerConstructorMap = new HashMap<Type, Type>() {
		/**
		 * @fieldName: serialVersionUID
		 * @fieldType: long
		 * @Description: serialVersionUID
		 */
		private static final long serialVersionUID = 6096975297449518595L;
		{
			put(Boolean.class, boolean.class);
			put(Boolean.TYPE, boolean.class);
			put(Byte.class, byte.class);
			put(Byte.TYPE, byte.class);
			put(Short.class, short.class);
			put(Short.TYPE, short.class);
			put(Integer.class, int.class);
			put(Integer.TYPE, int.class);
			put(Long.class, long.class);
			put(Long.TYPE, long.class);
			put(Float.class, float.class);
			put(Float.TYPE, float.class);
			put(Double.class, double.class);
			put(Double.TYPE, double.class);
		}
	};

	/**
	 * @Title: createNewInstance
	 * @Description: create a new instance by type
	 * @param t Class<?> type name
	 * @return Object return new instance
	 */
	public final static Object createNewInstance(Type t) {
		Type tmpType = null;
		tmpType = gmfDeserializerConstructorMap.get(t);
		if (null != tmpType) {
			try {
				return ((Class<?>) t).getConstructor((Class<?>) tmpType).newInstance(0);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			if (Map.class.isAssignableFrom((Class<?>) t)) {
				if (((Class<?>) t).getSimpleName().equals("Map")) {
					tmpType = HashMap.class;
				}
			} else if (List.class.isAssignableFrom((Class<?>) t)) {
				if (((Class<?>) t).getSimpleName().equals("List")) {
					tmpType = ArrayList.class;
				}
			}
			if (null == tmpType) {
				tmpType = t;
			}
			try {
				return ((Class<?>) tmpType).newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * @Title: createArrayNewInstance
	 * @Description: create a array instance by type
	 * @param t Class<?> type name
	 * @param size array size
	 * @return Object return array object
	 */
	public final static Object createArrayNewInstance(Type t, int size) {
		// return Array.newInstance(boolean.class, size);
		return Array.newInstance(((Class<?>) t), size);
	}
}
