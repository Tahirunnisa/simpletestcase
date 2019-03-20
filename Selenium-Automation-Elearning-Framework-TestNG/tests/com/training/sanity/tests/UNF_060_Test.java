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
import com.training.pom.UNF_060_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_060_Test {

	private WebDriver driver;
	private String baseUrl;
	private UNF_056_POM unf_056_POM;
	private UNF_060_POM unf_060_POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		// loginPOM = new LoginPOM(driver);
		unf_056_POM = new UNF_056_POM(driver);
		unf_060_POM = new UNF_060_POM(driver);
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
	public void Marketingicon() throws InterruptedException {

		unf_060_POM.clickmenuButton();
		unf_060_POM.marketingicon();
		unf_060_POM.Maillink();
		unf_060_POM.Tolistbox("All Affiliates");
		unf_060_POM.Subjecttextbox("New Product Launch");
		unf_060_POM.Messagetextbox("New Product Launch to be launched on 25th  February 2019");
		unf_060_POM.Cancel();
		
	}

}
