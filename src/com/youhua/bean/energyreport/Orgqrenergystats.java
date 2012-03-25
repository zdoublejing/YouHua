package com.youhua.bean.energyreport;

import java.sql.Timestamp;

/**
 * Orgqrenergystats entity. @author MyEclipse Persistence Tools
 */

public class Orgqrenergystats implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long orgEnergyStatsId;
	private String orgId;
	private String departId;
	private String departName;
	private Integer departNum;
	private Double buildArea;
	private Double heatArea;
	private Double coldArea;
	private Integer effectNum;
	private Integer peopleNum;
	private Double elecValue;
	private Double elecCost;
	private Double waterValue;
	private Double waterCost;
	private Double natgasValue;
	private Double natgasCost;
	private Double otherValue;
	private Double otherCost;
	private Integer recordYear;
	private Integer recordQr;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public Orgqrenergystats() {
	}

	/** minimal constructor */
	public Orgqrenergystats(String orgId, String departId, String departName,
			Integer recordYear, Integer recordQr) {
		this.orgId = orgId;
		this.departId = departId;
		this.departName = departName;
		this.recordYear = recordYear;
		this.recordQr = recordQr;
	}

	/** full constructor */
	public Orgqrenergystats(String orgId, String departId, String departName,
			Integer departNum, Double buildArea, Double heatArea,
			Double coldArea, Integer effectNum, Integer peopleNum,
			Double elecValue, Double elecCost, Double waterValue,
			Double waterCost, Double natgasValue, Double natgasCost,
			Double otherValue, Double otherCost, Integer recordYear,
			Integer recordQr, Timestamp createTime) {
		this.orgId = orgId;
		this.departId = departId;
		this.departName = departName;
		this.departNum = departNum;
		this.buildArea = buildArea;
		this.heatArea = heatArea;
		this.coldArea = coldArea;
		this.effectNum = effectNum;
		this.peopleNum = peopleNum;
		this.elecValue = elecValue;
		this.elecCost = elecCost;
		this.waterValue = waterValue;
		this.waterCost = waterCost;
		this.natgasValue = natgasValue;
		this.natgasCost = natgasCost;
		this.otherValue = otherValue;
		this.otherCost = otherCost;
		this.recordYear = recordYear;
		this.recordQr = recordQr;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getOrgEnergyStatsId() {
		return this.orgEnergyStatsId;
	}

	public void setOrgEnergyStatsId(Long orgEnergyStatsId) {
		this.orgEnergyStatsId = orgEnergyStatsId;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getDepartId() {
		return this.departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}

	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public Integer getDepartNum() {
		return this.departNum;
	}

	public void setDepartNum(Integer departNum) {
		this.departNum = departNum;
	}

	public Double getBuildArea() {
		return this.buildArea;
	}

	public void setBuildArea(Double buildArea) {
		this.buildArea = buildArea;
	}

	public Double getHeatArea() {
		return this.heatArea;
	}

	public void setHeatArea(Double heatArea) {
		this.heatArea = heatArea;
	}

	public Double getColdArea() {
		return this.coldArea;
	}

	public void setColdArea(Double coldArea) {
		this.coldArea = coldArea;
	}

	public Integer getEffectNum() {
		return this.effectNum;
	}

	public void setEffectNum(Integer effectNum) {
		this.effectNum = effectNum;
	}

	public Integer getPeopleNum() {
		return this.peopleNum;
	}

	public void setPeopleNum(Integer peopleNum) {
		this.peopleNum = peopleNum;
	}

	public Double getElecValue() {
		return this.elecValue;
	}

	public void setElecValue(Double elecValue) {
		this.elecValue = elecValue;
	}

	public Double getElecCost() {
		return this.elecCost;
	}

	public void setElecCost(Double elecCost) {
		this.elecCost = elecCost;
	}

	public Double getWaterValue() {
		return this.waterValue;
	}

	public void setWaterValue(Double waterValue) {
		this.waterValue = waterValue;
	}

	public Double getWaterCost() {
		return this.waterCost;
	}

	public void setWaterCost(Double waterCost) {
		this.waterCost = waterCost;
	}

	public Double getNatgasValue() {
		return this.natgasValue;
	}

	public void setNatgasValue(Double natgasValue) {
		this.natgasValue = natgasValue;
	}

	public Double getNatgasCost() {
		return this.natgasCost;
	}

	public void setNatgasCost(Double natgasCost) {
		this.natgasCost = natgasCost;
	}

	public Double getOtherValue() {
		return this.otherValue;
	}

	public void setOtherValue(Double otherValue) {
		this.otherValue = otherValue;
	}

	public Double getOtherCost() {
		return this.otherCost;
	}

	public void setOtherCost(Double otherCost) {
		this.otherCost = otherCost;
	}

	public Integer getRecordYear() {
		return this.recordYear;
	}

	public void setRecordYear(Integer recordYear) {
		this.recordYear = recordYear;
	}

	public Integer getRecordQr() {
		return this.recordQr;
	}

	public void setRecordQr(Integer recordQr) {
		this.recordQr = recordQr;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}