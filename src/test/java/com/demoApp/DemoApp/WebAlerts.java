package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("alertButton")).click();
        String text=driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
//        
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        String txt=driver.switchTo().alert().getText();
        System.out.println(txt);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        
        
        driver.findElement(By.id("confirmButton")).click();
        String text1=driver.switchTo().alert().getText();
        System.out.println(text1);
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
//        
        WebElement e=driver.findElement(By.id("promtButton"));
        e.click();
        String text2=driver.switchTo().alert().getText();
        System.out.println(text2);
        Thread.sleep(1000);
        e.sendKeys("Disha");
        driver.switchTo().alert().accept();
       
        
        
        
        driver.close();
	}

}
