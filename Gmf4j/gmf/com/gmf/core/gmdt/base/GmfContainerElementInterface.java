/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfContainerElementInterface.java
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt.base
 * @Description: gmf element interface 
 * @author: kitty   
 * @date: 2016年1月13日 下午3:15:34 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt.base;

import com.gmf.core.Gmf;
import com.gmf.core.gmdu.GmfGmdu;

/**
 * @ClassName: GmfContainerElementInterface
 * @Description: interface of gmf element
 * @author: kitty
 * @date: 2016年1月28日 下午4:37:20
 */
public interface GmfContainerElementInterface extends GmfElementInterface {
	/**
	 * @Title: decodeChildren
	 * @Description: decode children
	 * @param gmf gmf object
	 * @param dest destination byte[] buffer
	 * @param pos position of destination byte[] buffer
	 * @param length destination byte[] buffer length
	 * @return int used length
	 */
	public int decodeChildren(Gmf gmf, byte[] dest, int pos, int length);
	/**
	 * @Title: encodeChildren
	 * @Description: TODO
	 * @param gmf gmf object
	 * @param dest destination byte[] buffer
	 * @param pos position of destination byte[] buffer
	 * @param length destination byte[] buffer length
	 * @return int used length
	 */
	public int encodeChildren(Gmf gmf, byte[] dest, int pos, int length);
	/**
	 * @Title: addChildGmfGmdu
	 * @Description: add child gmfgmdu to current gmfgmdu
	 * @param gmfGmdu child gmfgmdu for add
	 * @return boolean true or false
	 */
	public boolean addChildGmfGmdu(GmfGmdu gmfGmdu);
	/**
	 * @Title: deleteChildGmfGmdu
	 * @Description: delete child gmfgmdu from current gmfgmdu
	 * @param gmfGmdu child gmfgmdu for delete
	 * @return boolean true or false
	 */
	public boolean deleteChildGmfGmdu(GmfGmdu gmfGmdu);
	/**
	 * @Title: findChildGmfGmdu
	 * @Description: find child gmfgmdu with current gmfgmdu
	 * @return GmfGmdu
	 */
	public GmfGmdu findChildGmfGmdu(String key);
	/**
	 * @Title: findChildGmfGmdu
	 * @Description: find child gmfgmdu with current gmfgmdu
	 * @param key GmfElement
	 * @return GmfGmdu
	 */
	public GmfGmdu findChildGmfGmdu(GmfElement key);
	/**
	 * @Title: updateChildGmfGmdu
	 * @Description: update child gmfgmdu with current gmfgmdu
	 * @param gmfGmdu GmfGmdu Object
	 * @return boolean true or false
	 */
	public boolean updateChildGmfGmdu(GmfGmdu gmfGmdu);
}
