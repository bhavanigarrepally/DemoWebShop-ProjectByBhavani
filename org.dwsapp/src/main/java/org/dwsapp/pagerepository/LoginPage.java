package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// 1. Identify and Declare Securely

	@FindBy(id = "Email")
	private WebElement EmailTextField;

	
	@FindBy(id = "Password")
	private WebElement PasswordTextField;

	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement LoginButton;


	// 2. Initialization via constructor

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 3. Utilization via getters & setters

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
}
