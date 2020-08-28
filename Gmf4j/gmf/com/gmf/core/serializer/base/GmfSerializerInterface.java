/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.base 
 * @Description: interface of GmfSerializer
 * @author: kitty   
 * @date: 2016年1月18日 下午2:31:57 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.base;

import java.lang.reflect.Field;

/**
 * @ClassName: GmfSerializer
 * @Description: GmfSerializerInterface
 * @author: kitty
 * @date: 2016年1月18日 下午2:31:57
 */
public interface GmfSerializerInterface {
	/**
	 * @Title: check
	 * @Description: check data before serialize
	 * @param gsc GmfSerializerConfigure information
	 * @param object source object
	 * @param f field data
	 * @return boolean
	 */
	public boolean check(GmfSerializerConfigure gsc, Object object, Field f);
	/**
	 * @Title: begin
	 * @Description: begin to serialize data
	 * @param gsc GmfSerializerConfigure information
	 * @param object source object
	 * @param f field data
	 * @return boolean
	 */
	public boolean begin(GmfSerializerConfigure gsc, Object object, Field f);
	/**
	 * @Title: serializer
	 * @Description: serialize data
	 * @param gsc GmfSerializerConfigure information
	 * @param object source object
	 * @param f field data
	 * @return boolean
	 */
	public boolean serializer(GmfSerializerConfigure gsc, Object object, Field f);
	/**
	 * @Title: end
	 * @Description: ending serialize data
	 * @param gsc GmfSerializerConfigure information
	 * @param object source object
	 * @param f field data
	 * @return boolean
	 */
	public boolean end(GmfSerializerConfigure gsc, Object object, Field f);
}
