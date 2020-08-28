/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaInstanceFactory.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.util 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 1, 2016 5:32:04 PM 
 * @version: V1.0   
 */
package com.nvg.mina.util;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgMinaInstanceFactory {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static Object newInstance(String className) {
		// begin-user-code
		Class<?> aClass = null;
		try {
			aClass = Class.forName(className);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (null == aClass) {
			try {
				throw new Exception("get class error.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			return aClass.newInstance();
		} catch (IllegalAccessException | InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return null;
		// end-user-code
	}
}