package com.api.extractor;

import com.fasterxml.jackson.annotation.JsonProperty;

public class product {

	private String id;
	private String name;
	private String createdAt;
	private String updatedAt;
	private String message;

	@JsonProperty("data")
	private Data data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcreatedAt() {
		return createdAt;
	}

	public void setcreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getupdatedAt() {
		return updatedAt;
	}

	public void setupdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}

	public Data getdata() {
		return data;
	}

	public void setdata(Data data) {
		this.data = data;
	}
}
