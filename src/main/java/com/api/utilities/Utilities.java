package com.api.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Utilities {
	public static String getTimeStamp() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY-HH-MM-SS"));
	}

	public static String textExtraction(String line) {
		StringBuilder sb = new StringBuilder();
		Pattern pattern = Pattern.compile("^\\d+\\.\\s.*", Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(line);

		while (matcher.find()) {
			sb.append(matcher.group() + "\n");
		}
		return sb.toString();
	}
}
