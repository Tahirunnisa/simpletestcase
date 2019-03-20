package com.training.sanity.tests;

import java.io.FileInputStream;
	import java.io.IOException;

	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
import java.util.List;
import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.training.generics.ScreenShot;
	import com.training.pom.LoginPOM;
	import com.training.pom.UNF_056_POM;
	import com.training.pom.UNF_059_POM;
	import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class UNF_059_Test {

		private WebDriver driver;
		private String baseUrl;
		private UNF_056_POM unf_056_POM;
		private UNF_059_POM unf_059_POM;
		private static Properties properties;
		private ScreenShot screenShot;
		
		@BeforeTest
		public void setUp() throws Exception {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			//loginPOM = new LoginPOM(driver);
			unf_056_POM = new UNF_056_POM(driver);
			unf_059_POM = new UNF_059_POM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver);
			// open the browser
			driver.get(baseUrl);
			unf_056_POM.sendUserName("admin");
			unf_056_POM.sendPassword("admin@123");
			unf_056_POM.clickLoginBtn();
			screenShot.captureScreenShot("First");
		}

		@AfterTest
		public void tearDown() throws Exception {
			Thread.sleep(1000);
			//driver.quit();
		}
			 
		@Test
		public void  Affiliateslink() throws InterruptedException {
			
			unf_059_POM.clickmenuButton();
			unf_059_POM.marketingicon();
			unf_059_POM.Affiliateslink();
			unf_059_POM.Addnewicon();
			unf_059_POM.FirstNametextbox("Trisha");
			unf_059_POM.LastNametextbox("Sharma");
			unf_059_POM.Mailtextbox("trisha.sharma1@gmail.com");
			unf_059_POM.Telephonetextbox("9765376551");
			unf_059_POM.passwordtextbox("trisha234");
			unf_059_POM.Confirmpasswordtextbox("trisha234");
			unf_059_POM.Address1textbox("K R Road");
			unf_059_POM.Address2textbox("bangalore");
			unf_059_POM.Citytextbox("Bangalore");
			unf_059_POM.Postcodetextbox("560022");
					
			unf_059_POM.Country("India");
			Thread.sleep(2000);
			unf_059_POM.Regionlistbox("Karnataka");
			unf_059_POM.PaymentDetailstab();
			unf_059_POM.payeeNametextbox("Trisha");
			unf_059_POM.Saveicon();
			String expectedValue = unf_059_POM.Message();
			String actualValue = unf_059_POM.Message();
			Assert.assertEquals(expectedValue, actualValue); 
			
			}
	
		}
		
