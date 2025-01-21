package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	WebDriver driver;

	By logoutbtn=By.id("react-burger-menu-btn");
	By logout=By.xpath("//a[text()='Logout']");
	
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void logout() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(logoutbtn).click();
		Thread.sleep(1000);
		driver.findElement(logout).click();
	}
}
