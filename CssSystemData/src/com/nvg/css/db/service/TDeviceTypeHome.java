package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TDeviceType;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TDeviceType.
 * @see com.nvg.css.db.domain.TDeviceType
 * @author Hibernate Tools
 */
public class TDeviceTypeHome {

	private static final Logger log = LoggerFactory.getLogger(TDeviceTypeHome.class);

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

	public void persist(TDeviceType transientInstance) {
		log.debug("persisting TDeviceType instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TDeviceType instance) {
		log.debug("attaching dirty TDeviceType instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TDeviceType instance) {
		log.debug("attaching clean TDeviceType instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TDeviceType persistentInstance) {
		log.debug("deleting TDeviceType instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TDeviceType merge(TDeviceType detachedInstance) {
		log.debug("merging TDeviceType instance");
		try {
			TDeviceType result = (TDeviceType) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TDeviceType findById(int id) {
		log.debug("getting TDeviceType instance with id: " + id);
		try {
			TDeviceType instance = (TDeviceType) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TDeviceType", id);
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

	public List<TDeviceType> findByExample(TDeviceType instance) {
		log.debug("finding TDeviceType instance by example");
		try {
			List<TDeviceType> results = (List<TDeviceType>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TDeviceType")
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
