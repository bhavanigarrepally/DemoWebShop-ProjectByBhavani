package org.dwsapp.pagerepository;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	@FindBy(partialLinkText = "Log")
	//Identify and Declare Securely
	private WebElement loginlink;
	
	@FindBy(xpath = "//a[text() = 'Register']")
	private WebElement registerlink;
	
	@FindBy(xpath = "//a[@href = '/logout']")
	private WebElement logoutlink;
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath = "(//a[contains(text(),'Computer')])[1]")
	private WebElement computerHeader;
	
	@FindBy(xpath = "(//a[contains(text(),'Desktop')])[1]")
	private WebElement desktopHeader;
	
	@FindBy(xpath = "(//a[contains(text(),'Notebooks')])[1]")
	private WebElement notebooksHeader;
	
	@FindBy(xpath = "(//a[contains(text(),'Accessories')])[1]")
	private WebElement accessoriesHeader;
	
	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	private WebElement electronicsHeader;
	
	@FindBy(xpath = "(//a[contains(text(),'Cell phones')])[1]")
	private WebElement cellphoneHeader;
	
	@FindBy(xpath = "// a/span[1][contains(text(),'Shopping cart')]")
	private WebElement shoppingCart;
	
	
	
	//Initialization via constructor
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization via getters
	public WebElement getloginlink() {
		
		return loginlink;
	}
	
	public WebElement getregisterlink() {
		
		return registerlink;
	}
	
	public WebElement getlogoutlink() {
		
		return logoutlink;
	}
	
	public WebElement getsearchBox() {
		return searchBox;
	}
	
	public WebElement getsearchButton() {
		return searchButton;
	}
	
	public WebElement getcomputerHeader() {
		return computerHeader;
	}
	
	public WebElement getdesktopHeader() {
		return desktopHeader;
	}
	
	public WebElement getnotebooksHeader() {
		return notebooksHeader;
	}
	
	public WebElement getaccessoriesHeader() {
		return accessoriesHeader;
	}
	
	public WebElement getelectronicsHeader() {
		return electronicsHeader;
	}
	
	public WebElement getcellphoneHeader() {
		return cellphoneHeader;
	}
	
	public WebElement getshoppingCart() {
		return shoppingCart;
	}
	
	
}
