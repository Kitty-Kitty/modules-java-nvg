/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: TestNullBean.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.test.serializer 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月22日 下午4:20:51 
 * @version: V0.1.0   
 */
package com.gmf.test.serializer;

import java.util.HashMap;

/** 
 * @ClassName: TestNullBean 
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月22日 下午4:20:51  
 */
public class TestNullBean {
	private boolean testBoolean;
	private byte testByte;
	private short testShort;
	private int testInt;
	private long testLong;
	private float testFloat;
	private double testDouble;
	private String testString = null;
	private StringBuffer testStringBuffer = null;
	private HashMap<Integer, String> testNullMap = null;

	//private ArrayList<String> testArrayList = new ArrayList<String>();
	
	public TestNullBean() {
	}

	/**
	 * @return the testBoolean
	 */
	public boolean isTestBoolean() {
		return testBoolean;
	}

	/**
	 * @param testBoolean the testBoolean to set
	 */
	public void setTestBoolean(boolean testBoolean) {
		this.testBoolean = testBoolean;
	}

	/**
	 * @return the testByte
	 */
	public byte getTestByte() {
		return testByte;
	}

	/**
	 * @param testByte the testByte to set
	 */
	public void setTestByte(byte testByte) {
		this.testByte = testByte;
	}

	/**
	 * @return the testShort
	 */
	public short getTestShort() {
		return testShort;
	}

	/**
	 * @param testShort the testShort to set
	 */
	public void setTestShort(short testShort) {
		this.testShort = testShort;
	}

	/**
	 * @return the testInt
	 */
	public int getTestInt() {
		return testInt;
	}

	/**
	 * @param testInt the testInt to set
	 */
	public void setTestInt(int testInt) {
		this.testInt = testInt;
	}

	/**
	 * @return the testLong
	 */
	public long getTestLong() {
		return testLong;
	}

	/**
	 * @param testLong the testLong to set
	 */
	public void setTestLong(long testLong) {
		this.testLong = testLong;
	}

	/**
	 * @return the testFloat
	 */
	public float getTestFloat() {
		return testFloat;
	}

	/**
	 * @param testFloat the testFloat to set
	 */
	public void setTestFloat(float testFloat) {
		this.testFloat = testFloat;
	}

	/**
	 * @return the testDouble
	 */
	public double getTestDouble() {
		return testDouble;
	}

	/**
	 * @param testDouble the testDouble to set
	 */
	public void setTestDouble(double testDouble) {
		this.testDouble = testDouble;
	}

	/**
	 * @return the testString
	 */
	public String getTestString() {
		return testString;
	}

	/**
	 * @param testString the testString to set
	 */
	public void setTestString(String testString) {
		this.testString = testString;
	}

	/**
	 * @return the testStringBuffer
	 */
	public StringBuffer getTestStringBuffer() {
		return testStringBuffer;
	}

	/**
	 * @param testStringBuffer the testStringBuffer to set
	 */
	public void setTestStringBuffer(StringBuffer testStringBuffer) {
		this.testStringBuffer = testStringBuffer;
	}

	/**
	 * @return the testNullMap
	 */
	public HashMap<Integer, String> getTestNullMap() {
		return testNullMap;
	}

	/**
	 * @param testNullMap the testNullMap to set
	 */
	public void setTestNullMap(HashMap<Integer, String> testNullMap) {
		this.testNullMap = testNullMap;
	}
	
	
}
