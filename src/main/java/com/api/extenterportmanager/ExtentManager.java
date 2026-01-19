package com.api.extenterportmanager;

import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports getInstance() {

		if (extent == null) {

			String reportDir = System.getProperty("user.dir") + "/target/extent-report";

			// THIS is why CI was failing
			new File(reportDir).mkdirs();

			String reportPath = reportDir + "/ExtentReport.html";

			ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

			extent = new ExtentReports();
			extent.attachReporter(spark);
		}
		return extent;
	}
}
