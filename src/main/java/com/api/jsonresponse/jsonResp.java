package com.api.jsonresponse;

import com.api.extractor.product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonResp {
	static ObjectMapper mapper = new ObjectMapper();

	public static void extract(String values) throws JsonMappingException, JsonProcessingException {
		product[] prod = mapper.readValue(values, product[].class);
		for (product pr : prod) {
			try {
				System.out.println(pr.getId() + "\n" + pr.getName() + "\n" + pr.getdata().getCapacity() + "\n"
						+ pr.getdata().getCapacityGB() + "\n" + pr.getdata().getCaseSize() + "\n"
						+ pr.getdata().getColor() + "\n" + pr.getdata().getCpuModel() + "\n"
						+ pr.getdata().getDescription() + "\n" + pr.getdata().getGeneration() + "\n"
						+ pr.getdata().getHardDiskSize() + "\n" + pr.getdata().getPrice() + "\n"
						+ pr.getdata().getScreenSize() + "\n" + pr.getdata().getStrapColour() + "\n"
						+ pr.getdata().getYear());
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
	}
}
