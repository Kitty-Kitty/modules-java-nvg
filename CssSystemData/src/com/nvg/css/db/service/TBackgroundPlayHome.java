package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TBackgroundPlay;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TBackgroundPlay.
 * @see com.nvg.css.db.domain.TBackgroundPlay
 * @author Hibernate Tools
 */
public class TBackgroundPlayHome {

	private static final Logger log = LoggerFactory.getLogger(TBackgroundPlayHome.class);

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

	public void persist(TBackgroundPlay transientInstance) {
		log.debug("persisting TBackgroundPlay instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TBackgroundPlay instance) {
		log.debug("attaching dirty TBackgroundPlay instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TBackgroundPlay instance) {
		log.debug("attaching clean TBackgroundPlay instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TBackgroundPlay persistentInstance) {
		log.debug("deleting TBackgroundPlay instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TBackgroundPlay merge(TBackgroundPlay detachedInstance) {
		log.debug("merging TBackgroundPlay instance");
		try {
			TBackgroundPlay result = (TBackgroundPlay) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TBackgroundPlay findById(java.lang.String id) {
		log.debug("getting TBackgroundPlay instance with id: " + id);
		try {
			TBackgroundPlay instance = (TBackgroundPlay) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TBackgroundPlay", id);
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

	public List<TBackgroundPlay> findByExample(TBackgroundPlay instance) {
		log.debug("finding TBackgroundPlay instance by example");
		try {
			List<TBackgroundPlay> results = (List<TBackgroundPlay>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TBackgroundPlay")
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
