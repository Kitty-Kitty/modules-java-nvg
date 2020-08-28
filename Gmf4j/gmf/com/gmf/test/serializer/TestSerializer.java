/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: TestSerializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.test.serializer 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月18日 下午7:42:33 
 * @version: V0.1.0   
 */
package com.gmf.test.serializer;

import com.gmf.core.Gmf;
import com.gmf.core.serializer.base.GmfSerializerConfigure;

/** 
 * @ClassName: TestSerializer 
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月18日 下午7:42:33  
 */
public class TestSerializer {
	
	public static void test(Object object) {
		GmfSerializerConfigure		gsc = new GmfSerializerConfigure();
		byte[]						bytes;
		
		
		
		bytes = gsc.getGmfBytes(object);
		if (null == bytes) {
			System.out.println("getGmfBytes error！");
		} else {
			Gmf gmfDecode = new Gmf();
			int	decodeLength = 0;
			
			decodeLength = gmfDecode.decode(bytes);
			if (decodeLength < 0) {
				System.out.println(gmfDecode.toPrintAllPrittyString());
				System.out.println("decode bytes error.");
			} else {
				String decodeString = gmfDecode.toPrintAllPrittyString();
				System.out.println(decodeString);
			}
		}
	}
	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestBean tb = new TestBean();
		
		test(tb);
		System.exit(0);
	}
}
