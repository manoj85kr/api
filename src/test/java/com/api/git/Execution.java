package com.api.git;

import java.io.IOException;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import com.api.connections.ApiConnections;
import com.api.jsonresponse.jsonResp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Execution extends ApiConnections {
	String id = "";

	@Test(priority = 1)
	public void postConnection() throws JsonMappingException, JsonProcessingException, IOException {
		System.out.println("********************Start of Post api*********************");
		id = jsonResp.postExtract(ApiConnections.postMakeConnection()).get("id");
		System.out.println("**********************End of Post api*********************");
	}

	@Test(priority = 2)
	public void putConnection() throws JsonMappingException, JsonProcessingException, IOException {
		System.out.println("**********************Start of Put api*********************");
		jsonResp.putExtract(ApiConnections.putMakeConnection(id));
		System.out.println("************************End of Put api*********************");
	}

	@Test(priority = 3)
	public void patchConnection() throws JsonMappingException, JsonProcessingException, IOException {
		System.out.println("**********************Start of Patch api*********************");
		jsonResp.patchExtract(ApiConnections.putMakeConnection(id));
		System.out.println("************************End of Patch api*********************");
	}

	@Test(priority = 4)
	public void deleteConnection() throws JsonMappingException, JsonProcessingException, IOException {
		System.out.println("**********************Start of Delete api*********************");
		jsonResp.deleteExtract(ApiConnections.deleteMakeConnection(id));
		System.out.println("************************End of Delete api*********************");
	}

}
