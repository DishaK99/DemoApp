package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMClass {
	
	WebDriver driver;
	
	By uname=By.id("user-name");
	By pwd=By.id("password");
	By logbtn=By.cssSelector("#login-button");
	
	//constructor
	public POMClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typelog(String uid, String pass)
	{
		driver.findElement(uname).sendKeys(uid);
		driver.findElement(pwd).sendKeys(pass);
		driver.findElement(logbtn).click();
	}
	public void typeuser()
	{
		driver.findElement(uname).sendKeys("standard_user");
		}
	public void typepass()
	{
		driver.findElement(pwd).sendKeys("secret_sauce");
	}
	public void clickbtn()
	{
		driver.findElement(logbtn).click();
	}

}
