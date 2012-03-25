package com.youhua.bean.energyreport;

import java.sql.Timestamp;

/**
 * Orgenergyitemresult entity. @author MyEclipse Persistence Tools
 */

public class Orgenergyitemresult implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long orgEnergyResultId;
	private String orgId;
	private String orgName;
	private String indexName;
	private String meterUnit;
	private String indexCode;
	private Double indexValue;
	private Integer recordYear;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public Orgenergyitemresult() {
	}

	/** minimal constructor */
	public Orgenergyitemresult(String orgId, String orgName, String indexName,
			Integer recordYear) {
		this.orgId = orgId;
		this.orgName = orgName;
		this.indexName = indexName;
		this.recordYear = recordYear;
	}

	/** full constructor */
	public Orgenergyitemresult(String orgId, String orgName, String indexName,
			String meterUnit, String indexCode, Double indexValue,
			Integer recordYear, Timestamp createTime) {
		this.orgId = orgId;
		this.orgName = orgName;
		this.indexName = indexName;
		this.meterUnit = meterUnit;
		this.indexCode = indexCode;
		this.indexValue = indexValue;
		this.recordYear = recordYear;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getOrgEnergyResultId() {
		return this.orgEnergyResultId;
	}

	public void setOrgEnergyResultId(Long orgEnergyResultId) {
		this.orgEnergyResultId = orgEnergyResultId;
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

	public String getIndexCode() {
		return this.indexCode;
	}

	public void setIndexCode(String indexCode) {
		this.indexCode = indexCode;
	}

	public Double getIndexValue() {
		return this.indexValue;
	}

	public void setIndexValue(Double indexValue) {
		this.indexValue = indexValue;
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