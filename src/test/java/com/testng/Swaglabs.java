package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swaglabs {
	
	WebDriver driver = new ChromeDriver();
	
  @BeforeTest
  public void initializeBrowser() {
	  WebDriverManager.chromedriver().setup();
       driver.get("https://saucedemo.com/");
      driver.manage().window().maximize();
  }
  @Test(priority=-1)
  public void test2()
  {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  
  }
  @Test(priority=0)
  public void test3() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	  //driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
  }
  @AfterTest
  public void teardown() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.close();
  }
}
