package com.ecm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecm.qa.base.TestBase;

public class UserPage extends TestBase {
	
	@FindBy(xpath = "//span[text()='test pom']")
	@CacheLookup
	public static WebElement userNameLabel;

	@FindBy(xpath = "(//SPAN)[35]")
	public WebElement Home;
	
	@FindBy(xpath = "//SPAN[text()='Order history and details']")
	public  WebElement OrderHistory;
	
	// Initializing the Page Objects:
		public UserPage() {
			PageFactory.initElements(driver, this);
		}
		
		public boolean verifyCorrectUserName(){
			return userNameLabel.isDisplayed();
		}
		
		 public static void clickonHome() throws InterruptedException {
			 Thread.sleep(50);
			 
			 UserPage userpage = new UserPage();
			 userpage.Home.click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		}
		
	
	

}
