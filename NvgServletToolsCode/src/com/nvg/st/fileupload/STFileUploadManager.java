/**
 * 
 */
package com.nvg.st.fileupload;

import com.nvg.st.base.STBase;

/**
 * @title : STFileUploadManager.java
 * @description : TODO(用一句话描述该类型的作用)
 * @author : fangzhenmu
 * @created : Oct 28, 20162:48:09 PM
 */
public class STFileUploadManager extends STBase {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fields uploadConf: TODO(@author : fangzhenmu)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static STFileUploadConfigure uploadConf;

	/** 
	 * @author : fangzhenmu
	 * @created : Oct 28, 20165:49:52 PM
	 * @return : uploadConf
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static STFileUploadConfigure getUploadConf() {
		// begin-user-code
		return uploadConf;
		// end-user-code
	}

	/** 
	 * @author : fangzhenmu
	 * @created : Oct 28, 20165:49:52 PM
	 * @param : uploadConf the uploadConf to set 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setUploadConf(STFileUploadConfigure uploadConf) {
		// begin-user-code
		STFileUploadManager.uploadConf = uploadConf;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fields upload: TODO(@author : fangzhenmu)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static STFileUpload upload;

	/** 
	 * @author : fangzhenmu
	 * @created : Oct 28, 20165:49:52 PM
	 * @return : upload
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static STFileUpload getUpload() {
		// begin-user-code
		return upload;
		// end-user-code
	}

	/** 
	 * @author : fangzhenmu
	 * @created : Oct 28, 20165:49:52 PM
	 * @param : upload the upload to set 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setUpload(STFileUpload upload) {
		// begin-user-code
		STFileUploadManager.upload = upload;
		// end-user-code
	}

}
