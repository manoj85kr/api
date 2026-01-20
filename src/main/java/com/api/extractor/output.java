package com.api.extractor;

import java.util.List;

public class output {
	private String id = "";
	private String type = "";
	private String status = "";
	private List<content> content;
	private String role = "";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<content> getContent() {
		return content;
	}

	public void setContent(List<content> content) {
		this.content = content;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
