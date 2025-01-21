package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//setting the driver path
//		//System.setProperty(name_of_the_driver, its's_path)
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\DDILIPKA\\Desktop\\Testing\\Selenium\\DemoApp\\driver\\msedgedriver.exe");
//		
		//creating WebDriver instance
		WebDriver driver=new EdgeDriver();
		
		//Navigate to web page
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//driver.close();
		
//		WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
        
//        WebElement a = driver.findElement(By.id("user-name"));
//        a.sendKeys("standard_user");
        
        //another way
        //driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
//        WebElement b= driver.findElement(By.id("password"));
//        b.sendKeys("secret_sauce");
//        
//        WebElement c = driver.findElement(By.id("login-button"));
//        c.click();     
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
	}

}
