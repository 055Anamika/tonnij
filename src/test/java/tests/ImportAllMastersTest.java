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

	public class ImportAllMastersTest extends BaseTest {
		
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
		


		
	}

	
	@Test(priority=1, enabled=true)
	public void VerifyUserIsAbleToImportDriver() throws Exception {
		driverr.importdriver(Driver.DRIVER_FILE);

	}
}
