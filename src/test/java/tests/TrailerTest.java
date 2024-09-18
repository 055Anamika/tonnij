
package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import web.pages.BaseMethods;
import web.pages.BasePage;
import web.pages.LoginSignUPPage;
import web.pages.TrailerPage;
import web.testdata.LoginSignUP;
import web.testdata.Trailer;
	
public class TrailerTest extends BaseTest {

	public LoginSignUPPage login;
	public TrailerPage trailer;
	public BaseMethods basemethod;
	public SoftAssert softAssert;
	public BasePage basepage;
	
	@BeforeClass
	public void setup() throws Exception {
		driver.set(driverFactory.initialize());
		login =new LoginSignUPPage(driver.get());
		login.navigateToURL(URL);
	//	login.Login(Customer.userID,Customer.PASS);
		trailer = new TrailerPage(driver.get());
		softAssert = new SoftAssert();
		basemethod= new BaseMethods(driver.get());
		basepage= new BasePage(driver.get());
	}
	

	@Test(priority=1)
	public void VerifyUserIsAbleToLogin() throws Exception {
		login.userLoginn(LoginSignUP.EMAIL, LoginSignUP.PASSWORD);		
	}

	@Test(priority=2)
	public void VerifyUserIsAbleToAddTrailer() throws Exception {
		trailer.AddTrailer( Trailer.TRAILER_UNITNO, Trailer.LICENSE_PLATENO,  Trailer.VIN_NO,Trailer.TRAILER_MAKE );	
		
		softAssert.assertEquals(basepage.getTostMessage(), "Trailer added successfully", "Message do not match" );
		softAssert.assertAll();
		
	}
	

	@Test(priority=3)
	public void AVerifyUserIsAbleToGoDasboard() throws Exception {
		trailer.dashboardTrailer();		
	}
	
	@Test(priority=3, enabled=false)
	public void AVerifyUserIsAbleTUpdatedTrailer() throws Exception {
		trailer.updateTrailer();		
	}
		
}