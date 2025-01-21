package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwagLogin {
WebDriver driver;
	
@FindBy(id="user-name")WebElement uname;
@FindBy(id="password")WebElement pass;
@FindBy(id="login-button")WebElement logBtn;
	
	public SwagLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void swaglog(String username, String password)
	{
		uname.sendKeys(username);
		pass.sendKeys(password);
		//logBtn.click();
	}
	
	public void clickbtn()
	{
		logBtn.click();
		//driver.close();
	}

}
