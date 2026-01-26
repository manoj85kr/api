package com.api.jsonresponse;

import java.util.LinkedHashMap;
import java.util.Map;
import com.api.extractor.Chat;
import com.api.extractor.product;
import com.api.requestbodystruct.githubRoot;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonResp {
	static ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

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

	public static Map<String, String> patchExtract(String values) throws JsonMappingException, JsonProcessingException {
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
			jsonParams.put("color", pr.getdata().getColor());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return jsonParams;
	}

	public static Map<String, String> deleteExtract(String values)
			throws JsonMappingException, JsonProcessingException {
		product pr = mapper.readValue(values, product.class);
		Map<String, String> jsonParams = new LinkedHashMap<>();
		try {
			jsonParams.put("Message", pr.getmessage());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return jsonParams;
	}

	public static Map<String, String> chatExtract(String values) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Chat chat = mapper.readValue(values, Chat.class);
		Map<String, String> jsonParams = new LinkedHashMap<>();
		jsonParams.put("Status", chat.getoutput().get(0).getStatus());
		jsonParams.put("text", chat.getoutput().get(0).getContent().get(0).getText());
		return jsonParams;
	}

	public static Map<String, String> githubExtract(String values)
			throws JsonMappingException, JsonProcessingException {
		githubRoot github = mapper.readValue(values, githubRoot.class);
		Map<String, String> jsonParams = new LinkedHashMap<>();
		jsonParams.put("content", github.getChoices().get(0).getMessage().getContent());
		return jsonParams;
	}
}
