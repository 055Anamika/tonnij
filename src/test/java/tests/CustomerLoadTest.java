package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web.pages.CreateLoadPage;
import web.pages.LoginSignUPPage;
import web.testdata.CreateLoad;
import web.testdata.LoginSignUP;

public class CustomerLoadTest extends BaseTest {

	public LoginSignUPPage login;
	public CreateLoadPage load;

	@BeforeClass
	public void setup() {
		driver.set(driverFactory.initialize());
		login = new LoginSignUPPage(driver.get());
		login.navigateToURL(URL);
		load = new CreateLoadPage(driver.get());

	}

	@Test(priority = 1)
	public void VerifyUserIsAbleToLogin() throws Exception {
		login.userLoginn(LoginSignUP.EMAIL, LoginSignUP.PASSWORD);

	}
	
	@Test(priority = 2, enabled=true)
	public void loadByDropdown() throws Exception {
		load.createLoadByDropdown(CreateLoad.PICKUP_BUILDING_NUMBER, CreateLoad.PICKUP_CITY,
				CreateLoad.PICKUP_POSTAL_CODE, CreateLoad.PICKUP_STREET_NAME, CreateLoad.DROP_NAME, CreateLoad.DUMP_POSTAL_CODE,
				CreateLoad.DUMP_STREET_NAME,  CreateLoad.DUMP_BUILDING_NUMBER, CreateLoad.DUMP_CITY, CreateLoad.TRUCK_QUANTITY);
		load.CustomerOrderInfo(CreateLoad.AGREED_RATE, CreateLoad.TRUCK_QUANTITY, CreateLoad.PO_NUMBER,
				CreateLoad.CUSTOMER_CELLPHONE_NO);
		
	}
	

	@Test(priority = 2, enabled=false)
	public void VerifyUserIsAbleToAddCustomerInfo() throws Exception {
		load.CustomerInfo(CreateLoad.COMPANY_NAME, CreateLoad.CONTACT_PERSON_NAME, CreateLoad.BUILDING_NUMBER,
				CreateLoad.STREET_NAME, CreateLoad.CITY, CreateLoad.POSTAL_CODE, CreateLoad.CUSTOMER_CELLPHONE_NO,
				CreateLoad.OFFICE_NO, CreateLoad.EMAIL);
	}
	
	
	@Test(priority = 3, enabled=false) //, dataProvider = "createLoadData", dataProviderClass = DataProvider_Load.class
	public void VerifyUserIsAbleToAddCustomerLoadInfo() throws Exception {
		load.CustomerLoadInfo(CreateLoad.PICKUP_BUILDING_NUMBER, CreateLoad.PICKUP_CITY,CreateLoad.PICKUP_POSTAL_CODE,
				 CreateLoad.PICKUP_STREET_NAME, CreateLoad.DROP_NAME, CreateLoad.DUMP_POSTAL_CODE,
				CreateLoad.DUMP_STREET_NAME,  CreateLoad.DUMP_BUILDING_NUMBER,  CreateLoad.DUMP_CITY);
	}
	
	@Test(priority = 4, enabled=false)
	public void VerifyUserIsAbleToAddCustomerOrderInfo() throws Exception {
		load.CustomerOrderInfo(CreateLoad.AGREED_RATE, CreateLoad.TRUCK_QUANTITY, CreateLoad.PO_NUMBER,
				CreateLoad.CUSTOMER_CELLPHONE_NO);
	}
	

	@Test(priority = 5, enabled=false)
	public void dispatchLoadToDriver() throws Exception {
		load.dispatchBoard(CreateLoad.REMARKS);
		
	}
	
	@Test(priority = 6, enabled=false)
	public void assignLoadToVendor() throws Exception {
		load.assignLoadToVendor(CreateLoad.PICKUP_STREET_NAME,CreateLoad.AGREED_RATE);
		
	}

	
}


