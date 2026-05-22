package com.tests;

import java.time.Duration;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Listeners.MyListeners;
import com.Pages.Footer;
import com.base.BaseClass;
@Listeners(MyListeners.class)
public class FooterTest extends BaseClass {

	Footer ft =null;
	@BeforeClass
	public void setup() throws Exception {
		
		BaseClass.SetUp();
		BaseClass.ReportUtils();
		ft = new Footer(driver);
			
	}
	
	@BeforeMethod
	public void waiting() throws InterruptedException {
		
		Thread.sleep(3000);
	}
	
	@Test
	public void aboutUsTest() {
		
		ft.aboutUsClick();
		Assert.assertEquals(driver.getTitle(),"About Us");
		
	}
	
	@Test
	public void TandC_Test() {
		ft.TandCClick();
		Assert.assertEquals(driver.getTitle(),"Terms and Conditions");
		
	}
	
	@Test
	public void PrivacyPolicyTest() {
		ft.PrivacyPolicyClick();
		Assert.assertEquals(driver.getTitle(),"Privacy Policy");
		
	}
	
	@Test
	public void returnTest() {
		ft.rutuenPolicyClick();
		Assert.assertEquals(driver.getTitle(),"Returns Policy");
		
	}
	
	@Test
	public void ContactUsTest() {
		ft.contactUsClick();
		Assert.assertEquals(driver.getTitle(),"");
		
	}
	
	@Test
	public void facebookTest() {
		ft.facebookClick();
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
		
	}
	
	@Test
	public void linkdinTest() {
		ft.linkdinClick();
		Assert.assertEquals(driver.getTitle(),"Contact Us");
		
	}
	
	@Test
	public void twitterTest() {
		ft.twitterClick();
		Assert.assertEquals(driver.getTitle(),"Contact Us");
		
	}
	@Test
	public void vimeoTest() {
		ft.vimeoClick();
		Assert.assertEquals(driver.getTitle(),"Contact Us");
		
	}
	@Test
	public void subscibemailTest() {
		
		throw new SkipException("skipped test...");
		
	}
	
}
