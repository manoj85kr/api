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

	@Test(enabled = false)
	public void getConnection() throws JsonMappingException, JsonProcessingException, IOException {
		jsonResp.extract(ApiConnections.getMakeConnections());
	}

	@Test(priority = 1)
	public void postConnection() throws JsonMappingException, JsonProcessingException, IOException {
		id = jsonResp.postExtract(ApiConnections.postMakeConnection()).get("id");
	}

	@Test(priority = 2)
	public void putConnection() throws JsonMappingException, JsonProcessingException, IOException {
		jsonResp.putExtract(ApiConnections.putMakeConnection(id));
	}
//
//	@Test(priority = 3)
//	public void patchConnection() throws JsonMappingException, JsonProcessingException, IOException {
//		jsonResp.patchExtract(ApiConnections.patchMakeConnection(id));
//	}
	
	@Test(priority = 3)
	public void deleteConnection() throws JsonMappingException, JsonProcessingException, IOException {
		jsonResp.deleteExtract(ApiConnections.deleteMakeConnection(id));
	}

}
