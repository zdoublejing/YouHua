package com.youhua.service;

import java.util.List;

import com.youhua.dao.DimenDateDAO;
import com.youhua.dao.DimenEnergyitemDAO;
import com.youhua.dao.DimenOrgdepartDAO;

public class StatisticsService{
	private DimenOrgdepartDAO dimenOrgdepartDao;
	private DimenEnergyitemDAO dimenEnergyitemDao;
	private DimenDateDAO dimenDateDao;

	public List<String> initContrastDepartname(String orgname) {
		return dimenOrgdepartDao.initDepartname(orgname);
	}

	public List<String> initContrasFItemname() {
		return dimenEnergyitemDao.initFItemname();
	}
	
	public List<Integer> initCOntrastYear() {
		return dimenDateDao.initYear();
	}
	
	//DAO getter setter
	public DimenOrgdepartDAO getDimenOrgdepartDao() {
		return dimenOrgdepartDao;
	}
	public void setDimenOrgdepartDao(DimenOrgdepartDAO dimenOrgdepartDao) {
		this.dimenOrgdepartDao = dimenOrgdepartDao;
	}

	public DimenEnergyitemDAO getDimenEnergyitemDao() {
		return dimenEnergyitemDao;
	}

	public void setDimenEnergyitemDao(DimenEnergyitemDAO dimenEnergyitemDao) {
		this.dimenEnergyitemDao = dimenEnergyitemDao;
	}

	public DimenDateDAO getDimenDateDao() {
		return dimenDateDao;
	}

	public void setDimenDateDao(DimenDateDAO dimenDateDao) {
		this.dimenDateDao = dimenDateDao;
	}
	
}