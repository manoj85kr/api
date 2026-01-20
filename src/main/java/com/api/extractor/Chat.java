package com.api.extractor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Chat {

	private String id = "";
	private String object = "";
	private String created_at = "";
	private String status = "";
	private boolean background = false;
	private billing billing;
	private String completed_at = "";
	private Object error = null;
	private double frequency_penalty;
	private Object incomplete_details = null;
	private Object instructions = null;
	private Object max_output_tokens = null;
	private Object max_tool_calls = null;
	private String model = "";
	private List<output> output;
	private boolean parallel_tool_calls;
	private double presence_penalty = 0.0;
	private Object previous_response_id = null;
	private Object prompt_cache_key = null;
	private Object prompt_cache_retention = null;
	private reasoning reasoning;
	private Object safety_identifier = null;
	private String service_tier = "";
	private boolean store;
	private double temperature = 0.0;
	private text tex;
	private String tool_choice = "";
	private List<tools> tools;
	private int top_logprobs = 0;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isBackground() {
		return background;
	}

	public void setBackground(boolean background) {
		this.background = background;
	}

	public billing getBilling() {
		return billing;
	}

	public void setBilling(billing billing) {
		this.billing = billing;
	}

	public String getCompleted_at() {
		return completed_at;
	}

	public void setCompleted_at(String completed_at) {
		this.completed_at = completed_at;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}

	public double getFrequency_penalty() {
		return frequency_penalty;
	}

	public void setFrequency_penalty(double frequency_penalty) {
		this.frequency_penalty = frequency_penalty;
	}

	public Object getIncomplete_details() {
		return incomplete_details;
	}

	public void setIncomplete_details(Object incomplete_details) {
		this.incomplete_details = incomplete_details;
	}

	public Object getInstructions() {
		return instructions;
	}

	public void setInstructions(Object instructions) {
		this.instructions = instructions;
	}

	public Object getMax_output_tokens() {
		return max_output_tokens;
	}

	public void setMax_output_tokens(Object max_output_tokens) {
		this.max_output_tokens = max_output_tokens;
	}

	public Object getMax_tool_calls() {
		return max_tool_calls;
	}

	public void setMax_tool_calls(Object max_tool_calls) {
		this.max_tool_calls = max_tool_calls;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<output> getoutput() {
		return output;
	}

	public void setoutput(List<output> output) {
		this.output = output;
	}

	public boolean isParallel_tool_calls() {
		return parallel_tool_calls;
	}

	public void setParallel_tool_calls(boolean parallel_tool_calls) {
		this.parallel_tool_calls = parallel_tool_calls;
	}

	public double getPresence_penalty() {
		return presence_penalty;
	}

	public void setPresence_penalty(double presence_penalty) {
		this.presence_penalty = presence_penalty;
	}

	public Object getPrevious_response_id() {
		return previous_response_id;
	}

	public void setPrevious_response_id(Object previous_response_id) {
		this.previous_response_id = previous_response_id;
	}

	public Object getPrompt_cache_key() {
		return prompt_cache_key;
	}

	public void setPrompt_cache_key(Object prompt_cache_key) {
		this.prompt_cache_key = prompt_cache_key;
	}

	public Object getPrompt_cache_retention() {
		return prompt_cache_retention;
	}

	public void setPrompt_cache_retention(Object prompt_cache_retention) {
		this.prompt_cache_retention = prompt_cache_retention;
	}

	public reasoning getReasoning() {
		return reasoning;
	}

	public void setReasoning(reasoning reasoning) {
		this.reasoning = reasoning;
	}

	public Object getSafety_identifier() {
		return safety_identifier;
	}

	public void setSafety_identifier(Object safety_identifier) {
		this.safety_identifier = safety_identifier;
	}

	public String getService_tier() {
		return service_tier;
	}

	public void setService_tier(String service_tier) {
		this.service_tier = service_tier;
	}

	public boolean isStore() {
		return store;
	}

	public void setStore(boolean store) {
		this.store = store;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public text getTex() {
		return tex;
	}

	public void setTex(text tex) {
		this.tex = tex;
	}

	public String getTool_choice() {
		return tool_choice;
	}

	public void setTool_choice(String tool_choice) {
		this.tool_choice = tool_choice;
	}

	public List<tools> getTools() {
		return tools;
	}

	public void setTool(List<tools> tools) {
		this.tools = tools;
	}

	public int getTop_logprobs() {
		return top_logprobs;
	}

	public void setTop_logprobs(int top_logprobs) {
		this.top_logprobs = top_logprobs;
	}

	public double getTop_p() {
		return top_p;
	}

	public void setTop_p(double top_p) {
		this.top_p = top_p;
	}

	public String getTruncation() {
		return truncation;
	}

	public void setTruncation(String truncation) {
		this.truncation = truncation;
	}

	public usage getUse() {
		return use;
	}

	public void setUse(usage use) {
		this.use = use;
	}

	public Object getUser() {
		return user;
	}

	public void setUser(Object user) {
		this.user = user;
	}

	public metadata getMeta() {
		return meta;
	}

	public void setMeta(metadata meta) {
		this.meta = meta;
	}

	private double top_p = 0.0;
	private String truncation = "";
	private usage use;
	private Object user = null;
	private metadata meta;

}
