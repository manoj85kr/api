package com.api.requestbodystruct;

import com.api.extractor.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

public class requestbody {
	private String name = "";
	private databody data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public databody getdata() {
		return data;
	}

	public void setdata(databody data) {
		this.data = data;
	}
}
