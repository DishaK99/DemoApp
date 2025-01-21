package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomMainClass {

	WebDriver driver;
	
	@Test
	public void testLog()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		POMClass obj=new POMClass(driver);
		
		obj.typeuser();
		obj.typepass();
		obj.clickbtn();
		
		//obj.typelog("problem_user", "secret_sauce");
	}
}
