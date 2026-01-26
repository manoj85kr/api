package com.api.git;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.api.base.BaseTest;
import com.api.connections.ApiConnections;
import com.api.connections.gitHubApiConnection;
import com.api.jsonresponse.jsonResp;
import com.api.utilities.Utilities;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class gitHubExecution extends BaseTest {

	@Test(priority = 1, dataProvider = "excelData")
	public void gitHubApiHit(Object[] values)
			throws JsonMappingException, JsonProcessingException, IOException, InterruptedException {
		ExtentTest test = extent.createTest("GitHub Post Connection Test");
		System.out.println("**********************Start of GitHub Post api*********************");
		if (values[0] != null && values[1] != null && values[2] != null && values[3] != null) {
			if (values[1].toString().toLowerCase().equalsIgnoreCase("Y")) {
				System.out.println("**********************Test Case_" + values[0] + "*********************");
				Map<String, String> content = jsonResp
						.githubExtract(gitHubApiConnection.postMakeConnection(values[3].toString()));
				for (Entry<String, String> en : content.entrySet()) {
					Utilities.writeDataInTextFile(en.getValue());
				}
				test.log(Status.INFO, "Test Passed");
				System.out.println(
						"***************************Test Case_" + values[0].toString() + "Ended *********************");
			} else {
				System.out.println("**********************Test Case_" + values[0].toString()
						+ "Not Executed *********************");
			}
		}

	}

	@DataProvider(name = "excelData")
	public Object[][] getData() throws IOException {
		Object[][] values;
		File file = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "githubGpt.xlsx");
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
