package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewTest {
  @Test
  public void firstMethod() {
	  WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      driver.get("https://google.com/");
      driver.manage().window().maximize();
      
      String expectedtitle="Google";
      String actualtitle=driver.getTitle();
      Assert.assertEquals(actualtitle,expectedtitle,"Title Mismatched");
      
      String expurl="www.google.com";
      String acturl=driver.getCurrentUrl();
      Assert.assertEquals(expurl, acturl, "URL are no same");
      

  }
}
