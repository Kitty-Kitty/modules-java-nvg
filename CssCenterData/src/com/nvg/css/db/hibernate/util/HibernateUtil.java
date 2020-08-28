/**   
 * Copyright �0�8 2016 Novigo. All rights reserved.
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
	//��ʾ�����ļ�
	private String configureFile = null;
	//��ʾ�Ự����
	private static SessionFactory sessionFactory = null;
	//ʹ���ֲ߳̾�ģʽ
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	
	private HibernateUtil(){};
	
	static {
		sessionFactory = new Configuration().configure("com/nvg/css/db/hibernate/conf/hibernate.cfg.xml").buildSessionFactory();
	}
	
	//��ȡȫ�µ�session
	public static Session openSession() {
		return sessionFactory.openSession();
	}
	
	//��ȡ���̹߳�����Session
	public static Session getCurrentSession() {
		Session session = threadLocal.get();
		//�ж��Ƿ�õ�
		if (session == null) {
			session = sessionFactory.openSession();
			//��session�������õ�threadLocal�У��൱�ڸ�session�Ѿ����̰߳�
			threadLocal.set(session);
		}
		return session;
	}
	//�ṩһ��ͳһ�Ĳ�ѯ����������ҳ��hql��ʽfrom�� where ����=?...
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
	
	
	//�ṩһ��ͳһ�Ĳ�ѯ�ӿڣ�hql��ʽ from �� where ����=? ... 
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
	//ͳһ���޸ĺ�ɾ��(����hql)
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
	
	//���һ������
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
