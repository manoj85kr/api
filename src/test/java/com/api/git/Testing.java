package com.api.git;

import java.io.IOException;
import com.api.connections.ApiConnections;
import com.api.jsonresponse.jsonResp;

public class Testing {
	public static void main(String[] args) throws IOException {
		jsonResp.extract(ApiConnections.getMakeConnections());
	}
}
