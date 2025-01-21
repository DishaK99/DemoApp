package Step_def_Tags;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactory.SwagLogin;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TagsSD {
	
	WebDriver driver;
	SwagLogin lg;
	
	@Given("user is on the login page for swag lab")
	public void user_is_on_the_login_page_for_swag_lab() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
	}
	@When("user credentials enter username & password")
	public void user_credentials_enter_username_password() {
		lg=new SwagLogin(driver);
		lg.swaglog("standard_user", "secret_sauce");
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		lg.clickbtn();
	}
	@Then("Login should be successful")
	public void login_should_be_successful() {
		//driver.close();
	}
	@When("user enter invalid username & password")
	public void user_enter_invalid_username_password() {
		lg=new SwagLogin(driver);
		lg.swaglog("abc", "xyz");
	}
	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
		
	   
	}

}
