/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfBytebuffer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.util.bytebuffer 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月18日 下午5:22:18 
 * @version: V0.1.0   
 */
package com.gmf.util.bytebuffer;

import java.util.ArrayList;

/** 
 * @ClassName: GmfBytebuffer 
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月18日 下午5:22:18  
 */
public class GmfByteChain {
	private int	defaultByteLength = 1024;
	private GmfByte	tailByte;
	private ArrayList<GmfByte> chain = new ArrayList<GmfByte>();
	
	
	/** 
	 * @Title:GmfByteChain
	 * @Description:TODO  
	 */
	public GmfByteChain() {
		
	}
	
	/** 
	 * @Title:GmfByteChain
	 * @Description:TODO 
	 * @param length 
	 */
	public GmfByteChain(int length) {
		this.defaultByteLength = length;
	}
	
	/** 
	 * @Title: cat 
	 * @Description: TODO
	 * @param data
	 * @return
	 */
	public int cat(byte[] data) {
		int 		tmpLength = this.defaultByteLength;
		int			tmpPos = 0;
		int			tmpSurplus = data.length;
		
		
		
		for (tmpSurplus = data.length; tmpSurplus > 0; tmpSurplus -= tmpLength) {
			if (null == tailByte) {
				tailByte = new GmfByte(defaultByteLength);
				chain.add(tailByte);
			} 
			
			if (tmpSurplus > this.defaultByteLength) {
				tmpLength = this.defaultByteLength;
			} else {
				tmpLength = tmpSurplus;
			}
			
			tmpLength = tailByte.cat(data, tmpPos, tmpLength);
			if (tmpLength == this.defaultByteLength) {
				tailByte = null;
			}
			
			tmpPos += tmpLength;
		}
		
		return data.length;
	}
	
	/** 
	 * @Title: getBytes 
	 * @Description: TODO
	 * @return
	 */
	public byte[] getBytes() {
		int			tmpLength = length();
		int			tmpPos = 0;
		
		
		
		if (tmpLength <= 0) {
			return null;
		} else {
			byte[] tmpBytes = null;
			byte[] bytes = new byte[tmpLength];
			
			for (int i = 0; i < chain.size(); i++) {
				tmpBytes = chain.get(i).getBytes();
				if (null != tmpBytes) {
					System.arraycopy(tmpBytes, 0, bytes, tmpPos, tmpBytes.length);
					tmpPos += tmpBytes.length;
				}
			}
			
			return bytes;
		}
	}
	
	/** 
	 * @Title: length 
	 * @Description: TODO
	 * @return
	 */
	public final int length() {
		int			tmpLength = 0;
		
		
		
		if (chain.size() <= 0) {
			return 0;
		} else {
			for (int i = 0; i < chain.size(); i++) {
				tmpLength += chain.get(i).length();
			}
		}
		
		return tmpLength;
	}
}
