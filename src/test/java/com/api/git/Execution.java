package com.api.git;

import java.io.IOException;
import org.testng.annotations.Test;

import com.api.base.BaseTest;
import com.api.connections.ApiConnections;
import com.api.jsonresponse.jsonResp;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Execution extends BaseTest {
	String id = "";

	@Test(priority = 1)
	public void postConnection() throws JsonMappingException, JsonProcessingException, IOException {
		ExtentTest test = extent.createTest("Post Connection Test");
		System.out.println("********************Start of Post api*********************");
		test.log(Status.INFO, "Test started..");
		id = jsonResp.postExtract(ApiConnections.postMakeConnection()).get("id");
		test.log(Status.INFO, "Test Passed");
		System.out.println("**********************End of Post api*********************");
	}

	@Test(priority = 2)
	public void putConnection() throws JsonMappingException, JsonProcessingException, IOException {
		ExtentTest test = extent.createTest("Put Connection Test");
		System.out.println("**********************Start of Put api*********************");
		test.log(Status.INFO, "Test started");
		jsonResp.putExtract(ApiConnections.putMakeConnection(id));
		test.log(Status.INFO, "Test Passed");
		System.out.println("************************End of Put api*********************");
	}

	@Test(priority = 3)
	public void patchConnection() throws JsonMappingException, JsonProcessingException, IOException {
		ExtentTest test = extent.createTest("Patch Connection Test");
		System.out.println("**********************Start of Patch api*********************");
		test.log(Status.INFO, "Test started");
		jsonResp.patchExtract(ApiConnections.putMakeConnection(id));
		test.log(Status.INFO, "Test Passed");
		System.out.println("************************End of Patch api*********************");
	}

	@Test(priority = 4)
	public void deleteConnection() throws JsonMappingException, JsonProcessingException, IOException {
		ExtentTest test = extent.createTest("Delete Connection Test");
		System.out.println("**********************Start of Delete api*********************");
		test.log(Status.INFO, "Test started");
		jsonResp.deleteExtract(ApiConnections.deleteMakeConnection(id));
		test.log(Status.INFO, "Test Passed");
		System.out.println("************************End of Delete api*********************");
	}

}
