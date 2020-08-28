/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfShortDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer 
 * @Description: deserialize short type
 * @author: kitty   
 * @date: 2016年1月25日 下午2:38:21 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer;

import java.lang.reflect.Field;

import com.gmf.core.deserializer.base.GmfDeserializer;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;

/**
 * @ClassName: GmfShortDeserializer
 * @Description: class to deserialize short type
 * @author: kitty
 * @date: 2016年1月25日 下午2:38:21
 */
public class GmfShortDeserializer extends GmfDeserializer {
	@Override
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f) {
		Object value = this.getValue(gdc, object, f);
		if (null != value) {
			if (value instanceof Short) {
				GmfDeserializerConfigure.setObject(object, f, value);
			}
		}
		return true;
	}
}
