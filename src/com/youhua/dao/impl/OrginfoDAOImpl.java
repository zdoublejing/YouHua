package com.youhua.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.user.Orginfo;
import com.youhua.dao.OrginfoDAO;

/**
 * @author MyEclipse Persistence Tools
 * @author jean
 */

public class OrginfoDAOImpl extends HibernateDaoSupport implements OrginfoDAO{
	private static final Logger log = LoggerFactory.getLogger(OrginfoDAOImpl.class);
	// property constants
	public static final String ORG_NAME = "orgName";

	protected void initDao() {
		// do nothing
	}

	public void save(Orginfo transientInstance) {
		log.debug("saving Orginfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Orginfo persistentInstance) {
		log.debug("deleting Orginfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Orginfo findById(java.lang.String id) {
		log.debug("getting Orginfo instance with id: " + id);
		try {
			Orginfo instance = (Orginfo) getHibernateTemplate().get(
					"com.youhua.bean.Orginfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Orginfo instance) {
		log.debug("finding Orginfo instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Orginfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Orginfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrgName(Object orgName) {
		return findByProperty(ORG_NAME, orgName);
	}

	public List findAll() {
		log.debug("finding all Orginfo instances");
		try {
			String queryString = "from Orginfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Orginfo merge(Orginfo detachedInstance) {
		log.debug("merging Orginfo instance");
		try {
			Orginfo result = (Orginfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Orginfo instance) {
		log.debug("attaching dirty Orginfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Orginfo instance) {
		log.debug("attaching clean Orginfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrginfoDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (OrginfoDAOImpl) ctx.getBean("OrginfoDAO");
	}
}