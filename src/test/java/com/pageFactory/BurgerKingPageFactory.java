package com.pageFactory;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BurgerKingPageFactory {
	
	WebDriver driver;
	BurgerKingFactory br;
	
	@Test
	public void verifyBurgerKing() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.burgerking.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		br=new BurgerKingFactory(driver);
		
		br.login();
		br.addtocart();
		br.checkout();
	}

}
