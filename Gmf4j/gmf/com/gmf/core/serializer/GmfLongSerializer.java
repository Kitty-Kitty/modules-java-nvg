/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfLongSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: gmf Long serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午4:08:43 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer;

import java.lang.reflect.Field;

import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfLongSerializer
 * @Description: GmfLongSerializer
 * @author: kitty
 * @date: 2016年1月22日 下午4:08:43
 */
public class GmfLongSerializer extends GmfSerializer {
	@Override
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == object || null == obj) {
			return true;
		}
		return this.addChildElement(gsc, this.getFieldName(gsc, object, f), obj);
	}
}
