/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfGmdt.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdu
 * @Description: GmfGmduInterface
 * @author: kitty   
 * @date: 2016年1月12日 下午5:23:47 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdu;

import com.gmf.core.Gmf;
import com.gmf.core.gmdt.base.GmfElement;

/** 
 * @ClassName: GmfGmduImpl 
 * @Description: defined general implements of gmf gmdu
 * @author: kitty
 * @date: 2016年1月13日 下午5:22:51  
 */
public interface GmfGmduInterface {
	
	/** 
	 * @Title: isEmpty 
	 * @Description: check is empty
	 * @return boolean
	 */
	public boolean isEmpty();

	/** 
	 * @Title: size 
	 * @Description: size
	 * @return int
	 */
	public int size();
	
	/** 
	 * @Title: getEncodeLength 
	 * @Description: used byte length of encode gmf gmdu
	 * @return int used byte length
	 */
	public int getEncodeLength();

	/** 
	 * @Title: toString 
	 * @Description: to string
	 * @param format format type
	 * @return String
	 */
	public String toString(int format);
	
	/** 
	 * @Title: toPrintString 
	 * @Description: to print string
	 * @return String
	 */
	public String toPrintString();
	
	/** 
	 * @Title: toPrintAllString 
	 * @Description: to print all string with object element, and this object element has children. other element likely toPrintString() 
	 * @return String
	 */
	public String toPrintAllString();
	
	/** 
	 * @Title: toPrintPrittyString 
	 * @Description: to print pritty string
	 * @return String
	 */
	public String toPrintPrittyString();
	
	/** 
	 * @Title: toPrintAllString 
	 * @Description: to print all string with object element, and this object element has children. other element likely toPrintPrittyString()
	 * @return String
	 */
	public String toPrintAllPrittyString();
	
	
	/** 
	 * @Title: createGmfElement 
	 * @Description: parser data. create gmf element
	 * @param gmf Gmf Object
	 * @param data intput data buffer
	 * @param pos position of intput data buffer
	 * @param length length of intput data buffer
	 * @return GmfElement
	 * @throws Exception 
	 */
	public GmfElement createGmfElement(Gmf gmf, byte[] data, int pos, int length) throws Exception;
	
	/** 
	 * @Title: check 
	 * @Description: to validation data. usually check gmf element flag before all functions (begin/decode/end)
	 * @param gmf Gmf Object
	 * @param data input data
	 * @param pos position index of the data
	 * @param length length of intput data buffer
	 * @return boolean
	 */
	public boolean check(Gmf gmf, byte[] data, int pos, int length);

	/** 
	 * @Title: begin 
	 * @Description: begin to process data
	 * @param gmf Gmf Object
	 * @param data intput data buffer
	 * @param pos position index of the data
	 * @param length length of intput data buffer
	 * @return int
	 */
	public int begin(Gmf gmf, byte[] data, int pos, int length);
	
	/** 
	 * @Title: decode 
	 * @Description: decode byte[] data to GmfElement
	 * @param gmf Gmf Object
	 * @param data intput data buffer
	 * @param pos position index of the data
	 * @param length length of intput data buffer
	 * @return int
	 * @throws Exception
	 */
	public int decode(Gmf gmf, byte[] data, int pos, int length) throws Exception;
	
	/** 
	 * @Title: end 
	 * @Description: ending decode byte[] data to GmfElement
	 * @param gmf Gmf Object
	 * @param data intput data buffer
	 * @param pos position index of the data
	 * @param length length of intput data buffer
	 * @return int
	 */
	public int end(Gmf gmf, byte[] data, int pos, int length);

	/** 
	 * @Title: encode 
	 * @Description: encode GmfElement to byte[] 
	 * @param gmf Gmf Object
	 * @return byte[]
	 */
	public byte[] encode(Gmf gmf);
	
	
	/** 
	 * @Title: encode 
	 * @Description: encode GmfElement to position of byte[] 
	 * @param gmf Gmf Object
	 * @param dest output data buffer
	 * @param pos position index of the data
	 * @param length length of intput data buffer
	 * @return int
	 */
	public int encode(Gmf gmf, byte[] dest, int pos, int length);
}
