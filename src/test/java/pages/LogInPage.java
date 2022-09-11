package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	WebDriver driver;
	/**********************
	 * Object
	 *********************/

	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	@FindBy(name = "user_login")
	WebElement UserName;
	@FindBy(id = "password")
	WebElement Password;
	@FindBy(className = "rememberMe")
	WebElement Checkbox;
	@FindBy(name = "btn_login")
	WebElement LoginBtn;

	public LogInPage(WebDriver BaseDriver) {
		this.driver = BaseDriver;
		PageFactory.initElements(BaseDriver, this);
	}

	public void LogIN(String UseName, String Paswd) {
		// Step1. Click on the Login Link

		LoginLink.click();

		// Step2: Enter Username

		UserName.sendKeys(UseName);

		// Step3: Enter Password

		Password.sendKeys(Paswd);

		// Step4 Click Remember Me checkbox

		Checkbox.click();

		// Step5: Click pn Login Button

		LoginBtn.click();
	}
}
