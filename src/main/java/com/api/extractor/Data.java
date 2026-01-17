package com.api.extractor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	@JsonProperty("Color")
	private String color;

	@JsonProperty("Capacity")
	private String capacity;

	@JsonProperty("capacity GB")
	private int capacityGB;

	@JsonProperty("Price")
	private double price;

	@JsonProperty("Generation")
	private String generation;

	@JsonProperty("year")
	private int year;

	@JsonProperty("CPU model")
	private String cpuModel;

	@JsonProperty("Hard disk size")
	private String hardDiskSize;

	@JsonProperty("Strap Colour")
	private String strapColour;

	@JsonProperty("Case Size")
	private String caseSize;

	@JsonProperty("Description")
	private String description;

	@JsonProperty("Screen size")
	private double screenSize;

	/* Getters and Setters */

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getCapacityGB() {
		return capacityGB;
	}

	public void setCapacityGB(int capacityGB) {
		this.capacityGB = capacityGB;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public String getHardDiskSize() {
		return hardDiskSize;
	}

	public void setHardDiskSize(String hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	public String getStrapColour() {
		return strapColour;
	}

	public void setStrapColour(String strapColour) {
		this.strapColour = strapColour;
	}

	public String getCaseSize() {
		return caseSize;
	}

	public void setCaseSize(String caseSize) {
		this.caseSize = caseSize;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
}
