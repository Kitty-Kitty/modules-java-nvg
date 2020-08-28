/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfArrayDeserializer.java 
 * @Prject: GmfPraser
 * @Package: GmfArraySerializer 
 * @Description: base array deserializer
 * @author: kitty   
 * @date: 2016年1月24日 下午6:23:03 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.array;

import java.lang.reflect.Field;

import com.gmf.core.deserializer.base.GmfDeserializer;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;

/**
 * @ClassName: GmfArrayDeserializer
 * @Description: deserializer array type
 * @author: kitty
 * @date: 2016年1月24日 下午6:23:03
 */
public abstract class GmfArrayDeserializer extends GmfDeserializer implements GmfArrayDeserializerInterface {
	@Override
	public boolean init(GmfDeserializerConfigure gdc, Object object, Field f) {
		return true;
	}
	@Override
	public Object createArray(GmfDeserializerConfigure gdc, Object object, Field f) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object deserializerArray(GmfDeserializerConfigure gdc, Object object, Field f) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean destory(GmfDeserializerConfigure gdc, Object object, Field f) {
		// TODO Auto-generated method stub
		return true;
	}
}
