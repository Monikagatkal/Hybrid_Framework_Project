package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class RegisterPage extends BaseClass{

WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	 WebElement firstname;
	
	@FindBy(name="lastname")
	 WebElement lastname;
	
	@FindBy(name="email")
	 WebElement email;
	
	@FindBy(name="telephone")
	 WebElement telephone;
	
	@FindBy(name="password")
	 WebElement password;
	
	@FindBy(name="confirm")
	 WebElement confirm;
	
	@FindBy(name="agree")
	WebElement check;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnClick;
	
	
	public void firstname(String name) {
		firstname.sendKeys(name);
	}
	
	public void lastname(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void email(String eml) {
		email.sendKeys(eml);
	}
	public void telephone(String ctelephoneno) {
		telephone.sendKeys(ctelephoneno);
		
	}
	public void password(String pass) {
	 password.sendKeys(pass);;
	}
	
	public void confirm(String conf) {
		confirm.sendKeys(conf);;
	}
	
	public void checkClick() {
		check.click();
	}
	public void buttonClick() {
		btnClick.click();
	}
	
}
