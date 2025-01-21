package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactory.LoginFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	LoginFactory log;
	
	@Given("user is on the login page of swag lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	@When("user enter uname & password")
	public void user_enter_uname_password() {
		
		log=new LoginFactory(driver);
		
		log.swaglog("standard_user", "secret_sauce");
		
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		
		log.clickbtn();
		
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
		driver.close();
		
	}




}
