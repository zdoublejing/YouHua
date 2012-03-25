package com.youhua.dao.impl;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.youhua.bean.satistics.DimenEnergyitem;
import com.youhua.dao.DimenEnergyitemDAO;

public class DimenEnergyitemDAOImpl extends HibernateDaoSupport implements DimenEnergyitemDAO {
	private static final Logger log = LoggerFactory
			.getLogger(DimenEnergyitemDAOImpl.class);
	// property constants
	public static final String FIRST_ITEM_NAME = "firstItemName";
	public static final String SECOND_ITEM_NAME = "secondItemName";
	public static final String THIRD_ITEM_NAME = "thirdItemName";
	public static final String ENERGY_ITEM_UNIT = "energyItemUnit";
	public static final String ENERGY_ITEM_FML = "energyItemFml";
	public static final String ENERGY_ITEM_LEVEL = "energyItemLevel";

	public List<String> initFItemname() {
		String hql = "select distinct firstItemName from DimenEnergyitem";
		return getHibernateTemplate().find(hql);
	}
	
	protected void initDao() {
		// do nothing
	}

	public void save(DimenEnergyitem transientInstance) {
		log.debug("saving DimenEnergyitem instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DimenEnergyitem persistentInstance) {
		log.debug("deleting DimenEnergyitem instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DimenEnergyitem findById(java.lang.Integer id) {
		log.debug("getting DimenEnergyitem instance with id: " + id);
		try {
			DimenEnergyitem instance = (DimenEnergyitem) getHibernateTemplate()
					.get("com.youhua.bean.satistics.DimenEnergyitem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DimenEnergyitem instance) {
		log.debug("finding DimenEnergyitem instance by example");
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
		log.debug("finding DimenEnergyitem instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DimenEnergyitem as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFirstItemName(Object firstItemName) {
		return findByProperty(FIRST_ITEM_NAME, firstItemName);
	}

	public List findBySecondItemName(Object secondItemName) {
		return findByProperty(SECOND_ITEM_NAME, secondItemName);
	}

	public List findByThirdItemName(Object thirdItemName) {
		return findByProperty(THIRD_ITEM_NAME, thirdItemName);
	}

	public List findByEnergyItemUnit(Object energyItemUnit) {
		return findByProperty(ENERGY_ITEM_UNIT, energyItemUnit);
	}

	public List findByEnergyItemFml(Object energyItemFml) {
		return findByProperty(ENERGY_ITEM_FML, energyItemFml);
	}

	public List findByEnergyItemLevel(Object energyItemLevel) {
		return findByProperty(ENERGY_ITEM_LEVEL, energyItemLevel);
	}

	public List findAll() {
		log.debug("finding all DimenEnergyitem instances");
		try {
			String queryString = "from DimenEnergyitem";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DimenEnergyitem merge(DimenEnergyitem detachedInstance) {
		log.debug("merging DimenEnergyitem instance");
		try {
			DimenEnergyitem result = (DimenEnergyitem) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DimenEnergyitem instance) {
		log.debug("attaching dirty DimenEnergyitem instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DimenEnergyitem instance) {
		log.debug("attaching clean DimenEnergyitem instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DimenEnergyitemDAOImpl getFromApplicationContext(
			ApplicationContext ctx) {
		return (DimenEnergyitemDAOImpl) ctx.getBean("DimenEnergyitemDAO");
	}

}