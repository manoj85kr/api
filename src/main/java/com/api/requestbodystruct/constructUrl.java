package com.api.requestbodystruct;

import java.util.ArrayList;
import java.util.List;

import com.api.configuration.Configuration;
import com.api.requestUrlConstruct.githubUrl;
import com.api.requestUrlConstruct.messages;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class constructUrl {
	public static String postBodyUrlConstructor() throws JsonProcessingException {
		requestbody reqbody = new requestbody();
		ObjectMapper mapper = new ObjectMapper();
		databody datas = new databody();
		reqbody.setName("Apple MacBook Pro 16");
		datas.setYear(2019);
		datas.setPrice(1849.99);
		datas.setCPUmodel("Intel Core i9");
		datas.setHarddisksize("1 TB");
		reqbody.setdata(datas);
		return mapper.writeValueAsString(reqbody);
	}

	public static String putBodyUrlConstructor() throws JsonProcessingException {
		requestbody reqbody = new requestbody();
		ObjectMapper mapper = new ObjectMapper();
		databody datas = new databody();
		reqbody.setName("Apple MacBook Pro 16");
		datas.setYear(2019);
		datas.setPrice(1849.99);
		datas.setCPUmodel("Intel Core i9");
		datas.setHarddisksize("1 TB");
		datas.setcolor("silver");
		reqbody.setdata(datas);
		return mapper.writeValueAsString(reqbody);
	}

	public static String patchBodyUrlConstructor() throws JsonProcessingException {
		patchrequestbody reqbody = new patchrequestbody();
		ObjectMapper mapper = new ObjectMapper();
		reqbody.setName("Apple MacBook Pro 16 (Updated Name as : Manoj)");
		return mapper.writeValueAsString(reqbody);
	}

	public static String chatGptInputUrlConstruct(String model, String input) throws JsonProcessingException {
		chatGptReq req = new chatGptReq();
		ObjectMapper mapper = new ObjectMapper();
		req.setInput(input);
		req.setModel(model);
		return mapper.writeValueAsString(req);
	}

	public static String githubConstructUrl(String question) throws JsonProcessingException {
		List<messages> messageList = new ArrayList<>();
		githubUrl giturl = new githubUrl();
		ObjectMapper mapper = new ObjectMapper();
		messages messages = new messages();
		giturl.setModel("gpt-4.1-mini");
		giturl.setMax_tokens(Integer.parseInt(Configuration.pro.getProperty("token")));
		giturl.setTemperature(Double.parseDouble(Configuration.pro.getProperty("temperature")));
		messages.setContent(question);
		messages.setRole("user");
		messageList.add(messages);
		giturl.setMessages(messageList);
		return mapper.writeValueAsString(giturl);
	}
}
