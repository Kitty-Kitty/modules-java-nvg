/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpGmphManager.java 
 * @Prject: GmfPraser
 * @Package: com.gmp.gmph 
 * @Description: gmp gmph manager
 * @author: kitty   
 * @date: 2016年2月21日 下午8:23:11 
 * @version: V0.1.0   
 */
package com.gmp.gmph;

import java.util.HashMap;

import com.gmp.gmph.defined.GmpGmphEmhtDefined;
import com.gmp.gmph.print.GmpGmphErrorDefined;
import com.gmp.gmph.print.GmpGmphWriteLog;

/** 
 * @ClassName: GmpGmphManager 
 * @Description: gmp gmph manager
 * @author: kitty
 * @date: 2016年2月21日 下午8:23:11  
 */
public class GmpGmphManager {
	private static HashMap<Integer, String> gmpGmphMap = new HashMap<Integer, String>() {
	    /**
		 * @fieldName: serialVersionUID
		 * @fieldType: long
		 * @Description: serial version id
		 */
		private static final long serialVersionUID = 485811394553016076L;
		{
			put(GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getEmht(), "com.gmp.gmph.GmpGmphNemh");
			put(GmpGmphEmhtDefined.GMP_GMPH_EMHT_SEMH.getEmht(), "com.gmp.gmph.GmpGmphSemh");
			put(GmpGmphEmhtDefined.GMP_GMPH_EMHT_UEMH.getEmht(), "com.gmp.gmph.GmpGmphUemh");
		}
	};
	
	
	/**
	 * @return the gmpGmphMap
	 */
	public static HashMap<Integer, String> getGmpGmphMap() {
		return gmpGmphMap;
	}
	
	/** 
	 * @Title: getGmphLength 
	 * @Description: get gmph length
	 * @param data
	 * @param pos
	 * @return int
	 */
	public static int getGmphLength(byte[] data, int pos) {
		int							emht = 0;
		int							length = 0;
		
		
		/**
		 * check base data length
		 */
		if (data.length - pos < GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength()) {
			GmpGmphWriteLog.printLog("%s size[%d] < [%d]", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_LENGTH.getErr(),
					data.length - pos,
					GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength());
			return -1;
		}
		/**
		 * get emht
		 */
		emht = (int)data[pos + GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength() - 1];
		/**
		 * get data length by emht
		 */
		length = GmpGmphEmhtDefined.length(emht);
		if (length <= 0) {
			GmpGmphWriteLog.printLog("%s.unknow emht[%d]", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_EMHT.getErr(),
					emht);
			return -2;
		}
		
		return length;
	}
	
	/** 
	 * @Title: decode 
	 * @Description: decode byte[],create a GmpGmph
	 * @param data
	 * @param pos
	 * @return GmpGmph
	 */
	public static GmpGmph decode(byte[] data, int pos) {
		int					retInt = 0;
		int					emht = 0;
		String 				className = "";
		Class<?> 			aClass;
		
		
		
		if (data.length - pos < GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength()) {
			GmpGmphWriteLog.printLog("%s size[%d] < [%d]", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_LENGTH.getErr(),
					data.length - pos,
					GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength());
			return null;
		}
		emht = (int)data[pos + GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength() - 1];

		className = gmpGmphMap.get(emht);
		if (null == className) {
			GmpGmphWriteLog.printLog("get class name error. emht[%d]", emht);
			return null;
		}
		
		try {
			aClass = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		if (null == aClass) {
			GmpGmphWriteLog.printLog("get class forName() error. emht[%d] className[%s]", 
					emht,
					className);
			return null;
		}
		try {
			GmpGmph gmpGmph = (GmpGmph)aClass.newInstance();
			if (null == gmpGmph) {
				GmpGmphWriteLog.printLog("newInstance() error. emht[%d] className[%s]", 
						emht,
						className);
				return null;
			}
			retInt = gmpGmph.decode(data, pos);
			if (retInt < 0) {
				GmpGmphWriteLog.printLog("decode() error. emht[%d] className[%s]", 
						emht,
						className);
				return null;
			}
			return gmpGmph;
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
