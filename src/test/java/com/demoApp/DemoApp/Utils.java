package com.demoApp.DemoApp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {

	public static void CaptureScreen(WebDriver driver, String filename) throws IOException
    {
        // TODO Auto-generated method stub
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file, new File("./Screenshots/"+filename+".png"));
 

    }

}
