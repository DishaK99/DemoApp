package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertClass {
  @Test
  public void f() {
	  WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      driver.get("https://google.com/");
      driver.manage().window().maximize();
      
      String expectedtitle="Google";
      String actualtitle=driver.getTitle();
      Assert.assertEquals(actualtitle,expectedtitle,"Title Mismatched");
      
      String expurl="www.google.com";
      String acturl=driver.getCurrentUrl();
      SoftAssert soft=new SoftAssert();
      soft.assertEquals(acturl, expurl,"URL is not same");
      
      //to throw an exception
      soft.assertAll();
  }
}
