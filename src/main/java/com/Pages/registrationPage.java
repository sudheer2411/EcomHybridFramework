package com.Pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class registrationPage extends BaseClass {

	public registrationPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//div[@class='large-6 columns show-for-medium-up']/a")
	public WebElement loginlink;

	@FindBy(id="title")
	public WebElement txttitle;
	@FindBy(id="first_name")
	public WebElement txtfirstName;
	@FindBy(id="last_name")
	public WebElement txtLastName;
	@FindBy(id="email")
	public WebElement txtEmail;
	@FindBy(id="phone")
	public WebElement txtPhone;
	@FindBy(id="mobile")
	public WebElement txtMobile;
	@FindBy(id="password")
	public WebElement txtPassword;
	@FindBy(id="passconf")
	public WebElement txtConfirmPass;
	@FindBy(id="terms")
	public WebElement chktandC;
	@FindBy(id="mailing")
	public WebElement chkSubscribe;
	@FindBy(id="register_submit")
	public WebElement btnRegister;
	@FindBy(xpath="//button[normalize-space()='Reset']")
	public WebElement btnreset;

	public void RageFromLoginPage() {

		loginlink.click();

	}

	public void enterTitle(String Title) {

		txttitle.sendKeys(Title);

	}
	public void enterFirstName(String firstName) {

		txtfirstName.sendKeys(firstName);

	}
	public void enterLastName(String LastName) {

		txtLastName.sendKeys(LastName);

	}
	public void enterEmail(String Email) {

		txtEmail.sendKeys( Email);

	}
	public void enterPhone(String phone) {

		txtPhone.sendKeys(phone);

	}
	public void enterMobile(String mobile) {

		txtMobile.sendKeys(mobile);

	}
	public void enterPass(String pass) {

		txtPassword.sendKeys(pass);

	}
	public void enterConfPass(String confPass) {

		txtConfirmPass.sendKeys(confPass);
	}

	public void checkTandC() {

		chktandC.click();
	}

	public void Registartionbutton() {

		btnRegister.click();
	}
	
	public void resetButton() {

		btnreset.click();
		
	}


}
