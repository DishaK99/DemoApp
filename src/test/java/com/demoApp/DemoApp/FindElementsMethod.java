package com.demoApp.DemoApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Element;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        
        List<WebElement> n = driver.findElements(By.tagName("input"));
        System.out.println("Elements: " + n.size());
        
        WebElement e=driver.findElement(By.cssSelector("#cars"));
        Select s=new Select(e);
        
        boolean b=s.isMultiple();
        System.out.println(b);
       
        
        List<WebElement> opt=s.getOptions();
        System.out.println(opt.size());
        
        
        for(WebElement e2:opt)
        {
        
        	String t=e.getText();
        	System.out.println(t);
        }
        
        WebElement e1=driver.findElement(By.id("oldSelectMenu"));
        Select s1=new Select(e1);
        
        boolean b1=s1.isMultiple();
        System.out.println(b1);
       
        
        List<WebElement> opt1=s1.getOptions();
        System.out.println(opt1.size());
        
        
        for(WebElement e3:opt)
        {
        
        	String t1=e1.getText();
        	System.out.println(t1);
        }
        
        System.out.println("first selected");
        
        s.selectByIndex(1);
        s.selectByValue("audi");
        
        WebElement d=s.getFirstSelectedOption();
        String first=d.getAttribute("value");
        System.out.println(first);
        
        List<WebElement> all1 = s.getAllSelectedOptions();
        System.out.println(all1.size());
        
	}

}
