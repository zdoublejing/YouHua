package com.youhua.dao.impl;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.satistics.DimenEnvironment;

/**
 * A data access object (DAO) providing persistence and search support for
 * DimenEnvironment entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.youhua.bean.satistics.DimenEnvironment
 * @author MyEclipse Persistence Tools
 */

public class DimenEnvironmentDAOImpl extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(DimenEnvironmentDAOImpl.class);
	// property constants
	public static final String TEMPRETURE_DESC = "tempretureDesc";
	public static final String HUMIDITY_DESC = "humidityDesc";
	public static final String AIR_QUALITY = "airQuality";

	protected void initDao() {
		// do nothing
	}

	public void save(DimenEnvironment transientInstance) {
		log.debug("saving DimenEnvironment instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DimenEnvironment persistentInstance) {
		log.debug("deleting DimenEnvironment instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DimenEnvironment findById(java.lang.Integer id) {
		log.debug("getting DimenEnvironment instance with id: " + id);
		try {
			DimenEnvironment instance = (DimenEnvironment) getHibernateTemplate()
					.get("com.youhua.bean.satistics.DimenEnvironment", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DimenEnvironment instance) {
		log.debug("finding DimenEnvironment instance by example");
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
		log.debug("finding DimenEnvironment instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DimenEnvironment as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTempretureDesc(Object tempretureDesc) {
		return findByProperty(TEMPRETURE_DESC, tempretureDesc);
	}

	public List findByHumidityDesc(Object humidityDesc) {
		return findByProperty(HUMIDITY_DESC, humidityDesc);
	}

	public List findByAirQuality(Object airQuality) {
		return findByProperty(AIR_QUALITY, airQuality);
	}

	public List findAll() {
		log.debug("finding all DimenEnvironment instances");
		try {
			String queryString = "from DimenEnvironment";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DimenEnvironment merge(DimenEnvironment detachedInstance) {
		log.debug("merging DimenEnvironment instance");
		try {
			DimenEnvironment result = (DimenEnvironment) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DimenEnvironment instance) {
		log.debug("attaching dirty DimenEnvironment instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DimenEnvironment instance) {
		log.debug("attaching clean DimenEnvironment instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DimenEnvironmentDAOImpl getFromApplicationContext(
			ApplicationContext ctx) {
		return (DimenEnvironmentDAOImpl) ctx.getBean("DimenEnvironmentDAO");
	}
}