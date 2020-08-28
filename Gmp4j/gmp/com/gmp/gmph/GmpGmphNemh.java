/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpGmphNemh.java 
 * @Prject: GmfPraser
 * @Package: com.gmp.gmph 
 * @Description: Null Extend Message Header
 * @author: kitty   
 * @date: 2016年2月21日 下午12:15:11 
 * @version: V0.1.0   
 */
package com.gmp.gmph;

import com.gmp.gmph.defined.GmpGmphEmhtDefined;

/** 
 * @ClassName: GmpGmphNemh 
 * @Description: Null Extend Message Header
 * @author: kitty
 * @date: 2016年2月21日 下午12:15:11  
 */
public class GmpGmphNemh extends GmpGmphBmh {

	GmpGmphNemh() {
		emht = (byte) GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getEmht();
	}
	
	@Override
	public int length() {
		return GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength();
	}

	@Override
	public int size() {
		return 0;
	}
	
	@Override
	public int decode(byte[] data, int pos, int length) {
		return 0;
	}
	
	@Override
	public int encode(byte[] dest, int pos, int length) {
		// TODO Auto-generated method stub
		return 0;
	}
}
