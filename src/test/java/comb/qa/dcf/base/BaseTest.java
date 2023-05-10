package comb.qa.dcf.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


import com.dcf.automation.factory.DriverFactory;
import com.dcf.pages.HomePage;

public class BaseTest {
	public WebDriver driver;
	public DriverFactory df;
	public HomePage homePage;
	
	@BeforeTest
	public void setup() {
		
		df = new DriverFactory();
		driver = df.initDriver();
		homePage = new HomePage(driver);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	

}
