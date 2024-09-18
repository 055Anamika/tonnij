package tests;

import web.pages.BaseMethods;
import web.pages.BasePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import web.pages.DriverPage;
import web.pages.LoginSignUPPage;
import web.testdata.Driver;
import org.testng.asserts.SoftAssert;
import web.testdata.LoginSignUP;

	public class DriverTest extends BaseTest {
		
		public LoginSignUPPage loginPage;
		public DriverPage driverr;
		public SoftAssert softAssert;
		public BaseMethods basemethod;
		public BasePage basepage;



	@BeforeClass
	public void setup() {
		driver.set(driverFactory.initialize());
		loginPage = new LoginSignUPPage(driver.get());
		loginPage.navigateToURL(URL);	
		loginPage.userLoginn(LoginSignUP.EMAIL, LoginSignUP.PASSWORD);
		driverr = new DriverPage(driver.get());
		softAssert = new SoftAssert();
		basemethod= new BaseMethods(driver.get());
		basepage= new BasePage(driver.get());
	//	basemethod.generatePhoneNumber();
		


		
	}

	
	@Test(priority=1, enabled=true)
	public void VerifyUserIsAbleToAddDriver() throws Exception {
		driverr.AddDriver(Driver.DRIVER_NAME, Driver.CELLPHONE_NO, Driver.EMAIL, Driver.BUILDING_NAME, Driver.STREET_NAME, 
				Driver.CITY, Driver.POSTAL_CODE, Driver.SIN, Driver.LICENSE_NO, Driver.UPLOAD_LICENSE);
		   
		softAssert.assertEquals(basepage.getTostMessage(), "Driver added successfully", "Message do not match" );
		softAssert.assertAll();
	}
	
	
	
	@Test(priority=2, enabled= true)
	public void DriverList() throws Exception {
		driverr.dashboardList();
	}
	
	@Test(priority=2, enabled= false)
	public void VerifyUserIsAbleToAddDriverUpdate() throws Exception {
		driverr.updateDriver();
	}
}
