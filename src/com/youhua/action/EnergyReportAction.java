package com.youhua.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.youhua.service.ReportService;
 
public class EnergyReportAction extends ActionSupport{
 
	/**
	 * @author jean
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Integer> orgbaseinfo_recordyear;
	private Integer orgbaseinfo_recordyear_selected;
	
	private List<Integer> orginfoaccount_recordyear;
	private Integer orginfoaccount_recordyear_selected;
	
	private List<Integer> orgenergyitemresult_recordyear;
	private Integer orgenergyitemresult_recordyear_selected;
	
	private List<Integer> orgenergyaccount_recordyear;
	private Integer orgenergyaccount_recordyear_selected;
	
	private List<Integer> depinfoaccount_recordyear;
	private Integer depinfoaccount_recordyear_selected;
	private List<String> depinfoaccount_departid;
	private String depinfoaccount_departid_selected;
	
	private List<Integer> orgqrenergystats_recordyear;
	private Integer orgqrenergystats_recordyear_selected;
	private Integer orgqrenergystats_quarter_selected;
	
	private List<Integer> depenergyaccount_recordyear;
	private List<String> depenergyaccount_departid;
	private Integer depenergyaccount_recordyear_selected;
	private String depenergyaccount_departid_selected;
	
	private ReportService reportService;

	public String getSessionOrgid() {
		HttpServletRequest request = ServletActionContext.getRequest();	
		return request.getSession().getAttribute("orgid").toString();
	}
	
	public String execute() {return SUCCESS;}
 
	public String orgbaseinfo() throws Exception {
		//System.out.println("you get " + orgid);
		orgbaseinfo_recordyear = this.reportService.initOrgbaseinfoParam(this.getSessionOrgid());
		//System.out.println("you get" + temp.get(0));
		this.setOrgbaseinfo_recordyear_selected(orgbaseinfo_recordyear.get(0));
		return NONE;
	}
	
/*	public Integer getOrgbaseinfo_recordyear_default() { //这里不需要私有成员都可以将值传人s:select,非常神奇。。。get+大写Abc--〉小写abc	
		return this.reportService.initOrgbaseinfoParam(this.getSessionOrgid()).get(0);
	}*/
	
	public String orginfoaccount() throws Exception {
		orginfoaccount_recordyear = this.reportService.initOrginfoaccountParam(this.getSessionOrgid());
		this.setOrginfoaccount_recordyear_selected(orginfoaccount_recordyear.get(0));	
		return NONE;
	}
	
	public String orgenergyitemresult() throws Exception {
		orgenergyitemresult_recordyear = this.reportService.initOrgenergyitemresultParam(this.getSessionOrgid());
		this.setOrgenergyitemresult_recordyear_selected(orgenergyitemresult_recordyear.get(0));	
		return NONE;
	}
	
	public String orgenergyaccount() throws Exception {
		orgenergyaccount_recordyear = this.reportService.initOrgenergyaccountParam(this.getSessionOrgid());
		this.setOrgenergyaccount_recordyear_selected(orgenergyaccount_recordyear.get(0));	
		return NONE;
	}
	
	public String depinfoaccount() throws Exception {
		depinfoaccount_recordyear = this.reportService.initDepinfoaccountRecordyear(this.getSessionOrgid());
		this.setDepinfoaccount_recordyear_selected(depinfoaccount_recordyear.get(0));	
		depinfoaccount_departid = this.reportService.initDepinfoaccountDepartid(this.getSessionOrgid());
		this.setDepinfoaccount_departid_selected(depinfoaccount_departid.get(0));	
		return NONE;
	}
	
	public String orgqrenergystats() throws Exception {
		orgqrenergystats_recordyear = this.reportService.initOrgqrenergystatsRecordyear(this.getSessionOrgid());
		this.setOrgqrenergystats_recordyear_selected(orgqrenergystats_recordyear.get(0));
		this.setOrgqrenergystats_quarter_selected(1);
		return NONE;
	}
	
	public String depenergyaccount() throws Exception {
		depenergyaccount_recordyear = this.reportService.initDepenergyaccountRecordyear(this.getSessionOrgid());
		this.setDepenergyaccount_recordyear_selected(depenergyaccount_recordyear.get(0));
		depenergyaccount_departid = this.reportService.initDepenergyaccountDepartid(this.getSessionOrgid());
		this.setDepenergyaccount_departid_selected(depenergyaccount_departid.get(1));
		return NONE;
	}	
	
	/*------------------Getter and Setter-----------------------------*/
	public List<Integer> getOrgbaseinfo_recordyear() {
		return orgbaseinfo_recordyear;
	}
	public void setOrgbaseinfo_recordyear(List<Integer> orgBaseInfoRecordyear) {
		orgbaseinfo_recordyear = orgBaseInfoRecordyear;
	}

	public List<Integer> getOrginfoaccount_recordyear() {
		return orginfoaccount_recordyear;
	}
	public void setOrginfoaccount_recordyear(List<Integer> orginfoaccountRecordyear) {
		orginfoaccount_recordyear = orginfoaccountRecordyear;
	}

	public List<Integer> getOrgenergyitemresult_recordyear() {
		return orgenergyitemresult_recordyear;
	}
	public void setOrgenergyitemresult_recordyear(
			List<Integer> orgenergyitemresultRecordyear) {
		orgenergyitemresult_recordyear = orgenergyitemresultRecordyear;
	}

	public List<Integer> getOrgenergyaccount_recordyear() {
		return orgenergyaccount_recordyear;
	}
	public void setOrgenergyaccount_recordyear(
			List<Integer> orgenergyaccountRecordyear) {
		orgenergyaccount_recordyear = orgenergyaccountRecordyear;
	}

	public List<Integer> getDepinfoaccount_recordyear() {
		return depinfoaccount_recordyear;
	}
	public void setDepinfoaccount_recordyear(List<Integer> depinfoaccountRecordyear) {
		depinfoaccount_recordyear = depinfoaccountRecordyear;
	}

	public String getDepinfoaccount_departid_selected() {
		return depinfoaccount_departid_selected;
	}

	public void setDepinfoaccount_departid_selected(
			String depinfoaccountDepartidSelected) {
		depinfoaccount_departid_selected = depinfoaccountDepartidSelected;
	}

	public List<Integer> getOrgqrenergystats_recordyear() {
		return orgqrenergystats_recordyear;
	}
	public void setOrgqrenergystats_recordyear(
			List<Integer> orgqrenergystatsRecordyear) {
		orgqrenergystats_recordyear = orgqrenergystatsRecordyear;
	}
	
	public List<Integer> getDepenergyaccount_recordyear() {
		return depenergyaccount_recordyear;
	}
	public void setDepenergyaccount_recordyear(
			List<Integer> depenergyaccountRecordyear) {
		depenergyaccount_recordyear = depenergyaccountRecordyear;
	}

	public List<String> getDepenergyaccount_departid() {
		return depenergyaccount_departid;
	}
	public void setDepenergyaccount_departid(List<String> depenergyaccountDepartid) {
		depenergyaccount_departid = depenergyaccountDepartid;
	}

	public Integer getOrgbaseinfo_recordyear_selected() {
		return orgbaseinfo_recordyear_selected;
	}
	public void setOrgbaseinfo_recordyear_selected(Integer orgbaseinfoRecordyearSelected) {
		orgbaseinfo_recordyear_selected = orgbaseinfoRecordyearSelected;
	}
	
	public Integer getOrginfoaccount_recordyear_selected() {
		return orginfoaccount_recordyear_selected;
	}
	public void setOrginfoaccount_recordyear_selected(
			Integer orginfoaccountRecordyearSelected) {
		orginfoaccount_recordyear_selected = orginfoaccountRecordyearSelected;
	}

	public Integer getOrgenergyitemresult_recordyear_selected() {
		return orgenergyitemresult_recordyear_selected;
	}
	public void setOrgenergyitemresult_recordyear_selected(
			Integer orgenergyitemresultRecordyearSelected) {
		orgenergyitemresult_recordyear_selected = orgenergyitemresultRecordyearSelected;
	}

	public Integer getOrgenergyaccount_recordyear_selected() {
		return orgenergyaccount_recordyear_selected;
	}
	public void setOrgenergyaccount_recordyear_selected(
			Integer orgenergyaccountRecordyearSelected) {
		orgenergyaccount_recordyear_selected = orgenergyaccountRecordyearSelected;
	}

	public Integer getDepinfoaccount_recordyear_selected() {
		return depinfoaccount_recordyear_selected;
	}
	public void setDepinfoaccount_recordyear_selected(
			Integer depinfoaccountRecordyearSelected) {
		depinfoaccount_recordyear_selected = depinfoaccountRecordyearSelected;
	}

	public Integer getOrgqrenergystats_recordyear_selected() {
		return orgqrenergystats_recordyear_selected;
	}
	public void setOrgqrenergystats_recordyear_selected(
			Integer orgqrenergystatsRecordyearSelected) {
		orgqrenergystats_recordyear_selected = orgqrenergystatsRecordyearSelected;
	}

	public Integer getDepenergyaccount_recordyear_selected() {
		return depenergyaccount_recordyear_selected;
	}
	public void setDepenergyaccount_recordyear_selected(
			Integer depenergyaccountRecordyearSelected) {
		depenergyaccount_recordyear_selected = depenergyaccountRecordyearSelected;
	}

	public String getDepenergyaccount_departid_selected() {
		return depenergyaccount_departid_selected;
	}
	public void setDepenergyaccount_departid_selected(
			String depenergyaccountDepartidSelected) {
		depenergyaccount_departid_selected = depenergyaccountDepartidSelected;
	}

	public Integer getOrgqrenergystats_quarter_selected() {
		return orgqrenergystats_quarter_selected;
	}
	public void setOrgqrenergystats_quarter_selected(
			Integer orgqrenergystatsQuarterSelected) {
		orgqrenergystats_quarter_selected = orgqrenergystatsQuarterSelected;
	}

	public List<String> getDepinfoaccount_departid() {
		return depinfoaccount_departid;
	}

	public void setDepinfoaccount_departid(List<String> depinfoaccountDepartid) {
		depinfoaccount_departid = depinfoaccountDepartid;
	}

	public ReportService getReportService() {
		return reportService;
	}
	public void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}

}