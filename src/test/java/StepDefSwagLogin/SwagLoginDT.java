package StepDefSwagLogin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataTableMultipleValues.SwagLabsDataTableLogin;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLoginDT {
	
	WebDriver driver;
	SwagLabsDataTableLogin lg;
	
	@Given("user is on the login page for swag lab")
	public void user_is_on_the_login_page_for_swag_lab() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    
	}
	@When("user credentials enter username & password")
	public void user_credentials_enter_username_password(DataTable data) {
	
		lg=new SwagLabsDataTableLogin(driver);
		
		//another way
//		List<List<String>> cells=data.cells();
//		lg.swaglog(cells.get(0).get(0),cells.get(0).get(1));
		
		System.out.println(data.cell(0, 0)+" , "+data.cell(0, 1));
		lg.swaglog(data.cell(0, 0), data.cell(0, 1));
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    lg.clickbtn();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
	    
	}


}
