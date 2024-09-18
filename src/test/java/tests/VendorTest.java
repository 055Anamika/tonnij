package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import web.testdata.Vendor;
import web.pages.BaseMethods;
import web.pages.BasePage;
import web.pages.LoginSignUPPage;
import web.pages.VendorPage;
import web.testdata.LoginSignUP;

public class VendorTest extends BaseTest {
	public LoginSignUPPage login;
	public VendorPage vendor;
	public BaseMethods basemethod;
	public SoftAssert softAssert;
	public BasePage basepage;

	@BeforeClass
	public void setup() throws Exception {
		driver.set(driverFactory.initialize());
		login = new LoginSignUPPage(driver.get());
		login.navigateToURL(URL);
		// loginPage.Login(Customer.userID,Customer.PASS);
		vendor = new VendorPage(driver.get());
		softAssert = new SoftAssert();
		basemethod= new BaseMethods(driver.get());
		basepage= new BasePage(driver.get());
	}
	

	@Test(priority = 1)
	public void VerifyUserIsAbleToLogin() throws Exception {
		login.userLoginn(LoginSignUP.EMAIL, LoginSignUP.PASSWORD);

	}

	@Test(priority = 2, enabled = true)
	public void VerifyUserIsAbleToAddVendor() throws Exception {
		vendor.addVendor(Vendor.VENDOR_COMPANY, Vendor.CONTACT_PERSON_NAME, Vendor.VENDOR_GST, Vendor.CUSTOMER_WEBSITE,
				Vendor.BUILDING_NUMBER, Vendor.STREET_NAME, Vendor.VENDOR_CITY, Vendor.POSTAL_CODE, Vendor.VENDOR_FAX,
				Vendor.MAIL, Vendor.OFFICE_NO, Vendor.VENDOR_CELLPHONE_NO, Vendor.VENDOR_NSC, Vendor.VENDOR_WCB);
		softAssert.assertEquals(basepage.getTostMessage(), "Vendor added successfully", "Message do not match" );
		softAssert.assertAll();
	}
	
	
		@Test(priority = 3, enabled=true)
		public void DashboardVendorList() throws Exception {
			vendor.dashboardVendor();
		}

	
	@Test(priority = 4, enabled = false)
	public void VerifyUserIsAbleToUpdateVendor() throws Exception {
		vendor.updateVendor();
	
}
}
