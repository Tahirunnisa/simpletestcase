package com.training.pom;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class UNF_057_POM{

		WebElement element;
		private WebDriver driver;

		public UNF_057_POM(WebDriver driver) {
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
		
		//Click on Add New icon
		@FindBy(xpath="//div[@class='pull-right']//a[@class='btn btn-primary']")
		private WebElement AddNewicon;
		
		//Enter Valid credentials in Product Name of General tab
		@FindBy(xpath="//input[@id='input-name1']")
		private WebElement ProductName;
		
	     // Enter Valid credentials in Meta Tag Title of General tab
		@FindBy(xpath="//input[@id='input-meta-title1']")
		private WebElement  MetaTagTitle;
		
		//Click on Data tab
		@FindBy(xpath="//a[contains(text(),'Data')]")
		private WebElement Datatab;
		
		//Enter valid credentials in Model textbox
		@FindBy(xpath="//input[@id='input-model']")
		private WebElement Modeltextbox;
		
		//Enter valid credentials in Price textbox
		@FindBy(xpath="//input[@id='input-price']")
		private WebElement Pricetextbox;
		
		//Enter valid credentials in Quantity textbox
		@FindBy(xpath="//input[@id='input-quantity']")
		private WebElement Quantitytextbox;
		
		//Click on Links tab
		@FindBy(xpath="//a[contains(text(),'Links')]")
		private WebElement Linkstab;
		
		//Click on Categories textbox
		@FindBy(xpath="//input[@id='input-category']")
		private WebElement Categoriestextbox;
		
		// Click on Discount tab
		@FindBy(xpath="//a[contains(text(),'Discount')]")
		private WebElement Discounttab;
		
		// Click on AddDiscount icon
		@FindBy(xpath="//table[@id='discount']//tfoot//button[@type='button']")
		private WebElement Adddiscounticon;
		
		// Enter valid credentials in Quantity textbox
		@FindBy(xpath="//tr[@id='discount-row0']//input[@placeholder='Quantity']")
		private WebElement Quanttextbox;
		
		// Enter valid credentials in Price textbox
		@FindBy(xpath="//tr[@id='discount-row0']//input[@placeholder='Price']")
		private WebElement  Pricetxtbox;
		
		//Select valid start date as current date
		@FindBy(xpath="//tr[@id='discount-row0']//input[@placeholder='Date Start']")
		private WebElement Startdate;
		
		// Click on Calender Icon
		@FindBy(xpath = "//tr[@id='discount-row0']//td[5]//div[1]//span[1]//button[1]")
		private WebElement Calendericon;
				
		// End Date
		@FindBy(xpath = "//tr[@id='discount-row0']//td[6]//div[1]//span[1]//button[1]//i[1]")
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
		
		public void productlink() {
			this.productlink.click();
		}
		
		public void AddNewicon() {
			this.AddNewicon.click();
		}
		public void ProductName(String ProdName) {
			this.ProductName.sendKeys(ProdName);
		}
		public void MetaTagTitle(String MetaTag) {
			this.MetaTagTitle.sendKeys(MetaTag);
		}
		
		public void Datatab() {
			this.Datatab.click();
		}
		
		public void Modeltextbox(String Modeltextbox) {
			this.Modeltextbox.sendKeys(Modeltextbox);
		}
		public void Pricetextbox(String Pricetextbox) {
			this.Pricetextbox.sendKeys(Pricetextbox);
			}
		public void Quantitytextbox(String quantitytextbox) {
			this.Quantitytextbox.sendKeys(quantitytextbox);
		}
		public void Linkstab() {
			this.Linkstab.click();
		}
		public void Categoriestextbox(String Categtextbox) {
			this.Categoriestextbox.sendKeys(Categtextbox);
			
		}
		public void Discounttab() {
			this.Discounttab.click();
		}
		public void Adddiscounticon() {
			this.Adddiscounticon.click();
		}
		public void Quanttextbox(String quanttextbox) {
			this.Quanttextbox.sendKeys(quanttextbox);
		}
		public void Pricetxtbox(String Pricetxtbox) {
			this.Pricetxtbox.sendKeys(Pricetxtbox);
			}
		public void StartDate() {
			this.Startdate.click();
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
	
