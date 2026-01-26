package com.api.requestbodystruct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class choices {
	private content_filter_results content_filter_results;
	private String finish_reason;
	private int index;
	private Object logprobs;
	private message message;
	@JsonIgnoreProperties(ignoreUnknown = true)
	private content_filter_result content_filter_result;

	public content_filter_result getContent_filter_result() {
		return content_filter_result;
	}

	public void setContent_filter_result(content_filter_result content_filter_result) {
		this.content_filter_result = content_filter_result;
	}

	public content_filter_results getContent_filter_results() {
		return content_filter_results;
	}

	public void setContent_filter_results(content_filter_results content_filter_results) {
		this.content_filter_results = content_filter_results;
	}

	public String getFinish_reason() {
		return finish_reason;
	}

	public void setFinish_reason(String finish_reason) {
		this.finish_reason = finish_reason;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Object getLogprobs() {
		return logprobs;
	}

	public void setLogprobs(Object logprobs) {
		this.logprobs = logprobs;
	}

	public message getMessage() {
		return message;
	}

	public void setMessage(message message) {
		this.message = message;
	}

}
