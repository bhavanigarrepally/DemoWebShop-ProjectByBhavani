package org.dwsapp.genericlibrary;

import org.dwsapp.pagerepository.BookPage;
import org.dwsapp.pagerepository.CheckOutPage;
import org.dwsapp.pagerepository.ComputerAccessoriesPage;
import org.dwsapp.pagerepository.ComputerDesktopPage;
import org.dwsapp.pagerepository.ComputerNotebooksPage;
import org.dwsapp.pagerepository.EletronicesCellphonePage;
import org.dwsapp.pagerepository.LoginPage;
import org.dwsapp.pagerepository.WelcomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicConfig extends WebDriverLibrary{
	
	public WelcomePage wpobj;
	public LoginPage lpobj;
	public BookPage bpobj;
	public ComputerDesktopPage cdpobj;
	public ComputerNotebooksPage cnpobj;
	public ComputerAccessoriesPage capobj;
	public EletronicesCellphonePage ecpobj;
	public PropertiesLibrary plib;
	public ExcelLibrary excellib;
	public CheckOutPage copobj;
	
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	
	
	@BeforeSuite
	public void ReportSetup() {
		//Create the SparkReport
		spark = new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//Configure the SparkReport Information
		spark.config().setDocumentTitle("Regression Testing For the SwagLabs");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.STANDARD);
		
		// Create the Extent Report
		report = new ExtentReports();
		
		//Attach the spark Report and ExtentReport
		report.attachReporter(spark);
		
		//Configure the system Information in Extent Report
		report.setSystemInfo("DeviceName :", "Bhavani");
		report.setSystemInfo("OperatingSystem :", "WINDOWS 11");
		report.setSystemInfo("Browser", "chrome :");
		report.setSystemInfo("BrowserVersion :", "chrome - 142.0.7444.176");
	}
	
	@AfterSuite
	public void ReportTerminate() {
		//Flush the Report Information
		report.flush();
	}
	
	
		@Parameters({"url", "browser"})
		@BeforeClass
		public void browserSetup(String url, String browser) 
		{
			
			
			openBrowser(browser);
			
			maximizeBrowser();
			waitStatement();
			navigateToApp(url);
			
			Reporter.log("Browser Setup Success", true);
		
		}
		
		@BeforeMethod
		public void login() {
			
			plib = new PropertiesLibrary();
			
			wpobj = new WelcomePage(driver);
			
			
			waitStatement(wpobj.getloginlink());
			clickOnElement(wpobj.getloginlink());
			
			
			lpobj = new LoginPage(driver);
			
			waitStatement(lpobj.getEmailTextField());
			enterDataOnElement(lpobj.getEmailTextField(), plib.readData("email"));
			enterDataOnElement(lpobj.getPasswordTextField(), plib.readData("Password"));
			clickOnElement(lpobj.getLoginButton());
			
//			lpobj.getEmailTextField().sendKeys(plib.readData("email"));
//			lpobj.getPasswordTextField().sendKeys(plib.readData("Password"));
//			lpobj.getLoginButton().click();
			
			
			Reporter.log("Login success", true);
			
		}
		
		@AfterMethod
		public void logout() {
			
			
			
			wpobj = new WelcomePage(driver);
			
			waitStatement(wpobj.getlogoutlink());
			clickElement_usingJsCode(wpobj.getlogoutlink());
			
			
			Reporter.log("Logout success", true);
		}
		
		@AfterClass
		public void browserTerminate() {
			closeBrowser();
			Reporter.log("Browser Terminate Success", true);
		}
		
		
	

	}


