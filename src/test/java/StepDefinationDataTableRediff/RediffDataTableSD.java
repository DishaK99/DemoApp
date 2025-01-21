package StepDefinationDataTableRediff;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactory.RediffDataTable;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffDataTableSD {
WebDriver driver;
	RediffDataTable red;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	    
	}
	@When("user clicks on create account button")
	public void user_clicks_on_create_account_button() {
		red=new RediffDataTable(driver);
		red.create();
	    
	}
	@When("user gives uname & uid")
	public void user_gives_uname_uid(DataTable data)
	{
		
		List<String> cell1=data.asList(String.class);
		red.enterDetails(cell1.get(0),cell1.get(1));
		
	   
	}
	@And("user clicks on create my account button")
	public void user_clicks_on_create_my_account_button() {
		red.registerUser();
	    
	}
	@Then("Account should be created")
	public void account_should_be_created() {
	    
	}

}
