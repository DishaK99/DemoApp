package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println("The title is : "+title);
		
		String current=driver.getCurrentUrl();
		System.out.println("Current URL : "+current);
		
		WebElement a=driver.findElement(By.id("password"));
		System.out.println("class name : "+a.getAttribute("class"));
		System.out.println("Tag name : "+a.getTagName());
		System.out.println("CSS Value : "+a.getCssValue("font-size"));
		
		String text=driver.findElement(By.xpath("//div[@class='login_password']/h4")).getText();
		System.out.println(text);
		
		

	}

}
