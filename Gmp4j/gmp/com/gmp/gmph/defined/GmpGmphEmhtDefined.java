/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpGmphEmhDefined.java 
 * @Prject: GmfPraser
 * @Package: com.gmp.gmph.defined 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年2月21日 上午11:54:37 
 * @version: V0.1.0   
 */
package com.gmp.gmph.defined;

/**
 * @ClassName: GmpGmphEmhDefined
 * @Description: TODO
 * @author: kitty
 * @date: 2016年2月21日 上午11:54:37
 */
public enum GmpGmphEmhtDefined {
	/**
	 * @fieldName: GMP_GMPH_EMHT_NEMH
	 * @fieldType: int
	 * @Description: NULL EMHT
	 */
	GMP_GMPH_EMHT_NEMH(0x00, 5),
	/**
	 * @fieldName: GMP_GMPH_EMHT_SEMH
	 * @fieldType: int
	 * @Description: Session Extend Message Header
	 */
	GMP_GMPH_EMHT_SEMH(0x01, 53),
	/**
	 * @fieldName: GMP_GMPH_EMHT_UEMH
	 * @fieldType: int
	 * @Description: Software Update Extend Message Header
	 */
	GMP_GMPH_EMHT_UEMH(0xF0, 12);
	
	/**
	 * @fieldName: emht
	 * @fieldType: int
	 * @Description: Extend Message Header Type
	 */
	private int emht;
	/**
	 * @fieldName: length
	 * @fieldType: int
	 * @Description: Extend Message Header Length
	 */
	private int length;

	private GmpGmphEmhtDefined(int emht, int length) {
		this.emht = emht;
		this.length = length;
	}

	/**
	 * @return the emht
	 */
	public int getEmht() {
		return emht;
	}

	/**
	 * @param emht the emht to set
	 */
	public void setEmht(int emht) {
		this.emht = emht;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/** 
	 * @Title: contains 
	 * @Description: check emht is contain
	 * @param emht
	 * @return false true:contain;false:uncontain
	 */
	public static boolean contains(int emht) {
		for (GmpGmphEmhtDefined gmpGmphEmht : GmpGmphEmhtDefined.values()) {
            if (gmpGmphEmht.getEmht() == emht) {
                return true;
            }
        }
		return false;
	}
	
	/** 
	 * @Title: length 
	 * @Description: get length of emht
	 * @param emht
	 * @return int length of emht
	 */
	public static int length(int emht) {
		for (GmpGmphEmhtDefined gmpGmphEmht : GmpGmphEmhtDefined.values()) {
            if (gmpGmphEmht.getEmht() == emht) {
                return gmpGmphEmht.getLength();
            }
        }
		return 0;
	}
}
