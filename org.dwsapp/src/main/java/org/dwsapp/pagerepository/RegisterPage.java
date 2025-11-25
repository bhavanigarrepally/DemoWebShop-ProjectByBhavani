package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(xpath = "//input[@id = 'gender-male']")
	private WebElement maleradiobtn;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	private WebElement femaleradiobtn;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstnametextfield;
	
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastnametextfield;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailtextfield;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement cnfpasswordtextfield;
	
	@FindBy(xpath = "//input[@id='register-button']")
	private WebElement registerbutton;
	
	
	//Initialization via constructor
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getmaleradiobtn() {
		return maleradiobtn;
	}
	
	public WebElement getfemaleradiobtn() {
		return femaleradiobtn;
	}
	
	public WebElement getfirstnametextfield() {
		return firstnametextfield;
	}
	
	public WebElement getlastnametextfield() {
		return lastnametextfield;
	}
	
	public WebElement getemailtextfield() {
		return emailtextfield;
	}
	
	public WebElement getpasswordtextfield() {
		return passwordtextfield;
	}
	
	public WebElement getcnfpasswordtextfield() {
		return cnfpasswordtextfield;
	}
	
	public WebElement getregisterbutton() {
		return registerbutton;
	}
}
