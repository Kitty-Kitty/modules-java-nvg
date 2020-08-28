/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfBooleanArraySerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.array 
 * @Description: Boolean array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午9:51:11 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfBooleanArraySerializer
 * @Description: Boolean array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午9:51:11
 */
public class GmfBooleanArraySerializer extends GmfArraySerializer {
	@Override
	public List<Object> converList(GmfSerializerConfigure gsc, Object object, Field f) {
		boolean[] array = (boolean[]) object;
		List<Object> retList = new ArrayList<Object>();
		for (int i = 0; i < array.length; i++) {
			retList.add(Boolean.valueOf(array[i]));
		}
		return retList;
	}
}
