package com.cts.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.baseclass.BaseClass;
import com.cts.pages.Loginpage;
import com.cts.utility.ExcelReader;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Webshop_Login extends BaseClass {
	WebDriver driver;
	Loginpage loginpage;

	@Given("^the user launch the chrome application i am on the home page$")
	public void the_user_launch_the_chrome_application_i_am_on_the_home_page() throws Throwable {
		driver = InitDriver("chrome");
		loginpage = new Loginpage(driver);
	}

	@When("^the user clicks the login button$")
	public void the_user_clicks_the_login_button() throws Throwable {
		loginpage.Loginlink();
	}

	@Then("^the user login using (.+) and (.+)$")
	public void the_user_login_using_and(String email, String password) throws Throwable {
		ExcelReader excelreader = new ExcelReader();
		loginpage.setUsername(email);
		loginpage.setPassword(password);

	}

	@And("^click on the login button user nagivate to the next page$")
	public void click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable {
		loginpage.Btnclick();

	}
}
