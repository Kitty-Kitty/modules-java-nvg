package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TRePlayPermission;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TRePlayPermission.
 * @see com.nvg.css.db.domain.TRePlayPermission
 * @author Hibernate Tools
 */
public class TRePlayPermissionHome {

	private static final Logger log = LoggerFactory
			.getLogger(TRePlayPermissionHome.class);

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

	public void persist(TRePlayPermission transientInstance) {
		log.debug("persisting TRePlayPermission instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TRePlayPermission instance) {
		log.debug("attaching dirty TRePlayPermission instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TRePlayPermission instance) {
		log.debug("attaching clean TRePlayPermission instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TRePlayPermission persistentInstance) {
		log.debug("deleting TRePlayPermission instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TRePlayPermission merge(TRePlayPermission detachedInstance) {
		log.debug("merging TRePlayPermission instance");
		try {
			TRePlayPermission result = (TRePlayPermission) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TRePlayPermission findById(java.lang.Integer id) {
		log.debug("getting TRePlayPermission instance with id: " + id);
		try {
			TRePlayPermission instance = (TRePlayPermission) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TRePlayPermission", id);
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

	public List<TRePlayPermission> findByExample(TRePlayPermission instance) {
		log.debug("finding TRePlayPermission instance by example");
		try {
			List<TRePlayPermission> results = (List<TRePlayPermission>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TRePlayPermission")
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
