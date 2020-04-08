package com.cts.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class Loginpage extends Basepage {

	@FindBy(id = "Email")
	WebElement userEmailElement;
	@FindBy(id = "Password")
	WebElement userPasswordElement;
	@FindBy(css = ".login-button")
	WebElement loginbtnElement;

	public Loginpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String email) {
		userEmailElement.sendKeys(email);
	}

	public void setPassword(String password) {
		userPasswordElement.sendKeys(password);
	}

	public void Btnclick() {
		loginbtnElement.click();
	}

}
