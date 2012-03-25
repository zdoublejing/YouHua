package com.youhua.bean.satistics;

/**
 * FactEnergy entity. @author MyEclipse Persistence Tools
 */

public class FactEnergy implements java.io.Serializable {

	// Fields

	private FactEnergyId id;
	private DimenOrgdepart dimenOrgdepart;
	private DimenGposition dimenGposition;
	private DimenEnvironment dimenEnvironment;
	private DimenTime dimenTime;
	private DimenEnergyitem dimenEnergyitem;
	private DimenDate dimenDate;

	// Constructors

	/** default constructor */
	public FactEnergy() {
	}

	/** minimal constructor */
	public FactEnergy(FactEnergyId id) {
		this.id = id;
	}

	/** full constructor */
	public FactEnergy(FactEnergyId id, DimenOrgdepart dimenOrgdepart,
			DimenGposition dimenGposition, DimenEnvironment dimenEnvironment,
			DimenTime dimenTime, DimenEnergyitem dimenEnergyitem,
			DimenDate dimenDate) {
		this.id = id;
		this.dimenOrgdepart = dimenOrgdepart;
		this.dimenGposition = dimenGposition;
		this.dimenEnvironment = dimenEnvironment;
		this.dimenTime = dimenTime;
		this.dimenEnergyitem = dimenEnergyitem;
		this.dimenDate = dimenDate;
	}

	// Property accessors

	public FactEnergyId getId() {
		return this.id;
	}

	public void setId(FactEnergyId id) {
		this.id = id;
	}

	public DimenOrgdepart getDimenOrgdepart() {
		return this.dimenOrgdepart;
	}

	public void setDimenOrgdepart(DimenOrgdepart dimenOrgdepart) {
		this.dimenOrgdepart = dimenOrgdepart;
	}

	public DimenGposition getDimenGposition() {
		return this.dimenGposition;
	}

	public void setDimenGposition(DimenGposition dimenGposition) {
		this.dimenGposition = dimenGposition;
	}

	public DimenEnvironment getDimenEnvironment() {
		return this.dimenEnvironment;
	}

	public void setDimenEnvironment(DimenEnvironment dimenEnvironment) {
		this.dimenEnvironment = dimenEnvironment;
	}

	public DimenTime getDimenTime() {
		return this.dimenTime;
	}

	public void setDimenTime(DimenTime dimenTime) {
		this.dimenTime = dimenTime;
	}

	public DimenEnergyitem getDimenEnergyitem() {
		return this.dimenEnergyitem;
	}

	public void setDimenEnergyitem(DimenEnergyitem dimenEnergyitem) {
		this.dimenEnergyitem = dimenEnergyitem;
	}

	public DimenDate getDimenDate() {
		return this.dimenDate;
	}

	public void setDimenDate(DimenDate dimenDate) {
		this.dimenDate = dimenDate;
	}

}