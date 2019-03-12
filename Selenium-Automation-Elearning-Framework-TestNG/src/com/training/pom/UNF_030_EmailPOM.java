package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UNF_030_EmailPOM {

private WebDriver driver; 
	
	public UNF_030_EmailPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement email; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//span[contains(text(),'Tahira Shaik')]")
	private WebElement usericon;
	
	@FindBy(linkText="Logout")
	private WebElement Logout;
	
	public void sendUserName(String userName) {
		this.email.clear();
		this.email.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void clickLogout() {
		this.Logout.click(); 
	}
}


	

