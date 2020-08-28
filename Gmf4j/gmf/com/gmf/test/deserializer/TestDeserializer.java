/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfDeserializer.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.test.deserializer 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月24日 下午6:44:12 
 * @version: V0.1.0   
 */
package com.gmf.test.deserializer;

import com.gmf.core.Gmf;
import com.gmf.core.deserializer.base.GmfDeserializerConfigure;
import com.gmf.core.serializer.base.GmfSerializerConfigure;
import com.gmf.test.serializer.TestBean;
import com.gmf.test.serializer.TestChildBean;

/**
 * @ClassName: GmfDeserializer
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月24日 下午6:44:12
 */
public class TestDeserializer {
	public static void test(Object object) {
		GmfDeserializerConfigure gdc = new GmfDeserializerConfigure();
		GmfSerializerConfigure gsc = new GmfSerializerConfigure();
		byte[] bytes;
		
		
		
		bytes = gsc.getGmfBytes(object);
		if (null == bytes) {
			System.out.println("getGmfBytes error！");
		} else {
			// system printf information
			Gmf gmfDecode = new Gmf();
			int decodeLength = 0;
			decodeLength = gmfDecode.decode(bytes);
			if (decodeLength < 0) {
				System.out.println(gmfDecode.toPrintAllPrittyString());
				System.out.println("decode bytes error.");
			} else {
				String decodeString = gmfDecode.toPrintAllPrittyString();
				System.out.println(decodeString);
			}
			// deserializer byte[]
			TestDeserializerBean tb = 
					(TestDeserializerBean) gdc.getObject(bytes,	TestDeserializerBean.class);
			System.out.printf("TestBean = %s \n", tb);
		}
	}
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		TestBean tb = new TestBean();
		TestChildBean tcb = new TestChildBean();
		tb.getTcbArray()[0] = tcb;
		tb.getTcbArray()[1] = tcb;
		tb.getTcbArray()[2] = tcb;
		tb.getTestArrayListChildBean().add(tcb);
		tb.getTestArrayListChildBean().add(tcb);
		tb.getTestArrayListChildBean().add(tcb);
		test(tb);
		System.exit(0);
	}
}
