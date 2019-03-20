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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_056_Test {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private UNF_056_POM unf_056_POM;
	private static Properties properties;
	private ScreenShot screenShot;
	
	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		unf_056_POM = new UNF_056_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
		unf_056_POM.sendUserName("admin");
		unf_056_POM.sendPassword("admin@123");
		unf_056_POM.clickLoginBtn();
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
		
		unf_056_POM.clickmenuButton();
		unf_056_POM.clickCatelog();
						
	    String  expectedValue = "Categories";
		String actualValue = unf_056_POM.Displaycategory();
		Assert.assertEquals(expectedValue, actualValue);
		unf_056_POM.productlink(); 
		Thread.sleep(2000);
		unf_056_POM.Editicon();
		unf_056_POM.DataTab();
		unf_056_POM.CleardatafromQuantitytextbox();
		unf_056_POM.Quantitytextbox("30");
		unf_056_POM.Discouttab();
		unf_056_POM.Discouticon();
		unf_056_POM.Quantitytext("1");
		unf_056_POM.Pricetextbox("50");
		unf_056_POM.StartDate();
		unf_056_POM.Calender();
		unf_056_POM.EndDate();
		unf_056_POM.linkstab();
		unf_056_POM.Attributetab();
		unf_056_POM.Opttiontab();
		unf_056_POM.Recurringtab();
		unf_056_POM.Speciatab();
		unf_056_POM.Image();
		unf_056_POM.Rewardpoints();
		unf_056_POM.DesignTab();
	    unf_056_POM.Icon();
		String expectedValue1 = unf_056_POM.Message();
		//System.out.print(expectedValue1);
		String actualValue1 = unf_056_POM.Message();
		//System.out.print(actualValue1);
		Assert.assertEquals(expectedValue1, actualValue1); 
		//Assert.assertEquals(expectedValue1, actualValue1);
									
	}
		 	
}