package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOutClass {
	WebDriver driver = new EdgeDriver();
	
	  @BeforeTest
	  public void initializeBrowser() {
		  WebDriverManager.edgedriver().setup();
	       driver.get("https://saucedemo.com/");
	      driver.manage().window().maximize();
	  }
	  @Test (timeOut=1000)
	  public void test2(String username, String password)
	  {
		  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		  
	  }
	  @AfterTest
	  public void teardown() 
	  {
		  driver.close();
	  }
}
