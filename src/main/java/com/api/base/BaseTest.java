package com.api.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.api.extenterportmanager.ExtentManager;
import com.aventstack.extentreports.ExtentReports;

public class BaseTest {

	protected static ExtentReports extent;

	@BeforeSuite
	public void setupReport() {
		extent = ExtentManager.createInstance();
	}

	@AfterSuite
	public void tearDownReport() {
		extent.flush();
	}
}
