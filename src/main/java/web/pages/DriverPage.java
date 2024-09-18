package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverPage extends BasePage {

	public DriverPage(WebDriver driver) {
		super(driver);
	}

	protected By driver = By.xpath("//p[normalize-space()='Driver(s)']");
	protected By addDriver = By.xpath("//button[normalize-space()='+ Add Driver']");
	protected By driverName = By.xpath("//input[@id='signUpLastName']");
	protected By phNumber = By.id("Driver_Cellphone");
	protected By driverMail = By.id("Driver_Email");
	protected By houseNo = By.id("Driver_Building");
	protected By street = By.id("Driver_Street");
	protected By driverCity = By.id("Driver_City");
	protected By province = By.xpath("//span[normalize-space()='Please Select Province...']");
	protected By selectState = By.xpath("//span[normalize-space()='Alberta']");
	protected By selectState2 = By.xpath("//span[normalize-space()='New Brunswick']");

	protected By postalCode = By.id("Driver_Postal");
	protected By SIN_No = By.id("Driver_SIN");
	protected By licenseNo = By.id("Driver_License");
	protected By uploadLicense = By.xpath("//input[@type='file']");
	protected By addDriverButton = By.cssSelector(".btn.btn-primary");
	protected By anextDriverButton = By.xpath("//button[@aria-label='Next month']//span[@class='mat-mdc-button-touch-target']");
	protected By previosDriverButton = By.xpath("//button[@aria-label='Previous month']//span[@class='mat-mdc-button-touch-target']");
	
	//import driver	
	protected By importDriver = By.xpath("//button[normalize-space()='Import Driver(s)']");
	protected By uploadFile = By.xpath("//input[@type='file']");
	protected By uploadFileButton = By.xpath("//button[normalize-space()='Upload File']");
	

	// Update
	protected By driverdropdown = By.cssSelector("div[class='sub-menu d-flex flex-column'] span:nth-child(1)");
	protected By editOption = By.xpath("(//button[@class='mat-mdc-menu-trigger btn'])[1]");
	protected By editButton = By.xpath("//span[normalize-space()='Edit']");
	protected By updateDriver = By.xpath("//button[normalize-space()='Update Driver']");

	public void AddDriver(String Name, String DriverNo, String Mail, String BuildingNo, String Street, String City,
			String PostalCode, String SIN, String LicenseNo, String UploadLicense) throws Exception {
		// clickElement(driver);
		hardWait(4000);
		clickElement(addDriver);
		enterData(driverName, Name);
		enterData(phNumber, DriverNo);
		enterData(driverMail, Mail);
		enterData(houseNo, BuildingNo);
		enterData(street, Street);
		enterData(driverCity, City);
		hardWait(2000);
		clickElement(province);
		clickElement(selectState);
		enterData(postalCode, PostalCode);
		enterData(SIN_No, SIN);
		enterData(licenseNo, LicenseNo);
		clickElement(lisenceExpiryDate);
		hardWait(1000);
		clickElement(anextDriverButton);
		hardWait(1000);
		clickElement(selectLisenceExpiryDate);
		hardWait(1000);
		clickElement(hiringDate);
		hardWait(1000);
		clickElement(previosDriverButton);
		hardWait(1000);
		clickElement(selectHiringDate);
		// clickElement(leavingDate);
		// hardWait(1000);
		// clickElement( anextDriverButton);
		// hardWait(1000);
		// clickElement(selectLeavingDate);
		clickElement(dateOfBirth);
		hardWait(1000);
		clickElement(previosDriverButton);
		hardWait(1000);
		clickElement(selectDateOfBirth);
		uploadFile(uploadLicense, UploadLicense);
		hardWait(1000);
		clickElement(addDriverButton);
		getTostMessage();
		hardWait(5000);

	}

	public void dashboardList() {
		clickElement(home);
		hardWait(2000);
	
	}
	
	public void importdriver(String importDriverFile) {
		moveToElementClick(master);
		hardWait(1000);
		moveToElementClick(driverdropdown);
		hardWait(2000);
		clickElement(importDriver);
		enterData(uploadFile,importDriverFile );
		clickElement(uploadFileButton);
	
	}

	public void updateDriver() {
		hardWait(2000);
		moveToElementClick(master);
		hardWait(1000);
		moveToElementClick(driverdropdown);
		hardWait(2000);

		clickElement(editOption);
		clickElement(editButton);
		clickElement(dateOfBirth);
		hardWait(1000);
		clickElement(selectDateOfBirth);
		clickElement(updateDriver);
		moveToElementClick(home);
		hardWait(2000);
	}
}
