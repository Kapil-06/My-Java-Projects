package com.praffull.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id
	@Column(name="prodid")
	private String carid;
	
	@Column(name="prodnm")
	private String carnm;
	
	@Column(name="company")
	private String company;
	
	@Column(name="price")
	private float price;

	public String getCarid() {
		return carid;
	}

	public void setCarid(String carid) {
		this.carid = carid;
	}

	public String getCarnm() {
		return carnm;
	}

	public void setCarnm(String carnm) {
		this.carnm = carnm;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
}
