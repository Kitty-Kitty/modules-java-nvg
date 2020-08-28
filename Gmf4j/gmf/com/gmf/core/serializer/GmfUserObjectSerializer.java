/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfObjectSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: gmf User Oject(not Primitive Object or java.lang*) serializer
 * @author: kitty   
 * @date: 2016年1月23日 下午12:14:44 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer;

import java.lang.reflect.Field;
import java.util.HashMap;

import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfObjectSerializer
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月23日 下午12:14:44
 */
public class GmfUserObjectSerializer extends GmfSerializer {
	@Override
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == object || null == obj) {
			return true;
		}
		/**
		 * get field map for create container element
		 */
		HashMap<Integer, Field> map = GmfSerializerConfigure.getFieldMap(obj);
		/**
		 * get map object
		 */
		Object currentElement = this.getCurrentElement(gsc);
		Object topElement = this.createGmfGmdu(this.getFieldName(gsc, object, f), map);
		/**
		 * set current position
		 */
		this.addChildElement(gsc, topElement);
		this.setCurrentElement(gsc, topElement);
		/**
		 * process Object
		 */
		gsc.serializerObject(obj);
		this.setCurrentElement(gsc, currentElement);
		return true;
	}
}
