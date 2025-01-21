package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(1000);
     
        WebElement uname=driver.findElement(By.id("user-name"));
        js.executeScript("arguments[0].setAttribute('value','standard_user');",uname);
        
        Object obj = js.executeScript("return arguments[0].getAttribute('value')", uname);
        String s = (String)obj;
        System.out.println(s);

	}

}
