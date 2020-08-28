package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TReUsrgPermission;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TReUsrgPermission.
 * @see com.nvg.css.db.domain.TReUsrgPermission
 * @author Hibernate Tools
 */
public class TReUsrgPermissionHome {

	private static final Logger log = LoggerFactory
			.getLogger(TReUsrgPermissionHome.class);

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

	public void persist(TReUsrgPermission transientInstance) {
		log.debug("persisting TReUsrgPermission instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TReUsrgPermission instance) {
		log.debug("attaching dirty TReUsrgPermission instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TReUsrgPermission instance) {
		log.debug("attaching clean TReUsrgPermission instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TReUsrgPermission persistentInstance) {
		log.debug("deleting TReUsrgPermission instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TReUsrgPermission merge(TReUsrgPermission detachedInstance) {
		log.debug("merging TReUsrgPermission instance");
		try {
			TReUsrgPermission result = (TReUsrgPermission) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TReUsrgPermission findById(java.lang.Integer id) {
		log.debug("getting TReUsrgPermission instance with id: " + id);
		try {
			TReUsrgPermission instance = (TReUsrgPermission) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TReUsrgPermission", id);
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

	public List<TReUsrgPermission> findByExample(TReUsrgPermission instance) {
		log.debug("finding TReUsrgPermission instance by example");
		try {
			List<TReUsrgPermission> results = (List<TReUsrgPermission>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TReUsrgPermission")
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
