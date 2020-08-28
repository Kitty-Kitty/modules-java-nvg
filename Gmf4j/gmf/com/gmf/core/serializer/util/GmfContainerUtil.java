/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfContainerUtil.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.util 
 * @Description: GmfContainer util
 * @author: kitty   
 * @date: 2016年1月21日 下午5:06:08 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.util;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: GmfContainerUtil
 * @Description: GmfContainerUtil
 * @author: kitty
 * @date: 2016年1月21日 下午5:06:08
 */
public class GmfContainerUtil {
	/**
	 * @Title: isContainer
	 * @Description: is container
	 * @param object source object
	 * @return boolean
	 */
	public static boolean isContainer(Object object) {
		Class<?> clazz = object.getClass();
		if (Map.class.isAssignableFrom(clazz)) {
			return true;
		} else if (List.class.isAssignableFrom(clazz)) {
			return true;
		} else if (Collection.class.isAssignableFrom(clazz)) {
			return true;
		} else if (clazz.isEnum() || (clazz.getSuperclass() != null && clazz.getSuperclass().isEnum())) {
			return true;
		} else if (clazz.isArray()) {
			return true;
		} else if (Throwable.class.isAssignableFrom(clazz)) {
			return true;
		}
		return false;
	}
	/**
	 * @Title: isGeneralObject
	 * @Description: check is general object
	 * @param object source object
	 * @return boolean
	 */
	public static boolean isGeneralObject(Object object) {
		if (object instanceof Integer) {
			return true;
		} else if (object instanceof Short) {
			return true;
		} else if (object instanceof Long) {
			return true;
		} else if (object instanceof Float) {
			return true;
		} else if (object instanceof Double) {
			return true;
		} else if (object instanceof Boolean) {
			return true;
		} else if (object instanceof String) {
			return true;
		} else if (object instanceof Date) {
			return true;
		} else {
			return false;
		}
	}
}
