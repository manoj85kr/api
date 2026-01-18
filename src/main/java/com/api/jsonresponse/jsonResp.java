package com.api.jsonresponse;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.api.extractor.product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonResp {
	static ObjectMapper mapper = new ObjectMapper();

	public static Map<String, String> extract(String values) throws JsonMappingException, JsonProcessingException {
		product pr = mapper.readValue(values, product.class);
		Map<String, String> jsonParams = new LinkedHashMap<>();
		try {
			jsonParams.put("id", pr.getId());
			jsonParams.put("Name", pr.getName());
			jsonParams.put("createdAt", pr.getcreatedAt());
			jsonParams.put("Year", String.valueOf(pr.getdata().getYear()));
			jsonParams.put("Price", String.valueOf(pr.getdata().getPrice()));
			jsonParams.put("CPU model", pr.getdata().getCpuModel());
			jsonParams.put("Hard Disk Size", pr.getdata().getHardDiskSize());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return jsonParams;
	}

	public static Map<String, String> postExtract(String values) throws JsonMappingException, JsonProcessingException {
		product pr = mapper.readValue(values, product.class);
		Map<String, String> jsonParams = new LinkedHashMap<>();
		try {
			jsonParams.put("id", pr.getId());
			jsonParams.put("Name", pr.getName());
			jsonParams.put("createdAt", pr.getcreatedAt());
			jsonParams.put("Year", String.valueOf(pr.getdata().getYear()));
			jsonParams.put("Price", String.valueOf(pr.getdata().getPrice()));
			jsonParams.put("CPU model", pr.getdata().getCpuModel());
			jsonParams.put("Hard Disk Size", pr.getdata().getHardDiskSize());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return jsonParams;
	}

	public static Map<String, String> putExtract(String values) throws JsonMappingException, JsonProcessingException {
		product pr = mapper.readValue(values, product.class);
		Map<String, String> jsonParams = new LinkedHashMap<>();
		try {
			jsonParams.put("id", pr.getId());
			jsonParams.put("Name", pr.getName());
			jsonParams.put("createdAt", pr.getupdatedAt());
			jsonParams.put("Year", String.valueOf(pr.getdata().getYear()));
			jsonParams.put("Price", String.valueOf(pr.getdata().getPrice()));
			jsonParams.put("CPU model", pr.getdata().getCpuModel());
			jsonParams.put("Hard Disk Size", pr.getdata().getHardDiskSize());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return jsonParams;
	}
}
