package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframesClass {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
        driver.manage().window().maximize();
        Actions act=new Actions(driver);

////        WebElement a=driver.findElement(By.tagName("a"));
////      act.moveToElement(a).doubleClick().build().perform();
//
        Thread.sleep(1000);
        //driver.switchTo().frame(0); - index of frame
        
        //driver.switchTo().frame("iframeResult"); - id or name of the frame
        
        WebElement frame1=driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);
        
        driver.findElement(By.xpath("//a[@href='https://www.w3schools.com/']")).click();
        
        Thread.sleep(1000);
        //driver.switchTo().parentFrame();
        
        driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());
        
        driver.findElement(By.id("runbtn")).click();
		
        
        
        
	}

}
