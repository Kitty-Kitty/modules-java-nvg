/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfTestGmfString.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.test 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月13日 下午1:48:43 
 * @version: V0.1.0   
 */
package com.gmf.test.gmf;

import java.util.ArrayList;
import java.util.Date;

import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.defined.GmfErrorDefined;

/** 
 * @ClassName: GmfTestGmfString 
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月13日 下午1:48:43  
 */
public class GmfTestGmfString {
	
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
		boolean retBoolean = false;
		
		
		
		System.out.println("-------------------start test GmfString----------------------");
		
		retBoolean = testCreateGmfString();
		if (retBoolean) {
			
		}
		
		System.out.println("-------------------stop test GmfString----------------------");
	}
}
