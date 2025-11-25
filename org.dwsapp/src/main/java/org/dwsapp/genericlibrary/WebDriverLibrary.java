package org.dwsapp.genericlibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverLibrary implements ProjectConstant {

	public WebDriver driver;
	public static WebDriver stdriver;
	public Actions actionobj;
	public Select selectobj;

	// Step1: Open the Browser
	public WebDriver openBrowser(String browser) {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			stdriver = driver;
		} else if (browser.equals("Edge")) {
			driver = new EdgeDriver();
			stdriver = driver;
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			stdriver = driver;
		} else {
			System.out.println("Invalid Browser");
		}

		return driver;
	}

	public void navigateToApp(String url) {
		driver.get(url);
	}

	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void closeAllBroswer() {
		driver.quit();
	}

	public void waitStatement() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitduration));
	}

	public void waitStatement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitduration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public void clickOnElement_UsingActions(WebElement element) {
		actionobj = new Actions(driver);
		actionobj.moveToElement(element).click().perform();
	}

	public void enterDataOnElement(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
	}

	public void enterDataOnElement_UsingActions(WebElement element, String data) {
		actionobj = new Actions(driver);
		element.clear();
		actionobj.click(element).sendKeys(data).perform();
	}

	public void mouseHoverToElement(WebElement element) {
		actionobj = new Actions(driver);
		actionobj.moveToElement(element).perform();
	}

	public void selectOption(WebElement dropdown, int index) {

		selectobj = new Select(dropdown);
		selectobj.selectByIndex(index);
	}

	public void selectOption(WebElement dropdown, String value) {

		selectobj = new Select(dropdown);
		selectobj.selectByValue(value);

	}

	public void selectOption(String visibleText, WebElement dropdown) {

		selectobj = new Select(dropdown);

		selectobj.selectByVisibleText(visibleText);
	}

}
