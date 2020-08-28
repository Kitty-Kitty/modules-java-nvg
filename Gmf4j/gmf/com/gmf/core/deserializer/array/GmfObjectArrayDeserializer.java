/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfObjectArrayDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.array 
 * @Description: object array deserializer 
 * @author: kitty   
 * @date: 2016年1月27日 下午5:07:04 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.array;

import java.lang.reflect.Field;
import java.util.List;

import com.gmf.core.deserializer.base.GmfDeserializerConfigure;
import com.gmf.core.deserializer.base.GmfDeserializerConstructor;
import com.gmf.defined.GmfErrorDefined;

/**
 * @ClassName: GmfObjectArrayDeserializer
 * @Description: other Object array deserializer class
 * @author: kitty
 * @date: 2016年1月27日 下午5:07:04
 */
public class GmfObjectArrayDeserializer extends GmfArrayDeserializer {
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
		if (value instanceof List) {
			List<?> list = (List<?>) value;
			Class<?> clazzComponent = clazz.getComponentType();
			int listSize = list.size();
			if (listSize > 0) {
				boolean retBoolean = false;
				Object item = null;
				Object currentElement = this.getCurrentElement(gdc);
				Object tmpNewArray = GmfDeserializerConstructor.createArrayNewInstance(clazzComponent, listSize);
				GmfDeserializerConfigure.setObject(object, f, tmpNewArray);
				for (int i = 0; i < listSize; i++) {
					item = list.get(i);
					if (null == item) {
						continue;
					}
					if (!this.isContainerGmfGmdu(item)) {
						continue;
					}
					this.setCurrentElement(gdc, item);
					/**
					 * deserializer object
					 */
					Object tmpNewObject = GmfDeserializerConstructor.createNewInstance(clazzComponent);
					retBoolean = gdc.deserializerObject(tmpNewObject);
					if (!retBoolean) {
						continue;
					} else {
						((Object[]) tmpNewArray)[i] = tmpNewObject;
					}
				}
				this.setCurrentElement(gdc, currentElement);
			}
		}
		return true;
	}
}
