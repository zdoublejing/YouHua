package com.youhua.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.energyreport.Orgbaseinfo;
import com.youhua.dao.OrgbaseinfoDAO;

/**
 * @author MyEclipse Persistence Tools
 * @author jean
 */

public class OrgbaseinfoDAOImpl extends HibernateDaoSupport implements OrgbaseinfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(OrgbaseinfoDAOImpl.class);
	// property constants
	public static final String ORG_ID = "orgId";
	public static final String INDEX_CODE = "indexCode";
	public static final String INDEX_NAME = "indexName";
	public static final String METER_UNIT = "meterUnit";
	public static final String INDEX_VALUE = "indexValue";
	public static final String RECORD_YEAR = "recordYear";
	
	public List<Integer> initParam(String orgid) {
		// TODO Auto-generated method stub
		//System.out.println(orgid);
		String hql = "select distinct recordYear from Orgbaseinfo as model where model.orgId = ?";
		return getHibernateTemplate().find(hql, orgid);
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Orgbaseinfo transientInstance) {
		log.debug("saving Orgbaseinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Orgbaseinfo persistentInstance) {
		log.debug("deleting Orgbaseinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Orgbaseinfo findById(java.lang.Long id) {
		log.debug("getting Orgbaseinfo instance with id: " + id);
		try {
			Orgbaseinfo instance = (Orgbaseinfo) getHibernateTemplate().get(
					"com.youhua.bean.Orgbaseinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Orgbaseinfo instance) {
		log.debug("finding Orgbaseinfo instance by example");
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
		log.debug("finding Orgbaseinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Orgbaseinfo as model where model."
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

	public List findByIndexCode(Object indexCode) {
		return findByProperty(INDEX_CODE, indexCode);
	}

	public List findByIndexName(Object indexName) {
		return findByProperty(INDEX_NAME, indexName);
	}

	public List findByMeterUnit(Object meterUnit) {
		return findByProperty(METER_UNIT, meterUnit);
	}

	public List findByIndexValue(Object indexValue) {
		return findByProperty(INDEX_VALUE, indexValue);
	}

	public List findByRecordYear(Object recordYear) {
		return findByProperty(RECORD_YEAR, recordYear);
	}

	public List findAll() {
		log.debug("finding all Orgbaseinfo instances");
		try {
			String queryString = "from Orgbaseinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Orgbaseinfo merge(Orgbaseinfo detachedInstance) {
		log.debug("merging Orgbaseinfo instance");
		try {
			Orgbaseinfo result = (Orgbaseinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Orgbaseinfo instance) {
		log.debug("attaching dirty Orgbaseinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Orgbaseinfo instance) {
		log.debug("attaching clean Orgbaseinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrgbaseinfoDAOImpl getFromApplicationContext(
			ApplicationContext ctx) {
		return (OrgbaseinfoDAOImpl) ctx.getBean("OrgbaseinfoDAO");
	}
}