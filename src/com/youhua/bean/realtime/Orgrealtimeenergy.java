package com.youhua.bean.realtime;

import java.sql.Timestamp;

/**
 * Orgrealtimeenergy entity. @author MyEclipse Persistence Tools
 */

public class Orgrealtimeenergy implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer orgRtenergyId;
	private String orgId;
	private String orgName;
	private String energyItemCode;
	private String energyItemName;
	private Double energyValue;
	private Double energySetValue;
	private Double energyBenchValue;
	private Double energyStdValue;
	private Timestamp createTime;
	private String realTimeLevel;
	private String energyItemUnit;

	// Constructors

	/** default constructor */
	public Orgrealtimeenergy() {
	}

	/** minimal constructor */
	public Orgrealtimeenergy(String orgId, String orgName,
			String energyItemCode, String energyItemName, Double energyValue) {
		this.orgId = orgId;
		this.orgName = orgName;
		this.energyItemCode = energyItemCode;
		this.energyItemName = energyItemName;
		this.energyValue = energyValue;
	}

	/** full constructor */
	public Orgrealtimeenergy(String orgId, String orgName,
			String energyItemCode, String energyItemName, Double energyValue,
			Double energySetValue, Double energyBenchValue,
			Double energyStdValue, Timestamp createTime, String realTimeLevel,
			String energyItemUnit) {
		this.orgId = orgId;
		this.orgName = orgName;
		this.energyItemCode = energyItemCode;
		this.energyItemName = energyItemName;
		this.energyValue = energyValue;
		this.energySetValue = energySetValue;
		this.energyBenchValue = energyBenchValue;
		this.energyStdValue = energyStdValue;
		this.createTime = createTime;
		this.realTimeLevel = realTimeLevel;
		this.energyItemUnit = energyItemUnit;
	}

	// Property accessors

	public Integer getOrgRtenergyId() {
		return this.orgRtenergyId;
	}

	public void setOrgRtenergyId(Integer orgRtenergyId) {
		this.orgRtenergyId = orgRtenergyId;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getEnergyItemCode() {
		return this.energyItemCode;
	}

	public void setEnergyItemCode(String energyItemCode) {
		this.energyItemCode = energyItemCode;
	}

	public String getEnergyItemName() {
		return this.energyItemName;
	}

	public void setEnergyItemName(String energyItemName) {
		this.energyItemName = energyItemName;
	}

	public Double getEnergyValue() {
		return this.energyValue;
	}

	public void setEnergyValue(Double energyValue) {
		this.energyValue = energyValue;
	}

	public Double getEnergySetValue() {
		return this.energySetValue;
	}

	public void setEnergySetValue(Double energySetValue) {
		this.energySetValue = energySetValue;
	}

	public Double getEnergyBenchValue() {
		return this.energyBenchValue;
	}

	public void setEnergyBenchValue(Double energyBenchValue) {
		this.energyBenchValue = energyBenchValue;
	}

	public Double getEnergyStdValue() {
		return this.energyStdValue;
	}

	public void setEnergyStdValue(Double energyStdValue) {
		this.energyStdValue = energyStdValue;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getRealTimeLevel() {
		return this.realTimeLevel;
	}

	public void setRealTimeLevel(String realTimeLevel) {
		this.realTimeLevel = realTimeLevel;
	}

	public String getEnergyItemUnit() {
		return this.energyItemUnit;
	}

	public void setEnergyItemUnit(String energyItemUnit) {
		this.energyItemUnit = energyItemUnit;
	}

}