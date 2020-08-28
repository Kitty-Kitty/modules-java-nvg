/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: TestClass.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.test.reflection 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月14日 上午9:57:14 
 * @version: V0.1.0   
 */
package com.gmf.test.reflection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @ClassName: TestClass
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月14日 上午9:57:14
 */
public class TestClass {
	private Long id;
	private String name;
	private Date createdate;
	private String no;
	public String nickname;
	public ArrayList<String>args = new ArrayList<String>();
	public HashMap<String, String> mapArgs = new HashMap<String, String>();
	
	
	public TestClass() {
		args.add("abc1");
		args.add("abc2");
		args.add("abc3");
		
		
		mapArgs.put("1", "a");
		mapArgs.put("2", "b");
		mapArgs.put("3", "c");
	}
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the createdate
	 */
	public Date getCreatedate() {
		return createdate;
	}
	/**
	 * @param createdate the createdate to set
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	/**
	 * @return the no
	 */
	public String getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(String no) {
		this.no = no;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}
