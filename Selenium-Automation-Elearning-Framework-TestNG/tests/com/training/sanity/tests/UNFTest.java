package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
//import com.training.pom.CategoriesPOM;
//import com.training.pom.FilterOrdersPOM;
import com.training.pom.LoginPOM;
import com.training.pom.UNF;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNFTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	//private FilterOrdersPOM filterOrdersPOM;
    private UNF shikshaPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		shikshaPOM = new UNF(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot("First");
	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void FilterOrders() throws InterruptedException {

		shikshaPOM.clickOrders();
		shikshaPOM.selectStartDate();
		shikshaPOM.selectEndDate();
		shikshaPOM.clickFilterButton();
		shikshaPOM.selectGroupByValue();
		shikshaPOM.selectOrderStatusValue();
		shikshaPOM.clickFilterButton();

		Thread.sleep(2000);

	}

}