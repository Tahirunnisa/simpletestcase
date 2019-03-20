package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UNF_058_POM {

	WebElement element;
	private WebDriver driver;

	public UNF_058_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='fa fa-indent fa-lg']")
	private WebElement menuBtn;

	// Click on Marketing icon
	@FindBy(xpath = "//span[contains(text(),'Marketing')]")
	private WebElement Markicon;

	// Click on Coupons link
	@FindBy(xpath = "/html[1]/body[1]/div[1]/nav[1]/ul[1]/li[7]/ul[1]/li[3]/a[1]")
	private WebElement couponlink;

	// click on Add New icon
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement AddNewicon;

	// enter valid credentials in Coupon Name textbox
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement CouponName;

	// enter valid credentials in Code textbox
	@FindBy(xpath = "//input[@id='input-code']")
	private WebElement Codetextbox;

	// enter valid credentials in Discount textbox
	@FindBy(xpath = "//input[@id='input-discount']")
	private WebElement Discounttextbox;

	// enter valid credentials in Product textbox
	@FindBy(xpath = "//input[@id='input-product']")
	private WebElement producttextbox;

	// Select valid start date as current date
	@FindBy(xpath = "//input[@id='input-date-start']")
	private WebElement startdate;

	// Click on Calender Icon
	@FindBy(xpath = "//div[10]//div[1]//div[1]//span[1]//button[1]//i[1]")
	private WebElement Calendericon;

	// End Date
	@FindBy(xpath = "//input[@placeholder='Date End']")
	private WebElement Enddate;

	// Click on Save
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Saveicon;

	// TO show message
	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement successsmessage;

	public void clickmenuButton() {
		this.menuBtn.click();
	}

	public void marketingicon() {
		this.Markicon.click();
	}

	public void couponslink() {
		this.couponlink.click();
	}

	public void Addnewicon() {
		this.AddNewicon.click();
	}

	public void CouponName(String EntercouponName) {
		this.CouponName.sendKeys(EntercouponName);
	}

	public void CodetextBox(String Entercodetextbox) {
		this.Codetextbox.sendKeys(Entercodetextbox);
	}

	public void DisocunttextBox(String EnterDiscounttextbox) {
		this.Discounttextbox.sendKeys(EnterDiscounttextbox);
	}

	public void producttextBox(String Enterproducttextbox) {
		this.producttextbox.sendKeys(Enterproducttextbox);
	}

	public void StartDate() {
		this.startdate.click();
	}

	public void Calender() {
		this.Calendericon.click();

	}

	public void EndDate() {
		this.Enddate.click();
	}

	public void Icon() {
		this.Saveicon.click();
	}

	public String Message() {
		return this.successsmessage.getText();

	}
}


