package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersClass {
	WebDriver driver = new EdgeDriver();
	
	  @Test(priority=-1)
	  public void initializeBrowser() {
		  WebDriverManager.edgedriver().setup();
	       driver.get("https://saucedemo.com/");
	      driver.manage().window().maximize();
	  }
	  @Test(priority=0)
	  @Parameters({"username","password"})
	  public void test2(String username, String password)
	  {
		  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		  
	  }
	  @Test(priority=1)
	  public void teardown() 
	  {
		  driver.close();
	  }
}
