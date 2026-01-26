package com.api.requestbodystruct;

import java.util.List;

public class githubRoot {
	private List<choices> choices;
	private long created;
	private String id;
	private String model;
	private String object;
	private List<prompt_filter_results> prompt_filter_results;
	private String system_fingerprint;
	private usage usage;

	public List<choices> getChoices() {
		return choices;
	}

	public void setChoices(List<choices> choices) {
		this.choices = choices;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public List<prompt_filter_results> getPrompt_filter_results() {
		return prompt_filter_results;
	}

	public void setPrompt_filter_results(List<prompt_filter_results> prompt_filter_results) {
		this.prompt_filter_results = prompt_filter_results;
	}

	public String getSystem_fingerprint() {
		return system_fingerprint;
	}

	public void setSystem_fingerprint(String system_fingerprint) {
		this.system_fingerprint = system_fingerprint;
	}

	public usage getUsage() {
		return usage;
	}

	public void setUsage(usage usage) {
		this.usage = usage;
	}

}