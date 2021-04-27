package com.ecm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.ecm.qa.pages.HomePage;
import com.ecm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
		@FindBy(xpath="//*[@id=\"email\"]")
		public static WebElement username;
		
		@FindBy(xpath="//*[@id=\"passwd\"]")
		public static WebElement password;
		
		@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
		public static WebElement SignInbutton;
		
		@FindBy(xpath="//*[@id=\"header_logo\"]/a/img")
		public static WebElement ecmLogo;
		
		
		@FindBy(xpath="//div/a[@title='Log in to your customer account']")
		WebElement SignInheader;
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public static String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateCRMImage(){
			return ecmLogo.isDisplayed();
		}
		
		public static void login(String un, String pwd) throws InterruptedException{
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			LoginPage loginpage = new LoginPage();
			loginpage.SignInheader.click();
			Thread.sleep(5);
			username.sendKeys(un);
			password.sendKeys(pwd);
			Thread.sleep(10);
			SignInbutton.click();
			    	//JavascriptExecutor js = (JavascriptExecutor)driver;
			    	//js.executeScript("arguments[0].click();", SignInbutton);
		}
		

	
	
	
}
