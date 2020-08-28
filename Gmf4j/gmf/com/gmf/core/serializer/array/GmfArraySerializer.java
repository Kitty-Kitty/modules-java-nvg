/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfBaseArraySerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.array 
 * @Description: super all of gmf array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午9:03:33 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;
import java.util.List;

import com.gmf.core.serializer.base.GmfElementFlagAdapter;
import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfBaseArraySerializer
 * @Description: super class of array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午9:03:33
 */
public abstract class GmfArraySerializer extends GmfSerializer implements GmfArraySerializerInterface {
	@Override
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		boolean retBoolean = false;
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == object || null == obj) {
			return true;
		}
		/**
		 * init process array serializer
		 */
		retBoolean = init(gsc, object, f);
		if (!retBoolean) {
			return retBoolean;
		}
		/**
		 * conver array to list
		 */
		List<Object> tmpList = converList(gsc, obj, f);
		if (null == tmpList) {
			return false;
		}
		/**
		 * serializer array list
		 */
		retBoolean = serializerList(gsc, object, f, tmpList);
		if (!retBoolean) {
			return retBoolean;
		}
		/**
		 * stop process and destory
		 */
		return destory(gsc, object, f);
	}
	@Override
	public boolean init(GmfSerializerConfigure gsc, Object object, Field f) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean serializerList(GmfSerializerConfigure gsc, Object object, Field f, List<Object> list) {
		// add top element
		Object currentElement = this.getCurrentElement(gsc);
		Object topElement = this.createGmfGmdu(this.getFieldName(gsc, object, f), list);
		this.addChildElement(gsc, topElement);
		for (int i = 0; i < list.size(); i++) {
			boolean itemIsGeneralObject = GmfElementFlagAdapter.isGeneralObject(list.get(i));
			this.setCurrentElement(gsc, topElement);
			// list serializer default value is null
			Object childElement = this.createGmfGmdu(list.get(i), null);
			if (null == childElement) {
				continue;
			}
			if (!this.addChildElement(gsc, childElement)) {
				// add GmfGmdu failed
				continue;
			}
			if (!itemIsGeneralObject) {
				this.setCurrentElement(gsc, childElement);
				gsc.serializerObject(list.get(i));
			}
		}
		this.setCurrentElement(gsc, currentElement);
		return true;
	}
	@Override
	public boolean destory(GmfSerializerConfigure gsc, Object object, Field f) {
		// TODO Auto-generated method stub
		return true;
	}
}
