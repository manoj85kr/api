package com.api.extractor;

import com.fasterxml.jackson.annotation.JsonProperty;

public class product {

	private int id;
	private String name;

	@JsonProperty("data")
	private Data data;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Data getdata() {
		return data;
	}

	public void setdata(Data data) {
		this.data = data;
	}
}
