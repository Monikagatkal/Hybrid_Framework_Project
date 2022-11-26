package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class AccountPage extends BaseClass{
	
	WebDriver driver;
	public AccountPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Edit your account information")
	private WebElement editAccountInformationOption;
	
	public WebElement editAccountInformationOption() {
		return editAccountInformationOption;
	}
	
}
