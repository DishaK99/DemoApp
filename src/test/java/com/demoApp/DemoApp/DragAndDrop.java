package com.demoApp.DemoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryui.com/droppable/");
        driver.manage().window().maximize();
        
        Actions act = new Actions(driver);

        driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(0);

        WebElement source = driver.findElement(By.id("draggable"));
        Thread.sleep(1000);
        WebElement destination = driver.findElement(By.id("droppable"));
        Thread.sleep(1000);
        
        
        act.dragAndDrop(source, destination).perform();

        Thread.sleep(1000);
        if(destination.getText().matches("Dropped!"))
        {
            System.out.println("Successful!");
        }
        
        driver.close();

	}

}
