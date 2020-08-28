/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpGmphInterface.java 
 * @Prject: GmfPraser
 * @Package: com.gmp.gmph 
 * @Description: General Message Protocol Operation Interface
 * @author: kitty   
 * @date: 2016年2月21日 上午11:20:34 
 * @version: V0.1.0   
 */
package com.gmp.gmph;


/** 
 * @ClassName: GmpGmphInterface 
 * @Description: General Message Protocol Operation Interface
 * @author: kitty
 * @date: 2016年2月21日 上午11:20:34  
 */
public interface GmpGmph {
	/** 
	 * @Title: length 
	 * @Description: get General Message Protocol header length
	 * @return
	 */
	public int length();
	
	/** 
	 * @Title: size 
	 * @Description: get General Message Protocol body size
	 * @return
	 */
	public int size();
	
	/**
	 * @Title: check
	 * @Description: check General Message Protocol header data before process
	 * @param data deserialize output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return: boolean
	 */
	public boolean check(byte[] data, int pos, int length);
	/**
	 * @Title: begin
	 * @Description: beging to decode General Message Protocol header data
	 * @param data deserialize output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int used data length
	 */
	public int begin(byte[] data, int pos, int length);
	/** 
	 * @Title: decode 
	 * @Description: decode General Message Protocol header
	 * @param data
	 * @return
	 */
	public int decode(byte[] data);
	/**
	 * @Title: decode
	 * @Description: decode gmph data
	 * @param data input buffer
	 * @param pos position of input buffer
	 * @return int used buffer length
	 */
	public int decode(byte[] data, int pos);
	/**
	 * @Title: decode
	 * @Description: decode General Message Protocol header data
	 * @param data deserialize output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int used data length
	 */
	public abstract int decode(byte[] data, int pos, int length);
	
	/**
	 * @Title: end
	 * @Description: end decode General Message Protocol header data
	 * @param data deserialize output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int used data length
	 */
	public int end(byte[] data, int pos, int length);
	/**
	 * @Title: encode
	 * @Description: encode gmf for byte[]
	 * @return byte[]
	 */
	public byte[] encode();
	/**
	 * @Title: encode
	 * @Description: encode to buffer
	 * @param dest output buffer
	 * @param pos position of output buffer
	 * @param length length of output buffer
	 * @return int
	 */
	public abstract int encode(byte[] dest, int pos, int length);
}
