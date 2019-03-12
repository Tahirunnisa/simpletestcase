package com.training.pom;

		import java.util.List;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;
		
		public class UNF_026_POM<Webelement> {
		
			WebElement element;
			private WebDriver driver; 
			
			public UNF_026_POM(WebDriver driver) {
				this.driver = driver; 
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(name="username")
			private WebElement userName; 
			
			@FindBy(name="password")
			private WebElement password;
			
			@FindBy(xpath="//button[@type='submit']")
			private WebElement loginBtn; 
			
			@FindBy(xpath="//a[@id='button-menu']")
			private WebElement menuBtn;
			
			@FindBy(xpath="//span[contains(text(),'Reports')]")
			private WebElement reporticon;
			
			@FindBy(xpath="//a[@class='parent'][contains(text(),'Products')]")
			private WebElement productsicon;
			
			@FindBy(xpath="/html[1]/body[1]/div[1]/nav[1]/ul[1]/li[9]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
			private WebElement purchasedlink;
				
		    @FindBy(xpath="//table[@class='table table-bordered']")
		    private WebElement table;
		    
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
			
			public void productIcon() {
				this.productsicon.click();
					}
			
			public void purchasedIcon() {
				this.purchasedlink.click();
					}
			
			public void table() {
			//	this.table.findElements(	
				List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-bordered']"));
				int count = rows.size();
			}
						
		}


