package com.omegacode.entity;

import java.math.BigInteger;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
@Entity
public class Size {
	@Id
	@javax.persistence.Id
	private BigInteger id;
	private int heightCm;
	private int collarSize;
	// todo: enum
	private String internationalClothesSize;
	// todo: enum?
	private String braSize;
	private int waistCm;
	private int thighsCm;
	private int bustCm;
	private int underBustCm;
	// todo: calculator
	private int shoeCm;

	public int getHeightCm() {
		return heightCm;
	}

	public void setHeightCm(int heightCm) {
		this.heightCm = heightCm;
	}

	public int getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(int collarSize) {
		this.collarSize = collarSize;
	}

	public String getInternationalClothesSize() {
		return internationalClothesSize;
	}

	public void setInternationalClothesSize(String internationalClothesSize) {
		this.internationalClothesSize = internationalClothesSize;
	}

	public String getBraSize() {
		return braSize;
	}

	public void setBraSize(String braSize) {
		this.braSize = braSize;
	}

	public int getWaistCm() {
		return waistCm;
	}

	public void setWaistCm(int waistCm) {
		this.waistCm = waistCm;
	}

	public int getThighsCm() {
		return thighsCm;
	}

	public void setThighsCm(int thighsCm) {
		this.thighsCm = thighsCm;
	}

	public int getBustCm() {
		return bustCm;
	}

	public void setBustCm(int bustCm) {
		this.bustCm = bustCm;
	}

	public int getUnderBustCm() {
		return underBustCm;
	}

	public void setUnderBustCm(int underBustCm) {
		this.underBustCm = underBustCm;
	}

	public int getShoeCm() {
		return shoeCm;
	}

	public void setShoeCm(int shoeCm) {
		this.shoeCm = shoeCm;
	}

}
