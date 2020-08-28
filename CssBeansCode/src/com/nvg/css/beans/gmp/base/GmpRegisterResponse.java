/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpRegisterResponse.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.base 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:46:34 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.base;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpRegisterResponse extends GmpResponse {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>return data of response</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GmpReturnHost Return;

	/** 
	 * @return the Return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public GmpReturnHost getReturn() {
		// begin-user-code
		return Return;
		// end-user-code
	}

	/** 
	 * @param Return the Return to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setReturn(GmpReturnHost Return) {
		// begin-user-code
		this.Return = Return;
		// end-user-code
	}
}