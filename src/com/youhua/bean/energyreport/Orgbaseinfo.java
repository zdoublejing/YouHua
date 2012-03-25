package com.youhua.bean.energyreport;

import java.sql.Timestamp;

/**
 * Orgbaseinfo entity. @author MyEclipse Persistence Tools
 */

public class Orgbaseinfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long orgInfoId;
	private String orgId;
	private String indexCode;
	private String indexName;
	private String meterUnit;
	private String indexValue;
	private Integer recordYear;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public Orgbaseinfo() {
	}

	/** minimal constructor */
	public Orgbaseinfo(String orgId, String indexCode, String indexName,
			Integer recordYear) {
		this.orgId = orgId;
		this.indexCode = indexCode;
		this.indexName = indexName;
		this.recordYear = recordYear;
	}

	/** full constructor */
	public Orgbaseinfo(String orgId, String indexCode, String indexName,
			String meterUnit, String indexValue, Integer recordYear,
			Timestamp createTime) {
		this.orgId = orgId;
		this.indexCode = indexCode;
		this.indexName = indexName;
		this.meterUnit = meterUnit;
		this.indexValue = indexValue;
		this.recordYear = recordYear;
		this.createTime = createTime;
	}

	// Property accessors

	public Long getOrgInfoId() {
		return this.orgInfoId;
	}

	public void setOrgInfoId(Long orgInfoId) {
		this.orgInfoId = orgInfoId;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getIndexCode() {
		return this.indexCode;
	}

	public void setIndexCode(String indexCode) {
		this.indexCode = indexCode;
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

	public String getIndexValue() {
		return this.indexValue;
	}

	public void setIndexValue(String indexValue) {
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