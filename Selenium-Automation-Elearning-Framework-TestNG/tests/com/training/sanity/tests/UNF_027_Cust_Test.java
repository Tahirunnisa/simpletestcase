package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.UNF_027_CustPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_027_Cust_Test {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private UNF_027_CustPOM unf_027_CustPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	/* @BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		unf_027_CustPOM = new UNF_027_CustPOM(driver);
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
		unf_027_CustPOM.sendUserName("admin");
		unf_027_CustPOM.sendPassword("admin@123");
		unf_027_CustPOM.clickLoginBtn();
		unf_027_CustPOM.clickmenuButton();
		unf_027_CustPOM.clicReport();
		unf_027_CustPOM.customers();
		// driver.findElement(By.linkText("Purchased"));
	}   */

	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		unf_027_CustPOM = new UNF_027_CustPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
		unf_027_CustPOM.sendUserName("admin");
		unf_027_CustPOM.sendPassword("admin@123");
		unf_027_CustPOM.clickLoginBtn();
		//unf_027_CustPOM.clicReport();
		screenShot.captureScreenShot("First");
	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void Customerslink() throws InterruptedException {
		Thread.sleep(1000);
		unf_027_CustPOM.clickmenuButton();
		unf_027_CustPOM.clicReport();
		unf_027_CustPOM.customerslink();
		unf_027_CustPOM.customersonlinelink();
		unf_027_CustPOM.customertextbox("Tahira");
		unf_027_CustPOM.clickFilterButton();
		
		String CustomersOnlineexpected="Customers Online";
		String CustomerActual = driver.findElement(By.xpath("//ul[@class='collapse in']//a[contains(text(),'Customers Online')]")).getText();
	    Assert.assertEquals(CustomersOnlineexpected, CustomerActual);
	    System.out.println("CustomerActual value.........." + CustomerActual);
		
	}
	
}
