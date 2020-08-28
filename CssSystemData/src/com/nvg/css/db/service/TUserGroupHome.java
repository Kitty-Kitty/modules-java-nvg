package com.nvg.css.db.service;

// Generated Jun 10, 2016 7:15:45 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.db.domain.TUserGroup;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class TUserGroup.
 * @see com.nvg.css.db.domain.TUserGroup
 * @author Hibernate Tools
 */
public class TUserGroupHome {

	private static final Logger log = LoggerFactory.getLogger(TUserGroupHome.class);

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

	public void persist(TUserGroup transientInstance) {
		log.debug("persisting TUserGroup instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TUserGroup instance) {
		log.debug("attaching dirty TUserGroup instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TUserGroup instance) {
		log.debug("attaching clean TUserGroup instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TUserGroup persistentInstance) {
		log.debug("deleting TUserGroup instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TUserGroup merge(TUserGroup detachedInstance) {
		log.debug("merging TUserGroup instance");
		try {
			TUserGroup result = (TUserGroup) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TUserGroup findById(java.lang.String id) {
		log.debug("getting TUserGroup instance with id: " + id);
		try {
			TUserGroup instance = (TUserGroup) sessionFactory
					.getCurrentSession().get(
							"com.nvg.css.db.domain.TUserGroup", id);
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

	public List<TUserGroup> findByExample(TUserGroup instance) {
		log.debug("finding TUserGroup instance by example");
		try {
			List<TUserGroup> results = (List<TUserGroup>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.nvg.css.db.domain.TUserGroup")
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
