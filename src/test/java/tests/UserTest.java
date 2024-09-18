package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web.testdata.User;
import web.pages.LoginSignUPPage;
import web.pages.UserPage;
import web.testdata.LoginSignUP;

public class UserTest extends BaseTest {

	public LoginSignUPPage loginSignUPPage;
	public UserPage userPage;

	@BeforeClass
	public void setup() throws Exception {
		driver.set(driverFactory.initialize());
		loginSignUPPage = new LoginSignUPPage(driver.get());
		loginSignUPPage.navigateToURL(URL);
//		loginSignUPPage.userLoginn(LoginSignUP.MAIL, LoginSignUP.PASSWORD);
		userPage = new UserPage(driver.get());
	}

	@Test(priority = 1)
	public void AVerifyUserIsAbleToLogin() throws Exception {
		loginSignUPPage.registerTab(LoginSignUP.FIRST_NAME, LoginSignUP.LAST_NAME, LoginSignUP.MAILPOST_FIX,
				LoginSignUP.CELLPHONE_NUMBER, LoginSignUP.PASSWORD, LoginSignUP.CONFIRM_PASSWORD, LoginSignUP.OTP_1,
				LoginSignUP.OTP_2, LoginSignUP.OTP_3, LoginSignUP.OTP_4);
	}

	 @Test(priority=2, enabled=false)
	
	  public void AVerifyUserIsAbleToLoginn() throws Exception {
	  loginSignUPPage.userLoginnn(LoginSignUP.MAILPOST_FIX, LoginSignUP.PASSWORD); }
	  
	 

	@Test(priority = 3)
	public void BVerifyUserIsAbleToAddManager() throws Exception {
		userPage.Company_Info(User.COMPANY_NAME, User.POSTAL_CODE, User.BUILDING_NO, User.STREET_NAME, User.CITY,
				User.COMPANYPH_NO, User.COMPANY_FAX, User.COMPANY_GST, User.COMPANY_WCB, User.COMPANY_NSC,
				User.UPLOAD_LOGO);

	}

	@Test(priority = 4, enabled = true)
	public void CVerifyUserIsAbleToUploadDocument() throws Exception {
		userPage.Upload_Document(User.UPLOAD_COI, User.UPLOAD_NSC, User.UPLOAD_WCB, User.UPLOAD_BUSINESS_CERFICATION);

	}

	@Test(priority = 5, enabled = true)
	public void DVerifyUserIsAbleToAddMasterSetting() throws Exception {
		userPage.Master_Settings( User.SERIAL_NUMBER);

	}

	@Test(priority = 6, enabled = true)
	public void EVerifyUserIsAbleToTaxClass() throws Exception {
		userPage.Tax_Class(User.TAX_RATE);

	}

	@Test(priority = 7, enabled = true)
	public void FVerifyAdminLogin() throws Exception {
		loginSignUPPage.After_Logout_Admin_Login(LoginSignUP.ADMIN_ID, LoginSignUP.ADMIN_PASS);

	}

	@Test(priority = 8, enabled = true)
	public void GVerifyIfAdminIsAbleToApproveClient() throws Exception {
		userPage.Approve_From_Admin();

	}

}
