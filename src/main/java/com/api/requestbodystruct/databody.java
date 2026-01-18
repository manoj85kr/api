package com.api.requestbodystruct;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class databody {
	private int year;
	private double price;
	@JsonProperty("CPU model")
	private String CPUmodel = "";
	@JsonProperty("Hard disk size")
	private String Harddisksize = "";
	private String color;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@JsonIgnore
	public String getCPUmodel() {
		return CPUmodel;
	}

	public void setCPUmodel(String CPUmodel) {
		this.CPUmodel = CPUmodel;
	}

	@JsonIgnore
	public String getHarddisksize() {
		return Harddisksize;
	}

	public void setHarddisksize(String Harddisksize) {
		this.Harddisksize = Harddisksize;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}
}
