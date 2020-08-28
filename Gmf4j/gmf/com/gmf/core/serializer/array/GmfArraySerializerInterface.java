/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfBaseArraySerializerInterface.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.array 
 * @Description: interface of all array serializer
 * @author: kitty   
 * @date: 2016年1月22日 下午9:04:55 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.array;

import java.lang.reflect.Field;
import java.util.List;

import com.gmf.core.serializer.base.GmfSerializerConfigure;

/**
 * @ClassName: GmfBaseArraySerializerInterface
 * @Description: interface of all array serializer
 * @author: kitty
 * @date: 2016年1月22日 下午9:04:55
 */
public interface GmfArraySerializerInterface {
	/**
	 * @Title: init
	 * @Description: init array serializer information
	 * @param gsc GmfSerializerConfigure information
	 * @param object source object
	 * @param f field data
	 * @return boolean
	 */
	public boolean init(GmfSerializerConfigure gsc, Object object, Field f);
	/**
	 * @Title: converList
	 * @Description: conver all field item of object into a list
	 * @param gsc GmfSerializerConfigure information
	 * @param object source object
	 * @param f field data
	 * @return List<Object>
	 */
	public List<Object> converList(GmfSerializerConfigure gsc, Object object, Field f);
	/**
	 * @Title: serializerList
	 * @Description: serializer list object
	 * @param gsc GmfSerializerConfigure information
	 * @param object source object
	 * @param f field data
	 * @param list source list
	 * @return boolean
	 */
	public boolean serializerList(GmfSerializerConfigure gsc, Object object, Field f, List<Object> list);
	/**
	 * @Title: destory
	 * @Description: TODO
	 * @param gsc GmfSerializerConfigure information
	 * @param object source object
	 * @param f field data
	 * @return boolean
	 */
	public boolean destory(GmfSerializerConfigure gsc, Object object, Field f);
}
