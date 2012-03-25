package com.youhua.bean.satistics;

import java.util.HashSet;
import java.util.Set;

/**
 * DimenGposition entity. @author MyEclipse Persistence Tools
 */

public class DimenGposition implements java.io.Serializable {

	// Fields

	private Integer gpositionPk;
	private Double longitude;
	private Double latitude;
	private Double altitude;
	private String region;
	private String province;
	private String city;
	private String district;
	private String county;
	private String village;
	private String town;
	private Set factEnergies = new HashSet(0);

	// Constructors

	/** default constructor */
	public DimenGposition() {
	}

	/** full constructor */
	public DimenGposition(Double longitude, Double latitude, Double altitude,
			String region, String province, String city, String district,
			String county, String village, String town, Set factEnergies) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.region = region;
		this.province = province;
		this.city = city;
		this.district = district;
		this.county = county;
		this.village = village;
		this.town = town;
		this.factEnergies = factEnergies;
	}

	// Property accessors

	public Integer getGpositionPk() {
		return this.gpositionPk;
	}

	public void setGpositionPk(Integer gpositionPk) {
		this.gpositionPk = gpositionPk;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getAltitude() {
		return this.altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getVillage() {
		return this.village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Set getFactEnergies() {
		return this.factEnergies;
	}

	public void setFactEnergies(Set factEnergies) {
		this.factEnergies = factEnergies;
	}

}