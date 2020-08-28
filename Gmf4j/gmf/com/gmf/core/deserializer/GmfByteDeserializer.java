/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfByteDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer 
 * @Description: deserialize byte type
 * @author: kitty   
 * @date: 2016年1月25日 上午11:44:41 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer;

import java.lang.reflect.Field;

import com.gmf.core.deserializer.base.GmfDeserializer;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;

/**
 * @ClassName: GmfByteDeserializer
 * @Description: class to deserialize byte type
 * @author: kitty
 * @date: 2016年1月25日 上午11:44:41
 */
public class GmfByteDeserializer extends GmfDeserializer {

	@Override
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f) {
		Object value = this.getValue(gdc, object, f);
		
		
		if (null != value) {
			if (value instanceof Byte) {
				GmfDeserializerConfigure.setObject(object, f, value);
			}
		}
		
		return true;
	}
}
