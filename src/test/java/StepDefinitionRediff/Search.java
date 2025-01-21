package StepDefinitionRediff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactory.RediffSearch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
//	
	WebDriver driver;
	RediffSearch red;
//	
	@Given("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	    }
	@When("^user gives (.*) in search field$")
	public void gives_in_search_field(String keyword){
		red= new RediffSearch(driver);
		red.searchtext(keyword);
		
	    }
	
	@And ("user cliks on search icon user")
	public void user_cliks_on_search_icon_user() throws InterruptedException
	{
		
		
		red.searchBtn();
		
	}
	@Then("Search data should be displayed")
	public void search_data_should_be_displayed() {
	   }


}
