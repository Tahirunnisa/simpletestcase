package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.UNF_029_POMLogin;
import com.training.pom.UNF_030_EmailPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UNF_030_EmailLogout {

	
	private WebDriver driver;
	private String baseUrl1;
	private LoginPOM loginPOM;
	private UNF_030_EmailPOM unf_030_emailPOM;
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
		loginPOM = new LoginPOM(driver); 
		unf_030_emailPOM =new UNF_030_EmailPOM(driver);
		baseUrl1 = properties.getProperty("baseURL1");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl1);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() {
		unf_030_emailPOM.sendUserName("tahirunnisa82@gmail.com");
		unf_030_emailPOM.sendPassword("firodoz2011");
		unf_030_emailPOM.clickLoginBtn();
		unf_030_emailPOM.clickLogout(); 
		//loginPOM.clickmenuButton();
		//loginPOM.clicReport();
	}	
}

