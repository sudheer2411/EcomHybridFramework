package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.registrationPage;
import com.Pages.successLogin;
import com.base.BaseClass;

public class RegPageTest extends BaseClass {
    
	successLogin lp = null;
	registrationPage rp = null;
	
	@BeforeClass
	public void setup() throws Exception {
		
		BaseClass.SetUp();
		BaseClass.ReportUtils();
		lp = new successLogin(driver);
		lp.newRegClick();
		rp = new registrationPage(driver);
		
	}
	
	@Test
	public void aboutUsTest() {
		
		rp.enterTitle("Mr");
		rp.enterFirstName("Sudhir");
		rp.enterLastName("Ingole");
		rp.enterEmail("xyz@gmail.com");
		rp.enterPhone("9087654321");
		rp.enterMobile("6536253642");
		rp.enterPass("sudhiringole");
		rp.enterConfPass("jshfdjshfd");
		rp.checkTandC();
		rp.Registartionbutton();
		Assert.assertEquals("Your passwords do not match.","Your passwords do not match.");
		
	}
	

	
}
