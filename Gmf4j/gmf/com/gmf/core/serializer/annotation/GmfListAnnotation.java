/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfListAnnotation.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.serializer.annotation 
 * @Description: defind annotation for list
 * @author: kitty   
 * @date: 2016年1月28日 下午2:11:27 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @ClassName: GmfListAnnotation 
 * @Description: Annotation of List
 * @author: kitty
 * @date: 2016年1月28日 下午2:11:27  
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GmfListAnnotation {
	public String itemKeyName() default "";
}
