package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import web.pages.BaseMethods;
import web.pages.BasePage;
import web.pages.CustomerPage;
import web.pages.DriverPage;
import web.pages.LoginSignUPPage;
import web.pages.TrailerPage;
import web.pages.TruckPage;
import web.pages.VendorPage;
import web.testdata.Customer;
import web.testdata.Driver;
import web.testdata.LoginSignUP;
import web.testdata.Truck;
import web.testdata.Trailer;
import web.testdata.Vendor;

public class AllMasters extends BaseTest {

	public LoginSignUPPage loginPage;
	public DriverPage driverr;
	public TruckPage truck;
	public TrailerPage trailor;
	public CustomerPage customer;
	public VendorPage vendor;
	public BaseMethods basemethod;
	public SoftAssert softAssert;
	public BasePage basepage;

	@BeforeClass
	public void setup() {
		driver.set(driverFactory.initialize());
		loginPage = new LoginSignUPPage(driver.get());
		loginPage.navigateToURL(URL);
		loginPage.userLoginn(LoginSignUP.EMAIL, LoginSignUP.PASSWORD);
		driverr = new DriverPage(driver.get());
		truck = new TruckPage(driver.get());
		trailor = new TrailerPage(driver.get());
		customer = new CustomerPage(driver.get());
		vendor = new VendorPage(driver.get());
		softAssert = new SoftAssert();
		basemethod= new BaseMethods(driver.get());
		basepage= new BasePage(driver.get());

	}



	@Test(priority = 2)
	public void VerifyUserIsAbleToAddDriver() throws Exception {
		driverr.AddDriver(Driver.DRIVER_NAME, Driver.CELLPHONE_NO, Driver.EMAIL, Driver.BUILDING_NAME,
				Driver.STREET_NAME, Driver.CITY, Driver.POSTAL_CODE, Driver.SIN, Driver.LICENSE_NO,
				Driver.UPLOAD_LICENSE);
		softAssert.assertEquals(basepage.getTostMessage(), "Driver added successfully", "Message do not match" );
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public void DashboardDriverList() throws Exception {
		driverr.dashboardList();
	}

	@Test(priority = 4, enabled= false)
	public void VerifyUserIsAbleToAddDriverUpdate() throws Exception {
		driverr.updateDriver();
	}

	@Test(priority = 5)
	public void VerifyUserIsAbleToAddTruck() throws Exception {
		truck.addTruck(Truck.TRUCK_UNITNO, Truck.TRUCK_MAKE, Truck.TRUCK_VIN_NO, Truck.Truck_LICENSE_PLATENO);
		softAssert.assertEquals(basepage.getTostMessage(), "Truck added successfully", "Message do not match" );
		softAssert.assertAll();
	}

	@Test(priority = 6)
	public void DashboardTruckList() throws Exception {
		truck.dashboardTruck();
	}

	@Test(priority = 7, enabled= false)
	public void AVerifyUserIsAbleToUpdateTruck() throws Exception {
		truck.updateTruck();
	}

	@Test(priority = 8)
	public void VerifyUserIsAbleToAddTrailer() throws Exception {
		trailor.AddTrailer(Trailer.TRAILER_UNITNO, Trailer.TRAILER_MAKE, Trailer.LICENSE_PLATENO, Trailer.VIN_NO);
		softAssert.assertEquals(basepage.getTostMessage(), "Trailer added successfully", "Message do not match" );
		softAssert.assertAll();
	}

	@Test(priority = 9)
	public void DashboardTrailerList() throws Exception {
		trailor.dashboardTrailer();
	}

	@Test(priority = 10, enabled= false)
	public void AVerifyUserIsAbleTUpdatedTrailer() throws Exception {
		trailor.updateTrailer();
	}

	@Test(priority = 11)
	public void VerifyUserIsAbleToAddCustomer() throws Exception {
		customer.addCustomer(Customer.COMPANY_NAME, Customer.CONTACT_PERSON_NAME, Customer.BUILDING_NUMBER,
				Customer.STREET_NAME, Customer.CUSTOMER_CITY, Customer.POSTAL_CODE, Customer.CUSTOMER_CELLPHONE_NO,
				Customer.OFFICE_NO, Customer.MAIL, Customer.CUSTOMER_WEBSITE, Customer.CUSTOMER_FAX,
				Customer.CUSTOMER_GST);
		softAssert.assertEquals(basepage.getTostMessage(), "Customer added successfully", "Message do not match" );
		softAssert.assertAll();
	}

	@Test(priority = 12)
	public void DashboardCustomerList() throws Exception {
		customer.dashboardCustomer();
	}

	@Test(priority = 13, enabled= false)
	public void VerifyUserIsAbleToUpdateCustomer() throws Exception {
		customer.updateCustomer();
	}

	@Test(priority = 14)
	public void VerifyUserIsAbleToAddVendor() throws Exception {
		vendor.addVendor(Vendor.VENDOR_COMPANY, Vendor.CONTACT_PERSON_NAME, Vendor.VENDOR_GST, Vendor.CUSTOMER_WEBSITE,
				Vendor.BUILDING_NUMBER, Vendor.STREET_NAME, Vendor.VENDOR_CITY, Vendor.POSTAL_CODE, Vendor.VENDOR_FAX,
				Vendor.MAIL, Vendor.OFFICE_NO, Vendor.VENDOR_CELLPHONE_NO, Vendor.VENDOR_NSC, Vendor.VENDOR_WCB);
		softAssert.assertEquals(basepage.getTostMessage(), "Vendor added successfully", "Message do not match" );
		softAssert.assertAll();

	}

	@Test(priority = 15)
	public void DashboardVendorList() throws Exception {
		vendor.dashboardVendor();
	}

	@Test(priority = 16, enabled= false)
	public void VerifyUserIsAbleToUpdateVendor() throws Exception {
		vendor.updateVendor();

	}
}
