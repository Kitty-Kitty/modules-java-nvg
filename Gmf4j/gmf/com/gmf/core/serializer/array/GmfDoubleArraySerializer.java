/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDoubleArraySerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.array 
 * @Description: Double array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午9:47:21 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfDoubleArraySerializer
 * @Description: Double array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午9:47:21
 */
public class GmfDoubleArraySerializer extends GmfArraySerializer {
	@Override
	public List<Object> converList(GmfSerializerConfigure gsc, Object object, Field f) {
		double[] array = (double[]) object;
		List<Object> retList = new ArrayList<Object>();
		for (int i = 0; i < array.length; i++) {
			retList.add(Double.valueOf(array[i]));
		}
		return retList;
	}
}
