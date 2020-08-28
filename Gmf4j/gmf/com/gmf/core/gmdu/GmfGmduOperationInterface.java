/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfGmdt.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdu
 * @Description: GmfGmduOperationInterface
 * @author: kitty   
 * @date: 2016年1月12日 下午5:23:47 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdu;

import com.gmf.core.gmdt.base.GmfElement;

/** 
 * @ClassName: GmfGmduOperationInterface 
 * @Description: interface of GmfGmdu
 * @author: kitty
 * @date: 2016年1月28日 下午5:29:57  
 */
public interface GmfGmduOperationInterface {
	
	/**
	 * 
	 * @Title: addGmfGmdu 
	 * @Description: TODO
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean addGmfGmdu(GmfElement key, GmfElement value);
	
	public boolean addGmfGmdu(GmfGmdu gmfGmdu);
	
	public boolean addChildGmfGmdu(GmfElement key, GmfElement value);
	
	public boolean addChildGmfGmdu(GmfGmdu gmfGmdu);
	
	/**
	 * 
	 * @Title: delGmfGmdu 
	 * @Description: TODO
	 * @return
	 */
	@Deprecated
	public boolean deleteGmfGmdu();
	@Deprecated
	public boolean deleteGmfGmdu(GmfGmdu gmfGmdu);
	@Deprecated
	public boolean deleteGmfGmdu(GmfElement key);
	@Deprecated
	public boolean deleteChildGmfGmdu();
	@Deprecated
	public boolean deleteChildGmfGmdu(GmfGmdu gmfGmdu);
	@Deprecated
	public boolean deleteChildGmfGmdu(GmfElement key);
	
	/**
	 * 
	 * @Title: findGmfGmdu 
	 * @Description: TODO
	 * @param key
	 * @return
	 */
	public GmfGmdu findGmfGmdu(String key);
	
	public GmfGmdu findGmfGmdu(GmfGmdu gmfGmdu);
	
	public GmfGmdu findGmfGmdu(GmfElement key);
	
	public GmfGmdu findChildGmfGmdu(String key);
	
	public GmfGmdu findChildGmfGmdu(GmfGmdu gmfGmdu);
	
	public GmfGmdu findChildGmfGmdu(GmfElement key);
	
	/**
	 * 
	 * @Title: updateGmfGmdu 
	 * @Description: TODO
	 * @param gmfGmdu
	 * @return
	 */
	public boolean updateGmfGmdu(GmfGmdu gmfGmdu);
	
	/** 
	 * @Title: outGmfGmdu 
	 * @Description: TODO
	 * @return
	 */
	public void outGmfGmdu();
}
