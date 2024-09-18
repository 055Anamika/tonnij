package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web.pages.BaseMethods;
import web.pages.CloseLoad;
import web.pages.CreateLoadPage;
import web.pages.LoginSignUPPage;
import web.testdata.CreateLoad;
import web.testdata.LoginSignUP;

public class CloseLoadScenariosTest extends BaseTest {

	public LoginSignUPPage login;
	public CreateLoadPage load;
	public CloseLoad closeLoad;
	public BaseMethods baseMethod;


	@BeforeClass
	public void setup() {
		driver.set(driverFactory.initialize());
		login = new LoginSignUPPage(driver.get());
		login.navigateToURL(URL);
		login.userLoginn(LoginSignUP.EMAIL, LoginSignUP.PASSWORD);
		load = new CreateLoadPage(driver.get());
		closeLoad = new CloseLoad(driver.get());
		baseMethod = new BaseMethods(driver.get());

	}

	@Test(invocationCount = 1, priority = 9, enabled=false)
	public void VerifyiClientIsAbleToCloseMyLoadOfVendor() throws Exception {
		
        
		load.MyLoad( CreateLoad.PICKUP_BUILDING_NUMBER, CreateLoad.PICKUP_CITY,
				CreateLoad.PICKUP_POSTAL_CODE, CreateLoad.PICKUP_STREET_NAME, CreateLoad.DROP_NAME, CreateLoad.DUMP_POSTAL_CODE,
				CreateLoad.DUMP_STREET_NAME,  CreateLoad.DUMP_BUILDING_NUMBER, CreateLoad.DUMP_CITY, CreateLoad.TRUCK_QUANTITY);
			
		load.assignLoadToVendor(CreateLoad.PICKUP_STREET_NAME,CreateLoad.AGREED_RATE);		
		
		closeLoad.closeVendorLoad(CreateLoad.UPLOAD_PDF,CreateLoad.UNIT_1, CreateLoad.UNIT_2, CreateLoad.TKT_1, CreateLoad.TKT_2); 

	}




	@Test(priority = 4, enabled = false)
	public void VerifyiClientIsAbleToCloseCustomerLoadToDriver() throws Exception {
		load.createLoadByDropdown(CreateLoad.PICKUP_BUILDING_NUMBER, CreateLoad.PICKUP_CITY,
				CreateLoad.PICKUP_POSTAL_CODE, CreateLoad.PICKUP_STREET_NAME, CreateLoad.DROP_NAME,
				CreateLoad.DUMP_POSTAL_CODE, CreateLoad.DUMP_STREET_NAME, CreateLoad.DUMP_BUILDING_NUMBER,
				CreateLoad.DUMP_CITY, CreateLoad.TRUCK_QUANTITY);

		load.CustomerOrderInfo(CreateLoad.AGREED_RATE, CreateLoad.TRUCK_QUANTITY, CreateLoad.PO_NUMBER,
				CreateLoad.CUSTOMER_CELLPHONE_NO);

		load.dispatchBoard(CreateLoad.REMARKS);
		
		closeLoad.closeCustomerLoadtoDriver(CreateLoad.UPLOAD_PDF, CreateLoad.TKT_1, CreateLoad.TKT_2); 

	}

	@Test(invocationCount = 1, priority = 5, enabled = false)
	public void VerifyiClientIsAbleToCloseCustomerLoadToVendor() throws Exception {
		load.createLoadByDropdown(CreateLoad.PICKUP_BUILDING_NUMBER, CreateLoad.PICKUP_CITY,
				CreateLoad.PICKUP_POSTAL_CODE, CreateLoad.PICKUP_STREET_NAME, CreateLoad.DROP_NAME,
				CreateLoad.DUMP_POSTAL_CODE, CreateLoad.DUMP_STREET_NAME, CreateLoad.DUMP_BUILDING_NUMBER,
				CreateLoad.DUMP_CITY, CreateLoad.TRUCK_QUANTITY);

		load.CustomerOrderInfo(CreateLoad.AGREED_RATE, CreateLoad.TRUCK_QUANTITY, CreateLoad.PO_NUMBER,
				CreateLoad.CUSTOMER_CELLPHONE_NO);

		// load.dispatchBoard(CreateLoad.REMARKS);

		load.assignLoadToVendor(CreateLoad.PICKUP_STREET_NAME, CreateLoad.AGREED_RATE);
		
		closeLoad.closeVendorLoad(CreateLoad.UPLOAD_PDF,CreateLoad.UNIT_1, CreateLoad.UNIT_2, CreateLoad.TKT_1, CreateLoad.TKT_2); 


	}

	@Test(invocationCount = 2, priority = 6, enabled = false)
	public void VerifyiClientIsAbleToCloseCustomerLoadToBoth() throws Exception {
		load.createLoadByDropdown(CreateLoad.PICKUP_BUILDING_NUMBER, CreateLoad.PICKUP_CITY,
				CreateLoad.PICKUP_POSTAL_CODE, CreateLoad.PICKUP_STREET_NAME, CreateLoad.DROP_NAME,
				CreateLoad.DUMP_POSTAL_CODE, CreateLoad.DUMP_STREET_NAME, CreateLoad.DUMP_BUILDING_NUMBER,
				CreateLoad.DUMP_CITY, CreateLoad.TRUCK_QUANTITY);

		load.CustomerOrderInfo(CreateLoad.AGREED_RATE, CreateLoad.TRUCK_QUANTITY, CreateLoad.PO_NUMBER,
				CreateLoad.CUSTOMER_CELLPHONE_NO);

		load.assignLoadToBoth(CreateLoad.PICKUP_STREET_NAME,CreateLoad.AGREED_RATE);
		
		closeLoad.closeCustomerLoadBothCases(CreateLoad.UPLOAD_PDF,CreateLoad.UNIT_1,  CreateLoad.TKT_1, CreateLoad.TKT_2); 
		


	}

	@Test(invocationCount = 1, priority = 7, enabled = false)
	public void VerifyiClientIsAbleToCloseMyLoadToDriver() throws Exception {
		load.MyLoad(CreateLoad.PICKUP_BUILDING_NUMBER, CreateLoad.PICKUP_CITY, CreateLoad.PICKUP_POSTAL_CODE,
				CreateLoad.PICKUP_STREET_NAME, CreateLoad.DROP_NAME, CreateLoad.DUMP_POSTAL_CODE,
				CreateLoad.DUMP_STREET_NAME, CreateLoad.DUMP_BUILDING_NUMBER, CreateLoad.DUMP_CITY,
				CreateLoad.TRUCK_QUANTITY);

		load.dispatchBoard(CreateLoad.REMARKS);
		
		closeLoad.closeMyLoadDriver();

	}

	@Test(invocationCount = 1, priority = 8, enabled = true)
	public void VerifyiClientIsAbleToCloseMyLoadToBoth() throws Exception {
		load.MyLoad(CreateLoad.PICKUP_BUILDING_NUMBER, CreateLoad.PICKUP_CITY, CreateLoad.PICKUP_POSTAL_CODE,
				CreateLoad.PICKUP_STREET_NAME, CreateLoad.DROP_NAME, CreateLoad.DUMP_POSTAL_CODE,
				CreateLoad.DUMP_STREET_NAME, CreateLoad.DUMP_BUILDING_NUMBER, CreateLoad.DUMP_CITY,
				CreateLoad.TRUCK_QUANTITY);

		load.assignLoadToBoth(CreateLoad.PICKUP_STREET_NAME,CreateLoad.AGREED_RATE);
		
		closeLoad.closeMyLoadBothCases(CreateLoad.UPLOAD_PDF,CreateLoad.UNIT_1, CreateLoad.TKT_1); 


	}

}
