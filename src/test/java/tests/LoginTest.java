package tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AccountPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.BaseClass;


public class LoginTest extends BaseClass{
	public WebDriver driver;
	
	@Test(dataProvider = "getLoginData")
	public void login(String email, String password, String expectedResult) throws IOException, InterruptedException
	{
		
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.loginOption().click();
		
		Thread.sleep(5000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddress().sendKeys(email);
		loginPage.passwordFeild().sendKeys(password);
		loginPage.loginBtn().click();
		
		AccountPage accountPage = new AccountPage(driver);
		
		String actualResult = null;
		try {
			if(accountPage.editAccountInformationOption().isDisplayed()) {
			actualResult = "Successfull";
			}
		}
		catch(Exception e){

			actualResult = "Failure";
		}
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@BeforeMethod
	public void openApplication() throws IOException {
	
		driver = initializationDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void closure() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data= {{"monika123@gmail.com","7767050633","Successfull"},{"dummy@gmail.com","dummy123","Failure"}};
		return data;
	}
}
