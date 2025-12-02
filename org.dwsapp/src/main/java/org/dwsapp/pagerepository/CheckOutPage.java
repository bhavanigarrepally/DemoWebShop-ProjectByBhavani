package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	@FindBy(id="termsofservice")
	private WebElement termsAndCond;
	
	@FindBy(xpath = "//button[@id = 'checkout']")
	private WebElement checkoutButton;
	
	@FindBy(xpath = "(//input[@value = 'Continue'])[1]")
	private WebElement billAddressContinue;
	
	@FindBy(xpath = "(//input[@value = 'Continue'])[2]")
	private WebElement shipAddressContinue;
	
	@FindBy(xpath = "(//input[@value = 'Continue'])[3]")
	private WebElement shipMethodContinue;
	
	@FindBy(xpath = "(//input[@value = 'Continue'])[4]")
	private WebElement payMethodContinue;
	
	@FindBy(xpath = "(//input[@value = 'Continue'])[5]")
	private WebElement payInfoContinue;
	
	@FindBy(xpath = "//input[@value = 'Confirm']")
	private WebElement confirmOrder;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement confirmOrderSuccess;
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement gettermsAndCond() {
		return termsAndCond;
	}
	
	public WebElement getcheckoutButton() {
		return checkoutButton;
	}
	
	public WebElement getbillAddressContinue() {
		return billAddressContinue;
	}
	
	public WebElement getshipAddressContinue() {
		return shipAddressContinue;
	}
	
	public WebElement getshipMethodContinue() {
		return shipMethodContinue;
	}
	
	public WebElement getpayMethodContinue() {
		return payMethodContinue;
	}
	
	public WebElement getpayInfoContinue() {
		return payInfoContinue;
	}
	
	public WebElement getconfirmOrder() {
		return confirmOrder;
	}
	
	public WebElement getconfirmOrderSuccess() {
		return confirmOrderSuccess;
	}
	
	

}
