package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EletronicesCellphonePage {

	@FindBy(xpath = "(//input[contains(@value,'Add to cart')])[1]")
	private WebElement cellphoneAddToCart;
	
	public EletronicesCellphonePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getcellphoneAddToCart() {
		return cellphoneAddToCart;
	}
}
