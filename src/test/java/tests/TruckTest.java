
package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import web.pages.BaseMethods;
import web.pages.BasePage;
import web.pages.LoginSignUPPage;
import web.pages.TruckPage;
import web.testdata.LoginSignUP;
import web.testdata.Truck;
	
public class TruckTest extends BaseTest {
	
	public LoginSignUPPage login;
	public TruckPage truck;
	public BaseMethods basemethod;
	public SoftAssert softAssert;
	public BasePage basepage;
	
	@BeforeClass
	public void setup() throws Exception {
		driver.set(driverFactory.initialize());
		login =new LoginSignUPPage(driver.get());
		login.navigateToURL(URL);
	//	login.Login(Customer.userID,Customer.PASS);
		truck = new TruckPage(driver.get());
		softAssert = new SoftAssert();
		basemethod= new BaseMethods(driver.get());
		basepage= new BasePage(driver.get());
	}
	

	@Test(priority=1)
	public void VerifyUserIsAbleToLogin() throws Exception {
		login.userLoginn(LoginSignUP.EMAIL, LoginSignUP.PASSWORD);		
	}
	
	@Test(priority=2)
	public void VerifyUserIsAbleToAddTruck() throws Exception {
		truck.addTruck(Truck.TRUCK_UNITNO,  Truck.TRUCK_VIN_NO, Truck.Truck_LICENSE_PLATENO, Truck.TRUCK_MAKE);	
		softAssert.assertEquals(basepage.getTostMessage(), "Truck added successfully", "Message do not match" );
		softAssert.assertAll();
	}
	
	

	@Test(priority=3)
	public void AVerifyUserIsAbleToGoDasboard() throws Exception {
		truck.dashboardTruck();		
	}
	
	@Test(priority=3, enabled=false)
	public void AVerifyUserIsAbleToUpdateTruck() throws Exception {
		truck.updateTruck();		
	}
		
}