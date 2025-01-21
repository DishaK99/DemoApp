package DataTableMultipleValues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsDataTableLogin {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]")WebElement uname;
	@FindBy(xpath="//*[@id=\"password\"]")WebElement pass;
	@FindBy(id="login-button")WebElement logBtn;
		
		public SwagLabsDataTableLogin(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		public void swaglog(String username, String password)
		{
			uname.sendKeys(username);
			pass.sendKeys(password);
		}
		
		public void clickbtn()
		{
			logBtn.click();
			driver.close();
		}

}
