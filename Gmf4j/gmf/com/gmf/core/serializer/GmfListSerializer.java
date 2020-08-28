/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfListSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: gmf List serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午4:28:43 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

import com.gmf.core.serializer.annotation.GmfListAnnotation;
import com.gmf.core.serializer.base.GmfElementFlagAdapter;
import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfListSerializer
 * @Description: GmfListSerializer
 * @author: kitty
 * @date: 2016年1月22日 下午4:28:43
 */
public class GmfListSerializer extends GmfSerializer {
	@Override
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == object || null == obj) {
			return true;
		}
		/**
		 * get List object
		 */
		List<?> list = (List<?>) obj;
		// add top element
		Object currentElement = this.getCurrentElement(gsc);
		Object topElement = this.createGmfGmdu(this.getFieldName(gsc, object, f), list);
		this.addChildElement(gsc, topElement);
		/**
		 * process list items
		 */
		if (list.size() > 0) {
			/**
			 * get Annotation value
			 */
			String itemKeyName = null;
			GmfListAnnotation a = f.getAnnotation(GmfListAnnotation.class);
			if (null != a) {
				itemKeyName = a.itemKeyName();
			}
			/**
			 * 
			 */
			for (Object item : list) {
				boolean itemIsGeneralObject = GmfElementFlagAdapter.isGeneralObject(item);
				this.setCurrentElement(gsc, topElement);
				/**
				 * process item
				 */
				if (itemIsGeneralObject) {
					/**
					 * list serializer default value is null
					 */
					Object childElement = null;
					if (null == itemKeyName) {
						childElement = this.createGmfGmdu(item, null);
					} else {
						childElement = this.createGmfGmdu(itemKeyName, item);
					}
					if (null == childElement) {
						continue;
					}
					if (!this.addChildElement(gsc, childElement)) {
						// add GmfGmdu failed
						continue;
					}
				} else {
					/**
					 * is object item
					 */
					HashMap<Integer, Field> tmpFieldMap = GmfSerializerConfigure.getFieldMap(item);
					Object containerElement = null;
					if (null == itemKeyName) {
						containerElement = this.createGmfGmdu(tmpFieldMap, null);
					} else {
						containerElement = this.createGmfGmdu(itemKeyName, tmpFieldMap);
					}
					this.addChildElement(gsc, containerElement);
					this.setCurrentElement(gsc, containerElement);
					gsc.serializerObject(item);
				}
			}
			this.setCurrentElement(gsc, currentElement);
		}
		return true;
	}
}
