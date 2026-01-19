package com.api.extenterportmanager;

import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	public static ExtentReports extent;

	public static ExtentReports createInstance() {

		if (extent == null) {

			String reportDir = System.getProperty("user.dir") + File.separator + "target" + File.separator
					+ "extent-report";

			// ✅ CREATE DIRECTORY (IMPORTANT)
			new File(reportDir).mkdirs();

			String reportPath = reportDir + File.separator + "ExtentReport.html";

			ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

			spark.config().setReportName("Automation Test Report");
			spark.config().setDocumentTitle("Extent Report");

			extent = new ExtentReports();
			extent.attachReporter(spark);

			extent.setSystemInfo("OS", System.getProperty("os.name"));
			extent.setSystemInfo("Java", System.getProperty("java.version"));
			extent.setSystemInfo("Tester", "manoj");
			extent.setSystemInfo("Environment", "QA");
		}
		return extent;
	}
}
