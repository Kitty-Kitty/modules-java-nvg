/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: HibernateUtil.java 
 * @Prject: MyHibernateProject
 * @Package: com.css.test 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Apr 17, 2016 5:22:41 PM 
 * @version: V1.0   
 */
package com.nvg.css.db.hibernate.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/** 
 * @ClassName: HibernateUtil 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Apr 17, 2016 5:22:41 PM 
 * 
 */
final public class HibernateUtil {
	//表示配置文件
	private String configureFile = null;
	//表示会话工厂
	private static SessionFactory sessionFactory = null;
	//使用线程局部模式
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	
	private HibernateUtil(){};
	
	static {
		sessionFactory = new Configuration().configure("com/nvg/css/db/hibernate/conf/hibernate.cfg.xml").buildSessionFactory();
	}
	
	//获取全新的session
	public static Session openSession() {
		return sessionFactory.openSession();
	}
	
	//获取和线程关联的Session
	public static Session getCurrentSession() {
		Session session = threadLocal.get();
		//判断是否得到
		if (session == null) {
			session = sessionFactory.openSession();
			//把session对象设置到threadLocal中，相当于该session已经和线程绑定
			threadLocal.set(session);
		}
		return session;
	}
	//提供一个统一的查询方法（带分页）hql形式from类 where 条件=?...
	public static List executeQueryByPage
	(String hql, String[] parameters, int pageSize, int pageNow){
		List list = null;
		Session session = null;
		
		try {
			session = openSession();
			Query query = session.createQuery(hql);
			
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setString(i, parameters[i]);
				}
			}
			
			query.setFirstResult((pageNow - 1) * pageSize);
			query.setMaxResults(pageSize);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

		return list;
	}
	
	
	//提供一个统一的查询接口，hql形式 from 类 where 条件=? ... 
	public static List excuteQuery(String hql, String[] parameters) {
		List list = null;
		Session session = null;
		
		try {
			session = openSession();
			Query query = session.createQuery(hql);
			
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setString(i, parameters[i]);
				}
			}
			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

		return list;
	}
	//统一的修改和删除(批量hql)
	public static void excuteUpdate(String hql, String[] parameters) {
		Session session = null;
		Transaction tx = null;
		
		try {
			session = openSession();
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
			
			if (parameters != null && parameters.length > 0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setString(i, parameters[i]);
				}
			}
			
			query.executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	//添加一个对象
	public static void save(Object obj) {
		Session session = null;
		Transaction tx = null;
		
		try {
			session = openSession();
			tx = session.beginTransaction();
			session.save(obj);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	/**
	 * 
	 * @Title: closeCurrentSession 
	 * @Description: TODO
	 * void
	 *
	 * @return: void
	 * @exception
	 */
	public static void closeCurrentSession() {
		Session s = getCurrentSession();
		
		if (s != null && s.isOpen()) {
			s.close();
			threadLocal.set(null);
		}
	}

	/**
	 * @return the configureFile
	 */
	public String getConfigureFile() {
		return configureFile;
	}

	/**
	 * @param configureFile the configureFile to set
	 */
	public void setConfigureFile(String configureFile) {
		this.configureFile = configureFile;
	}
	
}
