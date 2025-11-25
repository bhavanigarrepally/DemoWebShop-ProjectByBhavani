package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerAccessoriesPage {
	
	@FindBy(xpath = "(//input[contains(@value,'Add to cart')])[2]")
	private WebElement AccessoriesaddToCart;
	
	public ComputerAccessoriesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAccessoriesaddToCart() {
		return AccessoriesaddToCart;
	}
}
