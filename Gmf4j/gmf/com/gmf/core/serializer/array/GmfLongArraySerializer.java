/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfLongArraySerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.array 
 * @Description: Long array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午9:45:37 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfLongArraySerializer
 * @Description: Long array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午9:45:37
 */
public class GmfLongArraySerializer extends GmfArraySerializer {
	@Override
	public List<Object> converList(GmfSerializerConfigure gsc, Object object, Field f) {
		long[] array = (long[]) object;
		List<Object> retList = new ArrayList<Object>();
		for (int i = 0; i < array.length; i++) {
			retList.add(Long.valueOf(array[i]));
		}
		return retList;
	}
}
