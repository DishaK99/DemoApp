package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='user-name']")
	WebElement uname;
	
	@FindBy(id="password")
	//@CacheLookup - used to mark the WebElements once located
	@CacheLookup
	WebElement pass;
	
	@FindBy(how=How.XPATH, using="//input[@id='login-button']")
	WebElement logBtn;
	
	//we can use multiple locators for one element
	@FindBys({
		@FindBy(xpath="/input[@id='password']"),
		@FindBy(id="password")
		})
	WebElement password;
	
	@FindAll({
		@FindBy(xpath="/input[@id='password']"),
		@FindBy(id="password")
	})
	WebElement pwd;
	
	public LoginFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void swaglog(String username, String password)
	{
		uname.sendKeys(username);
		pass.sendKeys(password);
		logBtn.click();
	}
	
	public void clickbtn()
	{
		logBtn.click();
		driver.close();
	}
	
}
