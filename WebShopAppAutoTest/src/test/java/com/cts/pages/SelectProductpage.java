package com.cts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductpage extends Basepage {
	@FindBy(xpath = "//a[contains(text(),'Books')]")
	WebElement selectBook;
	@FindBy(xpath = "//input[@value='Add to cart']")
	WebElement AddBooktocart;
	@FindBy(xpath = "//a[contains(text(),'Computers')]")
	WebElement selectcomputers;
	@FindBy(xpath = "//img[@alt='Picture for category Notebooks']")
	WebElement selectnotebooks;

	@FindBy(xpath = "//input[@value='Add to cart']")
	WebElement addnotebooktocart;

	@FindBy(xpath = "//a[contains(text(),'Electronics')]")
	WebElement selectelectronics;
	@FindBy(xpath = "//img[@alt='Picture for category Cell phones']")
	WebElement selectphones;
	@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	WebElement Addphonetocart;

	public SelectProductpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void AddBook() {
		selectBook.click();
		AddBooktocart.click();

	}

	public void AddComputer() {
		selectcomputers.click();
		selectnotebooks.click();
		addnotebooktocart.click();
	}

	public void AddPhone() {
		selectelectronics.click();
		selectphones.click();
		Addphonetocart.click();
	}
}
