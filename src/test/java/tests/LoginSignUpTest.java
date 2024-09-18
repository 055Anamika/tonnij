package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import web.pages.LoginSignUPPage;


public class LoginSignUpTest extends BaseTest {

	public LoginSignUPPage loginPage;
	public SoftAssert softAssert;

	@BeforeClass
	public void setup() {
		driver.set(driverFactory.initialize());
		loginPage = new LoginSignUPPage(driver.get());
		loginPage.navigateToURL(URL);
		softAssert = new SoftAssert();
	}

	@Test
	public void AVerifyUserIsAbleToLogin() throws Exception {
	    String currentURL = loginPage.currentURL();
        String expectedURL = loginPage.expectedURL("https://4tn5p340-4200.inc1.devtunnels.ms/auth/client-signup");
        
        loginPage.signUP(expectedURL, expectedURL);
        softAssert.assertEquals(currentURL, expectedURL, "url is Mis-Matched");
		
		softAssert.assertAll();
	}

}
