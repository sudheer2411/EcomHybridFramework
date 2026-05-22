package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Pages.successLogin;
import com.base.BaseClass;
import com.Listeners.MyListeners;
import com.utilities.PropertyUtils;

@Listeners(MyListeners.class)
public class successLoginTest extends BaseClass {
	
	successLogin lp = null;
	
	@BeforeClass
	public void setup() throws Exception {
		
		BaseClass.SetUp();
		BaseClass.ReportUtils();
		lp = new successLogin(driver);
		lp.GetLogin();
		
	}
	
	@AfterMethod 
	public void teardown() throws Exception {
		
		driver.quit();
		
	}
	
	@Test
	public void logintest() throws Exception {
		
		String before= driver.getTitle();
		
		lp.enterUsername(PropertyUtils.readConfig("username"));
		
		lp.enterPassword(PropertyUtils.readConfig("password"));
		lp.loginClick();
		
		String after= driver.getTitle();
		
		Assert.assertNotSame(before, after);
	}
	
	@Test
	public void newRegFromLogin() throws Exception {
		
		String before= driver.getCurrentUrl();
		
		lp.newRegClick();
		
		String after = driver.getCurrentUrl();
		
		Assert.assertNotSame(before, after);
	}
	
}
