package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        
        Actions act=new Actions(driver);
        WebElement a=driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]"));
        
        act.contextClick(a).build().perform();
        
        //contextClick() - for right click
        //doubleClick() - for double click
        
        

	}

}
