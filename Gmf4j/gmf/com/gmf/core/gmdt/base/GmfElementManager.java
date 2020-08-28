package com.gmf.core.gmdt.base;

import java.util.HashMap;

import com.gmf.defined.GmfGmdtFlag;

public class GmfElementManager {
	private static HashMap<Integer, String> gmfElementMap = new HashMap<Integer, String>() {
	    /**
		 * @fieldName: serialVersionUID
		 * @fieldType: long
		 * @Description: serialVersionUID
		 */
		private static final long serialVersionUID = -4779113017173576881L;

		{
	        put(GmfGmdtFlag.GMF_GMDT_B, "com.gmf.core.gmdt.GmfBoolean");
	        put(GmfGmdtFlag.GMF_GMDT_C, "com.gmf.core.gmdt.GmfChar");
	        put(GmfGmdtFlag.GMF_GMDT_UC, "com.gmf.core.gmdt.GmfUChar");
	        put(GmfGmdtFlag.GMF_GMDT_S, "com.gmf.core.gmdt.GmfShort");
	        put(GmfGmdtFlag.GMF_GMDT_US, "com.gmf.core.gmdt.GmfUShort");
	        put(GmfGmdtFlag.GMF_GMDT_IN, "com.gmf.core.gmdt.GmfInt");
	        put(GmfGmdtFlag.GMF_GMDT_UIN, "com.gmf.core.gmdt.GmfUInt");
	        put(GmfGmdtFlag.GMF_GMDT_L, "com.gmf.core.gmdt.GmfLong");
	        put(GmfGmdtFlag.GMF_GMDT_UL, "com.gmf.core.gmdt.GmfULong");
	        put(GmfGmdtFlag.GMF_GMDT_F, "com.gmf.core.gmdt.GmfFloat");
	        put(GmfGmdtFlag.GMF_GMDT_UF, "com.gmf.core.gmdt.GmfUFloat");
	        put(GmfGmdtFlag.GMF_GMDT_D, "com.gmf.core.gmdt.GmfDouble");
	        put(GmfGmdtFlag.GMF_GMDT_UD, "com.gmf.core.gmdt.GmfUDouble");
	        put(GmfGmdtFlag.GMF_GMDT_N, "com.gmf.core.gmdt.GmfNull");
	        put(GmfGmdtFlag.GMF_GMDT_T, "com.gmf.core.gmdt.GmfType");
	        
	        
	        put(GmfGmdtFlag.GMF_GMDT_A, "com.gmf.core.gmdt.GmfArray");
	        put(GmfGmdtFlag.GMF_GMDT_O, "com.gmf.core.gmdt.GmfObject");
	        put(GmfGmdtFlag.GMF_GMDT_X, "com.gmf.core.gmdt.GmfXML");
	        put(GmfGmdtFlag.GMF_GMDT_JS, "com.gmf.core.gmdt.GmfJSON");
	        put(GmfGmdtFlag.GMF_GMDT_IOB, "com.gmf.core.gmdt.GmfIOBuffer");
	        
	        
	        put(GmfGmdtFlag.GMF_GMDT_ST, "com.gmf.core.gmdt.GmfString");
	        put(GmfGmdtFlag.GMF_GMDT_R, "com.gmf.core.gmdt.GmfRect");
	        put(GmfGmdtFlag.GMF_GMDT_RP, "com.gmf.core.gmdt.GmfRectPair");
	    }
	};
	
	/**
	 * @return the gmfElementMap
	 */
	public static HashMap<Integer, String> getGmfElementMap() {
		return gmfElementMap;
	}


	/** 
	 * @Title: createGmfElement 
	 * @Description: create gmf element by flag
	 * @param flag GmfElement flag number
	 * @return GmfElement a new gmf element
	 * @throws Exception
	 */
	public final static GmfElement createGmfElement(int flag) throws Exception {
		String className = (String)gmfElementMap.get(flag);
		
		if (null == className) {
			return null;
		}
		
		Class<?> aClass = Class.forName(className);
		if (null == aClass) {
			return null;
		}
		
		GmfElement gmfElement = (GmfElement)aClass.newInstance();
		if (null != gmfElement) {
			gmfElement.gmdt.setFlag(flag);
		}
		
		return gmfElement;
	}
}
