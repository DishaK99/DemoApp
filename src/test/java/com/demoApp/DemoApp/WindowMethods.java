package com.demoApp.DemoApp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowMethods {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.magicbricks.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
        
        Actions act = new Actions(driver);
        
        //parentWindow is main Window
        String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);
        
        WebElement a=driver.findElement(By.id("buyheading"));
        act.moveToElement(a).build().perform();
        
        driver.findElement(By.xpath("//*[@id=\"propTypesBuy1\"]/ul/li[1]/a")).click();
        
        Thread.sleep(2000);
        driver.switchTo().window(parentWindow);
        
        //getting id of all the windows
        //getWindow handles
        Set<String> handles=driver.getWindowHandles();
        for(String h:handles)
        {
        	System.out.println(h);
        }
        

	}

}
