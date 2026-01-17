package com.api.git;

import java.io.IOException;

import org.testng.annotations.Test;

import com.api.connections.ApiConnections;
import com.api.jsonresponse.jsonResp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Test
public class Execution extends ApiConnections {
	public void connectionHit() throws JsonMappingException, JsonProcessingException, IOException {
		jsonResp.extract(ApiConnections.getMakeConnections());
	}
}
