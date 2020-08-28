package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TReGroupPermission;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TReGroupPermission.
 * @see com.nvg.css.db.domain.TReGroupPermission
 * @author Hibernate Tools
 */
public class TReGroupPermissionHome {

	private static final Logger log = LoggerFactory
			.getLogger(TReGroupPermissionHome.class);

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

	public void persist(TReGroupPermission transientInstance) {
		log.debug("persisting TReGroupPermission instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TReGroupPermission instance) {
		log.debug("attaching dirty TReGroupPermission instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TReGroupPermission instance) {
		log.debug("attaching clean TReGroupPermission instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TReGroupPermission persistentInstance) {
		log.debug("deleting TReGroupPermission instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TReGroupPermission merge(TReGroupPermission detachedInstance) {
		log.debug("merging TReGroupPermission instance");
		try {
			TReGroupPermission result = (TReGroupPermission) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TReGroupPermission findById(java.lang.Integer id) {
		log.debug("getting TReGroupPermission instance with id: " + id);
		try {
			TReGroupPermission instance = (TReGroupPermission) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TReGroupPermission", id);
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

	public List<TReGroupPermission> findByExample(TReGroupPermission instance) {
		log.debug("finding TReGroupPermission instance by example");
		try {
			List<TReGroupPermission> results = (List<TReGroupPermission>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TReGroupPermission")
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
