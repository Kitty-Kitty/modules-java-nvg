/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfMapSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: gmf Map serializer
 * @author: kitty   
 * @date: 2016年1月18日 下午2:39:55 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.gmf.core.serializer.base.GmfElementFlagAdapter;
import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;
import com.gmf.core.serializer.defined.GmfSerializerDefined;

/**
 * @ClassName: GmfMapSerializer
 * @Description: GmfMapSerializer
 * @author: kitty
 * @date: 2016年1月18日 下午2:39:55
 */
public class GmfMapSerializer extends GmfSerializer {
	@SuppressWarnings({ "rawtypes" })
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == object || null == obj) {
			return true;
		}
		/**
		 * get map object
		 */
		Map<?, ?> map = (Map<?, ?>) obj;
		Object currentElement = this.getCurrentElement(gsc);
		Object topElement = this.createGmfGmdu(this.getFieldName(gsc, object, f), map);
		this.addChildElement(gsc, topElement);
		/**
		 * process map item
		 */
		if (map.size() > 0) {
			for (Map.Entry entry : map.entrySet()) {
				Object entryKey = entry.getKey();
				Object entryValue = entry.getValue();
				Object childElement = null;
				boolean keyIsGeneralObject = false;
				boolean valueIsGeneralObject = false;
				/**
				 * process key and value
				 */
				this.setCurrentElement(gsc, topElement);
				if (null == entryValue && null == entryKey) {
					// value and key whole null error
					continue;
				}
				/**
				 * check key and value
				 */
				keyIsGeneralObject = GmfElementFlagAdapter.isGeneralObject(entryKey);
				valueIsGeneralObject = GmfElementFlagAdapter.isGeneralObject(entryValue);
				if (!keyIsGeneralObject && !valueIsGeneralObject) {
					// if value and key whole container. default set key to string
					entryKey = GmfSerializerDefined.GMF_SERIALIZER_DEFAULT_KEY_NAME;
				}
				/**
				 * process general object and other
				 */
				if (keyIsGeneralObject && valueIsGeneralObject) {
					childElement = this.createGmfGmdu(entryKey, entryValue);
					if (null == childElement) {
						continue;
					}
					if (!this.addChildElement(gsc, childElement)) {
						// add GmfGmdu failed
						continue;
					}
				} else {
					HashMap<Integer, Field> tmpFieldMap = null;
					Object containerElement = null;
					Object containerObject = null;
					/**
					 * object item process again
					 */
					if (!keyIsGeneralObject) {
						containerObject = entryKey;
						tmpFieldMap = GmfSerializerConfigure.getFieldMap(entryKey);
						containerElement = this.createGmfGmdu(tmpFieldMap, entryValue);
					}
					if (!valueIsGeneralObject) {
						containerObject = entryValue;
						tmpFieldMap = GmfSerializerConfigure.getFieldMap(entryValue);
						containerElement = this.createGmfGmdu(entryKey, tmpFieldMap);
					}
					this.addChildElement(gsc, containerElement);
					this.setCurrentElement(gsc, containerElement);
					gsc.serializerObject(containerObject);
				}
			}
			this.setCurrentElement(gsc, currentElement);
		}
		return true;
	}
}
