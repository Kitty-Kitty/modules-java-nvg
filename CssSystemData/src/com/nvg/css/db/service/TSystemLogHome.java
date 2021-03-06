package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TSystemLog;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TSystemLog.
 * @see com.nvg.css.db.domain.TSystemLog
 * @author Hibernate Tools
 */
public class TSystemLogHome {

	private static final Logger log = LoggerFactory.getLogger(TSystemLogHome.class);

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

	public void persist(TSystemLog transientInstance) {
		log.debug("persisting TSystemLog instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TSystemLog instance) {
		log.debug("attaching dirty TSystemLog instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TSystemLog instance) {
		log.debug("attaching clean TSystemLog instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TSystemLog persistentInstance) {
		log.debug("deleting TSystemLog instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TSystemLog merge(TSystemLog detachedInstance) {
		log.debug("merging TSystemLog instance");
		try {
			TSystemLog result = (TSystemLog) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TSystemLog findById(java.lang.Integer id) {
		log.debug("getting TSystemLog instance with id: " + id);
		try {
			TSystemLog instance = (TSystemLog) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TSystemLog", id);
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

	public List<TSystemLog> findByExample(TSystemLog instance) {
		log.debug("finding TSystemLog instance by example");
		try {
			List<TSystemLog> results = (List<TSystemLog>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TSystemLog")
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
