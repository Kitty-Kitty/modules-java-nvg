/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfFloatDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer 
 * @Description: deserialize float type
 * @author: kitty   
 * @date: 2016年1月25日 下午2:34:46 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer;

import java.lang.reflect.Field;

import com.gmf.core.deserializer.base.GmfDeserializer;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;

/**
 * @ClassName: GmfFloatDeserializer
 * @Description: class to deserialize float type
 * @author: kitty
 * @date: 2016年1月25日 下午2:34:46
 */
public class GmfFloatDeserializer extends GmfDeserializer {
	@Override
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f) {
		Object value = this.getValue(gdc, object, f);
		if (null != value) {
			if (value instanceof Float) {
				GmfDeserializerConfigure.setObject(object, f, value);
			}
		}
		return true;
	}
}
