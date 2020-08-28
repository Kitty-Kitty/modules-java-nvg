package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TResource;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TResource.
 * @see com.nvg.css.db.domain.TResource
 * @author Hibernate Tools
 */
public class TResourceHome {

	private static final Logger log = LoggerFactory.getLogger(TResourceHome.class);

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

	public void persist(TResource transientInstance) {
		log.debug("persisting TResource instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TResource instance) {
		log.debug("attaching dirty TResource instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TResource instance) {
		log.debug("attaching clean TResource instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TResource persistentInstance) {
		log.debug("deleting TResource instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TResource merge(TResource detachedInstance) {
		log.debug("merging TResource instance");
		try {
			TResource result = (TResource) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TResource findById(java.lang.String id) {
		log.debug("getting TResource instance with id: " + id);
		try {
			TResource instance = (TResource) sessionFactory.getCurrentSession()
					.get("com.nvg.css.db.domain.TResource", id);
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

	public List<TResource> findByExample(TResource instance) {
		log.debug("finding TResource instance by example");
		try {
			List<TResource> results = (List<TResource>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TResource")
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
