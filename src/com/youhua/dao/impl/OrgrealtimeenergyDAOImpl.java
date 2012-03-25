package com.youhua.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.realtime.Orgrealtimeenergy;

/**
 * A data access object (DAO) providing persistence and search support for
 * Orgrealtimeenergy entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.youhua.bean.realtime.Orgrealtimeenergy
 * @author MyEclipse Persistence Tools
 */

public class OrgrealtimeenergyDAOImpl extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(OrgrealtimeenergyDAOImpl.class);
	// property constants
	public static final String ORG_ID = "orgId";
	public static final String ORG_NAME = "orgName";
	public static final String ENERGY_ITEM_CODE = "energyItemCode";
	public static final String ENERGY_ITEM_NAME = "energyItemName";
	public static final String ENERGY_VALUE = "energyValue";
	public static final String ENERGY_SET_VALUE = "energySetValue";
	public static final String ENERGY_BENCH_VALUE = "energyBenchValue";
	public static final String ENERGY_STD_VALUE = "energyStdValue";
	public static final String REAL_TIME_LEVEL = "realTimeLevel";
	public static final String ENERGY_ITEM_UNIT = "energyItemUnit";

	protected void initDao() {
		// do nothing
	}

	public void save(Orgrealtimeenergy transientInstance) {
		log.debug("saving Orgrealtimeenergy instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Orgrealtimeenergy persistentInstance) {
		log.debug("deleting Orgrealtimeenergy instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Orgrealtimeenergy findById(java.lang.Integer id) {
		log.debug("getting Orgrealtimeenergy instance with id: " + id);
		try {
			Orgrealtimeenergy instance = (Orgrealtimeenergy) getHibernateTemplate()
					.get("com.youhua.bean.Orgrealtimeenergy", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Orgrealtimeenergy instance) {
		log.debug("finding Orgrealtimeenergy instance by example");
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
		log.debug("finding Orgrealtimeenergy instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Orgrealtimeenergy as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrgId(Object orgId) {
		return findByProperty(ORG_ID, orgId);
	}

	public List findByOrgName(Object orgName) {
		return findByProperty(ORG_NAME, orgName);
	}

	public List findByEnergyItemCode(Object energyItemCode) {
		return findByProperty(ENERGY_ITEM_CODE, energyItemCode);
	}

	public List findByEnergyItemName(Object energyItemName) {
		return findByProperty(ENERGY_ITEM_NAME, energyItemName);
	}

	public List findByEnergyValue(Object energyValue) {
		return findByProperty(ENERGY_VALUE, energyValue);
	}

	public List findByEnergySetValue(Object energySetValue) {
		return findByProperty(ENERGY_SET_VALUE, energySetValue);
	}

	public List findByEnergyBenchValue(Object energyBenchValue) {
		return findByProperty(ENERGY_BENCH_VALUE, energyBenchValue);
	}

	public List findByEnergyStdValue(Object energyStdValue) {
		return findByProperty(ENERGY_STD_VALUE, energyStdValue);
	}

	public List findByRealTimeLevel(Object realTimeLevel) {
		return findByProperty(REAL_TIME_LEVEL, realTimeLevel);
	}

	public List findByEnergyItemUnit(Object energyItemUnit) {
		return findByProperty(ENERGY_ITEM_UNIT, energyItemUnit);
	}

	public List findAll() {
		log.debug("finding all Orgrealtimeenergy instances");
		try {
			String queryString = "from Orgrealtimeenergy";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Orgrealtimeenergy merge(Orgrealtimeenergy detachedInstance) {
		log.debug("merging Orgrealtimeenergy instance");
		try {
			Orgrealtimeenergy result = (Orgrealtimeenergy) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Orgrealtimeenergy instance) {
		log.debug("attaching dirty Orgrealtimeenergy instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Orgrealtimeenergy instance) {
		log.debug("attaching clean Orgrealtimeenergy instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrgrealtimeenergyDAOImpl getFromApplicationContext(
			ApplicationContext ctx) {
		return (OrgrealtimeenergyDAOImpl) ctx.getBean("OrgrealtimeenergyDAO");
	}
}