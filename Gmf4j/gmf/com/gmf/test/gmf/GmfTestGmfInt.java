/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfTestGmfInt.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.test 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月13日 下午1:45:52 
 * @version: V0.1.0   
 */
package com.gmf.test.gmf;

import java.util.ArrayList;
import java.util.Date;

import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.defined.GmfErrorDefined;

/** 
 * @ClassName: GmfTestGmfInt 
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月13日 下午1:45:52  
 */
public class GmfTestGmfInt {
	
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
	
	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		boolean retBoolean = false;
		
		
		
		System.out.println("-------------------start test GmfInt----------------------");
		
		retBoolean = testCreateGmfInt();
		if (retBoolean) {
			
		}
		
		System.out.println("-------------------stop test GmfInt----------------------");
	}
}
