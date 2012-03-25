package com.youhua.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.satistics.DimenDate;
import com.youhua.dao.DimenDateDAO;

public class DimenDateDAOImpl extends HibernateDaoSupport implements DimenDateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(DimenDateDAOImpl.class);
	// property constants
	public static final String DATE_FULLY_DESC = "dateFullyDesc";
	public static final String DATE_YEAR = "dateYear";
	public static final String DATE_HALF_YEAR = "dateHalfYear";
	public static final String DATE_QUARTER = "dateQuarter";
	public static final String DATE_MONTH = "dateMonth";
	public static final String DATE_DAY = "dateDay";
	public static final String DATE_WEEK = "dateWeek";
	
	public List<Integer> initYear(){
		String hql = "select distinct Year(date) from DimenDate"; //Date 的 year/month/day(Date)类型是Integer
		return getHibernateTemplate().find(hql);
	}

	protected void initDao() {
		// do nothing
	}

	public void save(DimenDate transientInstance) {
		log.debug("saving DimenDate instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DimenDate persistentInstance) {
		log.debug("deleting DimenDate instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DimenDate findById(java.lang.Integer id) {
		log.debug("getting DimenDate instance with id: " + id);
		try {
			DimenDate instance = (DimenDate) getHibernateTemplate().get(
					"com.youhua.bean.satistics.DimenDate", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DimenDate instance) {
		log.debug("finding DimenDate instance by example");
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
		log.debug("finding DimenDate instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DimenDate as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDateFullyDesc(Object dateFullyDesc) {
		return findByProperty(DATE_FULLY_DESC, dateFullyDesc);
	}

	public List findByDateYear(Object dateYear) {
		return findByProperty(DATE_YEAR, dateYear);
	}

	public List findByDateHalfYear(Object dateHalfYear) {
		return findByProperty(DATE_HALF_YEAR, dateHalfYear);
	}

	public List findByDateQuarter(Object dateQuarter) {
		return findByProperty(DATE_QUARTER, dateQuarter);
	}

	public List findByDateMonth(Object dateMonth) {
		return findByProperty(DATE_MONTH, dateMonth);
	}

	public List findByDateDay(Object dateDay) {
		return findByProperty(DATE_DAY, dateDay);
	}

	public List findByDateWeek(Object dateWeek) {
		return findByProperty(DATE_WEEK, dateWeek);
	}

	public List findAll() {
		log.debug("finding all DimenDate instances");
		try {
			String queryString = "from DimenDate";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DimenDate merge(DimenDate detachedInstance) {
		log.debug("merging DimenDate instance");
		try {
			DimenDate result = (DimenDate) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DimenDate instance) {
		log.debug("attaching dirty DimenDate instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DimenDate instance) {
		log.debug("attaching clean DimenDate instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DimenDateDAOImpl getFromApplicationContext(ApplicationContext ctx) {
		return (DimenDateDAOImpl) ctx.getBean("DimenDateDAO");
	}
}