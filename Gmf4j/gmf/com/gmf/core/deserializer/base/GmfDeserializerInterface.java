/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDeserializerInterface.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.base 
 * @Description: interface of deseriazlizer
 * @author: kitty   
 * @date: 2016年1月23日 下午8:38:50 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.base;

import java.lang.reflect.Field;

/**
 * @ClassName: GmfDeserializerInterface
 * @Description: interface of deseriazlizer
 * @author: kitty
 * @date: 2016年1月23日 下午8:38:50
 */
public interface GmfDeserializerInterface {
	/**
	 * @Title: check
	 * @Description: check information before "begin" deserialize
	 * @param gdc GmfDeserializerConfigure information
	 * @param object destination object
	 * @param f current field data
	 * @return boolean ture of false
	 */
	public boolean check(GmfDeserializerConfigure gdc, Object object, Field f);
	/**
	 * @Title: begin
	 * @Description: begining deserialize
	 * @param gdc GmfDeserializerConfigure information
	 * @param object destination object
	 * @param f current field data
	 * @return boolean ture of false
	 */
	public boolean begin(GmfDeserializerConfigure gdc, Object object, Field f);
	/**
	 * @Title: serializer
	 * @Description: deserializer object data
	 * @param gdc GmfDeserializerConfigure information
	 * @param object destination object
	 * @param f current field data
	 * @return boolean ture of false
	 */
	public boolean deserializer(GmfDeserializerConfigure gdc, Object object, Field f);
	/**
	 * @Title: end
	 * @Description: ending deserialize
	 * @param gdc GmfDeserializerConfigure information
	 * @param object destination object
	 * @param f current field data
	 * @return boolean ture of false
	 */
	public boolean end(GmfDeserializerConfigure gdc, Object object, Field f);
}
