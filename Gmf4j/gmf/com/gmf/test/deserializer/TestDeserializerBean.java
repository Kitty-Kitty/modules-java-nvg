/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: TestDeserializerBean.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.test.deserializer 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月24日 下午6:28:26 
 * @version: V0.1.0   
 */
package com.gmf.test.deserializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.gmf.test.serializer.TestChildBean;

/** 
 * @ClassName: TestDeserializerBean 
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月24日 下午6:28:26  
 */
public class TestDeserializerBean {
	private boolean testBoolean;
	private byte testByte;
	private short testShort;
	private int testInt;
	private long testLong;
	private float testFloat;
	private double testDouble;
	private String testString;
	private boolean[] testArrayBoolean;
	private Boolean[] testArrayBooleanObject;
	private byte[] testArrayByte;
	private char[] testArrayChar;
	private short[] testArrayShort;
	private int[] testArrayInt;
	private long[] testArrayLong;
	private float[] testArrayFloat;
	private double[] testArrayDouble;
	private String[] testArrayString;
	private TestChildBean[]  tcbArray;
	private StringBuffer testStringBuffer;
	private HashMap<String, String> testStringMap;
	private ConcurrentHashMap<String, String> testStringConcurrentHashMap;
	private HashMap<Integer, Integer> testIntMap;
	private ArrayList<String> testArrayList;
	private List<Integer> testList;
	private ArrayList<TestChildBean> testArrayListChildBean;
	private ArrayList<String> testArrayListString;
	private HashMap<String, TestChildBean> testIntMapChildBean;
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
	 * @return the testArrayBoolean
	 */
	public boolean[] getTestArrayBoolean() {
		return testArrayBoolean;
	}
	/**
	 * @param testArrayBoolean the testArrayBoolean to set
	 */
	public void setTestArrayBoolean(boolean[] testArrayBoolean) {
		this.testArrayBoolean = testArrayBoolean;
	}
	/**
	 * @return the testArrayBooleanObject
	 */
	public Boolean[] getTestArrayBooleanObject() {
		return testArrayBooleanObject;
	}
	/**
	 * @param testArrayBooleanObject the testArrayBooleanObject to set
	 */
	public void setTestArrayBooleanObject(Boolean[] testArrayBooleanObject) {
		this.testArrayBooleanObject = testArrayBooleanObject;
	}
	/**
	 * @return the testArrayByte
	 */
	public byte[] getTestArrayByte() {
		return testArrayByte;
	}
	/**
	 * @param testArrayByte the testArrayByte to set
	 */
	public void setTestArrayByte(byte[] testArrayByte) {
		this.testArrayByte = testArrayByte;
	}
	/**
	 * @return the testArrayChar
	 */
	public char[] getTestArrayChar() {
		return testArrayChar;
	}
	/**
	 * @param testArrayChar the testArrayChar to set
	 */
	public void setTestArrayChar(char[] testArrayChar) {
		this.testArrayChar = testArrayChar;
	}
	/**
	 * @return the testArrayShort
	 */
	public short[] getTestArrayShort() {
		return testArrayShort;
	}
	/**
	 * @param testArrayShort the testArrayShort to set
	 */
	public void setTestArrayShort(short[] testArrayShort) {
		this.testArrayShort = testArrayShort;
	}
	/**
	 * @return the testArrayInt
	 */
	public int[] getTestArrayInt() {
		return testArrayInt;
	}
	/**
	 * @param testArrayInt the testArrayInt to set
	 */
	public void setTestArrayInt(int[] testArrayInt) {
		this.testArrayInt = testArrayInt;
	}
	/**
	 * @return the testArrayLong
	 */
	public long[] getTestArrayLong() {
		return testArrayLong;
	}
	/**
	 * @param testArrayLong the testArrayLong to set
	 */
	public void setTestArrayLong(long[] testArrayLong) {
		this.testArrayLong = testArrayLong;
	}
	/**
	 * @return the testArrayFloat
	 */
	public float[] getTestArrayFloat() {
		return testArrayFloat;
	}
	/**
	 * @param testArrayFloat the testArrayFloat to set
	 */
	public void setTestArrayFloat(float[] testArrayFloat) {
		this.testArrayFloat = testArrayFloat;
	}
	/**
	 * @return the testArrayDouble
	 */
	public double[] getTestArrayDouble() {
		return testArrayDouble;
	}
	/**
	 * @param testArrayDouble the testArrayDouble to set
	 */
	public void setTestArrayDouble(double[] testArrayDouble) {
		this.testArrayDouble = testArrayDouble;
	}
	/**
	 * @return the testArrayString
	 */
	public String[] getTestArrayString() {
		return testArrayString;
	}
	/**
	 * @param testArrayString the testArrayString to set
	 */
	public void setTestArrayString(String[] testArrayString) {
		this.testArrayString = testArrayString;
	}
	/**
	 * @return the tcbArray
	 */
	public TestChildBean[] getTcbArray() {
		return tcbArray;
	}
	/**
	 * @param tcbArray the tcbArray to set
	 */
	public void setTcbArray(TestChildBean[] tcbArray) {
		this.tcbArray = tcbArray;
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
	 * @return the testStringMap
	 */
	public HashMap<String, String> getTestStringMap() {
		return testStringMap;
	}
	/**
	 * @param testStringMap the testStringMap to set
	 */
	public void setTestStringMap(HashMap<String, String> testStringMap) {
		this.testStringMap = testStringMap;
	}
	/**
	 * @return the testStringConcurrentHashMap
	 */
	public ConcurrentHashMap<String, String> getTestStringConcurrentHashMap() {
		return testStringConcurrentHashMap;
	}
	/**
	 * @param testStringConcurrentHashMap the testStringConcurrentHashMap to set
	 */
	public void setTestStringConcurrentHashMap(ConcurrentHashMap<String, String> testStringConcurrentHashMap) {
		this.testStringConcurrentHashMap = testStringConcurrentHashMap;
	}
	/**
	 * @return the testIntMap
	 */
	public HashMap<Integer, Integer> getTestIntMap() {
		return testIntMap;
	}
	/**
	 * @param testIntMap the testIntMap to set
	 */
	public void setTestIntMap(HashMap<Integer, Integer> testIntMap) {
		this.testIntMap = testIntMap;
	}
	/**
	 * @return the testArrayList
	 */
	public ArrayList<String> getTestArrayList() {
		return testArrayList;
	}
	/**
	 * @param testArrayList the testArrayList to set
	 */
	public void setTestArrayList(ArrayList<String> testArrayList) {
		this.testArrayList = testArrayList;
	}
	/**
	 * @return the testList
	 */
	public List<Integer> getTestList() {
		return testList;
	}
	/**
	 * @param testList the testList to set
	 */
	public void setTestList(List<Integer> testList) {
		this.testList = testList;
	}
	/**
	 * @return the testArrayListChildBean
	 */
	public ArrayList<TestChildBean> getTestArrayListChildBean() {
		return testArrayListChildBean;
	}
	/**
	 * @param testArrayListChildBean the testArrayListChildBean to set
	 */
	public void setTestArrayListChildBean(ArrayList<TestChildBean> testArrayListChildBean) {
		this.testArrayListChildBean = testArrayListChildBean;
	}
	/**
	 * @return the testArrayListString
	 */
	public ArrayList<String> getTestArrayListString() {
		return testArrayListString;
	}
	/**
	 * @param testArrayListString the testArrayListString to set
	 */
	public void setTestArrayListString(ArrayList<String> testArrayListString) {
		this.testArrayListString = testArrayListString;
	}
	/**
	 * @return the testIntMapChildBean
	 */
	public HashMap<String, TestChildBean> getTestIntMapChildBean() {
		return testIntMapChildBean;
	}
	/**
	 * @param testIntMapChildBean the testIntMapChildBean to set
	 */
	public void setTestIntMapChildBean(HashMap<String, TestChildBean> testIntMapChildBean) {
		this.testIntMapChildBean = testIntMapChildBean;
	}
}
