package com.api.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.api.base.BaseTest;
import com.aventstack.extentreports.ExtentTest;

public class ExtentListener extends BaseTest implements ITestListener {

	private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	@Override
	public void onTestStart(ITestResult result) {
		test.set(extent.createTest(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.get().fail(result.getThrowable());
	}
}
