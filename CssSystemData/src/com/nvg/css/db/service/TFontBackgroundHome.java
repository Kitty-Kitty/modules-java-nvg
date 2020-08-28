package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TFontBackground;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TFontBackground.
 * @see com.nvg.css.db.domain.TFontBackground
 * @author Hibernate Tools
 */
public class TFontBackgroundHome {

	private static final Logger log = LoggerFactory.getLogger(TFontBackgroundHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TFontBackground transientInstance) {
		log.debug("persisting TFontBackground instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TFontBackground instance) {
		log.debug("attaching dirty TFontBackground instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TFontBackground instance) {
		log.debug("attaching clean TFontBackground instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TFontBackground persistentInstance) {
		log.debug("deleting TFontBackground instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TFontBackground merge(TFontBackground detachedInstance) {
		log.debug("merging TFontBackground instance");
		try {
			TFontBackground result = (TFontBackground) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TFontBackground findById(java.lang.String id) {
		log.debug("getting TFontBackground instance with id: " + id);
		try {
			TFontBackground instance = (TFontBackground) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TFontBackground", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TFontBackground> findByExample(TFontBackground instance) {
		log.debug("finding TFontBackground instance by example");
		try {
			List<TFontBackground> results = (List<TFontBackground>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TFontBackground")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
