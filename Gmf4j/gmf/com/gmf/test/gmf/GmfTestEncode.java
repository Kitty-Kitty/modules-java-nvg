/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfTestEncode.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.test 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月13日 上午10:39:44 
 * @version: V0.1.0   
 */
package com.gmf.test.gmf;

import java.util.ArrayList;
import java.util.Date;

import com.gmf.core.Gmf;
import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.core.gmdu.GmfGmdu;
import com.gmf.defined.GmfErrorDefined;
import com.gmf.util.PosByteUtil;

/** 
 * @ClassName: GmfTestEncode 
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月13日 上午10:39:44  
 */
public class GmfTestEncode {
	
	public static boolean testCreateGmfInt() {
		int tmpInt = 1000;
		short tmpShort = 1000;
		long tmpLong = 1000000;
		float tmpfloat = 10000000.111f;
		double tmpDouble = 10000000.111;
		boolean tmpBoolean = true;
		Date tmpDate = new Date();
		ArrayList<String> tmpList = new ArrayList<String>();
		
		
		
		
		GmfElement ge = GmfElement.format("%IN", tmpInt);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: int\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		
		ge = GmfElement.format("%IN", tmpShort);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: short\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		ge = GmfElement.format("%IN", tmpLong);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: long\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		ge = GmfElement.format("%IN", tmpfloat);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: float\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		ge = GmfElement.format("%IN", tmpDouble);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: double\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		ge = GmfElement.format("%IN", tmpBoolean);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: boolean\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		ge = GmfElement.format("%IN", tmpDate);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: Date\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		ge = GmfElement.format("%IN", tmpList);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("unsupport type: List\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		return true;
	}
	
	public static boolean testCreateGmfString() {
		int tmpInt = 1000;
		short tmpShort = 1000;
		long tmpLong = 1000000;
		float tmpfloat = 10000000.111f;
		double tmpDouble = 10000000.111;
		boolean tmpBoolean = true;
		Date tmpDate = new Date();
		ArrayList<String> tmpList = new ArrayList<String>();
		
		
		
		
		GmfElement ge = GmfElement.format("%ST", tmpInt);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: int\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		
		ge = GmfElement.format("%ST", tmpShort);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: short\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		ge = GmfElement.format("%ST", tmpLong);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: long\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		ge = GmfElement.format("%ST", tmpfloat);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: float\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		ge = GmfElement.format("%ST", tmpDouble);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: double\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		
		
		ge = GmfElement.format("%ST", tmpBoolean);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: boolean\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		ge = GmfElement.format("%ST", tmpDate);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("support type: Date\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		
		ge = GmfElement.format("%ST", tmpList);
		if (GmfErrorDefined.GMF_ERROR_CRITICAL == ge.getErrno()) {
			System.out.println(ge.getErr());
		} else {
			System.out.printf("unsupport type: List\t\tresult: %s\n" , ge.toPrintPrittyString());
		}
		
		return true;
	}
	
	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//testCreateGmfInt();
		
		//testCreateGmfString();
		byte a = (byte)235;
		int a_c = PosByteUtil.getByteInt(a);
		System.out.println("a =" + a + "      a_c=" + a_c);
		
		byte b = (byte)0;
		System.out.println(b);
		
		
		int				e = 14072;
		byte[] e_byte = PosByteUtil.getBytes(e);
		PosByteUtil.printHex(e_byte);
		
		
		
		float				f = 140.72f;
		byte[] f_byte = PosByteUtil.getBytes(f);
		PosByteUtil.printHex(f_byte);
		
		
		String testString = "123456";
		byte[] dest = new byte[1024];
		System.arraycopy(testString.getBytes(), 0, dest, 0, testString.length());
		PosByteUtil.printHex(dest);
		
		
		Gmf gmf = new Gmf();
		
		GmfGmdu gg = GmfGmdu.createGmfGmdu(GmfElement.format("%ST", "attribute1"), GmfElement.format("%IN", 1));
		gmf.getRootGmfGmdu().addChildGmfGmdu(gg);
		
		
		byte[] encode = gmf.encode();
		PosByteUtil.printHex(encode);
		
		
		Gmf gmfDecode = new Gmf();
		int	decodeLength = 0;
		
		decodeLength = gmfDecode.decode(encode);
		if (decodeLength < 0) {
			System.out.println("decode bytes error.");
		} else {
			String decodeString = gmfDecode.toPrintAllPrittyString();
			System.out.println(decodeString);
		}
	}
}
