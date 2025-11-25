package org.dwsapp.allproductstest;

import org.dwsapp.genericlibrary.BasicConfig;
import org.dwsapp.genericlibrary.ExcelLibrary;
import org.dwsapp.pagerepository.BookPage;
import org.dwsapp.pagerepository.CheckOutPage;
import org.dwsapp.pagerepository.ComputerAccessoriesPage;
import org.dwsapp.pagerepository.ComputerDesktopPage;
import org.dwsapp.pagerepository.ComputerNotebooksPage;
import org.dwsapp.pagerepository.EletronicesCellphonePage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

@Listeners(org.dwsapp.listenerlibrary.ListenerImplementation.class)

public class ProductTest extends BasicConfig{

	
	//Health Book
	
	@Test(enabled = true, priority = 6, groups = "RT")
	public void Book_HealthBookTest() {
		
		//Create the Test Information
		test = report.createTest("Verify -- Healthhhh Bookkk");
		
		//Steps Information
		test.log(Status.INFO, "Step1: Launching the browser successfull");
		
		test.log(Status.INFO, "Step2: Navigating To Application via URL successful");
		
		test.log(Status.PASS, "Step3: Verified the WebPage successful");
		
		excellib = new ExcelLibrary();
		
				
		waitStatement();
		
		bpobj = new BookPage(driver);
		
		//Verify SearchBox in Welcome page is displayed and enabled, and then enter text
		Assert.assertTrue(wpobj.getsearchBox().isDisplayed());
		Assert.assertTrue(wpobj.getsearchBox().isEnabled());
		
		if(wpobj.getsearchBox().isDisplayed() && wpobj.getsearchBox().isEnabled()) {
			test.log(Status.PASS, "Steps4: Verified SearchBox is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Steps4: Verified SearchBox is not displayed and Enabled");
		}
		
		Reporter.log("SearchBox validated successfully", true);
		
		//Get the Search data from Excel
		enterDataOnElement(wpobj.getsearchBox(), excellib.readSingleData("SearchData", 0, 0) );
		
		Reporter.log("SearchData - book entered successfully", true);
		
		//Verify search button display and enable and then click on search button
		Assert.assertTrue(wpobj.getsearchButton().isDisplayed());
		Assert.assertTrue(wpobj.getsearchButton().isEnabled());
		
		if(wpobj.getsearchButton().isDisplayed() && wpobj.getsearchButton().isEnabled()) {
			test.log(Status.PASS, "Steps5: Verified SearchButton is displayed and Enabled");
		}else {
			test.log(Status.FAIL, "Steps5: Verified SearchButton is not displayed and Enabled");
		}
		
		clickOnElement(wpobj.getsearchButton());
		Reporter.log("SearchButton successfully clicked", true);
		
		//Verify Healthbook - Add to cart button is displayed and enabled, then click on Add to Cart button
		
		waitStatement(bpobj.getbookAddToCart());
		
		Assert.assertTrue(bpobj.getbookAddToCart().isDisplayed());
		Assert.assertTrue(bpobj.getbookAddToCart().isEnabled());
		
		if(bpobj.getbookAddToCart().isDisplayed() && bpobj.getbookAddToCart().isEnabled()) {
			test.log(Status.PASS, "Steps6: Verified Book Add to Cart button is displayed and Enabled");
		}else {
			test.log(Status.FAIL, "Steps6: Verified Book Add to Cart button is not displayed and Enabled");
		}
				
		clickOnElement(bpobj.getbookAddToCart());
		Reporter.log("Book added to cart successfully", true);
		
		
		//Verify Shopping cart is displayed and enabled, then click on Shopping cart link
		Assert.assertTrue(wpobj.getshoppingCart().isDisplayed());
		Assert.assertTrue(wpobj.getshoppingCart().isEnabled());
		if(wpobj.getshoppingCart().isDisplayed() && wpobj.getshoppingCart().isEnabled()) {
			test.log(Status.PASS, "Step7: Verified Shopping Cart is displayed and Enabled");
		}else {
			test.log(Status.FAIL, "Step7: Verified Shopping Cart is not displayed and Enabled");
		}
		
		clickOnElement(wpobj.getshoppingCart());
		Reporter.log("Clicked on Shopping Cart", true);
		
		copobj = new CheckOutPage(driver);
		
		//Selecting Terms and Conditions Check box in Checkout page
		waitStatement(copobj.gettermsAndCond());
		
		Assert.assertTrue(copobj.gettermsAndCond().isDisplayed());
		Assert.assertTrue(copobj.gettermsAndCond().isEnabled());
		if(copobj.gettermsAndCond().isDisplayed() && copobj.gettermsAndCond().isEnabled()) {
			test.log(Status.PASS, "Step8: Verified terms and conditions checkbox is displayed and Enabled");
		}else {
			test.log(Status.FAIL, "Step8: Verified terms and conditions checkbox is not displayed and Enabled");
		}
		
		clickOnElement(copobj.gettermsAndCond());
		Reporter.log("terms and Condition checkbox selected", true);
		
		//Click on Checkout Button 
		waitStatement(copobj.getcheckoutButton());
		
		Assert.assertTrue(copobj.getcheckoutButton().isDisplayed());
		Assert.assertTrue(copobj.getcheckoutButton().isEnabled());
		if(copobj.getcheckoutButton().isDisplayed() && copobj.getcheckoutButton().isEnabled()) {
			test.log(Status.PASS, "Step9: Verified Checkout Button is displayed and Enabled");
		}else {
			test.log(Status.FAIL, "Step9: Verified Checkout Button is not displayed and Enabled");
		}
		clickOnElement(copobj.getcheckoutButton());
		Reporter.log("Checkout button selected", true);
		
		waitStatement(copobj.getbillAddressContinue());
		
		Assert.assertTrue(copobj.getbillAddressContinue().isDisplayed());
		Assert.assertTrue(copobj.getbillAddressContinue().isEnabled());
		if(copobj.getbillAddressContinue().isDisplayed() && copobj.getbillAddressContinue().isEnabled()) {
			test.log(Status.PASS, "Step 10 : Verify Billing Address Continue button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 10 : Verify Billing Address Continue button is not displayed and enabled");
		}
		clickOnElement(copobj.getbillAddressContinue());
		Reporter.log("Billing Address Continue button clicked", true);
		
		
		waitStatement(copobj.getshipAddressContinue());
		
		Assert.assertTrue(copobj.getshipAddressContinue().isDisplayed());
		Assert.assertTrue(copobj.getshipAddressContinue().isEnabled());
		if(copobj.getshipAddressContinue().isDisplayed() && copobj.getshipAddressContinue().isEnabled()) {
			test.log(Status.PASS, "Step 11 : Verify Shipping Address Continue button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 11 : Verify Shipping Address Continue button is not displayed and enabled");
		}
		clickOnElement(copobj.getshipAddressContinue());
		Reporter.log("Shipping Address Continue button selected", true);
		
		
		waitStatement(copobj.getshipMethodContinue());
		
		Assert.assertTrue(copobj.getshipMethodContinue().isDisplayed());
		Assert.assertTrue(copobj.getshipMethodContinue().isEnabled());
		if(copobj.getshipMethodContinue().isDisplayed() && copobj.getshipMethodContinue().isEnabled()) {
			test.log(Status.PASS, "Step 12 : Verify Shipping Method Continue Button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 12 : Verify Shipping Method Continue Button is not displayed and enabled");
		}
		clickOnElement(copobj.getshipMethodContinue());
		Reporter.log("Shipping Method Continue Button",true);
		
		waitStatement(copobj.getpayMethodContinue());
		
		Assert.assertTrue(copobj.getpayMethodContinue().isDisplayed());
		Assert.assertTrue(copobj.getpayMethodContinue().isEnabled());
		if(copobj.getpayMethodContinue().isDisplayed() && copobj.getpayMethodContinue().isEnabled()) {
			test.log(Status.PASS, "Step 13 : Verify Payment Method Continue Button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 13 : Verify Payment Method Continue Button is not displayed and enabled");
		}
		clickOnElement(copobj.getpayMethodContinue());
		Reporter.log("Payment Method Continue Button",true);
		
		waitStatement(copobj.getpayInfoContinue());
		
		Assert.assertTrue(copobj.getpayInfoContinue().isDisplayed());
		Assert.assertTrue(copobj.getpayInfoContinue().isEnabled());
		if(copobj.getpayInfoContinue().isDisplayed() && copobj.getpayInfoContinue().isEnabled()) {
			test.log(Status.PASS, "Step 14 : Verify Payment Info Continue Button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 14 : Verify Payment Info Continue Button is not displayed and enabled");
		}
		clickOnElement(copobj.getpayInfoContinue());
		Reporter.log("Payment Info Continue Button",true);
		
		
		waitStatement(copobj.getconfirmOrder());
		
		Assert.assertTrue(copobj.getconfirmOrder().isDisplayed());
		Assert.assertTrue(copobj.getconfirmOrder().isEnabled());
		if(copobj.getconfirmOrder().isDisplayed() && copobj.getconfirmOrder().isEnabled()) {
			test.log(Status.PASS, "Step 15 : Verify Confirm order Button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 15 : Verify Confirm order Button is not displayed and enabled");
		}
		clickOnElement(copobj.getconfirmOrder());
		Reporter.log("Confirm order Button",true);
		
		Reporter.log("BookTest - HealthBook - verified", true);
	}

	
	
	
	//Computer Desktop
	
@Test(enabled = true, priority = 3, groups = "FT")
	public void Computers_desktopTest() {

		// Create the Test Information
		test = report.createTest("Verify Computerrrr -- Desktoppp");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching the browser successfull");

		test.log(Status.INFO, "Step2: Navigating To Application via URL successful");

		test.log(Status.PASS, "Step3: Verified the WebPage successful");

		waitStatement();

		cdpobj = new ComputerDesktopPage(driver);

		// Verify computer header displayed and enabled, then Hover on header
		Assert.assertTrue(wpobj.getcomputerHeader().isDisplayed());
		Assert.assertTrue(wpobj.getcomputerHeader().isEnabled());

		if(wpobj.getcomputerHeader().isDisplayed() && wpobj.getcomputerHeader().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified Computer Header is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Step4: Verified Computer Header is not displayed and Enabled");
		}
		
		mouseHoverToElement(wpobj.getcomputerHeader());

		// Verify Desktop header displayed and enabled in computer tab, then Hover on header
		Assert.assertTrue(wpobj.getdesktopHeader().isDisplayed());
		Assert.assertTrue(wpobj.getdesktopHeader().isEnabled());

		if(wpobj.getdesktopHeader().isDisplayed() && wpobj.getdesktopHeader().isEnabled()) {
			test.log(Status.PASS, "Step5: Verified Desktop Header is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Step5: Verified Desktop Header is not displayed and Enabled");
		}
		
		mouseHoverToElement(wpobj.getdesktopHeader());
		clickOnElement(wpobj.getdesktopHeader());

		// Verify Desktop - Add to cart button is displayed and enabled, then click on Add to Cart button
		Assert.assertTrue(cdpobj.getdesktopAddToCart().isDisplayed());
		Assert.assertTrue(cdpobj.getdesktopAddToCart().isEnabled());

		if(cdpobj.getdesktopAddToCart().isDisplayed() && cdpobj.getdesktopAddToCart().isEnabled()) {
			test.log(Status.PASS, "Steps6: Verified Desktop Add to Cart button is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Steps6: Verified Desktop Add to Cart button is not displayed and Enabled");
		}
		
		clickOnElement(cdpobj.getdesktopAddToCart());
		
		
		//Verify Shopping cart is displayed and enabled, then click on Shopping cart link
				Assert.assertTrue(wpobj.getshoppingCart().isDisplayed());
				Assert.assertTrue(wpobj.getshoppingCart().isEnabled());
				if(wpobj.getshoppingCart().isDisplayed() && wpobj.getshoppingCart().isEnabled()) {
					test.log(Status.PASS, "Step7: Verified Shopping Cart is displayed and Enabled");
				}else {
					test.log(Status.FAIL, "Step7: Verified Shopping Cart is not displayed and Enabled");
				}
				
				clickOnElement(wpobj.getshoppingCart());
				Reporter.log("Clicked on Shopping Cart", true);
				
				copobj = new CheckOutPage(driver);
				
				//Selecting Terms and Conditions Check box in Checkout page
				waitStatement(copobj.gettermsAndCond());
				
				Assert.assertTrue(copobj.gettermsAndCond().isDisplayed());
				Assert.assertTrue(copobj.gettermsAndCond().isEnabled());
				if(copobj.gettermsAndCond().isDisplayed() && copobj.gettermsAndCond().isEnabled()) {
					test.log(Status.PASS, "Step8: Verified terms and conditions checkbox is displayed and Enabled");
				}else {
					test.log(Status.FAIL, "Step8: Verified terms and conditions checkbox is not displayed and Enabled");
				}
				
				clickOnElement(copobj.gettermsAndCond());
				Reporter.log("terms and Condition checkbox selected", true);
				
				//Click on Checkout Button 
				waitStatement(copobj.getcheckoutButton());
				
				Assert.assertTrue(copobj.getcheckoutButton().isDisplayed());
				Assert.assertTrue(copobj.getcheckoutButton().isEnabled());
				if(copobj.getcheckoutButton().isDisplayed() && copobj.getcheckoutButton().isEnabled()) {
					test.log(Status.PASS, "Step9: Verified Checkout Button is displayed and Enabled");
				}else {
					test.log(Status.FAIL, "Step9: Verified Checkout Button is not displayed and Enabled");
				}
				clickOnElement(copobj.getcheckoutButton());
				Reporter.log("Checkout button selected", true);
				
				waitStatement(copobj.getbillAddressContinue());
				
				Assert.assertTrue(copobj.getbillAddressContinue().isDisplayed());
				Assert.assertTrue(copobj.getbillAddressContinue().isEnabled());
				if(copobj.getbillAddressContinue().isDisplayed() && copobj.getbillAddressContinue().isEnabled()) {
					test.log(Status.PASS, "Step 10 : Verify Billing Address Continue button is displayed and enabled");
				} else {
					test.log(Status.FAIL, "Step 10 : Verify Billing Address Continue button is not displayed and enabled");
				}
				clickOnElement(copobj.getbillAddressContinue());
				Reporter.log("Billing Address Continue button clicked", true);
				
				
				waitStatement(copobj.getshipAddressContinue());
				
				Assert.assertTrue(copobj.getshipAddressContinue().isDisplayed());
				Assert.assertTrue(copobj.getshipAddressContinue().isEnabled());
				if(copobj.getshipAddressContinue().isDisplayed() && copobj.getshipAddressContinue().isEnabled()) {
					test.log(Status.PASS, "Step 11 : Verify Shipping Address Continue button is displayed and enabled");
				} else {
					test.log(Status.FAIL, "Step 11 : Verify Shipping Address Continue button is not displayed and enabled");
				}
				clickOnElement(copobj.getshipAddressContinue());
				Reporter.log("Shipping Address Continue button selected", true);
				
				
				waitStatement(copobj.getshipMethodContinue());
				
				Assert.assertTrue(copobj.getshipMethodContinue().isDisplayed());
				Assert.assertTrue(copobj.getshipMethodContinue().isEnabled());
				if(copobj.getshipMethodContinue().isDisplayed() && copobj.getshipMethodContinue().isEnabled()) {
					test.log(Status.PASS, "Step 12 : Verify Shipping Method Continue Button is displayed and enabled");
				} else {
					test.log(Status.FAIL, "Step 12 : Verify Shipping Method Continue Button is not displayed and enabled");
				}
				clickOnElement(copobj.getshipMethodContinue());
				Reporter.log("Shipping Method Continue Button",true);
				
				waitStatement(copobj.getpayMethodContinue());
				
				Assert.assertTrue(copobj.getpayMethodContinue().isDisplayed());
				Assert.assertTrue(copobj.getpayMethodContinue().isEnabled());
				if(copobj.getpayMethodContinue().isDisplayed() && copobj.getpayMethodContinue().isEnabled()) {
					test.log(Status.PASS, "Step 13 : Verify Payment Method Continue Button is displayed and enabled");
				} else {
					test.log(Status.FAIL, "Step 13 : Verify Payment Method Continue Button is not displayed and enabled");
				}
				clickOnElement(copobj.getpayMethodContinue());
				Reporter.log("Payment Method Continue Button",true);
				
				waitStatement(copobj.getpayInfoContinue());
				
				Assert.assertTrue(copobj.getpayInfoContinue().isDisplayed());
				Assert.assertTrue(copobj.getpayInfoContinue().isEnabled());
				if(copobj.getpayInfoContinue().isDisplayed() && copobj.getpayInfoContinue().isEnabled()) {
					test.log(Status.PASS, "Step 14 : Verify Payment Info Continue Button is displayed and enabled");
				} else {
					test.log(Status.FAIL, "Step 14 : Verify Payment Info Continue Button is not displayed and enabled");
				}
				clickOnElement(copobj.getpayInfoContinue());
				Reporter.log("Payment Info Continue Button",true);
				
				
				waitStatement(copobj.getconfirmOrder());
				
				Assert.assertTrue(copobj.getconfirmOrder().isDisplayed());
				Assert.assertTrue(copobj.getconfirmOrder().isEnabled());
				if(copobj.getconfirmOrder().isDisplayed() && copobj.getconfirmOrder().isEnabled()) {
					test.log(Status.PASS, "Step 15 : Verify Confirm order Button is displayed and enabled");
				} else {
					test.log(Status.FAIL, "Step 15 : Verify Confirm order Button is not displayed and enabled");
				}
				clickOnElement(copobj.getconfirmOrder());
				Reporter.log("Confirm order Button",true);

		Reporter.log("ComputerTest - Desktops - verified", true);
	}
	

	@Test(enabled = true, priority = 5, groups = "IT")
	public void Computers_notebooksTest() {

		// Create the Test Information
		test = report.createTest("Verify Computerrrr -- notebookkk");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching the browser successfull");

		test.log(Status.INFO, "Step2: Navigating To Application via URL successful");

		test.log(Status.PASS, "Step3: Verified the WebPage successful");

		waitStatement();

		cnpobj = new ComputerNotebooksPage(driver);

		// Verify computer header displayed and enabled, then Hover on header
		Assert.assertTrue(wpobj.getcomputerHeader().isDisplayed());
		Assert.assertTrue(wpobj.getcomputerHeader().isEnabled());

		if(wpobj.getcomputerHeader().isDisplayed() && wpobj.getcomputerHeader().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified Computer Header is displayed and Enabled");
		}else {
			test.log(Status.FAIL, "Step4: Verified Computer Header is not displayed and Enabled");
		}
		
		mouseHoverToElement(wpobj.getcomputerHeader());

		// Verify Notebooks header displayed and enabled in computer tab, then Hover on  header
		Assert.assertTrue(wpobj.getnotebooksHeader().isDisplayed());
		Assert.assertTrue(wpobj.getnotebooksHeader().isEnabled());

		if(wpobj.getnotebooksHeader().isDisplayed() && wpobj.getnotebooksHeader().isEnabled()) {
			test.log(Status.PASS, "Step5: Verified NoteBooks Header is displayed and Enabled");
		}else {
			test.log(Status.FAIL, "Step5: Verified NoteBooks Header is not displayed and Enabled");
		}
		
		mouseHoverToElement(wpobj.getnotebooksHeader());
		clickOnElement(wpobj.getnotebooksHeader());

		// Verify Notebook - Add to cart button is displayed and enabled, then click on  Add to Cart button
		Assert.assertTrue(cnpobj.getnotebookaddToCart().isDisplayed());
		Assert.assertTrue(cnpobj.getnotebookaddToCart().isEnabled());

		if(cnpobj.getnotebookaddToCart().isDisplayed() && cnpobj.getnotebookaddToCart().isEnabled()) {
			test.log(Status.PASS, "Steps6: Verified Notebook Add to Cart button is displayed and Enabled");
		}else {
			test.log(Status.FAIL, "Steps6: Verified Notebook Add to Cart button is not displayed and Enabled");
		}
		
		clickOnElement(cnpobj.getnotebookaddToCart());

		Reporter.log("ComputerTest - NoteBooks - verified", true);
	}

	@Test(enabled = true, priority = 2, groups = "RT")
	public void Computers_accessoriesTest() {
		
		// Create the Test Information
		test = report.createTest("Verify Computerrrr -- accessoriess");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching the browser successfull");

		test.log(Status.INFO, "Step2: Navigating To Application via URL successful");

		test.log(Status.PASS, "Step3: Verified the WebPage successful");

		waitStatement();

		capobj = new ComputerAccessoriesPage(driver);

		// Verify computer header displayed and enabled, then Hover on header
		Assert.assertTrue(wpobj.getcomputerHeader().isDisplayed());
		Assert.assertTrue(wpobj.getcomputerHeader().isEnabled());

		if(wpobj.getcomputerHeader().isDisplayed() && wpobj.getcomputerHeader().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified Computer Header is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Step4: Verified Computer Header is not displayed and Enabled");
		}
		
		mouseHoverToElement(wpobj.getcomputerHeader());

		// Verify Accessories header displayed and enabled in computer tab, then Hover on header
		Assert.assertTrue(wpobj.getaccessoriesHeader().isDisplayed());
		Assert.assertTrue(wpobj.getaccessoriesHeader().isEnabled());

		if(wpobj.getaccessoriesHeader().isDisplayed() && wpobj.getaccessoriesHeader().isEnabled()) {
			test.log(Status.PASS, "Step5: Verified Accessories Header is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Step5: Verified Accessories Header is not displayed and Enabled");
		}
		
		mouseHoverToElement(wpobj.getaccessoriesHeader());
		clickOnElement(wpobj.getaccessoriesHeader());

		// Verify Accessories - Add to cart button is displayed and enabled, then click on Add to Cart button
		Assert.assertTrue(capobj.getAccessoriesaddToCart().isDisplayed());
		Assert.assertTrue(capobj.getAccessoriesaddToCart().isEnabled());

		if(capobj.getAccessoriesaddToCart().isDisplayed() && capobj.getAccessoriesaddToCart().isEnabled()) {
			test.log(Status.PASS, "Steps6: Verified Accessories Add to Cart button is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Steps6: Verified Accessories Add to Cart button is not displayed and Enabled");
		}
		
		clickOnElement(capobj.getAccessoriesaddToCart());

		Reporter.log("ComputerTest - Accessories - verified", true);
	}
	
	
	
	
	@Test(enabled = true, priority = 1, groups = "FT")
	public void Electronics_CameraAndPhotoTest() {

		waitStatement();
		test = report.createTest("Verify Electronicss -- CameraAndPhoto");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching the browser successfull");

		test.log(Status.INFO, "Step2: Navigating To Application via URL successful");

		test.log(Status.PASS, "Step3: Verified the WebPage successful");
		
		Reporter.log("ElectronicsTest - Camera and photo - verified", true);
	}

	
	
	@Test(enabled = true, priority = 4, groups = "RT")
	public void Electronics_cellphonesTest() {
		
		// Create the Test Information
		test = report.createTest("Verify Electronicss -- Cellphonee");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching the browser successfull");

		test.log(Status.INFO, "Step2: Navigating To Application via URL successful");

		test.log(Status.PASS, "Step3: Verified the WebPage successful");

		waitStatement();
		
		ecpobj = new EletronicesCellphonePage(driver);
		
		//Verify Electronics header displayed and enabled, then Hover on header
		Assert.assertTrue(wpobj.getelectronicsHeader().isDisplayed());
		Assert.assertTrue(wpobj.getelectronicsHeader().isEnabled());
		
		if(wpobj.getelectronicsHeader().isDisplayed() && wpobj.getelectronicsHeader().isEnabled()) {
			test.log(Status.PASS, "Step4: Verified Electronics Header is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Step4: Verified Electronics Header is not displayed and Enabled");
		}
		mouseHoverToElement(wpobj.getelectronicsHeader());
		
		//Verify CellPhone header displayed and enabled in Electronics tab, and then Hover on header
		Assert.assertTrue(wpobj.getcellphoneHeader().isDisplayed());
		Assert.assertTrue(wpobj.getcellphoneHeader().isEnabled());
		
		if(wpobj.getcellphoneHeader().isDisplayed() && wpobj.getcellphoneHeader().isEnabled()) {
			test.log(Status.PASS, "Step5: Verified CellPhone Header is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Step5: Verified CellPhone Header is not displayed and Enabled");
		}
		
		mouseHoverToElement(wpobj.getcellphoneHeader());
		clickOnElement(wpobj.getcellphoneHeader());
		
		//Verify Accessories - Add to cart button is displayed and enabled, then click on Add to Cart button
		Assert.assertTrue(ecpobj.getcellphoneAddToCart().isDisplayed());
		Assert.assertTrue(ecpobj.getcellphoneAddToCart().isEnabled());
		
		if(ecpobj.getcellphoneAddToCart().isDisplayed() && ecpobj.getcellphoneAddToCart().isEnabled()) {
			test.log(Status.PASS, "Steps6: Verified CellPhone Add to Cart button is displayed and Enabled");
		}
		else {
			test.log(Status.FAIL, "Steps6: Verified CellPhone Add to Cart button is not displayed and Enabled\"");
		}
		clickOnElement(ecpobj.getcellphoneAddToCart());

		
		Reporter.log("ElectronicsTest - Cellphones - verified", true);

	}
	
}
