package com.api.requestbodystruct;

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
}
