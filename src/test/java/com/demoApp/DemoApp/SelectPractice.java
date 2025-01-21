package com.demoApp.DemoApp;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class SelectPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebElement e = driver.findElement(By.cssSelector("#cars"));
        Select s = new Select(e);

        boolean b = s.isMultiple();
        
        System.out.println(b);

        s.selectByIndex(2);
        s.deselectByValue("saab");
        s.selectByVisibleText("Volvo");

        s.deselectByIndex(2);
        s.deselectByValue("saab");
        s.deselectByVisibleText("Volvo");

	}

}
