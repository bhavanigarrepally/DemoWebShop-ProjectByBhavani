package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerNotebooksPage {

	@FindBy(xpath = "(//input[contains(@value,'Add to cart')])[1]")
	private WebElement notebookaddToCart;
	
	public ComputerNotebooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getnotebookaddToCart() {
		return notebookaddToCart;
	}
}
