package com.cts.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BaseClass;
import com.cts.pages.Loginpage;
import com.cts.pages.SelectProductpage;
import com.cts.utility.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Webshop_Selectproduct extends BaseClass {
	final static Logger logger = LogManager.getLogger(Webshop_Login.class.getName());
	WebDriver driver;
	SelectProductpage selectproductpage;
	ExcelReader excelreader = new ExcelReader();

	@Given("^the user launch the chrome application i am on the home page and logs in$")
	public void the_user_launch_the_chrome_application_i_am_on_the_home_page_and_logs_in() throws Throwable {
		driver = InitDriver("chrome");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.Loginlink();
		loginpage.setUsername(excelreader.excel_username(0));
		loginpage.setPassword(excelreader.excel_password(0));
		loginpage.Btnclick();
		logger.info("user logs in");
	}

	@Given("^the user clicks on books$")
	public void the_user_clicks_on_books() throws Throwable {

		selectproductpage = new SelectProductpage(driver);
		System.out.println("The user Clicks on books");
		selectproductpage.AddBook();
	}

	@Then("^the user clicks on computers$")
	public void the_user_clicks_on_computers() throws Throwable {
		selectproductpage.AddComputer();
	}

	@Then("^the user clicks on phones$")
	public void the_user_clicks_on_phones() throws Throwable {
		selectproductpage.AddPhone();
		logger.info("completes selecting products");
	}
}
