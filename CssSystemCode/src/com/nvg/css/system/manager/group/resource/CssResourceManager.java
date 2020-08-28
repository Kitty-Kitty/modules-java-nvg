/**
 * 
 */
package com.nvg.css.system.manager.group.resource;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.resource.CssResource;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssResourceManager extends CssGRManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssResource> resourceMap = new HashMap<String, CssResource>();

	/** 
	 * @return the resourceMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssResource> getResourceMap() {
		// begin-user-code
		return resourceMap;
		// end-user-code
	}

	/** 
	 * @param resourceMap the resourceMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setResourceMap(Map<String, CssResource> resourceMap) {
		// begin-user-code
		this.resourceMap = resourceMap;
		// end-user-code
	}
}