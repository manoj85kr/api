package com.api.extractor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class content {
	private String type = "";
	private List<Object> annotations;
	@JsonProperty("logprobs")
	private List<Object> logprobs;
	private String text = "";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Object> getAnnotations() {
		return annotations;
	}

	public void setAnnotations(List<Object> annotations) {
		this.annotations = annotations;
	}

	public List<Object> getLogProbs() {
		return logprobs;
	}

	public void setLogProbs(List<Object> logprobs) {
		this.logprobs = logprobs;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
