/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfBooleanDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer 
 * @Description: deserialize boolean type
 * @author: kitty   
 * @date: 2016年1月23日 下午8:37:15 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer;

import java.lang.reflect.Field;

import com.gmf.core.deserializer.base.GmfDeserializer;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;

/**
 * @ClassName: GmfBooleanDeserializer
 * @Description: class to deserialize boolean type
 * @author: kitty
 * @date: 2016年1月23日 下午8:37:15
 */
public class GmfBooleanDeserializer extends GmfDeserializer {

	@Override
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f) {
		Object value = this.getValue(gdc, object, f);
		
		
		if (null != value) {
			if (value instanceof Boolean) {
				GmfDeserializerConfigure.setObject(object, f, value);
			}
		}
		
		return true;
	}
}
