/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfListDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer 
 * @Description: deserialize list type
 * @author: kitty   
 * @date: 2016年1月25日 下午2:37:05 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.gmf.core.deserializer.base.GmfDeserializer;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;
import com.gmf.core.deserializer.base.GmfDeserializerConstructor;
import com.gmf.core.serializer.base.GmfSerializerConfigure;
import com.gmf.defined.GmfErrorDefined;

/**
 * @ClassName: GmfListDeserializer
 * @Description: class to deserialize list type
 * @author: kitty
 * @date: 2016年1月25日 下午2:37:05
 */
public class GmfListDeserializer extends GmfDeserializer {
	@Override
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f) {
		Class<?> clazz = f.getType();
		Class<?> genericClazz = null;
		Object value = this.getValue(gdc, object, f);
		/**
		 * get data value
		 */
		if (null == value) {
			this.println(gdc, 
					GmfErrorDefined.GMF_ERROR_CRITICAL, "%s value is null error! ", clazz.getName());
			return true;
		}
		/**
		 * check clazz is List.class
		 */
		if (!List.class.isAssignableFrom(clazz)) {
			this.println(gdc, 
					GmfErrorDefined.GMF_ERROR_CRITICAL, "%s isAssignableFrom() failed! not List.class.",
					clazz);
			return true;
		}
		/**
		 * List<ClassA>, get ClassA
		 */
		Type fieldType = f.getGenericType();
		if (null == fieldType) {
			this.println(gdc, 
					GmfErrorDefined.GMF_ERROR_CRITICAL, "%s getGenericType() failed! field type is null.",
					clazz);
			return true;
		}
		/**
		 * check fieldType is ParameterizedType
		 */
		if (fieldType instanceof ParameterizedType) {
			ParameterizedType pt = (ParameterizedType) fieldType;
			genericClazz = (Class<?>) pt.getActualTypeArguments()[0];
		} else {
			this.println(gdc, GmfErrorDefined.GMF_ERROR_CRITICAL,
					"%s \"fieldType instanceof ParameterizedType\" failed! ", 
					fieldType);
			return true;
		}
		/**
		 * get bean Object
		 */
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == obj) {
			/**
			 * if Object is null, create a new one
			 */
			obj = GmfDeserializerConstructor.createNewInstance(clazz);
			if (null == obj) {
				this.println(gdc, GmfErrorDefined.GMF_ERROR_CRITICAL,
						"%s GmfDeserializerConstructor.createNewInstance() failed! ", 
						clazz.getName());
				return true;
			}
			GmfDeserializerConfigure.setObject(object, f, obj);
		}
		/**
		 * process list element
		 */
		@SuppressWarnings("unchecked")
		List<Object> objList = (ArrayList<Object>) obj;
		Object currentElement = this.getCurrentElement(gdc);
		Object newListItem = null;
		boolean retBoolean = false;
		boolean isContainerGmfGmdu = false;
		/**
		 * parse List value
		 */
		if (value instanceof List) {
			List<?> list = (List<?>) value;
			if (list.size() > 0) {
				for (Object item : list) {
					/**
					 * begin parse list item
					 */
					this.setCurrentElement(gdc, item);
					/**
					 * ceate a new list item
					 */
					newListItem = GmfDeserializerConstructor.createNewInstance(genericClazz);
					if (null == newListItem) {
						continue;
					}
					isContainerGmfGmdu = this.isContainerGmfGmdu(item);
					if (!isContainerGmfGmdu) {
						Object itemObjectValue = this.getNoNullValue(item);
						if (genericClazz.isAssignableFrom(itemObjectValue.getClass())) {
							newListItem = itemObjectValue;
							objList.add(newListItem);
						}
					} else {
						/**
						 * deserializer object
						 */
						retBoolean = gdc.deserializerObject(newListItem);
						if (!retBoolean) {
							continue;
						}
						objList.add(newListItem);
					}
				}
			}
		}
		this.setCurrentElement(gdc, currentElement);
		return true;
	}
}
