/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpAccessServerInformation.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.devices 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:46:34 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.devices;

import java.util.Set;
import com.nvg.css.beans.gmp.media.GmpMedia;

/** 
 * <!-- begin-UML-doc -->
 * <p>access server information </p>
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpAccessServerInformation extends GmpServerInformation {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>medias list</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<GmpMedia> medias;

	/** 
	 * @return the medias
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<GmpMedia> getMedias() {
		// begin-user-code
		return medias;
		// end-user-code
	}

	/** 
	 * @param medias the medias to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setMedias(Set<GmpMedia> medias) {
		// begin-user-code
		this.medias = medias;
		// end-user-code
	}
}