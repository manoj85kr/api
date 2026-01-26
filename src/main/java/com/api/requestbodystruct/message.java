package com.api.requestbodystruct;

import java.util.List;

public class message {
	private List<annotations> annotations;
	private String content;
	private Object refusal;
	private String role;

	public List<annotations> getAnnotations() {
		return annotations;
	}

	public void setAnnotations(List<annotations> annotations) {
		this.annotations = annotations;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Object getRefusal() {
		return refusal;
	}

	public void setRefusal(Object refusal) {
		this.refusal = refusal;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
