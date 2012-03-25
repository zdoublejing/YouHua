package com.youhua.dao.impl;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.satistics.DimenOrgdepart;
import com.youhua.dao.DimenOrgdepartDAO;

public class DimenOrgdepartDAOImpl extends HibernateDaoSupport implements DimenOrgdepartDAO {
	private static final Logger log = LoggerFactory
			.getLogger(DimenOrgdepartDAOImpl.class);
	// property constants
	public static final String DEPART_NAME = "departName";
	public static final String DEPART_LEVEL = "departLevel";
	public static final String PARENT_DEPART_NAME = "parentDepartName";
	public static final String ORG_NAME = "orgName";
	public static final String PEOPLE_NUM = "peopleNum";
	public static final String EFFECT_NUM = "effectNum";
	public static final String DEPART_AREA = "departArea";
	public static final String HEAT_AREA = "heatArea";
	public static final String COLD_AREA = "coldArea";
	public static final String ORG_PEOPLE_NUM = "orgPeopleNum";
	public static final String ORG_EFFECT_NUM = "orgEffectNum";
	public static final String ORG_AREA = "orgArea";
	public static final String ORG_HEAT_AREA = "orgHeatArea";
	public static final String ORG_COLD_AREA = "orgColdArea";
	
	public List<String> initDepartname(String orgname) {
		String hql = "select departName from DimenOrgdepart as model where model.orgName = ?";
		return getHibernateTemplate().find(hql, orgname);
	}

	protected void initDao() {
		// do nothing
	}

	public void save(DimenOrgdepart transientInstance) {
		log.debug("saving DimenOrgdepart instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DimenOrgdepart persistentInstance) {
		log.debug("deleting DimenOrgdepart instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DimenOrgdepart findById(java.lang.Integer id) {
		log.debug("getting DimenOrgdepart instance with id: " + id);
		try {
			DimenOrgdepart instance = (DimenOrgdepart) getHibernateTemplate()
					.get("com.youhua.bean.satistics.DimenOrgdepart", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DimenOrgdepart instance) {
		log.debug("finding DimenOrgdepart instance by example");
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
		log.debug("finding DimenOrgdepart instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DimenOrgdepart as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDepartName(Object departName) {
		return findByProperty(DEPART_NAME, departName);
	}

	public List findByDepartLevel(Object departLevel) {
		return findByProperty(DEPART_LEVEL, departLevel);
	}

	public List findByParentDepartName(Object parentDepartName) {
		return findByProperty(PARENT_DEPART_NAME, parentDepartName);
	}

	public List findByOrgName(Object orgName) {
		return findByProperty(ORG_NAME, orgName);
	}

	public List findByPeopleNum(Object peopleNum) {
		return findByProperty(PEOPLE_NUM, peopleNum);
	}

	public List findByEffectNum(Object effectNum) {
		return findByProperty(EFFECT_NUM, effectNum);
	}

	public List findByDepartArea(Object departArea) {
		return findByProperty(DEPART_AREA, departArea);
	}

	public List findByHeatArea(Object heatArea) {
		return findByProperty(HEAT_AREA, heatArea);
	}

	public List findByColdArea(Object coldArea) {
		return findByProperty(COLD_AREA, coldArea);
	}

	public List findByOrgPeopleNum(Object orgPeopleNum) {
		return findByProperty(ORG_PEOPLE_NUM, orgPeopleNum);
	}

	public List findByOrgEffectNum(Object orgEffectNum) {
		return findByProperty(ORG_EFFECT_NUM, orgEffectNum);
	}

	public List findByOrgArea(Object orgArea) {
		return findByProperty(ORG_AREA, orgArea);
	}

	public List findByOrgHeatArea(Object orgHeatArea) {
		return findByProperty(ORG_HEAT_AREA, orgHeatArea);
	}

	public List findByOrgColdArea(Object orgColdArea) {
		return findByProperty(ORG_COLD_AREA, orgColdArea);
	}

	public List findAll() {
		log.debug("finding all DimenOrgdepart instances");
		try {
			String queryString = "from DimenOrgdepart";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DimenOrgdepart merge(DimenOrgdepart detachedInstance) {
		log.debug("merging DimenOrgdepart instance");
		try {
			DimenOrgdepart result = (DimenOrgdepart) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DimenOrgdepart instance) {
		log.debug("attaching dirty DimenOrgdepart instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DimenOrgdepart instance) {
		log.debug("attaching clean DimenOrgdepart instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DimenOrgdepartDAOImpl getFromApplicationContext(
			ApplicationContext ctx) {
		return (DimenOrgdepartDAOImpl) ctx.getBean("DimenOrgdepartDAO");
	}

}