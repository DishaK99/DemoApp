package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Home {
WebDriver driver;


	
	By uname=By.id("user-name");
	By pwd=By.id("password");
	By logbtn=By.cssSelector("#login-button");
	
	
	
	By addbtn=By.id("add-to-cart-sauce-labs-backpack");
	By cart=By.xpath("//a[@class='shopping_cart_link']");
	
	//constructor
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void typelog(String uid, String pass)
	{
		driver.findElement(uname).sendKeys(uid);
		driver.findElement(pwd).sendKeys(pass);
		driver.findElement(logbtn).click();
	}
	public void filter() throws InterruptedException
	{
		WebElement e=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select s=new Select(e);
		Thread.sleep(1000);
		s.selectByIndex(2);
	}
	public void addToCart() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(addbtn).click();
		driver.findElement(cart).click();
	}
	

}
