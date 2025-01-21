package com.demoApp.DemoApp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilsScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

 

        Utils.CaptureScreen(driver, "log1");
        driver.findElement(By.id("login-button")).click();
        Utils.CaptureScreen(driver, "after log");
	}

}
