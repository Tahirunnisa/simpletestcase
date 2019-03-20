package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UNF_056_POM {

	WebElement element;
	private WebDriver driver;

	public UNF_056_POM(WebDriver driver) {
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

	// Click on Catelog Icon
	@FindBy(xpath = "//span[contains(text(),'Catalog')]")
	private WebElement Catalogicon;

	// Click on Products link
	@FindBy(xpath = "/html[1]/body[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	private WebElement productlink;

	// To Display Catetogories under CatelogIcon
	@FindBy(xpath = "//a[contains(text(),'Categories')]")
	private WebElement categories;

	// Click on Edit icon of the Product
	@FindBy(xpath = "//tr[1]//td[8]//a[1]//i[1]")
	private WebElement Editpageshudgetdisplayed;

	// Click on Datatab
	@FindBy(xpath = "//a[contains(text(),'Data')]")
	private WebElement Datatab;

	// Clear data from Quantity textbox
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement Cleardata;

	// Enter valid credentials in Quantity textbox
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement Quantitytextbox;

	// Click on Discount tab
	@FindBy(xpath = "//a[contains(text(),'Discount')]")
	private WebElement Discounttab;

	// Click on Add discount icon
	@FindBy(xpath = "//table[@id='discount']//tfoot//button[@type='button']")
	private WebElement Discounticon;

	// Enter valid credentials in Quantity textbox
	@FindBy(xpath = "//tr[@id='discount-row1']//input[@placeholder='Quantity']")
	private WebElement quantitytextbox;

	// Enter valid credentials in Price textbox
	@FindBy(xpath = "//tr[2]//td[4]//input[1]")
	private WebElement pricetextbox;

	// Select valid start date as current date
	@FindBy(xpath = "//tr[@id='discount-row1']//input[@placeholder='Date Start']")
	private WebElement startdate;

	// Click on Calender Icon
	@FindBy(xpath = "//tr[@id='discount-row1']//td[5]//div[1]//span[1]//button[1]//i[1]")
	private WebElement Calendericon;

	// End Date
	@FindBy(xpath = "//tr[@id='discount-row1']//td[6]//div[1]//span[1]//button[1]//i[1]")
	private WebElement Enddate;

//  Keep default values in Links, Attribute, Option, Recurring, Special, Image, Reward Points and Design tab
	@FindBy(xpath = "//a[contains(text(),'Links')]")
	private WebElement Links;

	// Click on Attribute Tab
	@FindBy(xpath = "//a[@href='#tab-attribute']")
	private WebElement Attribute;

	// Click on Option Tab
	@FindBy(xpath = "//a[@href='#tab-option']")
	private WebElement Option;

	// Click on Recurring Tab
	@FindBy(xpath = "//a[@href='#tab-recurring']")
	private WebElement Recurring;

	// Click on Special
	@FindBy(xpath = "//a[contains(text(),'Special')]")
	private WebElement Special;

	// Click on Image
	@FindBy(xpath = "//a[contains(text(),'Image')]")
	private WebElement Image;

	// Click on Reward Points
	@FindBy(xpath = "//a[@href='#tab-reward']")
	private WebElement Rewards;

	// Click on DesignTab
	@FindBy(xpath = "//a[contains(text(),'Design')]")
	private WebElement Designtab;
	
	// Click on Save
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement Saveicon;
	
	// TO show message
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successsmessage;
	
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

	// Click on Catelog icon
	public void clickCatelog() {
		this.Catalogicon.click();
	}

	public String Displaycategory() {
		return this.categories.getText();
	}

	public void productlink() {
		this.productlink.click();
	}

	public void Editicon() {
		this.Editpageshudgetdisplayed.click();
	}

	public void DataTab() {
		this.Datatab.click();
	}

	public void CleardatafromQuantitytextbox() {
		this.Cleardata.clear();
	}

	public void Quantitytextbox(String quantity) {
		// this.password.clear();
		this.Quantitytextbox.sendKeys(quantity);
	}

	public void Discouttab() {
		this.Discounttab.click();
	}

	public void Discouticon() {
		this.Discounticon.click();
	}

	public void Quantitytext(String Quantity) {
		this.quantitytextbox.clear();
		this.quantitytextbox.sendKeys(Quantity);
	}

	public void Pricetextbox(String price) {
		this.pricetextbox.clear();
		this.pricetextbox.sendKeys(price);
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

	public void linkstab() {
		this.Links.click();
	}

	public void Attributetab() {
		this.Attribute.click();
	}

	public void Opttiontab() {
		this.Option.click();
	}

	public void Recurringtab() {
		this.Recurring.click();
	}

	public void Speciatab() {
		this.Special.click();
	}

	public void Image() {
		this.Image.click();
	}

	public void Rewardpoints() {
		this.Rewards.click();
	}

	public void DesignTab() {
		this.Designtab.click();
	}
	
	public void Icon() {
		this.Saveicon.click();
	}
	public String Message() {
		return this.successsmessage.getText();
		
	}
	
	
}
