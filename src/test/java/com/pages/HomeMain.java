package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeMain {
	
WebDriver driver;
	
	@Test
	public void testLog() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Home home=new Home(driver);
		Logout logout=new Logout(driver);
		
		home.typelog("problem_user", "secret_sauce");
		home.filter();
		home.addToCart();
		
		logout.logout();
	}

}
