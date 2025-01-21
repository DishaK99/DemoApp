package FromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLogin {
	
	WebDriver driver;
	

	
	@FindBy(id="user-name")WebElement uname;
	@FindBy(id="password")WebElement pass;
	@FindBy(id="login-button")WebElement loginBtn;
	
	public SwagLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
		
	 public void enterDetails(String username, String password)
	 {        
	        uname.sendKeys(username);
	        pass.sendKeys(password);
		 
	 }
	 public void login()
	 {
		 loginBtn.click();
	 }

}
