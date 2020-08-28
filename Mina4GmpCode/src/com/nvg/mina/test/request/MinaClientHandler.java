/**   
 * Copyright �0�8 2016 Novigo. All rights reserved.
 * 
 * @Title: MinaClientHandler.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.test.request 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 10:47:48 AM 
 * @version: V1.0   
 */
package com.nvg.mina.test.request;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.log4j.Logger;  
import org.apache.mina.core.session.IdleStatus;  
import org.apache.mina.core.session.IoSession;  

/** 
 * @ClassName: MinaClientHandler 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 10:47:48 AM 
 * 
 */
public class MinaClientHandler extends IoHandlerAdapter {
	private static final Logger log = Logger.getLogger(MinaClientHandler.class);  
    @Override  
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {  
        cause.printStackTrace();  
    }  
  
    @Override  
    public void messageReceived(IoSession session, Object message)throws Exception {  
        log.info("client��Ϣ���յ�"+message);  
    }  
  
    @Override  
    public void messageSent(IoSession session, Object message) throws Exception {  
        log.info("client-��Ϣ�Ѿ�����"+message);  
    }  
  
    @Override  
    public void sessionClosed(IoSession session) throws Exception {  
        log.info("client -session�ر����ӶϿ�");  
    }  
  
    @Override  
    public void sessionCreated(IoSession session) throws Exception {  
        System.out.println("client -����session");  
    }  
  
    @Override  
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {  
        System.out.println("client-ϵͳ������...");  
    }  
  
    @Override  
    public void sessionOpened(IoSession session) throws Exception {  
        System.out.println("client-session��");  
    }  
}
