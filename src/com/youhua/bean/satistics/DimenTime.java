package com.youhua.bean.satistics;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

/**
 * DimenTime entity. @author MyEclipse Persistence Tools
 */

public class DimenTime implements java.io.Serializable {

	// Fields

	private Integer timePk;
	private Time startTime;
	private Time endTime;
	private String startTimeFullyDesc;
	private String endTimeFullyDesc;
	private String startHour;
	private String endHour;
	private String startMinute;
	private String endMinute;
	private String startSecond;
	private String endSecond;
	private String amorPm;
	private Set factEnergies = new HashSet(0);

	// Constructors

	/** default constructor */
	public DimenTime() {
	}

	/** minimal constructor */
	public DimenTime(Time startTime, Time endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	/** full constructor */
	public DimenTime(Time startTime, Time endTime, String startTimeFullyDesc,
			String endTimeFullyDesc, String startHour, String endHour,
			String startMinute, String endMinute, String startSecond,
			String endSecond, String amorPm, Set factEnergies) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.startTimeFullyDesc = startTimeFullyDesc;
		this.endTimeFullyDesc = endTimeFullyDesc;
		this.startHour = startHour;
		this.endHour = endHour;
		this.startMinute = startMinute;
		this.endMinute = endMinute;
		this.startSecond = startSecond;
		this.endSecond = endSecond;
		this.amorPm = amorPm;
		this.factEnergies = factEnergies;
	}

	// Property accessors

	public Integer getTimePk() {
		return this.timePk;
	}

	public void setTimePk(Integer timePk) {
		this.timePk = timePk;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getStartTimeFullyDesc() {
		return this.startTimeFullyDesc;
	}

	public void setStartTimeFullyDesc(String startTimeFullyDesc) {
		this.startTimeFullyDesc = startTimeFullyDesc;
	}

	public String getEndTimeFullyDesc() {
		return this.endTimeFullyDesc;
	}

	public void setEndTimeFullyDesc(String endTimeFullyDesc) {
		this.endTimeFullyDesc = endTimeFullyDesc;
	}

	public String getStartHour() {
		return this.startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getEndHour() {
		return this.endHour;
	}

	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}

	public String getStartMinute() {
		return this.startMinute;
	}

	public void setStartMinute(String startMinute) {
		this.startMinute = startMinute;
	}

	public String getEndMinute() {
		return this.endMinute;
	}

	public void setEndMinute(String endMinute) {
		this.endMinute = endMinute;
	}

	public String getStartSecond() {
		return this.startSecond;
	}

	public void setStartSecond(String startSecond) {
		this.startSecond = startSecond;
	}

	public String getEndSecond() {
		return this.endSecond;
	}

	public void setEndSecond(String endSecond) {
		this.endSecond = endSecond;
	}

	public String getAmorPm() {
		return this.amorPm;
	}

	public void setAmorPm(String amorPm) {
		this.amorPm = amorPm;
	}

	public Set getFactEnergies() {
		return this.factEnergies;
	}

	public void setFactEnergies(Set factEnergies) {
		this.factEnergies = factEnergies;
	}

}