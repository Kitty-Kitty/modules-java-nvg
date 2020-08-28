/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfStringSerializer.java 
 * @Prject: GmfPraser
 * @Package: GmfBooleanSerializer 
 * @Description: gmf String serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午3:53:51 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer;

import java.lang.reflect.Field;

import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfStringSerializer
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月22日 下午3:53:51
 */
public class GmfStringSerializer extends GmfSerializer {
	@Override
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == object || null == obj) {
			return true;
		}
		return this.addChildElement(gsc, this.getFieldName(gsc, object, f), obj);
	}
}
