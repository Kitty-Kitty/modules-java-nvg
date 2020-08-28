/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfIntArraySerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.array 
 * @Description: Integer array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午9:00:39 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfIntArraySerializer
 * @Description: Integer array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午9:00:39
 */
public class GmfIntegerArraySerializer extends GmfArraySerializer {
	@Override
	public List<Object> converList(GmfSerializerConfigure gsc, Object object, Field f) {
		int[] array = (int[]) object;
		List<Object> retList = new ArrayList<Object>();
		for (int i = 0; i < array.length; i++) {
			retList.add(Integer.valueOf(array[i]));
		}
		return retList;
	}
}
