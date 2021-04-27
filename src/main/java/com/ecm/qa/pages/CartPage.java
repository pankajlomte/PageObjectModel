package com.ecm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecm.qa.base.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath="//A[@href='http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-orange'][text()='Color : Orange, Size : S']")
	WebElement prodcolor1;
	
	@FindBy(xpath="//A[@href='http://automationpractice.com/index.php?id_product=2&controller=product#/size-s/color-black'][text()='Color : Black, Size : S']")
	WebElement prodcolor2;
	
	@FindBy(xpath="//table[@id='cart_summary']/tbody/tr[1]/td[4]")
	WebElement unitprice;
	
	@FindBy(xpath="//table[@id='cart_summary']/tbody/tr[1]/td[6]")
	WebElement unittotalprice;
	
	@FindBy(xpath="//td[@id='total_product']")
	WebElement Totalproducts;
	
	@FindBy(xpath="//TD[@id='total_shipping']")
	WebElement Totalshipping;
	
	@FindBy(xpath="//SPAN[@id='total_price']")
	WebElement Total;
	
	@FindBy(xpath="//SPAN[text()='Proceed to checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//span/input[@type='checkbox']")
	WebElement termsofservice;
	
	@FindBy(xpath="//div/p/a[@title='Pay by bank wire']")
	WebElement paybybankwire;
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	WebElement confirmorder;
	
	@FindBy(xpath="//div/p/strong[text()='Your order on My Store is complete.']")
	WebElement completeorder;
	

	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	

	
	

}
