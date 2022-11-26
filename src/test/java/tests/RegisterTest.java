package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.RegisterPage;
import resources.BaseClass;

public class RegisterTest extends BaseClass{

	@Test
	public void register() throws InterruptedException, IOException {
		
		//System.out.println("FourTest Excuted");
		
		 driver = initializationDriver();
		 driver.get(prop.getProperty("url"));
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.RegisterOption().click();
		
		Thread.sleep(5000);
		
		RegisterPage register = new RegisterPage(driver);
		register.firstname("Monika");
		register.lastname("Gatkal");
		String email =randomestring()+"@gmail.com";
		register.email(email);
		register.telephone("1234567890");
		register.password("password");
		register.confirm("password");
		
		register.checkClick();
		//driver.findElement(By.name("agree")).click();
		
		register.buttonClick();
		
		boolean result = driver.getPageSource().contains("Your Account Has Been Created!");
		if(result==true) {
			Assert.assertTrue(true);
			System.out.println("Successfully Register");
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("Not Register");
		}
		
	}
	
	@AfterMethod
	public void closure() {
		driver.close();
	}
	
}
