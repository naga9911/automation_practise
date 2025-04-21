package com.automation_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class base_class {
WebDriver driver;
	@BeforeClass
	public void browser() {
		 
		 //ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-save-password-bubble");
		 driver = new ChromeDriver();
	}
	
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}
}
