/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfBooleanSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: gmf Boolean serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午3:39:31 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer;

import java.lang.reflect.Field;

import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfBooleanSerializer
 * @Description: GmfBooleanSerializer
 * @author: kitty
 * @date: 2016年1月22日 下午3:39:31
 */
public class GmfBooleanSerializer extends GmfSerializer {
	@Override
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		Object obj = GmfSerializerConfigure.getObject(object, f);
		
		if (null == object || null == obj) {
			return true;
		}
		this.addChildElement(gsc, this.getFieldName(gsc, object, f), obj);
		return true;
	}
}
