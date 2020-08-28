/**
 * 
 */
package com.nvg.css.db.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nvg.css.db.domain.TDeviceType;
import com.nvg.css.db.hibernate.util.HibernateUtil;

/**
 * @author kitty
 *
 */
public class NvgDbTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		
		try {
			session = HibernateUtil.getCurrentSession();
			tx = session.beginTransaction();
			
			TDeviceType dt = new TDeviceType();
			dt.setDtType(0);
			dt.setDtName("MediaServer");
			dt.setDtComment("defined a media server");
			session.save(dt);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

}
