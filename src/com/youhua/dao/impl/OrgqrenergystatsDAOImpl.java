package com.youhua.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.energyreport.Orgqrenergystats;
import com.youhua.dao.OrgqrenergystatsDAO;

/**
 * @see com.youhua.bean.energyreport.Orgqrenergystats
 * @author MyEclipse Persistence Tools
 */

public class OrgqrenergystatsDAOImpl extends HibernateDaoSupport implements OrgqrenergystatsDAO {
	private static final Logger log = LoggerFactory
			.getLogger(OrgqrenergystatsDAOImpl.class);
	// property constants
	public static final String ORG_ID = "orgId";
	public static final String DEPART_ID = "departId";
	public static final String DEPART_NAME = "departName";
	public static final String DEPART_NUM = "departNum";
	public static final String BUILD_AREA = "buildArea";
	public static final String HEAT_AREA = "heatArea";
	public static final String COLD_AREA = "coldArea";
	public static final String EFFECT_NUM = "effectNum";
	public static final String PEOPLE_NUM = "peopleNum";
	public static final String ELEC_VALUE = "elecValue";
	public static final String ELEC_COST = "elecCost";
	public static final String WATER_VALUE = "waterValue";
	public static final String WATER_COST = "waterCost";
	public static final String NATGAS_VALUE = "natgasValue";
	public static final String NATGAS_COST = "natgasCost";
	public static final String OTHER_VALUE = "otherValue";
	public static final String OTHER_COST = "otherCost";
	public static final String RECORD_YEAR = "recordYear";
	public static final String RECORD_QR = "recordQr";
	
	public List<Integer> initParam(String orgid) {
		// TODO Auto-generated method stub
		String hql = "select distinct recordYear from Orgqrenergystats as model where model.orgId = ?";
		return getHibernateTemplate().find(hql, orgid);
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Orgqrenergystats transientInstance) {
		log.debug("saving Orgqrenergystats instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Orgqrenergystats persistentInstance) {
		log.debug("deleting Orgqrenergystats instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Orgqrenergystats findById(java.lang.Long id) {
		log.debug("getting Orgqrenergystats instance with id: " + id);
		try {
			Orgqrenergystats instance = (Orgqrenergystats) getHibernateTemplate()
					.get("com.youhua.bean.Orgqrenergystats", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Orgqrenergystats instance) {
		log.debug("finding Orgqrenergystats instance by example");
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
		log.debug("finding Orgqrenergystats instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Orgqrenergystats as model where model."
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

	public List findByDepartId(Object departId) {
		return findByProperty(DEPART_ID, departId);
	}

	public List findByDepartName(Object departName) {
		return findByProperty(DEPART_NAME, departName);
	}

	public List findByDepartNum(Object departNum) {
		return findByProperty(DEPART_NUM, departNum);
	}

	public List findByBuildArea(Object buildArea) {
		return findByProperty(BUILD_AREA, buildArea);
	}

	public List findByHeatArea(Object heatArea) {
		return findByProperty(HEAT_AREA, heatArea);
	}

	public List findByColdArea(Object coldArea) {
		return findByProperty(COLD_AREA, coldArea);
	}

	public List findByEffectNum(Object effectNum) {
		return findByProperty(EFFECT_NUM, effectNum);
	}

	public List findByPeopleNum(Object peopleNum) {
		return findByProperty(PEOPLE_NUM, peopleNum);
	}

	public List findByElecValue(Object elecValue) {
		return findByProperty(ELEC_VALUE, elecValue);
	}

	public List findByElecCost(Object elecCost) {
		return findByProperty(ELEC_COST, elecCost);
	}

	public List findByWaterValue(Object waterValue) {
		return findByProperty(WATER_VALUE, waterValue);
	}

	public List findByWaterCost(Object waterCost) {
		return findByProperty(WATER_COST, waterCost);
	}

	public List findByNatgasValue(Object natgasValue) {
		return findByProperty(NATGAS_VALUE, natgasValue);
	}

	public List findByNatgasCost(Object natgasCost) {
		return findByProperty(NATGAS_COST, natgasCost);
	}

	public List findByOtherValue(Object otherValue) {
		return findByProperty(OTHER_VALUE, otherValue);
	}

	public List findByOtherCost(Object otherCost) {
		return findByProperty(OTHER_COST, otherCost);
	}

	public List findByRecordYear(Object recordYear) {
		return findByProperty(RECORD_YEAR, recordYear);
	}

	public List findByRecordQr(Object recordQr) {
		return findByProperty(RECORD_QR, recordQr);
	}

	public List findAll() {
		log.debug("finding all Orgqrenergystats instances");
		try {
			String queryString = "from Orgqrenergystats";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Orgqrenergystats merge(Orgqrenergystats detachedInstance) {
		log.debug("merging Orgqrenergystats instance");
		try {
			Orgqrenergystats result = (Orgqrenergystats) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Orgqrenergystats instance) {
		log.debug("attaching dirty Orgqrenergystats instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Orgqrenergystats instance) {
		log.debug("attaching clean Orgqrenergystats instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrgqrenergystatsDAOImpl getFromApplicationContext(
			ApplicationContext ctx) {
		return (OrgqrenergystatsDAOImpl) ctx.getBean("OrgqrenergystatsDAO");
	}
}