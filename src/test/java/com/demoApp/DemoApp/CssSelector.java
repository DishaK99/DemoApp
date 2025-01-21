package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//CssSelector starts-with
		driver.findElement(By.cssSelector("input[id^=user]")).sendKeys("standard_user");
		
		//CssSelector Ends-with
		driver.findElement(By.cssSelector("input[id$=word]")).sendKeys("secret_sauce");
		
		//CssSelector contains
		driver.findElement(By.cssSelector("input[id*=login]")).click();

	}

}
