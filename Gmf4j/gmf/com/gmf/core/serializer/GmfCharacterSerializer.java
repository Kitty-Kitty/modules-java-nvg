/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfCharacterSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: gmf Character serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午4:02:32 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer;

import java.lang.reflect.Field;

import com.gmf.core.serializer.base.GmfSerializer;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfCharacterSerializer
 * @Description: GmfCharacterSerializer
 * @author: kitty
 * @date: 2016年1月22日 下午4:02:32
 */
public class GmfCharacterSerializer extends GmfSerializer {
	@Override
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f) {
		Object obj = GmfSerializerConfigure.getObject(object, f);
		if (null == object || null == obj) {
			return true;
		}
		this.addChildElement(gsc, this.getFieldName(gsc, object, f), ((Character) obj).toString());
		return true;
	}
}
