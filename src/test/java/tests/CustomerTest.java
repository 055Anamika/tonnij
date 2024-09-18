package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import web.pages.BaseMethods;
import web.pages.BasePage;
import web.pages.CustomerPage;
import web.pages.LoginSignUPPage;
import web.testdata.Customer;
import web.testdata.LoginSignUP;

public class CustomerTest extends BaseTest {

	public LoginSignUPPage login;
	public CustomerPage customer;
	public BaseMethods basemethod;
	public SoftAssert softAssert;
	public BasePage basepage;

	@BeforeClass
	public void setup() {
		driver.set(driverFactory.initialize());
		login = new LoginSignUPPage(driver.get());
		login.navigateToURL(URL);
		customer = new CustomerPage(driver.get());
		softAssert = new SoftAssert();
		basemethod= new BaseMethods(driver.get());
		basepage= new BasePage(driver.get());

	}

	@Test(priority = 1)
	public void VerifyUserIsAbleToLogin() throws Exception {
		login.userLoginn(LoginSignUP.EMAIL, LoginSignUP.PASSWORD);

	}

	@Test(priority = 2, enabled=true)
	public void VerifyUserIsAbleToAddCustomer() throws Exception {
		customer.addCustomer(Customer.COMPANY_NAME, Customer.CONTACT_PERSON_NAME, Customer.BUILDING_NUMBER,
				Customer.STREET_NAME, Customer.CUSTOMER_CITY, Customer.POSTAL_CODE, Customer.CUSTOMER_CELLPHONE_NO,
				Customer.OFFICE_NO, Customer.MAIL, Customer.CUSTOMER_WEBSITE, Customer.CUSTOMER_FAX,
				Customer.CUSTOMER_GST);
		
		softAssert.assertEquals(basepage.getTostMessage(), "Customer added successfully", "Message do not match" );
		softAssert.assertAll();
	}
	
	@Test(priority = 3, enabled=true)
	public void Dashboard() throws Exception {
		customer.dashboardCustomer();
	}
	
	@Test(priority = 4, enabled=true)
	public void VerifyUserIsAbleToUpdateCustomer() throws Exception {
		customer.updateCustomer();
	}
}
