package com.api.requestbodystruct;

public class prompt_filter_results {
	private int prompt_index;
	private content_filter_results content_filter_results;
	private hate hate;
	private jailbreak jailbreak;
	private self_harm self_harm;
	private sexual sexual;
	private violence violence;
	
	public int getPrompt_index() {
		return prompt_index;
	}
	public void setPrompt_index(int prompt_index) {
		this.prompt_index = prompt_index;
	}
	public content_filter_results getContent_filter_results() {
		return content_filter_results;
	}
	public void setContent_filter_results(content_filter_results content_filter_results) {
		this.content_filter_results = content_filter_results;
	}
	public hate getHate() {
		return hate;
	}
	public void setHate(hate hate) {
		this.hate = hate;
	}
	public jailbreak getJailbreak() {
		return jailbreak;
	}
	public void setJailbreak(jailbreak jailbreak) {
		this.jailbreak = jailbreak;
	}
	public self_harm getSelf_harm() {
		return self_harm;
	}
	public void setSelf_harm(self_harm self_harm) {
		this.self_harm = self_harm;
	}
	public sexual getSexual() {
		return sexual;
	}
	public void setSexual(sexual sexual) {
		this.sexual = sexual;
	}
	public violence getViolence() {
		return violence;
	}
	public void setViolence(violence violence) {
		this.violence = violence;
	}
}
