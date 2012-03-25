package com.youhua.bean.satistics;

import java.util.HashSet;
import java.util.Set;

/**
 * DimenEnergyitem entity. @author MyEclipse Persistence Tools
 */

public class DimenEnergyitem implements java.io.Serializable {

	// Fields

	private Integer energyItemPk;
	private String firstItemName;
	private String secondItemName;
	private String thirdItemName;
	private String energyItemUnit;
	private String energyItemFml;
	private String energyItemLevel;
	private Set factEnergies = new HashSet(0);

	// Constructors

	/** default constructor */
	public DimenEnergyitem() {
	}

	/** minimal constructor */
	public DimenEnergyitem(String firstItemName) {
		this.firstItemName = firstItemName;
	}

	/** full constructor */
	public DimenEnergyitem(String firstItemName, String secondItemName,
			String thirdItemName, String energyItemUnit, String energyItemFml,
			String energyItemLevel, Set factEnergies) {
		this.firstItemName = firstItemName;
		this.secondItemName = secondItemName;
		this.thirdItemName = thirdItemName;
		this.energyItemUnit = energyItemUnit;
		this.energyItemFml = energyItemFml;
		this.energyItemLevel = energyItemLevel;
		this.factEnergies = factEnergies;
	}

	// Property accessors

	public Integer getEnergyItemPk() {
		return this.energyItemPk;
	}

	public void setEnergyItemPk(Integer energyItemPk) {
		this.energyItemPk = energyItemPk;
	}

	public String getFirstItemName() {
		return this.firstItemName;
	}

	public void setFirstItemName(String firstItemName) {
		this.firstItemName = firstItemName;
	}

	public String getSecondItemName() {
		return this.secondItemName;
	}

	public void setSecondItemName(String secondItemName) {
		this.secondItemName = secondItemName;
	}

	public String getThirdItemName() {
		return this.thirdItemName;
	}

	public void setThirdItemName(String thirdItemName) {
		this.thirdItemName = thirdItemName;
	}

	public String getEnergyItemUnit() {
		return this.energyItemUnit;
	}

	public void setEnergyItemUnit(String energyItemUnit) {
		this.energyItemUnit = energyItemUnit;
	}

	public String getEnergyItemFml() {
		return this.energyItemFml;
	}

	public void setEnergyItemFml(String energyItemFml) {
		this.energyItemFml = energyItemFml;
	}

	public String getEnergyItemLevel() {
		return this.energyItemLevel;
	}

	public void setEnergyItemLevel(String energyItemLevel) {
		this.energyItemLevel = energyItemLevel;
	}

	public Set getFactEnergies() {
		return this.factEnergies;
	}

	public void setFactEnergies(Set factEnergies) {
		this.factEnergies = factEnergies;
	}

}