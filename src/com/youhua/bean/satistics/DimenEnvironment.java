package com.youhua.bean.satistics;

import java.util.HashSet;
import java.util.Set;

/**
 * DimenEnvironment entity. @author MyEclipse Persistence Tools
 */

public class DimenEnvironment implements java.io.Serializable {

	// Fields

	private Integer environmentPk;
	private String tempretureDesc;
	private String humidityDesc;
	private String airQuality;
	private Set factEnergies = new HashSet(0);

	// Constructors

	/** default constructor */
	public DimenEnvironment() {
	}

	/** full constructor */
	public DimenEnvironment(String tempretureDesc, String humidityDesc,
			String airQuality, Set factEnergies) {
		this.tempretureDesc = tempretureDesc;
		this.humidityDesc = humidityDesc;
		this.airQuality = airQuality;
		this.factEnergies = factEnergies;
	}

	// Property accessors

	public Integer getEnvironmentPk() {
		return this.environmentPk;
	}

	public void setEnvironmentPk(Integer environmentPk) {
		this.environmentPk = environmentPk;
	}

	public String getTempretureDesc() {
		return this.tempretureDesc;
	}

	public void setTempretureDesc(String tempretureDesc) {
		this.tempretureDesc = tempretureDesc;
	}

	public String getHumidityDesc() {
		return this.humidityDesc;
	}

	public void setHumidityDesc(String humidityDesc) {
		this.humidityDesc = humidityDesc;
	}

	public String getAirQuality() {
		return this.airQuality;
	}

	public void setAirQuality(String airQuality) {
		this.airQuality = airQuality;
	}

	public Set getFactEnergies() {
		return this.factEnergies;
	}

	public void setFactEnergies(Set factEnergies) {
		this.factEnergies = factEnergies;
	}

}