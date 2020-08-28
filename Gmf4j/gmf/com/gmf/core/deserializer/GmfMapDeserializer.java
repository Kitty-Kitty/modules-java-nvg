/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfMapDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer 
 * @Description: deserialize map type
 * @author: kitty   
 * @date: 2016年1月25日 下午2:37:57 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.gmf.core.deserializer.base.GmfDeserializer;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;
import com.gmf.core.deserializer.base.GmfDeserializerConstructor;
import com.gmf.core.serializer.base.GmfSerializerConfigure;
import com.gmf.defined.GmfErrorDefined;

/**
 * @ClassName: GmfMapDeserializer
 * @Description: class to deserialize map type
 * @author: kitty
 * @date: 2016年1月25日 下午2:37:57
 */
public class GmfMapDeserializer extends GmfDeserializer {
	@Override
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f) {
		Class<?> clazz = f.getType();
		Class<?> genericKeyClazz = null;
		Class<?> genericValueClazz = null;
		Object value = this.getValue(gdc, object, f);
		/**
		 * get data value
		 */
		if (null == value) {
			this.println(gdc, GmfErrorDefined.GMF_ERROR_CRITICAL, "%s",
					GmfErrorDefined.GmfErrorInformation.GMF_ERROR_STRING_GMDU_VALUE_NULL.getErr());
			return true;
		}
		/**
		 * check clazz is List.class
		 */
		if (!Map.class.isAssignableFrom(clazz)) {
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
			genericKeyClazz = (Class<?>) pt.getActualTypeArguments()[0];
			genericValueClazz = (Class<?>) pt.getActualTypeArguments()[1];
		} else {
			this.println(gdc, GmfErrorDefined.GMF_ERROR_CRITICAL,
					"%s \"fieldType instanceof ParameterizedType\" failed! ", fieldType);
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
						"%s \"fieldType instanceof ParameterizedType\" failed! ", fieldType);
				return true;
			}
			GmfDeserializerConfigure.setObject(object, f, obj);
		}
		/**
		 * process list element
		 */
		@SuppressWarnings("unchecked")
		Map<Object, Object> objMap = (Map<Object, Object>) obj;
		Object currentElement = this.getCurrentElement(gdc);
		Object newMapKeyItem = null;
		Object newMapValueItem = null;
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

					newMapKeyItem = GmfDeserializerConstructor.createNewInstance(genericKeyClazz);
					newMapValueItem = GmfDeserializerConstructor.createNewInstance(genericValueClazz);
					if (null == newMapKeyItem || null == newMapValueItem) {
						continue;
					}
					/**
					 * get object key and value data
					 */
					Object itemObjectKey = this.getKey(item);
					Object itemObjectValue = this.getValue(item);
					Object itemKeyObject = this.getKeyObject(item);
					Object itemValueObject = this.getValueObject(item);
					/**
					 * check container gmfgmdu
					 */
					isContainerGmfGmdu = this.isContainerGmfGmdu(item);
					if (!isContainerGmfGmdu) {
						if (genericKeyClazz.isAssignableFrom(itemObjectKey.getClass())
								&& genericValueClazz.isAssignableFrom(itemObjectValue.getClass())) {
							objMap.put(itemObjectKey, itemObjectValue);
						}
					} else {
						if (this.isContainerGmfElement(itemKeyObject)) {
							/**
							 * deserializer object
							 */
							retBoolean = gdc.deserializerObject(newMapKeyItem);
							if (!retBoolean) {
								continue;
							}
							// if (genericValueClazz.getClass().equals(itemObjectValue.getClass()))
							// {
							// objMap.put(newMapKeyItem, itemObjectValue);
							// }
							objMap.put(newMapKeyItem, itemObjectValue);
							continue;
						}
						if (this.isContainerGmfElement(itemValueObject)) {
							/**
							 * deserializer object
							 */
							retBoolean = gdc.deserializerObject(newMapValueItem);
							if (!retBoolean) {
								continue;
							}
							// if (genericKeyClazz.getClass().equals(itemObjectKey.getClass())) {
							// objMap.put(itemObjectKey, newMapValueItem);
							// }
							objMap.put(itemObjectKey, newMapValueItem);
							continue;
						}
					}
				}
			}
		}
		this.setCurrentElement(gdc, currentElement);
		return true;
	}
}
