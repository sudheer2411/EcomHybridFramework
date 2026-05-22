package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;



public class successLogin extends BaseClass  {


	public successLogin(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//a[@class='button trans small nopad-sides' and text()='Login']")
	public WebElement LoginLink;

	@FindBy(id="login-username")
	public  WebElement username;
	@FindBy(id="login-password")
	public WebElement password;
	@FindBy(xpath="//button[@name='submit']")
	public WebElement loginbutton;
	@FindBy(xpath="//a[@class='button trans small nopad-sides' and text()='Register']")
	public WebElement newReg;
	@FindBy(xpath="(//a[@class='button secondary expand nomarg'])[6]")
	public WebElement logout;

	public void GetLogin() {

		LoginLink.click();
	}

	public void enterUsername(String userid) {

		username.clear();
		username.sendKeys(userid);
	}

	public void enterPassword(String pass) {

		password.clear();
		password.sendKeys(pass);
	}

	public void loginClick() {

		loginbutton.click();
	}

	public void newRegClick() {

		newReg.click();
	}

	public void Logout() {

		logout.click();
	}

}
