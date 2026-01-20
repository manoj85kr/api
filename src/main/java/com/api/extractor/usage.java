package com.api.extractor;

public class usage {
	private int input_tokens = 0;
	private input_tokens_details inpTkndetls;
	private int output_tokens = 0;
	private output_tokens_details outTkndetls;
	private int total_tokens = 0;

	public int getInput_tokens() {
		return input_tokens;
	}

	public void setInput_tokens(int input_tokens) {
		this.input_tokens = input_tokens;
	}

	public input_tokens_details getInpTkndetls() {
		return inpTkndetls;
	}

	public void setInpTkndetls(input_tokens_details inpTkndetls) {
		this.inpTkndetls = inpTkndetls;
	}

	public int getOutput_tokens() {
		return output_tokens;
	}

	public void setOutput_tokens(int output_tokens) {
		this.output_tokens = output_tokens;
	}

	public output_tokens_details getOutTkndetls() {
		return outTkndetls;
	}

	public void setOutTkndetls(output_tokens_details outTkndetls) {
		this.outTkndetls = outTkndetls;
	}

	public int getTotal_tokens() {
		return total_tokens;
	}

	public void setTotal_tokens(int total_tokens) {
		this.total_tokens = total_tokens;
	}
}
