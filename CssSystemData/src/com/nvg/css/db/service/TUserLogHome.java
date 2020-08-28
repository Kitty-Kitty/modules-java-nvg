package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TUserLog;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TUserLog.
 * @see com.nvg.css.db.domain.TUserLog
 * @author Hibernate Tools
 */
public class TUserLogHome {

	private static final Logger log = LoggerFactory.getLogger(TUserLogHome.class);

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

	public void persist(TUserLog transientInstance) {
		log.debug("persisting TUserLog instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TUserLog instance) {
		log.debug("attaching dirty TUserLog instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TUserLog instance) {
		log.debug("attaching clean TUserLog instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TUserLog persistentInstance) {
		log.debug("deleting TUserLog instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TUserLog merge(TUserLog detachedInstance) {
		log.debug("merging TUserLog instance");
		try {
			TUserLog result = (TUserLog) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TUserLog findById(java.lang.Integer id) {
		log.debug("getting TUserLog instance with id: " + id);
		try {
			TUserLog instance = (TUserLog) sessionFactory.getCurrentSession()
					.get("com.nvg.css.db.domain.TUserLog", id);
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

	public List<TUserLog> findByExample(TUserLog instance) {
		log.debug("finding TUserLog instance by example");
		try {
			List<TUserLog> results = (List<TUserLog>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TUserLog")
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
