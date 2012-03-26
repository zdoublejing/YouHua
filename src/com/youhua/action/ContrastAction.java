package com.youhua.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import com.youhua.service.StatisticsService;

public class ContrastAction extends ActionSupport{
	/**
	 * @author jean
	 * 同期对比获取参数
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> contrast_departname;
	private List<String> contrast_fitemtname; //first
	private List<String> contrast_sitemtname; //second
	private List<String> contrast_titemtname; //third
	private List<Integer> contrast_year;
	private List<Date> contrast_fdates;
	private List<Date> contrast_fdatee;
	private List<Date> contrast_sdates;
	private List<Date> contrast_sdatee;
	
	private String contrast_departname_selected;
	private String contrast_fitemtname_selected;
	private String contrast_sitemtname_selected;
	private String contrast_titemtname_selected;
	private Integer contrast_year_selected;
	private Date contrast_fdates_selected;
	private Date contrast_fdatee_selected;
	private Date contrast_sdates_selected;
	private Date contrast_sdatee_selected;
	
	private StatisticsService statisticsService;
		
	public String getSessionOrgname() {
		HttpServletRequest request = ServletActionContext.getRequest();	
		return request.getSession().getAttribute("orgname").toString();
	}
	
	public String execute() {return SUCCESS;}
	
	public String contrast() throws Exception {
		String orgname = this.getSessionOrgname();
		
		contrast_departname = this.statisticsService.initContrastDepartname(orgname);
		this.setContrast_departname_selected(contrast_departname.get(0));
		
		contrast_fitemtname = this.statisticsService.initContrasFItemname();
		this.setContrast_fitemtname_selected(contrast_fitemtname.get(0));

		contrast_year = this.statisticsService.initCOntrastYear();
		this.setContrast_year_selected(contrast_year.get(0));
		
		SimpleDateFormat Formatter = new SimpleDateFormat("yyyy-MM-dd");
		this.setContrast_fdates_selected(Formatter.parse("2010-05-01"));
		this.setContrast_fdatee_selected(Formatter.parse("2010-05-11"));
		this.setContrast_sdates_selected(Formatter.parse("2012-05-01"));
		this.setContrast_sdatee_selected(Formatter.parse("2012-05-11"));
		
		return NONE;
	}

	public List<String> getContrast_departname() {
		return contrast_departname;
	}
	public void setContrast_departname(List<String> contrastDepartname) {
		contrast_departname = contrastDepartname;
	}
	
	
	public List<String> getContrast_fitemtname() {
		return contrast_fitemtname;
	}
	public void setContrast_fitemtname(List<String> contrastFitemtname) {
		contrast_fitemtname = contrastFitemtname;
	}

	public List<String> getContrast_sitemtname() {
		return contrast_sitemtname;
	}
	public void setContrast_sitemtname(List<String> contrastSitemtname) {
		contrast_sitemtname = contrastSitemtname;
	}

	public List<String> getContrast_titemtname() {
		return contrast_titemtname;
	}
	public void setContrast_titemtname(List<String> contrastTitemtname) {
		contrast_titemtname = contrastTitemtname;
	}
	
	public List<Integer> getContrast_year() {
		return contrast_year;
	}

	public void setContrast_year(List<Integer> contrastYear) {
		contrast_year = contrastYear;
	}

	public List<Date> getContrast_fdates() {
		return contrast_fdates;
	}
	public void setContrast_fdates(List<Date> contrastFdates) {
		contrast_fdates = contrastFdates;
	}

	public List<Date> getContrast_fdatee() {
		return contrast_fdatee;
	}
	public void setContrast_fdatee(List<Date> contrastFdatee) {
		contrast_fdatee = contrastFdatee;
	}

	public List<Date> getContrast_sdates() {
		return contrast_sdates;
	}
	public void setContrast_sdates(List<Date> contrastSdates) {
		contrast_sdates = contrastSdates;
	}

	public List<Date> getContrast_sdatee() {
		return contrast_sdatee;
	}
	public void setContrast_sdatee(List<Date> contrastSdatee) {
		contrast_sdatee = contrastSdatee;
	}

	public String getContrast_departname_selected() {
		return contrast_departname_selected;
	}
	public void setContrast_departname_selected(String contrastDepartnameSelected) {
		contrast_departname_selected = contrastDepartnameSelected;
	}

	public String getContrast_fitemtname_selected() {
		return contrast_fitemtname_selected;
	}
	public void setContrast_fitemtname_selected(String contrastFitemtnameSelected) {
		contrast_fitemtname_selected = contrastFitemtnameSelected;
	}

	public String getContrast_sitemtname_selected() {
		return contrast_sitemtname_selected;
	}
	public void setContrast_sitemtname_selected(String contrastSitemtnameSelected) {
		contrast_sitemtname_selected = contrastSitemtnameSelected;
	}

	public String getContrast_titemtname_selected() {
		return contrast_titemtname_selected;
	}
	public void setContrast_titemtname_selected(String contrastTitemtnameSelected) {
		contrast_titemtname_selected = contrastTitemtnameSelected;
	}

	public Integer getContrast_year_selected() {
		return contrast_year_selected;
	}

	public void setContrast_year_selected(Integer contrastYearSelected) {
		contrast_year_selected = contrastYearSelected;
	}

	public Date getContrast_fdates_selected() {
		return contrast_fdates_selected;
	}
	public void setContrast_fdates_selected(Date contrastFdatesSelected) {
		contrast_fdates_selected = contrastFdatesSelected;
	}

	public Date getContrast_fdatee_selected() {
		return contrast_fdatee_selected;
	}
	public void setContrast_fdatee_selected(Date contrastFdateeSelected) {
		contrast_fdatee_selected = contrastFdateeSelected;
	}

	public Date getContrast_sdates_selected() {
		return contrast_sdates_selected;
	}
	public void setContrast_sdates_selected(Date contrastSdatesSelected) {
		contrast_sdates_selected = contrastSdatesSelected;
	}

	public Date getContrast_sdatee_selected() {
		return contrast_sdatee_selected;
	}
	public void setContrast_sdatee_selected(Date contrastSdateeSelected) {
		contrast_sdatee_selected = contrastSdateeSelected;
	}

	public StatisticsService getStatisticsService() {
		return statisticsService;
	}
	public void setStatisticsService(StatisticsService statisticsService) {
		this.statisticsService = statisticsService;
	}
	
}