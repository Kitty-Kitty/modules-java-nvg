/**
 * 
 */
package com.nvg.st.fileupload;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @title : STFileUploadRenameType.java
 * @description : TODO(用一句话描述该类型的作用)
 * @author : fangzhenmu
 * @created : Oct 28, 20165:49:52 PM
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public enum STFileUploadRenameType {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fields ST_FILEUPLOAD_RANAME_TYPE_ID: TODO(@author : fangzhenmu)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	ST_FILEUPLOAD_RANAME_TYPE_ID(new Integer(1), "id"), /** 
														 * <!-- begin-UML-doc -->
														 * <!-- end-UML-doc -->
														 * @fields ST_FILEUPLOAD_RANAME_TYPE_ORIGIN: TODO(@author : fangzhenmu)
														 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
														 */
	ST_FILEUPLOAD_RANAME_TYPE_ORIGIN(new Integer(2), "origin"), /** 
																 * <!-- begin-UML-doc -->
																 * <!-- end-UML-doc -->
																 * @fields ST_FILEUPLOAD_RANAME_TYPE_BOTH: TODO(@author : fangzhenmu)
																 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
																 */
	ST_FILEUPLOAD_RANAME_TYPE_BOTH(new Integer(3), "both");

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fields index: TODO(@author : fangzhenmu)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int index;

	/** 
	 * @author : fangzhenmu
	 * @created : Oct 28, 20165:49:52 PM
	 * @return : index
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getIndex() {
		// begin-user-code
		return index;
		// end-user-code
	}

	/** 
	 * @author : fangzhenmu
	 * @created : Oct 28, 20165:49:52 PM
	 * @param : index the index to set 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIndex(int index) {
		// begin-user-code
		this.index = index;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fields type: TODO(@author : fangzhenmu)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String type;

	/** 
	 * @author : fangzhenmu
	 * @created : Oct 28, 20165:49:52 PM
	 * @return : type
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getType() {
		// begin-user-code
		return type;
		// end-user-code
	}

	/** 
	 * @author : fangzhenmu
	 * @created : Oct 28, 20165:49:52 PM
	 * @param : type the type to set 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setType(String type) {
		// begin-user-code
		this.type = type;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param index
	 * @param type
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private STFileUploadRenameType(int index, String type) {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}
}