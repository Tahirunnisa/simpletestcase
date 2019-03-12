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
	import com.training.pom.UNF_028_POM;
	import com.training.utility.DriverFactory;
	import com.training.utility.DriverNames;

	public class UNF_028_Test {

		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private UNF_028_POM unf_028_POM;
		private static Properties properties;
		private ScreenShot screenShot;
		
		@BeforeTest
		public void setUp() throws Exception {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			loginPOM = new LoginPOM(driver);
			unf_028_POM = new UNF_028_POM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver);
			// open the browser
			driver.get(baseUrl);
			unf_028_POM.sendUserName("admin");
			unf_028_POM.sendPassword("admin@123");
			unf_028_POM.clickLoginBtn();
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
			unf_028_POM.clickmenuButton();
			unf_028_POM.clicReport();
			unf_028_POM.customerslink();
		    Thread.sleep(2000);
			unf_028_POM.customersActivitylink();
			
			unf_028_POM.customertextbox("Tahira");
			unf_028_POM.clickFilterButton();
			
			String CustomersOnlineexpected="Customers Online";
			String CustomerActual = driver.findElement(By.xpath("//ul[@class='collapse in']//a[contains(text(),'Customers Online')]")).getText();
		    Assert.assertEquals(CustomersOnlineexpected, CustomerActual);
		    System.out.println("CustomerActual value.........." + CustomerActual);
			
		}
		
}
