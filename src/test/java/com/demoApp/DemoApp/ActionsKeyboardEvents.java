package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsKeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        
//        WebElement uname=driver.findElement(By.id("user-name"));
//        uname.click();
//        act.moveToElement(uname).sendKeys("standard_user").build().perform();
//
//        WebElement pwd=driver.findElement(By.id("password"));
//        pwd.click();
//        act.moveToElement(pwd).sendKeys("secret_sauce").build().perform();
//
//        WebElement log=driver.findElement(By.id("login-button"));
//        act.moveToElement(log).click().build().perform();
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        act.sendKeys(Keys.TAB).build().perform();
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
        

	}

}
