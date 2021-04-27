package com.ecm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ecm.qa.base.TestBase;


public class HomePage extends TestBase {
	
	@FindBy(xpath="(//a[@class='product_img_link']/img)[1]")
	WebElement quickviewimage;
	
	@FindBy(xpath="(//span[text()='Quick view'])[1]")
	WebElement quickview;
	
	@FindBy(xpath="(//iframe)[2]")
	WebElement quickviewpopup;
		
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement AddToCart;
	
	@FindBy(tagName="iframe")
	public static WebElement ContinueShoppingFrame;
		
	@FindBy(xpath="//span[@title='Continue shopping']")//
	public static WebElement ContinueShopping;
	
	@FindBy(xpath="//*[@id=\"group_1\"]")
	WebElement sizechange;
	
	@FindBy(xpath="//h1[text()='Faded Short Sleeve T-shirts']")
	WebElement proTitle;
	
	static Actions actions = new Actions(driver);
		
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public static void quickview() throws InterruptedException {
		HomePage homepage = new HomePage();
		
		actions.moveToElement(homepage.quickviewimage).perform();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		homepage.quickview.click();
		
		WebElement frame = driver.findElement(By.xpath("(//iframe)[2]"));	
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		driver.switchTo().frame(frame);
		
	}
	public static void changesize() throws InterruptedException {
		HomePage homepage = new HomePage();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//select")).click();
		
		Select size = new Select(homepage.sizechange);
		
		size.selectByIndex(1);	
	}
	
	public static void addToCart() throws InterruptedException {
		
	HomePage homepage = new HomePage();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	homepage.AddToCart.click();
	
	}

	public static void continueShopping() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("2nd frame is ---> "+ ContinueShoppingFrame);
		driver.switchTo().frame(ContinueShoppingFrame);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage.ContinueShopping.click();
		
	}

}
	
	
	


