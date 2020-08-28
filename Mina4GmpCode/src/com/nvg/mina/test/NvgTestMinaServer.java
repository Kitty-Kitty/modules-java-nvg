/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgTestMinaServer.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.test 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 5, 2016 10:37:44 AM 
 * @version: V1.0   
 */
package com.nvg.mina.test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.nvg.css.center.gmp.request.beans.base.CssGmpRegisterResponse;

/** 
 * <!-- begin-UML-doc -->
 * <p>test program of mina</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgTestMinaServer {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String... args) throws IOException {
		// begin-user-code
		CssGmpRegisterResponse cgrr = new CssGmpRegisterResponse();
		List<Field> fieldList = new ArrayList<Field>();

		getFieldList(fieldList, cgrr.getClass());
		for (int i = 0; fieldList.size() > i; i++) {
			System.out.printf("%s \n", fieldList.get(i).getName());
		}
		// end-user-code
	}

	/** 
	 * @Title: getFieldList 
	 * @Description: TODO
	 *
	 * @param fieldList
	 * @param object void
	 *
	 * @return: void
	 * @exception
	 */
	public static void getFieldList(List<Field> fieldList, Class<?> clazz) {
		if (null == clazz || Object.class.isPrimitive()) {
			return;
		}
		Field[] fs = clazz.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			fieldList.add(fs[i]);
		}
		getFieldList(fieldList, clazz.getSuperclass());
	}
}