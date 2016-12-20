package com.omegacode.entity;

import java.math.BigInteger;
import java.net.URI;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
@Entity
public class Piece {
	
	@Id
	@javax.persistence.Id
	private BigInteger id;
	
	// todo: RDF-backed
	String type;
//	Size size;
	// todo: enum
	String sex;
	String description;
	// todo: RDF-backed
	
//	List<String> color;
//	// todo: RDF-backed
//	
//	List<String> style;
//	// todo: RDF-backed
//	
//	List<String> pattern;
	// todo: RDF-backed
	
//	List<String> material;
//	List<URI> photos;
	
	private BigInteger wardrobeId;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getWardrobeId() {
		return wardrobeId;
	}

	public void setWardrobeId(BigInteger wardrobeId) {
		this.wardrobeId = wardrobeId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
