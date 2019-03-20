package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UNF_059_POM {

	WebElement element;
	private WebDriver driver;

	public UNF_059_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='fa fa-indent fa-lg']")
	private WebElement menuBtn;

	// Click on Marketing icon
	@FindBy(xpath = "//span[contains(text(),'Marketing')]")
	private WebElement Markicon;

	// Click on Affiliates link
	@FindBy(xpath = "/html[1]/body[1]/div[1]/nav[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]")
	private WebElement Affiliateslink;

	// Click on Add New icon
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement AddNewicon;

	// Enter valid credentials in First Name textbox
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement FirstName;

	// Enter valid credentials in Last Name textbox
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;

	// Enter valid credentials in E-Mail textbox
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement Email;

	// Enter valid credentials in Telephone textbox
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement Telephonetextbox;

	// Enter valid credentials in Password textbox
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement Passwordtextbox;

	// Enter valid credentials in Confirm password textbox
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement Confirmpasswordtextbox;

	// Enter valid credentials in Address1 textbox
	@FindBy(xpath = "//input[@id='input-address-1']")
	private WebElement Address1textbox;

	// Enter valid credentials in Address2 textbox
	@FindBy(xpath = "//input[@id='input-address-2']")
	private WebElement Address2textbox;

	// Enter valid credentials in City textbox
	@FindBy(xpath = "//input[@id='input-city']")
	private WebElement Citytextbox;

	// Enter valid credentials in Post Code textbox
	@FindBy(xpath = "//input[@id='input-postcode']")
	private WebElement PostCodetextbox;

	// Select credentials from Country list box
	@FindBy(xpath = "//select[@id='input-country']")
	private WebElement Countrylistbox;

	// Select credentials from Region/State list box
	@FindBy(xpath = "//select[@id='input-zone']")
	private WebElement RegionState;

	// Click on Payment Details tab
	@FindBy(xpath = "//a[contains(text(),'Payment Details')]")
	private WebElement PaymentDetailsTab;

	// Enter valid credentials in Cheque payee Name textbox
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement payeeNametextbox;

	// click on Save icon
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Saveicon;
	
	// TO show message
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement message;

	public void clickmenuButton() {
		this.menuBtn.click();
	}

	public void marketingicon() {
		this.Markicon.click();
	}

	public void Affiliateslink() {
		this.Affiliateslink.click();
	}

	public void Addnewicon() {
		this.AddNewicon.click();
	}

	public void FirstNametextbox(String FirstName) {
		this.FirstName.sendKeys(FirstName);
	}

	public void LastNametextbox(String LastName) {
		this.lastName.sendKeys(LastName);
	}

	public void Mailtextbox(String Email) {
		this.Email.sendKeys(Email);
	}

	public void Telephonetextbox(String Telephone) {
		this.Telephonetextbox.sendKeys(Telephone);
	}
	public void passwordtextbox(String password) {
		this.Passwordtextbox.sendKeys(password);
	}
	public void Confirmpasswordtextbox(String Confirmpassword) {
		this.Confirmpasswordtextbox.sendKeys(Confirmpassword);
	}
	public void Address1textbox(String Address1) {
		this.Address1textbox.sendKeys(Address1);
	}
	public void Address2textbox(String Address2) {
		this.Address2textbox.sendKeys(Address2);
	}
	public void Citytextbox(String City) {
		this.Citytextbox.sendKeys(City);
	}
	
	public void Postcodetextbox(String Postcode) {
		this.PostCodetextbox.sendKeys(Postcode);
	}
	public void Country(String Country) {
		this.Countrylistbox.sendKeys(Country);
	}
	public void Regionlistbox(String Region) {
		this.RegionState.sendKeys(Region);
	}
	public void PaymentDetailstab() {
		this.PaymentDetailsTab.click();
	}
	
	public void payeeNametextbox(String ChequepayeeName) {
		this.payeeNametextbox.sendKeys(ChequepayeeName);
	}
	
	public void Saveicon() {
		this.Saveicon.click();
	}
	public String Message() {
		return this.message.getText();
		
	}
}
