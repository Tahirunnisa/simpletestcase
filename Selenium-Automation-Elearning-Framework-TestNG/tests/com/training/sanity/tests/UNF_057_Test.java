package com.training.sanity.tests;

import java.io.FileInputStream;
	import java.io.IOException;

	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
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
	import com.training.pom.UNF_056_POM;
import com.training.pom.UNF_057_POM;
import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class UNF_057_Test {

		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private UNF_057_POM unf_057_POM;
		private static Properties properties;
		private ScreenShot screenShot;
		
		@BeforeTest
		public void setUp() throws Exception {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver);
			unf_057_POM = new UNF_057_POM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver);
			// open the browser
			driver.get(baseUrl);
			unf_057_POM.sendUserName("admin");
			unf_057_POM.sendPassword("admin@123");
			unf_057_POM.clickLoginBtn();
			//unf_027_CustPOM.clicReport();
			screenShot.captureScreenShot("First");
		}

		@AfterTest
		public void tearDown() throws Exception {
			Thread.sleep(1000);
			//driver.quit();
		}

		 	@Test
		public void  Catelogicon() throws InterruptedException {
			
			unf_057_POM.clickmenuButton();
			unf_057_POM.clickCatelog();
			unf_057_POM.productlink();
			unf_057_POM.AddNewicon();
			unf_057_POM.ProductName("Shoes");
			unf_057_POM.MetaTagTitle("Shoes for students");
			unf_057_POM.Datatab();
			unf_057_POM.Modeltextbox("SHS-103");	
			unf_057_POM.Pricetextbox("1000");
			unf_057_POM.Quantitytextbox("20");
			unf_057_POM.Linkstab();
			unf_057_POM.Categoriestextbox("Sports Uniform");
			unf_057_POM.Discounttab();
			unf_057_POM.Adddiscounticon();
			unf_057_POM.Quanttextbox("2");
			unf_057_POM.Pricetxtbox("1000");
			unf_057_POM.StartDate();
			unf_057_POM.Calender();
			unf_057_POM.EndDate();
			unf_057_POM.linkstab();
			unf_057_POM.Attributetab();
			unf_057_POM.Opttiontab();
			unf_057_POM.Recurringtab();
			unf_057_POM.Speciatab();
			unf_057_POM.Image();
			unf_057_POM.Rewardpoints();
			unf_057_POM.DesignTab();
			unf_057_POM.Icon();
			unf_057_POM.Message();
			
		 	}
	
}
