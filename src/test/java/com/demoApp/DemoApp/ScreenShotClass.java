package com.demoApp.DemoApp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        //TakesScreenshot - interface
        //type casting
        TakesScreenshot ts=(TakesScreenshot)driver;
        Thread.sleep(1000);
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./Screenshots/image.png"));
        driver.close();
	}

}
