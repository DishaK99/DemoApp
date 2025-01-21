package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IgnoreException {
	WebDriver driver = new ChromeDriver();
	
	  @BeforeTest
	  public void initializeBrowser() {
		  WebDriverManager.chromedriver().setup();
	       driver.get("https://saucedemo.com/");
	      driver.manage().window().maximize();
	  }
	  @Test (timeOut=1000, expectedExceptions= {NoSuchElementException.class})
	  public void test2() throws InterruptedException
	  {
		  driver.findElement(By.id("username")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  Thread.sleep(1000);
		  driver.findElement(By.id("login-button")).click();
		  
	  }
	  @AfterTest
	  public void teardown() throws InterruptedException 
	  {
		  Thread.sleep(2000);
		  driver.close();
	  }
}
