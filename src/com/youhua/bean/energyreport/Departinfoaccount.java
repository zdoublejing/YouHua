package com.youhua.bean.energyreport;

import java.sql.Timestamp;

/**
 * Departinfoaccount entity. @author MyEclipse Persistence Tools
 */

public class Departinfoaccount implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long departInfoAccId;
	private String orgId;
	private String departId;
	private String departName;
	private String indexName;
	private String meterUnit;
	private String collectCode;
	private Double january;
	private Double february;
	private Double march;
	private Double april;
	private Double may;
	private Double june;
	private Double july;
	private Double august;
	private Double september;
	private Double october;
	private Double november;
	private Double december;
	private Integer recordYear;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public Departinfoaccount() {
	}

	/** minimal constructor */
	public Departinfoaccount(String orgId, String departId, String departName,
			String indexName, Integer recordYear) {
		this.orgId = orgId;
		this.departId = departId;
		this.departName = departName;
		this.indexName = indexName;
		this.recordYear = recordYear;
	}

	/** full constructor */
	public Departinfoaccount(String orgId, String departId, String departName,
			String indexName, String meterUnit, String collectCode,
			Double january, Double february, Double march, Double april,
			Double may, Double june, Double july, Double august,
			Double september, Double october, Double november, Double december,
			Integer recordYear, Timestamp createTime) {
		this.orgId = orgId;
		this.departId = departId;
		this.departName = departName;
		this.indexName = indexName;
		this.meterUnit = meterUnit;
		this.collectCode = collectCode;
		this.january = january;
		this.february = february;
		this.march = march;
		this.april = april;
		this.may = may;
		this.june = june;
		this.july = july;
		this.august = august;
		this.september = september;
		this.october = october;
		this.november = november;
		this.december = december;
		this.recordYear = recordYear;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getDepartInfoAccId() {
		return this.departInfoAccId;
	}

	public void setDepartInfoAccId(Long departInfoAccId) {
		this.departInfoAccId = departInfoAccId;
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

	public String getIndexName() {
		return this.indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public String getMeterUnit() {
		return this.meterUnit;
	}

	public void setMeterUnit(String meterUnit) {
		this.meterUnit = meterUnit;
	}

	public String getCollectCode() {
		return this.collectCode;
	}

	public void setCollectCode(String collectCode) {
		this.collectCode = collectCode;
	}

	public Double getJanuary() {
		return this.january;
	}

	public void setJanuary(Double january) {
		this.january = january;
	}

	public Double getFebruary() {
		return this.february;
	}

	public void setFebruary(Double february) {
		this.february = february;
	}

	public Double getMarch() {
		return this.march;
	}

	public void setMarch(Double march) {
		this.march = march;
	}

	public Double getApril() {
		return this.april;
	}

	public void setApril(Double april) {
		this.april = april;
	}

	public Double getMay() {
		return this.may;
	}

	public void setMay(Double may) {
		this.may = may;
	}

	public Double getJune() {
		return this.june;
	}

	public void setJune(Double june) {
		this.june = june;
	}

	public Double getJuly() {
		return this.july;
	}

	public void setJuly(Double july) {
		this.july = july;
	}

	public Double getAugust() {
		return this.august;
	}

	public void setAugust(Double august) {
		this.august = august;
	}

	public Double getSeptember() {
		return this.september;
	}

	public void setSeptember(Double september) {
		this.september = september;
	}

	public Double getOctober() {
		return this.october;
	}

	public void setOctober(Double october) {
		this.october = october;
	}

	public Double getNovember() {
		return this.november;
	}

	public void setNovember(Double november) {
		this.november = november;
	}

	public Double getDecember() {
		return this.december;
	}

	public void setDecember(Double december) {
		this.december = december;
	}

	public Integer getRecordYear() {
		return this.recordYear;
	}

	public void setRecordYear(Integer recordYear) {
		this.recordYear = recordYear;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}