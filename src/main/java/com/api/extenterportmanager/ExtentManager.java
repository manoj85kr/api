package com.api.extenterportmanager;

import java.io.File;

import com.api.utilities.Utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	public static ExtentReports extent;

	public static ExtentReports createInstance() {
		if (extent == null) {
			ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator
					+ "ExtentsReport" + File.separator + "ExtentReport " + Utilities.getTimeStamp() + ".html");

			reporter.config().setReportName("Automation Test Report");
			reporter.config().setDocumentTitle("Execution Results");

			extent = new ExtentReports();
			extent.attachReporter(reporter);

			extent.setSystemInfo("Tester", "manoj");
			extent.setSystemInfo("Environment", "QA");
			extent.setSystemInfo("OS", "Windows");
		}
		return extent;
	}
}
