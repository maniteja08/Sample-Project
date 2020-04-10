package com.cts.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BaseClass;
import com.cts.pages.Loginpage;
import com.cts.tdd.WebShopTest;
import com.cts.utility.ExcelReader;
import com.cts.utility.ScreenShot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Webshop_Login extends BaseClass {
	final static Logger logger = LogManager.getLogger(Webshop_Login.class.getName());
	WebDriver driver;
	Loginpage loginpage;
	ScreenShot screenshot = new ScreenShot(driver);

	@Given("^the user launch the chrome application i am on the home page$")
	public void the_user_launch_the_chrome_application_i_am_on_the_home_page() throws Throwable {
		driver = InitDriver("chrome");
		loginpage = new Loginpage(driver);
		logger.info("browser opens");
	}

	@When("^the user clicks the login button$")
	public void the_user_clicks_the_login_button() throws Throwable {
		loginpage.Loginlink();
		logger.info("clicks login button");
	}

	@Then("^the user login using (.+) and (.+)$")
	public void the_user_login_using_and(String email, String password) throws Throwable {
		ExcelReader excelreader = new ExcelReader();    // remove this line ok sir
		loginpage.setUsername(email);
		loginpage.setPassword(password);
		logger.info("enters username and password");
	}

	@And("^click on the login button user nagivate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
		loginpage.Btnclick();
		//screenshot.takeSnapShot("E:\\maniteja\\Selenium Testing\\WebShopAppAutoTest\\Screenshots\\loginrunner.png");
	}
}
