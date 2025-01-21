package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();

//       
        String parenthandle = driver.getWindowHandle();

        driver.findElement(By.id("inputValEnter")).sendKeys("Sports Shoes");
        driver.findElement(By.xpath(" //*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button ")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[contains(@data-js-pos, '0')]")).click();
        Thread.sleep(1000);

       Thread.sleep(1000);
        driver.switchTo().window(parenthandle);

        driver.findElement(By.xpath("//label[contains(@for, 'avgRating-4.0')]")).click();    

        WebElement e = driver.findElement(By.xpath("//div[contains(@data-displayname, 'Color')]"));
        Select s = new Select(e);

        s.selectByVisibleText("Blue");
	}

}
