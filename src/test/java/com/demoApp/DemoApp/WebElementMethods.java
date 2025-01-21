package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/mumbai");
		driver.manage().window().maximize();
		
		WebElement a= driver.findElement(By.className("sc-s1isp7-5 fyZwWD"));
		System.out.println(a.isDisplayed());
		System.out.println(a.isSelected());
		System.out.println(a.isEnabled());
	}

}
