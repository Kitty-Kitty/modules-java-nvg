/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfShortSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: gmf Short serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午4:07:22 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer;

import java.lang.reflect.Field;

import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfShortSerializer
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月22日 下午4:07:22
 */
public class GmfShortSerializer extends GmfSerializer {
	@Override
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == object || null == obj) {
			return true;
		}
		return this.addChildElement(gsc, this.getFieldName(gsc, object, f), obj);
	}
}
