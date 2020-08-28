/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfUserObjectDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer 
 * @Description: deserialize other Object type
 * @author: kitty   
 * @date: 2016年1月24日 下午5:57:55 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

import com.gmf.core.deserializer.base.GmfDeserializer;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;
import com.gmf.core.deserializer.base.GmfDeserializerConstructor;
import com.gmf.core.serializer.base.GmfSerializerConfigure;
import com.gmf.defined.GmfErrorDefined;

/** 
 * @ClassName: GmfUserObjectDeserializer 
 * @Description: class to deserialize other Object type
 * @author: kitty
 * @date: 2016年1月24日 下午5:57:55  
 */
public class GmfUserObjectDeserializer extends GmfDeserializer {

	@Override
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f) {
		boolean retBoolean = false;
		Class<?> clazz = f.getType();
		Object value = this.getElement(gdc, object, f);
		/**
		 * get data value
		 */
		if (null == value) {
			this.println(gdc, 
					GmfErrorDefined.GMF_ERROR_CRITICAL, "%s value is null error! ", clazz.getName());
			return true;
		}
		/**
		 * get object class type
		 */
		Type fieldType = f.getGenericType();
		if (null == fieldType) {
			this.println(gdc, 
					GmfErrorDefined.GMF_ERROR_CRITICAL, "%s getGenericType() failed! field type is null.",
					clazz);
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
		 * process object element
		 */
		Object currentElement = this.getCurrentElement(gdc);
		this.setCurrentElement(gdc, value);
		
		retBoolean = gdc.deserializerObject(obj);
		if (!retBoolean) {
			this.println(gdc, GmfErrorDefined.GMF_ERROR_CRITICAL,
					"%s GmfDeserializerConstructor.deserializerObject() failed! ", 
					clazz.getName());
		}
		
		this.setCurrentElement(gdc, currentElement);
		return true;
	}
}
