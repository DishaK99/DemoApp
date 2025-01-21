package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffSearch {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"srchquery_tbox\"]") WebElement searchText;
	@FindBy(xpath="/html/body/div[4]/div[1]/form/input[2]")WebElement searchbtn;
	
	public RediffSearch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void searchtext(String key)
	{
		searchText.sendKeys(key);
	}
	public void searchBtn()
	{
		searchbtn.click();
	}
}
