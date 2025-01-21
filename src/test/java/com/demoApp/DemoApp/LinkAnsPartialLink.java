package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkAnsPartialLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.co.in/");
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//using link locator
		//driver.findElement(By.linkText("Gmail")).click();

		//using partial link locator
		//driver.findElement(By.partialLinkText("Ima")).click();

		//using relative xpath locator
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//text
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		
		//contains
		driver.findElement(By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")).click();
		
		//start with
		driver.findElement(By.xpath("//button[starts-with(@name,'back-to')]")).click();
		
		
	
	}

}
