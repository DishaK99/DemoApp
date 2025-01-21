package com.demoApp.DemoApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
        
        WebElement e= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
        Actions act=new Actions(driver);
        act.moveToElement(e).perform();
//        
//        //explicit wait
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();
      
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(8))
        		.pollingEvery(Duration.ofSeconds(2))
        		.ignoring(NoSuchElementException.class);
        
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.ebay.com/']")))
        
        
        
        driver.close();

	}

}
