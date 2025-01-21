package com.demoApp.DemoApp;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtentRepo {

	WebDriver driver = null;
    ExtentTest test;
    ExtentReports report;

@Test
public void verifyTitle() 
{
    report = new ExtentReports("C:\\Users\\DDILIPKA\\Desktop\\Testing\\Reports\\LogReport1.html");
    test = report.startTest("VerifyBlogTitle");

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    test.log(LogStatus.INFO, "Browser started");
    driver.get("https://www.saucedemo.com/");
    test.log(LogStatus.INFO, "Application is open");
    driver.manage().window().maximize();

    String title = driver.getTitle();
    Assert.assertTrue(title.contains("Swag Labs"));

    test.log(LogStatus.PASS, "Title verified");     
//    test.log(LogStatus.FAIL, "Title failed");




}

@AfterMethod
public void teardown(ITestResult result) throws IOException
{
    if(result.getStatus() == ITestResult.FAILURE)
    {
        String screen = Utils1.CaptureScreen(driver, result.getName());
        String image = test.addScreenCapture(screen);
        test.log(LogStatus.FAIL, "Title verification", image);
    }

    report.endTest(test);
    report.flush();

    driver.get("C:\\Users\\DDILIPKA\\Desktop\\Testing\\Reports\\LogReport1.html");
}
}
