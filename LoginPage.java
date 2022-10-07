package Selenium_eBanking.Selenium_eBanking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	@FindBy(id="email")
	 WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement SubmitButton;
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login(String uname,String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		SubmitButton.click();
	}

}
