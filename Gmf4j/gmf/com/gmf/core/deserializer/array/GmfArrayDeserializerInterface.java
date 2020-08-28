/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfArrayDeserializerInterface.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.deserializer.array 
 * @Description: interface of array deserializer
 * @author: kitty   
 * @date: 2016年1月24日 下午6:23:44 
 * @version: V0.1.0   
 */
package com.gmf.core.deserializer.array;

import java.lang.reflect.Field;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;

/**
 * @ClassName: GmfArrayDeserializerInterface
 * @Description: interface of array deserializer
 * @author: kitty
 * @date: 2016年1月24日 下午6:23:44
 */
public interface GmfArrayDeserializerInterface {
	
	/** 
	 * @Title: init 
	 * @Description: init array deserializer information
	 * @param gdc GmfDeserializerConfigure information
	 * @param object current Object data
	 * @param f current Field
	 * @return boolean 
	 */
	public boolean init(GmfDeserializerConfigure gdc, Object object, Field f);
	
	/** 
	 * @Title: createArray 
	 * @Description: change this field of Object to a array Object
	 * @param gdc GmfDeserializerConfigure information
	 * @param object current Object data
	 * @param f current Field
	 * @return Object change this field of Object to a array Object
	 */
	public Object createArray(GmfDeserializerConfigure gdc, Object object, Field f);
	
	/** 
	 * @Title: processArray 
	 * @Description: deserialize array Object data to a Object
	 * @param gdc GmfDeserializerConfigure information
	 * @param object current Object data
	 * @param f current Field
	 * @return Object deserialize array Object data to a Object
	 */
	public Object deserializerArray(GmfDeserializerConfigure gdc, Object object, Field f);
	
	/** 
	 * @Title: destory 
	 * @Description: destory deserializer information
	 * @param gdc GmfDeserializerConfigure information
	 * @param object current Object data
	 * @param f current Field
	 * @return boolean 
	 */
	public boolean destory(GmfDeserializerConfigure gdc, Object object, Field f);
}
