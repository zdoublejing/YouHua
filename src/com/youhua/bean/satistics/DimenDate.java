package com.youhua.bean.satistics;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DimenDate entity. @author MyEclipse Persistence Tools
 */

public class DimenDate implements java.io.Serializable {

	// Fields

	private Integer datePk;
	private Date date;
	private String dateFullyDesc;
	private String dateYear;
	private String dateHalfYear;
	private String dateQuarter;
	private String dateMonth;
	private Integer dateDay;
	private String dateWeek;
	private Set factEnergies = new HashSet(0);

	// Constructors

	/** default constructor */
	public DimenDate() {
	}

	/** minimal constructor */
	public DimenDate(Date date) {
		this.date = date;
	}

	/** full constructor */
	public DimenDate(Date date, String dateFullyDesc, String dateYear,
			String dateHalfYear, String dateQuarter, String dateMonth,
			Integer dateDay, String dateWeek, Set factEnergies) {
		this.date = date;
		this.dateFullyDesc = dateFullyDesc;
		this.dateYear = dateYear;
		this.dateHalfYear = dateHalfYear;
		this.dateQuarter = dateQuarter;
		this.dateMonth = dateMonth;
		this.dateDay = dateDay;
		this.dateWeek = dateWeek;
		this.factEnergies = factEnergies;
	}

	// Property accessors

	public Integer getDatePk() {
		return this.datePk;
	}

	public void setDatePk(Integer datePk) {
		this.datePk = datePk;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDateFullyDesc() {
		return this.dateFullyDesc;
	}

	public void setDateFullyDesc(String dateFullyDesc) {
		this.dateFullyDesc = dateFullyDesc;
	}

	public String getDateYear() {
		return this.dateYear;
	}

	public void setDateYear(String dateYear) {
		this.dateYear = dateYear;
	}

	public String getDateHalfYear() {
		return this.dateHalfYear;
	}

	public void setDateHalfYear(String dateHalfYear) {
		this.dateHalfYear = dateHalfYear;
	}

	public String getDateQuarter() {
		return this.dateQuarter;
	}

	public void setDateQuarter(String dateQuarter) {
		this.dateQuarter = dateQuarter;
	}

	public String getDateMonth() {
		return this.dateMonth;
	}

	public void setDateMonth(String dateMonth) {
		this.dateMonth = dateMonth;
	}

	public Integer getDateDay() {
		return this.dateDay;
	}

	public void setDateDay(Integer dateDay) {
		this.dateDay = dateDay;
	}

	public String getDateWeek() {
		return this.dateWeek;
	}

	public void setDateWeek(String dateWeek) {
		this.dateWeek = dateWeek;
	}

	public Set getFactEnergies() {
		return this.factEnergies;
	}

	public void setFactEnergies(Set factEnergies) {
		this.factEnergies = factEnergies;
	}

}