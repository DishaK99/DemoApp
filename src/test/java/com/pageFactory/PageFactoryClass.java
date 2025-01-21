package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryClass {

	WebDriver driver;
	LoginFactory log;
	
	@Test
	public void verifyswag()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		log=new LoginFactory(driver);
		log.swaglog("problem_user", "secret_sauce");
		log.clickbtn();
		
	}
}
