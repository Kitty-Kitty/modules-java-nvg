package com.gmf.test.serializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.gmf.core.serializer.annotation.GmfListAnnotation;


public class TestBean {
	private boolean testBoolean = true;
	public byte testByte = 0x07;
	private short testShort = 5;
	public int testInt = 12345;
	private long testLong = 12345;
	public float testFloat = 12345.01f;
	private double testDouble = 123499995.01;
	public String testString = "testString";
	public 	TestBean tb = null;
	private TestChildBean tcb = new TestChildBean();
	private boolean[] testArrayBoolean = {true, false, false};
	//private Boolean[] testArrayBooleanObject = {true, false, false};
	private byte[] testArrayByte = {1 , 2, 3};
	private char[] testArrayChar = "testArrayChar".toCharArray();
	private short[] testArrayShort = {1,2,3};
	private int[] testArrayInt = {1,2,3};
	private long[] testArrayLong = {1,2,3};
	private float[] testArrayFloat = {1.0f, 2.0f, 3.0f};
	private double[] testArrayDouble = {1.0, 2.0, 3.0};
	private String[] testArrayString = {"1","2","3"};
	private TestChildBean[]  tcbArray = new TestChildBean[3];
	private StringBuffer testStringBuffer = new StringBuffer("testStringBuffer");
	
	public List<Integer> testList = new ArrayList<Integer>();
	private ArrayList<String> testArrayList = new ArrayList<String>();
	
	@GmfListAnnotation(itemKeyName="Media")
	private ArrayList<TestChildBean> testArrayListChildBean = new ArrayList<TestChildBean>();
	private ArrayList<String> testArrayListString = new ArrayList<String>();
	public HashMap<String, String> testStringMap = new HashMap<String, String>();
	private ConcurrentHashMap<String, String> testStringConcurrentHashMap = new ConcurrentHashMap<String, String>();
	private HashMap<Integer, Integer> testIntMap = new HashMap<Integer, Integer>();
	private HashMap<String, TestChildBean> testIntMapChildBean = new HashMap<String, TestChildBean>();
	
	
	public TestBean() {
		testStringMap.put("MapItem1", "guest");
		testStringMap.put("MapItem2", "guest1");
		testStringMap.put("MapItem3", "guest2");
		testStringMap.put("MapItem4", "guest3");
		testStringMap.put("MapItem5", "guest4");
		
		
		testStringConcurrentHashMap.put("ConcurrentHashMapItem1", "guest1");
		testStringConcurrentHashMap.put("ConcurrentHashMapItem2", "guest2");
		testStringConcurrentHashMap.put("ConcurrentHashMapItem3", "guest3");
		testStringConcurrentHashMap.put("ConcurrentHashMapItem4", "guest4");
		
		
		testIntMap.put(1, 1);
		testIntMap.put(2, 2);
		testIntMap.put(3, 3);
		
		
		testArrayList.add("ListItem1");
		testArrayList.add("ListItem2");
		testArrayList.add("ListItem3");
		testArrayList.add("ListItem4");
		
		
		testArrayListString.add("testArrayListString1");
		testArrayListString.add("testArrayListString2");
		testArrayListString.add("testArrayListString3");
		testArrayListString.add("testArrayListString4");
		testArrayListString.add("testArrayListString5");
		
		testArrayListChildBean.add(new TestChildBean());
		testArrayListChildBean.add(new TestChildBean());
		testArrayListChildBean.add(new TestChildBean());
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		
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
	 * @return the tb
	 */
	public TestBean getTb() {
		return tb;
	}



	/**
	 * @param tb the tb to set
	 */
	public void setTb(TestBean tb) {
		this.tb = tb;
	}



	/**
	 * @return the tcb
	 */
	public TestChildBean getTcb() {
		return tcb;
	}



	/**
	 * @param tcb the tcb to set
	 */
	public void setTcb(TestChildBean tcb) {
		this.tcb = tcb;
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
