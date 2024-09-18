package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

import web.config.WebConfig;
import web.init.DriverFactory;

public class BaseTest {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	public DriverFactory driverFactory = new DriverFactory();
	public String URL = WebConfig.URL;
	

	@BeforeSuite
	public void beforeSuite() {
		driverFactory = new DriverFactory();
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public void setDriver(WebDriver driver) {
		BaseTest.driver.set(driver);
	}

	@AfterClass
	public void tearDown() {
		if (getDriver() != null) {
			getDriver().quit();
		}
	}
	


}
