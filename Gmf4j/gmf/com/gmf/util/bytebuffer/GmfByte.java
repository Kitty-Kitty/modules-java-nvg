/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfByte.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.util.bytebuffer 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月18日 下午5:21:54 
 * @version: V0.1.0   
 */
package com.gmf.util.bytebuffer;

/** 
 * @ClassName: GmfByte 
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月18日 下午5:21:54  
 */
public class GmfByte {
	private byte[] data;
	private int start;
	private int pos;
	private int tail;
	private int end;
	
	
	public GmfByte(int length) {
		data = new byte[length];
		start = 0;
		pos = start;
		tail = pos;
		end = start + length;
	}
	
	/** 
	 * @Title: cat 
	 * @Description: TODO
	 * @param data
	 * @return
	 */
	public int cat(byte[] data) {
		int			tmpLength = 0;
		
		
		
		if (data.length > (end - tail)) {
			tmpLength = (end - tail);
		} else {
			tmpLength = data.length;
		}
		
		System.arraycopy(data, 0, this.data, tail, tmpLength);
		tail += tmpLength;
		
		return tmpLength;
	}
	
	/** 
	 * @Title: cat 
	 * @Description: TODO
	 * @param data
	 * @param pos
	 * @param length
	 * @return
	 */
	public int cat(byte[] data, int pos, int length) {
		int			tmpLength = 0;
		
		
		
		if (length > data.length - pos) {
			length = data.length - pos;
		}
		
		if (length > (end - tail)) {
			tmpLength = (end - tail);
		} else {
			tmpLength = length;
		}
		
		System.arraycopy(data, pos, this.data, tail, tmpLength);
		tail += tmpLength;
		
		return tmpLength;
	}
	
	/** 
	 * @Title: getBytes 
	 * @Description: TODO
	 * @return
	 */
	public byte[] getBytes() {
		if (length() <= 0) {
			return null;
		} else {
			byte[] bytes = new byte[length()];
			
			System.arraycopy(data, pos, bytes, 0, length());
			return bytes;
		}
	}
	
	/** 
	 * @Title: length 
	 * @Description: TODO
	 * @return
	 */
	public final int length() {
		return (tail - pos);
	}
}
