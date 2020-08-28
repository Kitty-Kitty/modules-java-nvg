/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfArraySerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer 
 * @Description: Object array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午5:50:40 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfArraySerializer
 * @Description: Object array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午5:50:40
 */
public class GmfObjectArraySerializer extends GmfArraySerializer {
	@Override
	public List<Object> converList(GmfSerializerConfigure gsc, Object object, Field f) {
		Object[] array = (Object[]) object;
		ArrayList<Object> retList = new ArrayList<Object>();
		for (int i = 0; i < array.length; i++) {
			if (null == array[i]) {
				continue;
			}
			retList.add(array[i]);
		}
		return retList;
	}
}
