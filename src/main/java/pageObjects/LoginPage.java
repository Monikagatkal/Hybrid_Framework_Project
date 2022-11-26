package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordFeild;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn;
	
	public WebElement emailAddress() {
		return emailAddress;
	}
	
	public WebElement passwordFeild() {
		return passwordFeild;
	}
	
	public WebElement loginBtn() {
		return loginBtn;
	}
}
