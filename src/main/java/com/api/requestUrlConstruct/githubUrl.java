package com.api.requestUrlConstruct;

import java.util.List;

public class githubUrl {
	private String model;
	private List<messages> messages;
	private long max_tokens;
	private double temperature;

	public List<messages> getMessages() {
		return messages;
	}

	public void setMessages(List<messages> messages) {
		this.messages = messages;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getMax_tokens() {
		return max_tokens;
	}

	public void setMax_tokens(long max_tokens) {
		this.max_tokens = max_tokens;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

}
