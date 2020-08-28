/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfFloatArraySerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.array 
 * @Description: Float array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午9:46:31 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfFloatArraySerializer
 * @Description: Float array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午9:46:31
 */
public class GmfFloatArraySerializer extends GmfArraySerializer {
	@Override
	public List<Object> converList(GmfSerializerConfigure gsc, Object object, Field f) {
		float[] array = (float[]) object;
		List<Object> retList = new ArrayList<Object>();
		for (int i = 0; i < array.length; i++) {
			retList.add(Float.valueOf(array[i]));
		}
		return retList;
	}
}
