package com.Listeners;

import java.awt.Desktop;
import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utilities.ScreenshotUtils;

public class MyListeners extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getName());
		logger.info("test execution started");
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case pass is:-"+result.getName());
		logger.info("test execution success");
	}

	public void onTestFailure(ITestResult result) {
		
		test.log(Status.FAIL, "Test case failed is:-"+result.getName());
		logger.info("test execution failure");
		try {
			String ss=ScreenshotUtils.GettheScreenshot(result.getName());
			test.addScreenCaptureFromPath(ss);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, "Test case skipped is:-"+result.getName());
		logger.info("test execution skipped");
	}

	public void onStart(ITestContext context) {
		logger.info("test suite execution begins...");
	}

	public void onFinish(ITestContext context) {
		report.flush();
		logger.info("test suite execution completed");
		
	    String pathofextent = System.getProperty("user.dir")+"\\target\\report.html";
	    File Extentr = new File(pathofextent);
	    
	    try {
	    	
	    	Desktop.getDesktop().browse(Extentr.toURI());
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	}
	
}
