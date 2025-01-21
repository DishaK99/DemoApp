package com.demoApp.DemoApp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        
        Actions act=new Actions(driver);
        WebElement a=driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]"));

        		act.moveToElement(a).click().build().perform();
        		act.click(a).build().perform();
	}

}
