package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgerKingFactory {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/ul/li[3]/span")WebElement login;
	@FindBy(id="mobileNumber")WebElement mobNumber;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/button")WebElement getOTPBtn;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/button")WebElement verifyOTPBtn;
	
	@FindBy(xpath="//span[@class='location-input__value']")WebElement location;
	
	@FindBy(xpath="//*[@id=\"homeTop\"]/div[2]/section[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/button/div/span[1]")WebElement addBtn;
	@FindBy(xpath="//*[@id=\"homeTop\"]/div[4]/div/div[2]/div/div[2]")WebElement addToCart;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/ul/li[4]/span")WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div/div/div[1]/div/div/div[4]/button")WebElement checkout;
	
	public BurgerKingFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void login() throws InterruptedException
	{
		
		login.click();
		mobNumber.sendKeys("9172276422");
		getOTPBtn.click();
		Thread.sleep(40000);
		verifyOTPBtn.click();
		Thread.sleep(15000);
	}
	
	public void addtocart() throws InterruptedException
	{
		addBtn.click();
		addToCart.click();
		addToCartBtn.click();
	}
	
	public void checkout()
	{
		checkout.click();
	}
}
