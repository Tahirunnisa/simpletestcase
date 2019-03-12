package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UNF_027_CustPOM {

	WebElement element;
	private WebDriver driver;

	public UNF_027_CustPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;

	@FindBy(xpath = "//a[@id='button-menu']")
	private WebElement menuBtn;

	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	private WebElement reporticon;

	@FindBy(xpath = "//a[@class='parent'][contains(text(),'Customers')]")
	private WebElement customers;

	@FindBy(xpath = "//ul[@class='collapse in']//a[contains(text(),'Customers Online')]")
	private WebElement customersonline;

	@FindBy(xpath = "//input[@id='input-customer']")
	private WebElement customertextbox;

	@FindBy(id = "button-filter")
	private WebElement filterButton;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	public void clickmenuButton() {
		this.menuBtn.click();
	}

	// Click on Report icon
	public void clicReport() {
		this.reporticon.click();
	}

	public void customerslink() {
		this.customers.click();
	}

	public void customersonlinelink() {
		this.customersonline.click();

	}

	public void customertextbox(String customerTextbox) {
		this.customertextbox.clear();
		this.customertextbox.sendKeys("Tahira");
	}

	public void clickFilterButton() {
		this.filterButton.click();

	}
}
