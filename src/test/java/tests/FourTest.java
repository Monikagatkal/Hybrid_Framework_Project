package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.BaseClass;

@Test
public class FourTest extends BaseClass{
	
	public WebDriver driver;
	
	public void fourTest() throws IOException, InterruptedException {
	System.out.println("FourTest Excuted");
	
	 driver = initializationDriver();
	
	driver.get("https://www.google.co.in/");
	
	Thread.sleep(3000);
	
	Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void closingBrowser() {
		driver.close();
	}
}
