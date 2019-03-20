package com.training.pom;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class UNF_060_POM {

		WebElement element;
		private WebDriver driver;

		public UNF_060_POM(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//i[@class='fa fa-indent fa-lg']")
		private WebElement menuBtn;

		// Click on Marketing icon
		@FindBy(xpath = "//span[contains(text(),'Marketing')]")
		private WebElement Markicon;
		
		//Click on Mail link
		@FindBy(xpath ="//a[contains(text(),'Mail')]")
		private WebElement Maillink;
		
		// Select valid credentials in To list box
		@FindBy(xpath ="//select[@id='input-to']")
		private WebElement Tolistbox;
		
		//Enter valid credentials in Subject textbox
		@FindBy(xpath="//input[@id='input-subject']")
		private WebElement Subjecttextbox;
		
		//Enter valid credentials in Message textbox
		@FindBy(xpath="//div[@class='note-editable panel-body']")
		private WebElement Messagetextbox;
		
		//Click on Mail icon
		@FindBy(xpath="//h3[@class='panel-title']")
		private WebElement Mailicon;
		
		/* // Select valid credentials in To list box
		@FindBy(xpath ="//select[@name='to']")
		private WebElement Tolistbox1;
		
		//Enter valid credentials in Subject textbox
		@FindBy(xpath="//input[@id='input-subject']")
		private WebElement Subjecttextbox1;	
		
		//Enter valid credentials in Message textbox
		@FindBy(xpath="//div[@class='note-editable panel-body']")
		private WebElement Messagetextbox1;   */
		
		//Click on cancel
		@FindBy(xpath="//a[@class='btn btn-default']")
		private WebElement cancel;
		
		public void clickmenuButton() {
			this.menuBtn.click();
		}

		public void marketingicon() {
			this.Markicon.click();
		}

		public void Maillink() {
			this.Maillink.click();
		}
		public void Tolistbox(String EnterinTolistbox) {
			this.Tolistbox.sendKeys(EnterinTolistbox);
		}
		public void Subjecttextbox(String Subjecttextbox) {
			this.Subjecttextbox.sendKeys(Subjecttextbox);
		}
		public void Messagetextbox(String Messagetextbox) {
				this.Messagetextbox.sendKeys(Messagetextbox);
		}
		/* public void Tolistbox1(String EnterinTolistbox1) {
			this.Tolistbox1.sendKeys(EnterinTolistbox1);
		}
		public void Subjecttextbox1(String Subjecttextbox1) {
			this.Subjecttextbox1.sendKeys(Subjecttextbox1);
		}
		public void Messagetextbox1(String Messagetextbox1) {
			this.Messagetextbox1.sendKeys(Messagetextbox1);
	     } */
		public void Cancel() {
			this.cancel.click();
		}
	}
