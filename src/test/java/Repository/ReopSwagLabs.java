package Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReopSwagLabs {
  @Test
  public void testobj() throws IOException, InterruptedException {
	  
	  //read from the file
	  File src=new File("C:\\Users\\DDILIPKA\\Desktop\\Testing\\Selenium\\DemoApp\\src\\test\\java\\Repository\\swagRepo.properties");
	  FileInputStream fis=new FileInputStream(src);
	  Properties pro=new Properties();
	  pro.load(fis);
	  
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath(pro.getProperty("swag.log.uname.xpath"))).sendKeys("standard_user");
        driver.findElement(By.xpath(pro.getProperty("swag.log.pwd.xapth"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath(pro.getProperty("swag.log.logbtn.xpath"))).click();
        
  }
}
