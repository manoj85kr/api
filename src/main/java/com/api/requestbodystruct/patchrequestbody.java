package com.api.requestbodystruct;

import com.api.extractor.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

public class patchrequestbody {
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
