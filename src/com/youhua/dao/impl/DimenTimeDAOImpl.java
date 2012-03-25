package com.youhua.dao.impl;

import java.sql.Time;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.satistics.DimenTime;

/**
 * A data access object (DAO) providing persistence and search support for
 * DimenTime entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.youhua.bean.satistics.DimenTime
 * @author MyEclipse Persistence Tools
 */

public class DimenTimeDAOImpl extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(DimenTimeDAOImpl.class);
	// property constants
	public static final String START_TIME_FULLY_DESC = "startTimeFullyDesc";
	public static final String END_TIME_FULLY_DESC = "endTimeFullyDesc";
	public static final String START_HOUR = "startHour";
	public static final String END_HOUR = "endHour";
	public static final String START_MINUTE = "startMinute";
	public static final String END_MINUTE = "endMinute";
	public static final String START_SECOND = "startSecond";
	public static final String END_SECOND = "endSecond";
	public static final String AMOR_PM = "amorPm";

	protected void initDao() {
		// do nothing
	}

	public void save(DimenTime transientInstance) {
		log.debug("saving DimenTime instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DimenTime persistentInstance) {
		log.debug("deleting DimenTime instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DimenTime findById(java.lang.Integer id) {
		log.debug("getting DimenTime instance with id: " + id);
		try {
			DimenTime instance = (DimenTime) getHibernateTemplate().get(
					"com.youhua.bean.satistics.DimenTime", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DimenTime instance) {
		log.debug("finding DimenTime instance by example");
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
		log.debug("finding DimenTime instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DimenTime as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStartTimeFullyDesc(Object startTimeFullyDesc) {
		return findByProperty(START_TIME_FULLY_DESC, startTimeFullyDesc);
	}

	public List findByEndTimeFullyDesc(Object endTimeFullyDesc) {
		return findByProperty(END_TIME_FULLY_DESC, endTimeFullyDesc);
	}

	public List findByStartHour(Object startHour) {
		return findByProperty(START_HOUR, startHour);
	}

	public List findByEndHour(Object endHour) {
		return findByProperty(END_HOUR, endHour);
	}

	public List findByStartMinute(Object startMinute) {
		return findByProperty(START_MINUTE, startMinute);
	}

	public List findByEndMinute(Object endMinute) {
		return findByProperty(END_MINUTE, endMinute);
	}

	public List findByStartSecond(Object startSecond) {
		return findByProperty(START_SECOND, startSecond);
	}

	public List findByEndSecond(Object endSecond) {
		return findByProperty(END_SECOND, endSecond);
	}

	public List findByAmorPm(Object amorPm) {
		return findByProperty(AMOR_PM, amorPm);
	}

	public List findAll() {
		log.debug("finding all DimenTime instances");
		try {
			String queryString = "from DimenTime";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DimenTime merge(DimenTime detachedInstance) {
		log.debug("merging DimenTime instance");
		try {
			DimenTime result = (DimenTime) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DimenTime instance) {
		log.debug("attaching dirty DimenTime instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DimenTime instance) {
		log.debug("attaching clean DimenTime instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DimenTimeDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (DimenTimeDAOImpl) ctx.getBean("DimenTimeDAO");
	}
}