package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.UNF_026_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_026_Test {

	private WebDriver driver;
	private String baseUrl;
	//private LoginPOM loginPOM;
	private UNF_026_POM unf_026_POM;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		//loginPOM = new LoginPOM(driver); 
		 unf_026_POM = new UNF_026_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		unf_026_POM.sendUserName("admin");
		unf_026_POM.sendPassword("admin@123");
		unf_026_POM.clickLoginBtn(); 
		unf_026_POM.clickmenuButton();
		unf_026_POM.clicReport();
		unf_026_POM.productIcon();
		//driver.findElement(By.linkText("Purchased"));
		unf_026_POM.purchasedIcon();
		

		String Salesexpected="Sales";
		String SalesActual = driver.findElement(By.xpath("//a[contains(text(),'Sales')]")).getText();
	    Assert.assertEquals(Salesexpected, SalesActual);
	    System.out.println("SalesActual value.........." + SalesActual);
	    
	    String Productexpected="Products";
		String ProductActual = driver.findElement(By.xpath(" //a[@class='parent'][contains(text(),'Products')]")).getText();
	    Assert.assertEquals(Productexpected, ProductActual);
	    System.out.println("ProductActual value.........." + ProductActual);
	    
	    String Customerexpected="Customers";
		String CustomerActual = driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Customers')]")).getText();
	    Assert.assertEquals(Customerexpected, CustomerActual);
	    System.out.println("CustomerActual value.........." + CustomerActual);
	    
	    String Marketingexpected="Marketing";
		String MarketingActual = driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Marketing')]")).getText();
	    Assert.assertEquals(Marketingexpected, MarketingActual);
	    System.out.println("MarketingActual value.........." + MarketingActual);
	    
	    // To check the Product icon Links
	    String viewedexpected="Viewed";
		String ViewedActual = driver.findElement(By.xpath("//a[contains(text(),'Viewed')]")).getText();
	    Assert.assertEquals(viewedexpected, ViewedActual);
	    System.out.println("Products link viewedexpected value.........." + ViewedActual);
	    
	    String Purchasedexpected="Purchased";
		String PurchasedActual = driver.findElement(By.xpath("//a[contains(text(),'Purchased')]")).getText();
	    Assert.assertEquals(Purchasedexpected, PurchasedActual);
	    System.out.println("Products link Purchasedexpected value.........." + PurchasedActual);
	    
	        
	    screenShot.captureScreenShot("First");
	}


}


