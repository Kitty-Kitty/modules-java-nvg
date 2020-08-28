/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfCharArraySerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.array 
 * @Description: Char array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午9:52:03 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;

import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfCharArraySerializer
 * @Description: Char array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午9:52:03
 */
public class GmfCharArraySerializer extends GmfSerializer {
	@Override
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == object || null == obj) {
			return true;
		}
		this.addChildElement(gsc, this.getFieldName(gsc, object, f), new String((char[]) obj));
		return true;
	}
}
