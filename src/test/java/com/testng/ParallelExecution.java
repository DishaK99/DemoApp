package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecution {
	WebDriver driver;
	
	@Test (dataProvider = "loginData")
	  public void f(String user, String password) throws InterruptedException 
	  {
	        WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
	        driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();

	         System.out.println("Thread ID: "+ Thread.currentThread().getId());
	         Thread.sleep(1000);

	         driver.findElement(By.id("user-name")).sendKeys(user);
	         Thread.sleep(1000);
	         driver.findElement(By.id("password")).sendKeys(password);
	         Thread.sleep(1000);

	         driver.findElement(By.id("login-button")).click();        

	  }

	  @DataProvider (parallel = true)
	  public Object[][] loginData()
	  {
	      Object[][] data = new Object[3][2];
	      data[0][0] = "standard_user";
	      data[0][1] = "secret_sauce";

	      data[1][0] = "problem_user";
	      data[1][1] = "secret_sauce";

	      data[2][0] = "locked_out_user";
	      data[2][1] = "secret_sauce";

	      return data;

	  }
}
