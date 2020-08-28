/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfStringBufferDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer 
 * @Description: deserialize string type
 * @author: kitty   
 * @date: 2016年1月25日 下午2:39:23 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer;

import java.lang.reflect.Field;

import com.gmf.core.deserializer.base.GmfDeserializer;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;

/**
 * @ClassName: GmfStringBufferDeserializer
 * @Description: class to deserialize StringBuffer type
 * @author: kitty
 * @date: 2016年1月25日 下午2:39:23
 */
public class GmfStringBufferDeserializer extends GmfDeserializer {
	@Override
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f) {
		Object value = this.getValue(gdc, object, f);
		if (null != value) {
			if (value instanceof String) {
				GmfDeserializerConfigure.setObject(object, f, new StringBuffer((String) value));
			}
		}
		return true;
	}
}
