package com.demoApp.DemoApp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotCopyPaste {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        Robot robot=new Robot();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_DOWN);
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        //select the username
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        
        //copy the username
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        
        //go to the nect field
        robot.keyPress(KeyEvent.VK_TAB);
        
        //paste the username
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        
        WebElement a = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));

        System.out.println(a.getText());
	}

}
