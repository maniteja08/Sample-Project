package com.cts.stepdefination;

import org.openqa.selenium.WebDriver;

import com.cts.baseclass.BaseClass;
import com.cts.pages.Checkoutspage;
import com.cts.pages.Loginpage;
import com.cts.pages.SelectProductpage;
import com.cts.pages.Shoppingcartpage;
import com.cts.utility.ExcelReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Webshop_Checkout extends BaseClass {
	WebDriver driver;
	Checkoutspage checkout;
	ExcelReader excelreader = new ExcelReader();

	@Given("^the user launch the chrome application i am on the home page and logs and selects the products and selects shipping cart link$")
	public void the_user_launch_the_chrome_application_i_am_on_the_home_page_and_logs_and_selects_the_products_and_selects_shipping_cart_link()
			throws Throwable {
		driver = InitDriver("chrome");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.Loginlink();
		loginpage.setUsername(excelreader.excel_username(0));
		loginpage.setPassword(excelreader.excel_password(0));
		loginpage.Btnclick();

		SelectProductpage selectproductpage = new SelectProductpage(driver);
		selectproductpage.AddBook();
		selectproductpage.AddComputer();
		selectproductpage.AddPhone();
		Shoppingcartpage shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.Shoppingcartlink();
		shoppingcartpage.Selectcountry();
		shoppingcartpage.Selectstate();
		shoppingcartpage.Zipcode();
		shoppingcartpage.Acceptation();

	}

	@Then("^user cicks on checkout link$")
	public void user_cicks_on_checkout_link() throws Throwable {
		checkout = new Checkoutspage(driver);
		checkout.Checkoutlink();
	}

	@Then("^the user clicks on continue buttons as address is already filled$")
	public void the_user_clicks_on_continue_buttons_as_address_is_already_filled() throws Throwable {
		checkout.Selectcontinue();
	}

	@Then("^click on logout$")
	public void click_on_logout() throws Throwable {
		checkout.Logout();
	}

}
