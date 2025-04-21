package com.automation_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class base_class {
WebDriver driver;
	@BeforeClass
	public void browser() {
		 
		 driver = new FirefoxDriver();
	}
	
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
