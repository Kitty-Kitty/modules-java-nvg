/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpResponse.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.base 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:46:33 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.base;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpResponse {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>host information</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GmpHost host;

	/** 
	 * @return the host
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public GmpHost getHost() {
		// begin-user-code
		return host;
		// end-user-code
	}

	/** 
	 * @param host the host to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setHost(GmpHost host) {
		// begin-user-code
		this.host = host;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>communication status</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int status;

	/** 
	 * @return the status
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getStatus() {
		// begin-user-code
		return status;
		// end-user-code
	}

	/** 
	 * @param status the status to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setStatus(int status) {
		// begin-user-code
		this.status = status;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>error description</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String reason;

	/** 
	 * @return the reason
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getReason() {
		// begin-user-code
		return reason;
		// end-user-code
	}

	/** 
	 * @param reason the reason to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setReason(String reason) {
		// begin-user-code
		this.reason = reason;
		// end-user-code
	}
}