package com.youhua.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.satistics.FactEnergy;
import com.youhua.bean.satistics.FactEnergyId;

/**
 * A data access object (DAO) providing persistence and search support for
 * FactEnergy entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.youhua.bean.satistics.FactEnergy
 * @author MyEclipse Persistence Tools
 */

public class FactEnergyDAOImpl extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(FactEnergyDAOImpl.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(FactEnergy transientInstance) {
		log.debug("saving FactEnergy instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FactEnergy persistentInstance) {
		log.debug("deleting FactEnergy instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FactEnergy findById(com.youhua.bean.satistics.FactEnergyId id) {
		log.debug("getting FactEnergy instance with id: " + id);
		try {
			FactEnergy instance = (FactEnergy) getHibernateTemplate().get(
					"com.youhua.bean.satistics.FactEnergy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FactEnergy instance) {
		log.debug("finding FactEnergy instance by example");
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
		log.debug("finding FactEnergy instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from FactEnergy as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all FactEnergy instances");
		try {
			String queryString = "from FactEnergy";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FactEnergy merge(FactEnergy detachedInstance) {
		log.debug("merging FactEnergy instance");
		try {
			FactEnergy result = (FactEnergy) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FactEnergy instance) {
		log.debug("attaching dirty FactEnergy instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FactEnergy instance) {
		log.debug("attaching clean FactEnergy instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FactEnergyDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (FactEnergyDAOImpl) ctx.getBean("FactEnergyDAO");
	}
}