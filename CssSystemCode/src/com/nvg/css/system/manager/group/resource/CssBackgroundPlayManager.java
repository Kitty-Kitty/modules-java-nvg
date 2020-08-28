/**
 * 
 */
package com.nvg.css.system.manager.group.resource;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.division.CssBackgroundPlay;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssBackgroundPlayManager extends CssGRManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssBackgroundPlay> backgroundPlayMap = new HashMap<String, CssBackgroundPlay>();

	/** 
	 * @return the backgroundPlayMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssBackgroundPlay> getBackgroundPlayMap() {
		// begin-user-code
		return backgroundPlayMap;
		// end-user-code
	}

	/** 
	 * @param backgroundPlayMap the backgroundPlayMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBackgroundPlayMap(
			Map<String, CssBackgroundPlay> backgroundPlayMap) {
		// begin-user-code
		this.backgroundPlayMap = backgroundPlayMap;
		// end-user-code
	}
}