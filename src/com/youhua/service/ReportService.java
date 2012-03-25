package com.youhua.service;

import java.util.List;

import com.youhua.dao.DepartenergyaccountDAO;
import com.youhua.dao.DepartinfoaccountDAO;
import com.youhua.dao.OrgbaseinfoDAO;
import com.youhua.dao.OrgenergyaccountDAO;
import com.youhua.dao.OrgenergyitemresultDAO;
import com.youhua.dao.OrginfoaccountDAO;
import com.youhua.dao.OrgqrenergystatsDAO;

public class ReportService{
	private OrgbaseinfoDAO orgbaseinfoDao;
	private OrginfoaccountDAO orginfoaccountDao;
	private OrgenergyitemresultDAO orgenergyitemresultDao;
	private OrgenergyaccountDAO orgenergyaccountDao;
	private DepartinfoaccountDAO depinfoaccountDao;
	private OrgqrenergystatsDAO orgqrenergystatsDao;
	private DepartenergyaccountDAO depenergyaccountDao;
	
	public List<Integer> initOrgbaseinfoParam(String orgid){
		return orgbaseinfoDao.initParam(orgid);
	}
	
	public List<Integer> initOrginfoaccountParam(String orgid){
		return orginfoaccountDao.initParam(orgid);
	}
	
	public List<Integer> initOrgenergyitemresultParam(String orgid){
		//System.out.println("service start");
		return orgenergyitemresultDao.initParam(orgid);
	}

	public List<Integer> initOrgenergyaccountParam(String orgid) {
		return orgenergyaccountDao.initParam(orgid);
	}

	public List<Integer> initDepinfoaccountRecordyear(String orgid) {
		return depinfoaccountDao.initRecordyear(orgid);
	}
	public List<String> initDepinfoaccountDepartid(String orgid) {
		return depinfoaccountDao.initDepartid(orgid);
	}

	public List<Integer> initOrgqrenergystatsRecordyear(String orgid) {
		return orgqrenergystatsDao.initParam(orgid);
	}

	public List<Integer> initDepenergyaccountRecordyear(String orgid) {
		return depenergyaccountDao.initRecordyear(orgid);
	}
	public List<String> initDepenergyaccountDepartid(String orgid) {
		return depenergyaccountDao.initDepartid(orgid);
	}
	
	/*---------------Getter and Setter------------------------------*/
	public OrgbaseinfoDAO getOrgbaseinfoDao() {
		return orgbaseinfoDao;
	}
	public void setOrgbaseinfoDao(OrgbaseinfoDAO orgbaseinfoDao) {
		this.orgbaseinfoDao = orgbaseinfoDao;
	}

	public OrginfoaccountDAO getOrginfoaccountDao() {
		return orginfoaccountDao;
	}
	public void setOrginfoaccountDao(OrginfoaccountDAO orginfoaccountDao) {
		this.orginfoaccountDao = orginfoaccountDao;
	}

	public OrgenergyitemresultDAO getOrgenergyitemresultDao() {
		return orgenergyitemresultDao;
	}
	public void setOrgenergyitemresultDao(
			OrgenergyitemresultDAO orgenergyitemresultDao) {
		this.orgenergyitemresultDao = orgenergyitemresultDao;
	}

	
	public OrgenergyaccountDAO getOrgenergyaccountDao() {
		return orgenergyaccountDao;
	}

	public void setOrgenergyaccountDao(OrgenergyaccountDAO orgenergyaccountDao) {
		this.orgenergyaccountDao = orgenergyaccountDao;
	}
	

	public DepartinfoaccountDAO getDepinfoaccountDao() {
		return depinfoaccountDao;
	}

	public void setDepinfoaccountDao(DepartinfoaccountDAO depinfoaccountDao) {
		this.depinfoaccountDao = depinfoaccountDao;
	}
	

	public OrgqrenergystatsDAO getOrgqrenergystatsDao() {
		return orgqrenergystatsDao;
	}

	public void setOrgqrenergystatsDao(OrgqrenergystatsDAO orgqrenergystatsDao) {
		this.orgqrenergystatsDao = orgqrenergystatsDao;
	}

	
	public DepartenergyaccountDAO getDepenergyaccountDao() {
		return depenergyaccountDao;
	}

	public void setDepenergyaccountDao(DepartenergyaccountDAO depenergyaccountDao) {
		this.depenergyaccountDao = depenergyaccountDao;
	}

}