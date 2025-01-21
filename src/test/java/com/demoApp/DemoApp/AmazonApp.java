package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2")).click();
        Thread.sleep(1000);
        
        driver.switchTo().window(driver.getWindowHandle());
        
//        WebElement e = driver.findElement(By.xpath("//*[@id=\"brandsRefinements\"]/ul"));
//        Select s = new Select(e);
//        
//        s.selectByVisibleText("Samsung");
        driver.findElement(By.xpath("//*[@id=\"p_89/Samsung\"]"));
        
//        driver.findElement(By.xpath("//*[@id=\"addToCart_feature_div\"]/div[1]")).click();
//        driver.close();

	}

}
