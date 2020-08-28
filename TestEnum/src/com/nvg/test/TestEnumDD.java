/**
 * 
 */
package com.nvg.test;

  
/**
 * @title : TestEnum.java
 * @description : TODO(用一句话描述该类型的作用)
 * @author : fangzhenmu
 * @created : Oct 28, 20164:28:55 PM
 */
public enum TestEnumDD {
	SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");  
    private TestEnumDD(String abbreviation) {this.abbreviation = abbreviation;}  
    public String getAbbreviation(){return abbreviation;}  
    private String abbreviation;  
}
