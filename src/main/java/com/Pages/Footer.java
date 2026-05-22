package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Footer extends BaseClass {
	
	public Footer(WebDriver driver) {
		
	     PageFactory.initElements(driver, this);
	     
	}

	@FindBy(xpath="//a[text()='About Us']")
	public WebElement aboutuslink;
	@FindBy(xpath="//a[text()='Terms and Conditions']")
	public WebElement TandClink;
	@FindBy(xpath="//a[text()='Privacy Policy']")
	public WebElement privacypolicylink;
	@FindBy(xpath="//a[text()='Returns Policy']")
	public WebElement returnpolicylink;
	@FindBy(xpath="//a[text()='Contact Us']")
	public WebElement contactuslink;
	@FindBy(xpath="//a[@title='Facebook']")
	public WebElement facebooklink;
	@FindBy(xpath="//a[@title='Linkedin']")
	public WebElement linkdinlink;
	@FindBy(xpath="//a[@title='Twitter']")
	public WebElement twitterlink;
	@FindBy(xpath="//a[@title='Vimeo']")
	public WebElement vimeolink;
	
	@FindBy(id="newsletter_email")
	public WebElement subscribemailbox;
	@FindBy(id="subscribe_button")
	public WebElement subscribebutton;

	

	public void aboutUsClick() {

		aboutuslink.click();
		
	}
	
	public void TandCClick() {

		TandClink.click();
	}
	public void PrivacyPolicyClick() {
 
		privacypolicylink.click();
		
	}
	public void rutuenPolicyClick() {

		returnpolicylink.click();
	}
	public void contactUsClick() {

		contactuslink.click();
	}
	public void facebookClick() {

		facebooklink.click();
	}
	public void linkdinClick() {

		linkdinlink.click();
	}
	public void twitterClick() {

		twitterlink.click();
	}
	public void vimeoClick() {

		vimeolink.click();
	}
	public void Subscribetext(String email) {

		subscribemailbox.sendKeys(email);
	}
	public void SubscribeClick() {

		subscribebutton.click();
		
	}
	

}
