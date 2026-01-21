package com.api.git;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.api.base.BaseTest;
import com.api.connections.ApiConnections;
import com.api.jsonresponse.jsonResp;
import com.api.utilities.Utilities;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Execution extends BaseTest {
	String id = "";
	String responseString = "";

	@Test(priority = 1, enabled = false)
	public void postConnection()
			throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		ExtentTest test = extent.createTest("Post Connection Test");
		System.out.println("********************Start of Post api*********************");
		test.log(Status.INFO, "Test started..");
		id = jsonResp.postExtract(ApiConnections.postMakeConnection()).get("id");
		test.log(Status.INFO, "Test Passed");
		System.out.println("**********************End of Post api*********************");
	}

	@Test(priority = 2, enabled = false)
	public void putConnection() throws JsonMappingException, JsonProcessingException, IOException {
		ExtentTest test = extent.createTest("Put Connection Test");
		System.out.println("**********************Start of Put api*********************");
		test.log(Status.INFO, "Test started");
		jsonResp.putExtract(ApiConnections.putMakeConnection(id));
		test.log(Status.INFO, "Test Passed");
		System.out.println("************************End of Put api*********************");
	}

	@Test(priority = 3, enabled = false)
	public void patchConnection() throws JsonMappingException, JsonProcessingException, IOException {
		ExtentTest test = extent.createTest("Patch Connection Test");
		System.out.println("**********************Start of Patch api*********************");
		test.log(Status.INFO, "Test started");
		jsonResp.patchExtract(ApiConnections.putMakeConnection(id));
		test.log(Status.INFO, "Test Passed");
		System.out.println("************************End of Patch api*********************");
	}

	@Test(priority = 4, enabled = false)
	public void deleteConnection() throws JsonMappingException, JsonProcessingException, IOException {
		ExtentTest test = extent.createTest("Delete Connection Test");
		System.out.println("**********************Start of Delete api*********************");
		test.log(Status.INFO, "Test started");
		jsonResp.deleteExtract(ApiConnections.deleteMakeConnection(id));
		test.log(Status.INFO, "Test Passed");
		System.out.println("************************End of Delete api*********************");
	}

	@Test(priority = 5, dataProvider = "excelData")
	public void chatGptPostConnection(Object[] values)
			throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		String response = "";
		ExtentTest test = extent.createTest("ChatGpt Post Connection Test");
		test.log(Status.INFO, "Test started");
		if (values[0] != null && values[1] != null && values[2] != null && values[3] != null) {
			System.out.println("values[1].toString()" + values[1].toString());
			if (values[1].toString().toLowerCase().equalsIgnoreCase("Y")) {
				System.out.println("**********************Test Case_" + values[0] + "*********************");
				response = jsonResp
						.chatExtract(ApiConnections.postMakeConnection(values[2].toString(), values[3].toString()))
						.get("text");
				chatGptPostConnectionForAnswer(response);
				// System.out.println(response);
				// responseString = response;
				// writeFile(response);
				test.log(Status.INFO, "Test Passed");
				System.out.println(
						"***************************Test Case_" + values[0].toString() + "Ended *********************");
			} else {
				System.out.println("**********************Test Case_" + values[0].toString()
						+ "Not Executed *********************");
			}
		}

	}

	public void chatGptPostConnectionForAnswer(String response)
			throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		ExtentTest test = extent.createTest("ChatGpt Post Connection Test");
		System.out.println("**********************Start of ChatGpt Post api*********************");
		test.log(Status.INFO, "Test started");
		String[] text = Utilities.textExtraction(response).split("\n");
		for (String question : text) {
			response = jsonResp.chatExtract(ApiConnections.postMakeConnection("gpt-4.1-mini", question)).get("text");
			writeFile(response);
			Thread.sleep(30000);
		}
		test.log(Status.INFO, "Test Passed");
		System.out.println("************************End of ChatGpt Post api*********************");
	}

	public static void writeFile(String text) throws IOException {
		File file = new File(System.getProperty("user.dir") + File.separator + "Question.txt");
		try (FileWriter writer = new FileWriter(file, true)) {
			writer.append(text);
		}
	}

	@DataProvider(name = "excelData")
	public Object[][] getData() throws IOException {
		Object[][] values;
		File file = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "gpt.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int RowCount = sheet.getLastRowNum();
		int ColumnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		values = new Object[RowCount][ColumnCount];
		for (int i = 1; i < RowCount; i++) {
			Row row = sheet.getRow(i);
			if (row == null) {
				continue;
			}
			for (int j = 0; j < ColumnCount; j++) {
				Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
				values[i - 1][j] = cell.toString();
			}
		}
		workbook.close();
		fis.close();
		return values;
	}

}
