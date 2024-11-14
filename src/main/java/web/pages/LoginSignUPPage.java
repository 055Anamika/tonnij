package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSignUPPage extends BasePage {

	public LoginSignUPPage(WebDriver driver) {
		super(driver);

	}

	protected By continuee = By.xpath("//span[normalize-space()='Continue']");
	protected By register = By.xpath("//a[normalize-space()='Register']");
	protected By firstName = By.id("signUpFirstName");
	protected By lastName = By.id("signUpLastName");
	protected By email = By.xpath("//input[@formcontrolname='email']");
	protected By cellPhone = By.id("Driver_Cellphone");
	protected By password = By.xpath("//input[@formcontrolname='password']");
	protected By confirmPassword = By.id("signUpConfirmPassword");
	protected By checkBox = By.id("terms");
	protected By registerUser = By.xpath("//button[normalize-space()='Register']");
	protected By otp0 = By.xpath("(//input[@autocomplete='one-time-code'])[1]");
	protected By otp1 = By.xpath("(//input[@autocomplete='one-time-code'])[2]");
	protected By otp2 = By.xpath("(//input[@autocomplete='one-time-code'])[3]");
	protected By otp3 = By.xpath("(//input[@autocomplete='one-time-code'])[4]");
	protected By loginToDashboard = By.xpath("//button[normalize-space()='Login to Dashboard']");
	protected By signInHere = By.xpath("//a[normalize-space()='Sign in here']");

	protected By signIn = By.xpath("//button[normalize-space()='Sign In']");
	protected By profile = By.cssSelector(".header-right--user.w-100.d-flex.align-items-center.justify-content-between.gap-2");
	protected By logoutButton = By.xpath("//li[normalize-space()='Logout']");

	public void signUP(String currentURL, String expectedURL) throws Exception {
		clickElement(continuee);
		hardWait(2000);
		clickElement(register);
		hardWait(2000);
		currentURL();
		expectedURL(expectedURL);
		hardWait(2000);


		
	}

	
	public void registerTab(String FirstName, String LastName, String mail, String CellPhone, String Password,
			String ConfirmPassword, String one, String two, String three, String four) {
	//	clickElement(continuee);
		hardWait(2000);
		clickElement(register);
		hardWait(4000);
		enterData(firstName, FirstName);
		hardWait(1000);
		enterData(lastName, LastName);
		hardWait(1000);
		enterData(email, mail);
		hardWait(1000);
		enterData(cellPhone, CellPhone);
		hardWait(1000);
		enterData(password, Password);
		hardWait(1000);
		enterData(confirmPassword, ConfirmPassword);
		hardWait(1000);
		clickElement(checkBox);
		clickElement(registerUser);
		hardWait(2000);
		enterData(otp0, one);
		enterData(otp1, two);
		enterData(otp2, three);
		enterData(otp3, four);
		hardWait(2000);
		clickElement(loginToDashboard);
		hardWait(3000);
//		enterData(email, mail);
//		enterData(password, Password);
		clickElement(signIn);
	}

	public void userLoginn(String mail, String Password) {
		clickElement(continuee);
		hardWait(6000);
		enterData(email, mail);
		enterData(password, Password);
		clickElement(signIn);
	}
	
	
	public void userLoginnn(String mail, String Password) {
	//	clickElement(continuee);
		hardWait(2000);
		enterData(email, mail);
		enterData(password, Password);
		clickElement(signIn);
	}

	public void Admin_Login(String mail, String userPass) {
		clickElement(continuee);
		enterData(email, mail);
		enterData(password, userPass);
		clickElement(signIn);
	}

	public void After_Logout_Admin_Login(String mail, String userPass) {
		hardWait(2000);
		moveToElementClick(profile);
		hardWait(2000);
		clickElement(logoutButton);
		hardWait(2000);
		navigateToURL("https://web.tonnij.com/auth/admin-login");
		hardWait(3000);
		enterData(email, mail);
		enterData(password, userPass);
		clickElement(signIn);
		hardWait(2000);

	}

}
