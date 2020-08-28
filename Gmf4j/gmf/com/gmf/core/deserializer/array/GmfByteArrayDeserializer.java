/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfByteArrayDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.array 
 * @Description: byte array deserializer 
 * @author: kitty   
 * @date: 2016年1月27日 下午4:55:11 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.array;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;
import com.gmf.core.deserializer.base.GmfDeserializerConstructor;
import com.gmf.defined.GmfErrorDefined;

/**
 * @ClassName: GmfByteArrayDeserializer
 * @Description: byte array deserializer class
 * @author: kitty
 * @date: 2016年1月27日 下午4:55:11
 */
public class GmfByteArrayDeserializer extends GmfArrayDeserializer {
	@Override
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f) {
		Class<?> clazz = f.getType();
		Object value = this.getValue(gdc, object, f);
		/**
		 * get data value
		 */
		if (null == value) {
			this.println(gdc, GmfErrorDefined.GMF_ERROR_NOTICE, "%s value is null error! ", f.getName());
			return true;
		}
		/**
		 * check clazz is List.class
		 */
		if (!clazz.isArray()) {
			this.println(gdc, GmfErrorDefined.GMF_ERROR_NOTICE, "%s isArray() failed! not Array Class.",
					clazz.getName());
			return true;
		}
		/**
		 * parse List value
		 */
		if (value instanceof byte[]) {
			Class<?> clazzComponent = clazz.getComponentType();
			int listSize = ((byte[]) value).length;
			if (listSize > 0) {
				Object tmpNewArray = GmfDeserializerConstructor.createArrayNewInstance(clazzComponent, listSize);
				GmfDeserializerConfigure.setObject(object, f, tmpNewArray);
				for (int i = 0; i < listSize; i++) {
					Array.set(tmpNewArray, i, ((byte[]) value)[i]);
				}
			}
		}
		return true;
	}
}
