/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfElementAdapter.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt.base 
 * @Description: GmfElement Adapter
 * @author: kitty   
 * @date: 2016年1月21日 下午5:30:54 
 * @version: V0.1.0   
 */
package com.gmf.core.serializer.base;

import java.util.List;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.gmf.core.serializer.GmfUserObjectSerializer;
import com.gmf.defined.GmfGmdtFlag;

/**
 * @ClassName: GmfElementAdapter
 * @Description: change primitive type to GmfElement
 * @author: kitty
 * @date: 2016年1月21日 下午5:30:54
 */
public class GmfElementFlagAdapter {
	private static HashMap<Type, Integer> gmfElementFlagMap = new HashMap<Type, Integer>() {
		/**
		 * @fieldName: serialVersionUID
		 * @fieldType: long
		 * @Description: serialVersionUID
		 */
		private static final long serialVersionUID = 2110423049041642342L;
		{
			put(Boolean.class, GmfGmdtFlag.GMF_GMDT_B);
			put(Byte.class, GmfGmdtFlag.GMF_GMDT_C);
			// put(GmfGmdtFlag.GMF_GMDT_UC);
			put(Short.class, GmfGmdtFlag.GMF_GMDT_S);
			// put(GmfGmdtFlag.GMF_GMDT_US);
			put(Integer.class, GmfGmdtFlag.GMF_GMDT_IN);
			// put(GmfGmdtFlag.GMF_GMDT_UIN);
			put(Long.class, GmfGmdtFlag.GMF_GMDT_L);
			// put(GmfGmdtFlag.GMF_GMDT_UL);
			put(Float.class, GmfGmdtFlag.GMF_GMDT_F);
			// put(GmfGmdtFlag.GMF_GMDT_UF);
			put(Double.class, GmfGmdtFlag.GMF_GMDT_D);
			// put(GmfGmdtFlag.GMF_GMDT_UD);
			put(null, GmfGmdtFlag.GMF_GMDT_N);
			// put(GmfGmdtFlag.GMF_GMDT_T);
			put(List.class, GmfGmdtFlag.GMF_GMDT_A);
			put(Map.class, GmfGmdtFlag.GMF_GMDT_O);
			// put(GmfGmdtFlag.GMF_GMDT_X);
			// put(GmfGmdtFlag.GMF_GMDT_JS);
			put(byte[].class, GmfGmdtFlag.GMF_GMDT_IOB);
			put(String.class, GmfGmdtFlag.GMF_GMDT_ST);
			put(Date.class, GmfGmdtFlag.GMF_GMDT_ST);
			// put(GmfGmdtFlag.GMF_GMDT_R);
			// put(GmfGmdtFlag.GMF_GMDT_RP);
			put(GmfUserObjectSerializer.class, GmfGmdtFlag.GMF_GMDT_O);
		}
	};

	/**
	 * @Title: getGmfElementFlag
	 * @Description: get GmfElement flag
	 * @param object GmfElement
	 * @return int flag number
	 */
	public static int getGmfElementFlag(Object object) {
		/**
		 * if is null object, return null flag
		 */
		if (null == object) {
			return gmfElementFlagMap.get(object);
		}
		Integer retFlag = 0;
		Class<?> clazz = object.getClass();
		if (Map.class.isAssignableFrom(clazz)) {
			retFlag = gmfElementFlagMap.get(Map.class);
		} else if (List.class.isAssignableFrom(clazz)) {
			retFlag = gmfElementFlagMap.get(List.class);
		} else {
			retFlag = gmfElementFlagMap.get(clazz);
		}
		if (null == retFlag) {
			/**
			 * if not found type, return GmfUserObjectSerializer.class
			 */
			retFlag = gmfElementFlagMap.get(GmfUserObjectSerializer.class);
			// return -1;
		}
		return retFlag;
	}
	/**
	 * @Title: isGeneralObject
	 * @Description: check object is general object
	 * @param object GmfElement
	 * @return boolean
	 */
	public static boolean isGeneralObject(Object object) {
		int tmpFlag = 0;
		tmpFlag = getGmfElementFlag(object);
		if (tmpFlag != GmfGmdtFlag.GMF_GMDT_A && tmpFlag != GmfGmdtFlag.GMF_GMDT_O) {
			return true;
		}
		return false;
	}
}
