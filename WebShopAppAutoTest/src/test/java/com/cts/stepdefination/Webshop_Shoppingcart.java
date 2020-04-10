package com.cts.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BaseClass;
import com.cts.pages.Loginpage;
import com.cts.pages.SelectProductpage;
import com.cts.pages.Shoppingcartpage;
import com.cts.utility.ExcelReader;
import com.cts.utility.ScreenShot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Webshop_Shoppingcart extends BaseClass {
	final static Logger logger = LogManager.getLogger(Webshop_Login.class.getName());

	WebDriver driver;
	Shoppingcartpage shoppingcartpage;
	ExcelReader excelreadrer = new ExcelReader();
	ScreenShot screenshot = new ScreenShot(driver);

	@Given("^the user launch the chrome application i am on the home page and logs in and selects the products$")
	public void the_user_launch_the_chrome_application_i_am_on_the_home_page_and_logs_in_and_selects_the_products()
			throws Throwable {
		driver = InitDriver("chrome");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.Loginlink();
		loginpage.setUsername(excelreadrer.excel_username(0));
		loginpage.setPassword(excelreadrer.excel_password(0));
		loginpage.Btnclick();
		logger.info("user logs in");
		SelectProductpage selectproductpage = new SelectProductpage(driver);
		selectproductpage.AddBook();
		selectproductpage.AddComputer();
		selectproductpage.AddPhone();
		logger.info("completes selecting products");
	}

	@Given("^the user clicks the shopping cart link$")
	public void the_user_clicks_the_shopping_cart_link() throws Throwable {
		shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.Shoppingcartlink();
		logger.info("clicks on shipping cart link");
	}

	@Then("^the user selects the country$")
	public void the_user_selects_the_country() throws Throwable {
		shoppingcartpage.Selectcountry();
	}

	@And("^the user selects state$")
	public void the_user_selects_state() throws Throwable {
		shoppingcartpage.Selectstate();
	}

	@And("^the user enters zipcode$")
	public void the_user_enters_zipcode() throws Throwable {
		shoppingcartpage.Zipcode();
	}

	@And("^the user clicks on accept$")
	public void the_user_clics_on_accept() throws Throwable {
		shoppingcartpage.Acceptation();
	}

}
