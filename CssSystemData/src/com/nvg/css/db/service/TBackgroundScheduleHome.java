package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TBackgroundSchedule;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TBackgroundSchedule.
 * @see com.nvg.css.db.domain.TBackgroundSchedule
 * @author Hibernate Tools
 */
public class TBackgroundScheduleHome {

	private static final Logger log = LoggerFactory
			.getLogger(TBackgroundScheduleHome.class);

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

	public void persist(TBackgroundSchedule transientInstance) {
		log.debug("persisting TBackgroundSchedule instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TBackgroundSchedule instance) {
		log.debug("attaching dirty TBackgroundSchedule instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TBackgroundSchedule instance) {
		log.debug("attaching clean TBackgroundSchedule instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TBackgroundSchedule persistentInstance) {
		log.debug("deleting TBackgroundSchedule instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TBackgroundSchedule merge(TBackgroundSchedule detachedInstance) {
		log.debug("merging TBackgroundSchedule instance");
		try {
			TBackgroundSchedule result = (TBackgroundSchedule) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TBackgroundSchedule findById(java.lang.String id) {
		log.debug("getting TBackgroundSchedule instance with id: " + id);
		try {
			TBackgroundSchedule instance = (TBackgroundSchedule) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TBackgroundSchedule", id);
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

	public List<TBackgroundSchedule> findByExample(TBackgroundSchedule instance) {
		log.debug("finding TBackgroundSchedule instance by example");
		try {
			List<TBackgroundSchedule> results = (List<TBackgroundSchedule>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TBackgroundSchedule")
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
