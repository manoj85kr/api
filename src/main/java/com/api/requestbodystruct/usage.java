package com.api.requestbodystruct;

public class usage {
	private long completion_tokens;
	private completion_tokens_details completion_tokens_details;
	private int prompt_tokens;
	private prompt_tokens_details prompt_tokens_details;
	private long total_tokens;

	public long getCompletion_tokens() {
		return completion_tokens;
	}

	public void setCompletion_tokens(long completion_tokens) {
		this.completion_tokens = completion_tokens;
	}

	public completion_tokens_details getCompletion_tokens_details() {
		return completion_tokens_details;
	}

	public void setCompletion_tokens_details(completion_tokens_details completion_tokens_details) {
		this.completion_tokens_details = completion_tokens_details;
	}

	public int getPrompt_tokens() {
		return prompt_tokens;
	}

	public void setPrompt_tokens(int prompt_tokens) {
		this.prompt_tokens = prompt_tokens;
	}

	public prompt_tokens_details getPrompt_tokens_details() {
		return prompt_tokens_details;
	}

	public void setPrompt_tokens_details(prompt_tokens_details prompt_tokens_details) {
		this.prompt_tokens_details = prompt_tokens_details;
	}

	public long getTotal_tokens() {
		return total_tokens;
	}

	public void setTotal_tokens(long total_tokens) {
		this.total_tokens = total_tokens;
	}
}
