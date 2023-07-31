package com.kapil.beans;

public class Mobile {
	
	private int prodid;
	private String modelname, company, connectivity, ram, rom, color, screen,processor;
	private float battery, price, rating;
	
	public Mobile() {
		prodid=0; 
		modelname=""; 
		company=""; 
		connectivity=""; 
		ram="";
		rom="";
		color="";
		screen="";
		battery=0; 
		processor="";
		price=0; 
		rating=0;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public float getBattery() {
		return battery;
	}

	public void setBattery(float battery) {
		this.battery = battery;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

}
