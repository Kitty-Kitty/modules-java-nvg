/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfShortArraySerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.array 
 * @Description: Short array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午9:44:13 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfShortArraySerializer
 * @Description: Short array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午9:44:13
 */
public class GmfShortArraySerializer extends GmfArraySerializer {
	@Override
	public List<Object> converList(GmfSerializerConfigure gsc, Object object, Field f) {
		short[] array = (short[]) object;
		List<Object> retList = new ArrayList<Object>();
		for (int i = 0; i < array.length; i++) {
			retList.add(Short.valueOf(array[i]));
		}
		return retList;
	}
}
