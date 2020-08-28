package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TReGroupServer;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TReGroupServer.
 * @see com.nvg.css.db.domain.TReGroupServer
 * @author Hibernate Tools
 */
public class TReGroupServerHome {

	private static final Logger log = LoggerFactory.getLogger(TReGroupServerHome.class);

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

	public void persist(TReGroupServer transientInstance) {
		log.debug("persisting TReGroupServer instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TReGroupServer instance) {
		log.debug("attaching dirty TReGroupServer instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TReGroupServer instance) {
		log.debug("attaching clean TReGroupServer instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TReGroupServer persistentInstance) {
		log.debug("deleting TReGroupServer instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TReGroupServer merge(TReGroupServer detachedInstance) {
		log.debug("merging TReGroupServer instance");
		try {
			TReGroupServer result = (TReGroupServer) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TReGroupServer findById(java.lang.Integer id) {
		log.debug("getting TReGroupServer instance with id: " + id);
		try {
			TReGroupServer instance = (TReGroupServer) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TReGroupServer", id);
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

	public List<TReGroupServer> findByExample(TReGroupServer instance) {
		log.debug("finding TReGroupServer instance by example");
		try {
			List<TReGroupServer> results = (List<TReGroupServer>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TReGroupServer")
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
