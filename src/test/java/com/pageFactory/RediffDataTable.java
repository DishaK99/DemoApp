package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffDataTable {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='http://register.rediff.com/register/register.php?FormName=user_details']")WebElement createAcc;
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")WebElement name;
	@FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")WebElement ID;
	@FindBy(xpath="//*[@id=\"Register\"]")WebElement register;
	
	public RediffDataTable(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void create()
	{
		createAcc.click();
	}
	public void enterDetails(String uname, String uid)
	
	{
		name.sendKeys(uname);
		ID.sendKeys(uid);
	}
	public void registerUser()
	{
		register.click();
	}


}
