package StepDefinitionDataTable;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactory.RediffSearch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTable {
	
	WebDriver driver;
	RediffSearch red;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	}
	@When("user gives keyword in search field")
	public void user_gives_keyword_in_search_field(io.cucumber.datatable.DataTable keyword) {
		red=new RediffSearch(driver);
		List<String> cells=keyword.asList(String.class);
		red.searchtext(cells.get(1));
	   
	}
	@And("user cliks on search icon user")
	public void user_cliks_on_search_icon_user() {
		red.searchBtn();
	}
	@Then("Search data should be displayed")
	public void search_data_should_be_displayed() {
	   
	}

}
