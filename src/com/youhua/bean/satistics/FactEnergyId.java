package com.youhua.bean.satistics;

/**
 * FactEnergyId entity. @author MyEclipse Persistence Tools
 */

public class FactEnergyId implements java.io.Serializable {

	// Fields

	private DimenEnergyitem dimenEnergyitem;
	private DimenTime dimenTime;
	private DimenOrgdepart dimenOrgdepart;
	private DimenDate dimenDate;
	private DimenEnvironment dimenEnvironment;
	private DimenGposition dimenGposition;
	private Double energyValue;
	private Double equValue;
	private Double standardValue;
	private Double benchMarkValue;

	// Constructors

	/** default constructor */
	public FactEnergyId() {
	}

	/** minimal constructor */
	public FactEnergyId(Double energyValue) {
		this.energyValue = energyValue;
	}

	/** full constructor */
	public FactEnergyId(DimenEnergyitem dimenEnergyitem, DimenTime dimenTime,
			DimenOrgdepart dimenOrgdepart, DimenDate dimenDate,
			DimenEnvironment dimenEnvironment, DimenGposition dimenGposition,
			Double energyValue, Double equValue, Double standardValue,
			Double benchMarkValue) {
		this.dimenEnergyitem = dimenEnergyitem;
		this.dimenTime = dimenTime;
		this.dimenOrgdepart = dimenOrgdepart;
		this.dimenDate = dimenDate;
		this.dimenEnvironment = dimenEnvironment;
		this.dimenGposition = dimenGposition;
		this.energyValue = energyValue;
		this.equValue = equValue;
		this.standardValue = standardValue;
		this.benchMarkValue = benchMarkValue;
	}

	// Property accessors

	public DimenEnergyitem getDimenEnergyitem() {
		return this.dimenEnergyitem;
	}

	public void setDimenEnergyitem(DimenEnergyitem dimenEnergyitem) {
		this.dimenEnergyitem = dimenEnergyitem;
	}

	public DimenTime getDimenTime() {
		return this.dimenTime;
	}

	public void setDimenTime(DimenTime dimenTime) {
		this.dimenTime = dimenTime;
	}

	public DimenOrgdepart getDimenOrgdepart() {
		return this.dimenOrgdepart;
	}

	public void setDimenOrgdepart(DimenOrgdepart dimenOrgdepart) {
		this.dimenOrgdepart = dimenOrgdepart;
	}

	public DimenDate getDimenDate() {
		return this.dimenDate;
	}

	public void setDimenDate(DimenDate dimenDate) {
		this.dimenDate = dimenDate;
	}

	public DimenEnvironment getDimenEnvironment() {
		return this.dimenEnvironment;
	}

	public void setDimenEnvironment(DimenEnvironment dimenEnvironment) {
		this.dimenEnvironment = dimenEnvironment;
	}

	public DimenGposition getDimenGposition() {
		return this.dimenGposition;
	}

	public void setDimenGposition(DimenGposition dimenGposition) {
		this.dimenGposition = dimenGposition;
	}

	public Double getEnergyValue() {
		return this.energyValue;
	}

	public void setEnergyValue(Double energyValue) {
		this.energyValue = energyValue;
	}

	public Double getEquValue() {
		return this.equValue;
	}

	public void setEquValue(Double equValue) {
		this.equValue = equValue;
	}

	public Double getStandardValue() {
		return this.standardValue;
	}

	public void setStandardValue(Double standardValue) {
		this.standardValue = standardValue;
	}

	public Double getBenchMarkValue() {
		return this.benchMarkValue;
	}

	public void setBenchMarkValue(Double benchMarkValue) {
		this.benchMarkValue = benchMarkValue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FactEnergyId))
			return false;
		FactEnergyId castOther = (FactEnergyId) other;

		return ((this.getDimenEnergyitem() == castOther.getDimenEnergyitem()) || (this
				.getDimenEnergyitem() != null
				&& castOther.getDimenEnergyitem() != null && this
				.getDimenEnergyitem().equals(castOther.getDimenEnergyitem())))
				&& ((this.getDimenTime() == castOther.getDimenTime()) || (this
						.getDimenTime() != null
						&& castOther.getDimenTime() != null && this
						.getDimenTime().equals(castOther.getDimenTime())))
				&& ((this.getDimenOrgdepart() == castOther.getDimenOrgdepart()) || (this
						.getDimenOrgdepart() != null
						&& castOther.getDimenOrgdepart() != null && this
						.getDimenOrgdepart().equals(
								castOther.getDimenOrgdepart())))
				&& ((this.getDimenDate() == castOther.getDimenDate()) || (this
						.getDimenDate() != null
						&& castOther.getDimenDate() != null && this
						.getDimenDate().equals(castOther.getDimenDate())))
				&& ((this.getDimenEnvironment() == castOther
						.getDimenEnvironment()) || (this.getDimenEnvironment() != null
						&& castOther.getDimenEnvironment() != null && this
						.getDimenEnvironment().equals(
								castOther.getDimenEnvironment())))
				&& ((this.getDimenGposition() == castOther.getDimenGposition()) || (this
						.getDimenGposition() != null
						&& castOther.getDimenGposition() != null && this
						.getDimenGposition().equals(
								castOther.getDimenGposition())))
				&& ((this.getEnergyValue() == castOther.getEnergyValue()) || (this
						.getEnergyValue() != null
						&& castOther.getEnergyValue() != null && this
						.getEnergyValue().equals(castOther.getEnergyValue())))
				&& ((this.getEquValue() == castOther.getEquValue()) || (this
						.getEquValue() != null
						&& castOther.getEquValue() != null && this
						.getEquValue().equals(castOther.getEquValue())))
				&& ((this.getStandardValue() == castOther.getStandardValue()) || (this
						.getStandardValue() != null
						&& castOther.getStandardValue() != null && this
						.getStandardValue()
						.equals(castOther.getStandardValue())))
				&& ((this.getBenchMarkValue() == castOther.getBenchMarkValue()) || (this
						.getBenchMarkValue() != null
						&& castOther.getBenchMarkValue() != null && this
						.getBenchMarkValue().equals(
								castOther.getBenchMarkValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDimenEnergyitem() == null ? 0 : this.getDimenEnergyitem()
						.hashCode());
		result = 37 * result
				+ (getDimenTime() == null ? 0 : this.getDimenTime().hashCode());
		result = 37
				* result
				+ (getDimenOrgdepart() == null ? 0 : this.getDimenOrgdepart()
						.hashCode());
		result = 37 * result
				+ (getDimenDate() == null ? 0 : this.getDimenDate().hashCode());
		result = 37
				* result
				+ (getDimenEnvironment() == null ? 0 : this
						.getDimenEnvironment().hashCode());
		result = 37
				* result
				+ (getDimenGposition() == null ? 0 : this.getDimenGposition()
						.hashCode());
		result = 37
				* result
				+ (getEnergyValue() == null ? 0 : this.getEnergyValue()
						.hashCode());
		result = 37 * result
				+ (getEquValue() == null ? 0 : this.getEquValue().hashCode());
		result = 37
				* result
				+ (getStandardValue() == null ? 0 : this.getStandardValue()
						.hashCode());
		result = 37
				* result
				+ (getBenchMarkValue() == null ? 0 : this.getBenchMarkValue()
						.hashCode());
		return result;
	}

}