package com.ecm.qa.testcases;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ecm.qa.base.TestBase;
//import com.ecm.qa.pages.CartPage;
import com.ecm.qa.pages.HomePage;
import com.ecm.qa.pages.LoginPage;
import com.ecm.qa.pages.UserPage;

public class Test1 extends TestBase {
	
	public Test1(){
		super();
	}
	
	@BeforeTest
	public void setUp() throws InterruptedException{
		initialization();
		LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	@Test
	public void AdditemtoCart1() throws InterruptedException{
		
		 UserPage.clickonHome();
		 HomePage.quickview();
		 HomePage.changesize();;
		 HomePage.addToCart();
		 HomePage.continueShopping();
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException{
		Thread.sleep(20);
	}

}
