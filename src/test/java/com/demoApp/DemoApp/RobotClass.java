package com.demoApp.DemoApp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        Robot r = new Robot();	
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB); //username
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_TAB); //password
        Thread.sleep(1000);
        r.keyRelease(KeyEvent.VK_TAB);//login btn
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
       WebElement e=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/button"));
    String s=e.getText();
    System.out.println(s);
	}		
	

}
