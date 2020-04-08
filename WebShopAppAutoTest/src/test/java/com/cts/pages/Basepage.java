package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
	@FindBy(linkText = "Log in")
	WebElement loginlink;
	@FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
	WebElement ShoppingcartLink;
	@FindBy(id = "checkout")
	WebElement Checkoutlink;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logoutlink;

	public Basepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Loginlink() {
		loginlink.click();

	}

	public void Shoppingcartlink() {
		ShoppingcartLink.click();
	}

	public void Checkoutlink() {
		Checkoutlink.click();

	}

	public void Logout() {
		logoutlink.click();
	}
}
