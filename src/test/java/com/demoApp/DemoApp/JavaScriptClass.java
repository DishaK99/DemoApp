package com.demoApp.DemoApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        Thread.sleep(1000);
        js.executeScript("location.reload()");
        Thread.sleep(1000);

        WebElement a = driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a"));
        js.executeScript("arguments[0].click();", a);  
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
		
        driver.close();
	}

}
