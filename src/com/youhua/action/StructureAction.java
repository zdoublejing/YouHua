package com.youhua.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import com.youhua.service.StatisticsService;

public class StructureAction extends ActionSupport{
	/**
	 * @author jean
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> structure_fitemtname; //first
	//private List<String> structure_sitemtname; //second
	//private List<String> structure_titemtname; //third
	private List<Date> structure_dates;
	private List<Date> structure_datee;
	
	private String structure_fitemtname_selected;
	//private String structure_sitemtname_selected;
	//private String structure_titemtname_selected;
	private Date structure_dates_selected;
	private Date structure_datee_selected;
	
	private StatisticsService statisticsService;
	
	public String execute() {return SUCCESS;}
	
	public String contrast() throws Exception {
		
		structure_fitemtname = this.statisticsService.initContrasFItemname();
		this.setStructure_fitemtname_selected(structure_fitemtname.get(0));

		
		SimpleDateFormat Formatter = new SimpleDateFormat("yyyy-MM-dd");
		this.setStructure_dates_selected(Formatter.parse("2010-05-01"));
		this.setStructure_datee_selected(Formatter.parse("2010-05-11"));
		
		return NONE;
	}

	public List<String> getStructure_fitemtname() {
		return structure_fitemtname;
	}

	public void setStructure_fitemtname(List<String> structureFitemtname) {
		structure_fitemtname = structureFitemtname;
	}

	public List<Date> getStructure_dates() {
		return structure_dates;
	}

	public void setStructure_dates(List<Date> structureDates) {
		structure_dates = structureDates;
	}

	public List<Date> getStructure_datee() {
		return structure_datee;
	}

	public void setStructure_datee(List<Date> structureDatee) {
		structure_datee = structureDatee;
	}

	public String getStructure_fitemtname_selected() {
		return structure_fitemtname_selected;
	}

	public void setStructure_fitemtname_selected(String structureFitemtnameSelected) {
		structure_fitemtname_selected = structureFitemtnameSelected;
	}

	public Date getStructure_dates_selected() {
		return structure_dates_selected;
	}

	public void setStructure_dates_selected(Date structureDatesSelected) {
		structure_dates_selected = structureDatesSelected;
	}

	public Date getStructure_datee_selected() {
		return structure_datee_selected;
	}

	public void setStructure_datee_selected(Date structureDateeSelected) {
		structure_datee_selected = structureDateeSelected;
	}

	public StatisticsService getStatisticsService() {
		return statisticsService;
	}

	public void setStatisticsService(StatisticsService statisticsService) {
		this.statisticsService = statisticsService;
	}
}