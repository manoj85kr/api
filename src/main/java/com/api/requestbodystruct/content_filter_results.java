package com.api.requestbodystruct;

public class content_filter_results {
	private hate hate;
	private protected_material_code protected_material_code;
	private protected_material_text protected_material_text;
	private self_harm self_harm;
	private sexual sexual;
	private violence violence;
	private jailbreak jailbreak;

	public jailbreak getJailbreak() {
		return jailbreak;
	}

	public void setJailbreak(jailbreak jailbreak) {
		this.jailbreak = jailbreak;
	}

	public hate getHate() {
		return hate;
	}

	public void setHate(hate hate) {
		this.hate = hate;
	}

	public protected_material_code getProtected_material_code() {
		return protected_material_code;
	}

	public void setProtected_material_code(protected_material_code protected_material_code) {
		this.protected_material_code = protected_material_code;
	}

	public protected_material_text getProtected_material_text() {
		return protected_material_text;
	}

	public void setProtected_material_text(protected_material_text protected_material_text) {
		this.protected_material_text = protected_material_text;
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
