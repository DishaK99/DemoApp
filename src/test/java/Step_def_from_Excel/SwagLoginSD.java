package Step_def_from_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FromExcel.SwagLogin;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLoginSD {
	
	WebDriver driver;
	SwagLogin lg;
	File file;
	FileInputStream fis;
	Workbook w;
	Sheet s;
	
	String username;
    String password;
	
	@Given("user is on the login page for swag lab")
	public void user_is_on_the_login_page_for_swag_lab() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
		
		
	    
	}
	@When("user opens an excel sheet and read the values")
	public void user_opens_an_excel_sheet_and_read_the_values() throws IOException {
		
        file=new File("C:\\Users\\DDILIPKA\\Desktop\\Testing\\Selenium\\DemoApp\\ExcelData\\swaglabs.xls");
		
		fis=new FileInputStream(file);
		
		w=new HSSFWorkbook(fis);
		
		s=w.getSheetAt(0);
		
		username=s.getRow(0).getCell(0).getStringCellValue();
        password=s.getRow(0).getCell(1).getStringCellValue();
	    
	}
	@And("user credentials enter username & password")
	public void user_credentials_enter_username_password() {
		
		lg=new SwagLogin(driver);
		lg.enterDetails(username, password);
	   
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		lg.login();
	    
	}
	@Then("Login should be successful")
	public void login_should_be_successful() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.close();
	    
	}
}
