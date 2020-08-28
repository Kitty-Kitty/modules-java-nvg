/**
 * 
 */
package com.nvg.css.system.manager.group.resource;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.division.CssTemplate;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssTemplateManager extends CssGRManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssTemplate> templateMap = new HashMap<String, CssTemplate>();

	/** 
	 * @return the templateMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssTemplate> getTemplateMap() {
		// begin-user-code
		return templateMap;
		// end-user-code
	}

	/** 
	 * @param templateMap the templateMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTemplateMap(Map<String, CssTemplate> templateMap) {
		// begin-user-code
		this.templateMap = templateMap;
		// end-user-code
	}
}