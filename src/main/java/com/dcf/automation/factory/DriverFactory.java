package com.dcf.automation.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	public WebDriver driver;
	public WebDriver initDriver() {
			
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.home.saxo/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();

	return driver;
}

}
