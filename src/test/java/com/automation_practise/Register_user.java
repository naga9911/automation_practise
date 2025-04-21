package com.automation_practise;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Register_user extends base_class{

	@Test
	private void stepexecute() throws InterruptedException, AWTException {
		
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//Verify that home page is visible successfully
		
		String actual_title = driver.getTitle();
		String expected_title = "Automation Exercise";
		if (actual_title.equals(expected_title)) {
			System.out.println(actual_title + "=" + "testcase passed verified the page title");
		}
		else {
			System.out.println(expected_title +"="+ "The given expected title not verified Testcase failed");
		}
		
		//Click on 'Signup / Login' button
		
		//locator for signuploginbtn
		
		By slbtn = By.xpath("//a[text()=\" Signup / Login\"]");
		
		WebElement signuploginbtn = driver.findElement(slbtn);
		signuploginbtn.click();
		
		//Verify 'New User Signup!' is visible
		
		By visiblesignup = By.xpath("//h2[text()=\"New User Signup!\"]");
		String expected_nus = "New User Signup!";
		WebElement newusersignup = driver.findElement(visiblesignup);
		String message = newusersignup.getText();
		System.out.println(message);
		if (expected_nus.equals(message)) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("testcase failed");
		}
		
		//Enter name and email address
		
		By sname = By.xpath("//input[@name=\"name\"]");
		By semail = By.xpath("//input[@data-qa=\"signup-email\"]");
		
		
		WebElement ssname = driver.findElement(sname);
		ssname.sendKeys("babu");
		
		WebElement ssemail = driver.findElement(semail);
		ssemail.sendKeys("babu@gmail.com");
		
		//Click 'Signup' button
		By sbtn = By.xpath("//button[text()=\"Signup\"]");
		
		WebElement ssbtn = driver.findElement(sbtn);
		ssbtn.click();
		
		//Verify that 'ENTER ACCOUNT INFORMATION' is visible
		
		By eai = By.xpath("//b[text()=\"Enter Account Information\"]");
		String expected_eai = "Enter Account Information";
		
		WebElement eeai = driver.findElement(eai);
		String seeai = eeai.getText();
		
		if (expected_eai.equals(seeai)) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("testcase failed");
		}
		
		//Fill details: Title, Name, Email, Password, Date of birth
		
		By mrtitle = By.id("id_gender1");
		By mrstitle = By.id("id_gender2");
		By pword = By.id("password");
		By edays = By.id("days");
		By emonth = By.id("months");
		By eyear = By.id("years");
		
		WebElement emrtitle = driver.findElement(mrtitle);
		emrtitle.click();
		
		Thread.sleep(1000);
		
		WebElement emrstitle = driver.findElement(mrstitle);
		emrstitle.click();
		
		WebElement ppword = driver.findElement(pword);
		ppword.sendKeys("Welcome@123");
		
		WebElement sdays = driver.findElement(edays);
		
		Select ssdays = new Select(sdays);
		ssdays.selectByValue("5");
		
		WebElement semonth = driver.findElement(emonth);
		
		Select ssemonth = new Select (semonth);
		ssemonth.selectByValue("1");
		
		WebElement seyear = driver.findElement(eyear);
		
		Select sseyear = new Select (seyear);
		sseyear.selectByValue("2021");
		
		//Select checkbox 'Sign up for our newsletter!'
		
		By cb1 = By.id("newsletter");
		
		
		WebElement scb1 = driver.findElement(cb1);
		scb1.click();
		
		//Select checkbox 'Receive special offers from our partners!'
		By cb2 = By.id("optin");
		
		WebElement scb2 = driver.findElement(cb2);
		scb2.click();
		
		//Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		
		By fname = By.id("first_name");
		By lname = By.id("last_name");
		By company = By.id("company");
		By add1 = By.id("address1");
		By add2 = By.id("address2");
		By country = By.id("country");
		By state = By.id("state");
		By city = By.id("city");
		By zipcode = By.id("zipcode");
		By mobile_number = By.id("mobile_number");
		
		
		
		WebElement efname = driver.findElement(fname);
		efname.sendKeys("abcd");
		
		WebElement elname = driver.findElement(lname);
		elname.sendKeys("xyz");
		
		WebElement ecompany = driver.findElement(company);
		ecompany.sendKeys("xyz pvt limited");
		
		WebElement eadd1 = driver.findElement(add1);
		eadd1.sendKeys("abcd road xyz street z platform 9000233990");
		
		WebElement eadd2 = driver.findElement(add2);
		eadd2.sendKeys("xyz abcd abc road z street b platform 8000043399-0");
		
		WebElement ecountry = driver.findElement(country);
		
		Select eecountry = new Select (ecountry);
		eecountry.selectByValue("India");
		
		WebElement estate = driver.findElement(state);
		estate.sendKeys("xyz state");
		
		WebElement ecity = driver.findElement(city);
		ecity.sendKeys("abcd city");
		
		WebElement ezipcode = driver.findElement(zipcode);
		ezipcode.sendKeys("500006000");
		
		WebElement emobile_number = driver.findElement(mobile_number);
		emobile_number.sendKeys("0006666666-888");
		
		//Click 'Create Account button'
		By cab = By.xpath("//button[@data-qa=\"create-account\"]");
		
		WebElement ecab = driver.findElement(cab);
		ecab.click();
		
		//Verify that 'ACCOUNT CREATED!' is visible
		
		By ac = By.xpath("//b[text()=\"Account Created!\"]");
		
		String Expected_ac = "ACCOUNT CREATED!";
		
		WebElement eac = driver.findElement(ac);
		String eeac = eac.getText();
		if (Expected_ac.equals(eeac)) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("testcase failed");
		}
		
		//Click 'Continue' button
		
		By con = By.xpath("//a[@data-qa=\"continue-button\"]");
		
		WebElement ccon = driver.findElement(con);
		ccon.click();
		
		//Verify that 'Logged in as username' is visible
		
		By lusername = By.xpath("//b[text()=\"babu\"]");
		String Expected_lusername = "babu";
		
		WebElement clusername = driver.findElement(lusername);
		String cclusername = clusername.getText();
		
		if (Expected_lusername.equals(cclusername)) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("testcase failed");
		}
		
		//Click 'Delete Account' button
		By da = By.xpath("//a[text()=\" Delete Account\"]");
		
		WebElement cda = driver.findElement(da);
		cda.click();
		
		//popup
		//Robot robot = new Robot();
		//Thread.sleep(1000);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
		
		
		//Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button\
		
		By acd = By.xpath("//b[text()=\"Account Deleted!\"]");
		By ctn = By.xpath("//a[@data-qa=\"continue-button\"]");
		String expected_acd = "ACCOUNT DELETED!";
		
		WebElement scda = driver.findElement(acd);
		String sscda = scda.getText();
		if (expected_acd.equals(sscda)) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("testcase failed");
		}
		
		WebElement cctn = driver.findElement(ctn);
		cctn.click();
	}
}
