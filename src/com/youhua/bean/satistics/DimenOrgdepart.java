package com.youhua.bean.satistics;

import java.util.HashSet;
import java.util.Set;

/**
 * DimenOrgdepart entity. @author MyEclipse Persistence Tools
 */

public class DimenOrgdepart implements java.io.Serializable {

	// Fields

	private Integer departPk;
	private String departName;
	private String departLevel;
	private String parentDepartName;
	private String orgName;
	private Integer peopleNum;
	private Integer effectNum;
	private Double departArea;
	private Double heatArea;
	private Double coldArea;
	private Integer orgPeopleNum;
	private Integer orgEffectNum;
	private Double orgArea;
	private Double orgHeatArea;
	private Double orgColdArea;
	private Set factEnergies = new HashSet(0);

	// Constructors

	/** default constructor */
	public DimenOrgdepart() {
	}

	/** minimal constructor */
	public DimenOrgdepart(String departName) {
		this.departName = departName;
	}

	/** full constructor */
	public DimenOrgdepart(String departName, String departLevel,
			String parentDepartName, String orgName, Integer peopleNum,
			Integer effectNum, Double departArea, Double heatArea,
			Double coldArea, Integer orgPeopleNum, Integer orgEffectNum,
			Double orgArea, Double orgHeatArea, Double orgColdArea,
			Set factEnergies) {
		this.departName = departName;
		this.departLevel = departLevel;
		this.parentDepartName = parentDepartName;
		this.orgName = orgName;
		this.peopleNum = peopleNum;
		this.effectNum = effectNum;
		this.departArea = departArea;
		this.heatArea = heatArea;
		this.coldArea = coldArea;
		this.orgPeopleNum = orgPeopleNum;
		this.orgEffectNum = orgEffectNum;
		this.orgArea = orgArea;
		this.orgHeatArea = orgHeatArea;
		this.orgColdArea = orgColdArea;
		this.factEnergies = factEnergies;
	}

	// Property accessors

	public Integer getDepartPk() {
		return this.departPk;
	}

	public void setDepartPk(Integer departPk) {
		this.departPk = departPk;
	}

	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getDepartLevel() {
		return this.departLevel;
	}

	public void setDepartLevel(String departLevel) {
		this.departLevel = departLevel;
	}

	public String getParentDepartName() {
		return this.parentDepartName;
	}

	public void setParentDepartName(String parentDepartName) {
		this.parentDepartName = parentDepartName;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Integer getPeopleNum() {
		return this.peopleNum;
	}

	public void setPeopleNum(Integer peopleNum) {
		this.peopleNum = peopleNum;
	}

	public Integer getEffectNum() {
		return this.effectNum;
	}

	public void setEffectNum(Integer effectNum) {
		this.effectNum = effectNum;
	}

	public Double getDepartArea() {
		return this.departArea;
	}

	public void setDepartArea(Double departArea) {
		this.departArea = departArea;
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

	public Integer getOrgPeopleNum() {
		return this.orgPeopleNum;
	}

	public void setOrgPeopleNum(Integer orgPeopleNum) {
		this.orgPeopleNum = orgPeopleNum;
	}

	public Integer getOrgEffectNum() {
		return this.orgEffectNum;
	}

	public void setOrgEffectNum(Integer orgEffectNum) {
		this.orgEffectNum = orgEffectNum;
	}

	public Double getOrgArea() {
		return this.orgArea;
	}

	public void setOrgArea(Double orgArea) {
		this.orgArea = orgArea;
	}

	public Double getOrgHeatArea() {
		return this.orgHeatArea;
	}

	public void setOrgHeatArea(Double orgHeatArea) {
		this.orgHeatArea = orgHeatArea;
	}

	public Double getOrgColdArea() {
		return this.orgColdArea;
	}

	public void setOrgColdArea(Double orgColdArea) {
		this.orgColdArea = orgColdArea;
	}

	public Set getFactEnergies() {
		return this.factEnergies;
	}

	public void setFactEnergies(Set factEnergies) {
		this.factEnergies = factEnergies;
	}

}