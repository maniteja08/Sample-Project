package com.cts.tdd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.pages.Checkoutspage;
import com.cts.baseclass.BaseClass;
import com.cts.pages.Basepage;
import com.cts.pages.Loginpage;
import com.cts.pages.SelectProductpage;
import com.cts.pages.Shoppingcartpage;
import com.cts.tdd.WebShopTest;
import com.cts.utility.ExcelReader;
import com.cts.utility.ScreenShot;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebShopTest extends BaseClass {
	WebDriver driver;

	Loginpage loginpage;
	Basepage basepage;
	SelectProductpage selectproductpage;
	Shoppingcartpage shoppingcartpage;
	Checkoutspage addresspage;
	WebShopTest webshoptest;
	ExcelReader excelreader;
	ScreenShot screenshot;
	final static Logger logger = LogManager.getLogger(WebShopTest.class.getName());

	@BeforeSuite
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\maniteja\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Parameters({ "Browsers" })
	@BeforeTest
	public void launchBrowser() {
		driver.get("http://demowebshop.tricentis.com/");
		logger.info("Opening the browser with WebShopApp");
		loginpage = new Loginpage(driver);
		basepage = new Basepage(driver);
		selectproductpage = new SelectProductpage(driver);
		shoppingcartpage = new Shoppingcartpage(driver);
		addresspage = new Checkoutspage(driver);
		webshoptest = new WebShopTest();
		excelreader = new ExcelReader();
		screenshot = new ScreenShot(driver);

	}

	@DataProvider(name = "user_details")
	public Object[][] getData() throws IOException {

		// Object[][] testData = null;

		return excelreader.getData();
	}

	@Test(priority = 0, dataProvider = "user_details")
	public void validatelogin(String email, String password) {
		loginpage.Loginlink();
		logger.info("Processing Valid login with username and password");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpage.setUsername(email);
		loginpage.setPassword(password);
		loginpage.Btnclick();
	}

	@Test(priority = 1)
	public void Productselect() {
		logger.info("processing select product");

		selectproductpage.AddBook();
		selectproductpage.AddComputer();
		selectproductpage.AddPhone();
		screenshot.takeSnapShot("E:\\maniteja\\Selenium Testing\\WebShopAppAutoTest\\Screenshots\\selectproduct.png");
	}

	@Test(priority = 2)
	public void Shoppingcart() {
		logger.trace("processing shopping cart");

		selectproductpage.Shoppingcartlink();
		screenshot.takeSnapShot("E:\\maniteja\\Selenium Testing\\WebShopAppAutoTest\\Screenshots\\shoppingcart.png");
		shoppingcartpage.Selectcountry();
		shoppingcartpage.Selectstate();
		shoppingcartpage.Zipcode();
		shoppingcartpage.Acceptation();
	}

	@Test(priority = 3)
	public void CheckoutAddress() {
		logger.info("processing check out");

		shoppingcartpage.Checkoutlink();
		screenshot.takeSnapShot("E:\\maniteja\\Selenium Testing\\WebShopAppAutoTest\\Screenshots\\checkouts.png");
		addresspage.Selectcontinue();
	}

	@Test
	public void Logout() {
		logger.info("Logging out of the WebPage");

		basepage.Logout();
	}

	@AfterTest
	public void CloseBrowser() {
		screenshot.takeSnapShot("E:\\maniteja\\Selenium Testing\\WebShopAppAutoTest\\Screenshots\\screenshot.png");
		logger.error("Driver is going to get closed");

		driver.close();
	}
}