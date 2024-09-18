package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VendorPage extends BasePage {

	public VendorPage(WebDriver driver) {
		super(driver);
	}

	protected By vendor = By.xpath("//p[normalize-space()='Vendor(s)']");
	protected By addVendor = By.xpath("//button[normalize-space()='+ Add Vendor']");
	protected By vendorCompany = By.xpath("//input[@formcontrolname='company_name']");
	protected By contactPerson = By.xpath("//input[@formcontrolname='company_person_name']");
	protected By vendorGST = By.id("Vendor_GST");
	protected By vendorWebsite = By.id("Vendor_Website");
	protected By buildingNo = By.id("Vendor_Building_Number");
	protected By streetName = By.id("Vendor_Street");
	protected By vendorCity = By.id("Vendor_City");
	protected By province = By.xpath("//span[normalize-space()='Please Select Province...']");
	protected By vendorFAX = By.id("Vendor_Fax");
	protected By vendorPostal = By.id("Driver_Postal");
	protected By vendorEmail = By.id("Vendor_Email");
	protected By vendorCellphone = By.id("vendor_Cellphone");
	protected By vendorOfficeNo= By.xpath("Driver_Cellphone");
	protected By vendorNSC = By.id("Vendor_NSC");
	protected By vendorWCB = By.id("Vendor_WCB");
	protected By addVendorButton = By.xpath("//button[normalize-space()='Add Vendor']");

	// update
	protected By dropdownVendor = By.cssSelector("div[class='sub-menu d-flex flex-column'] span:nth-child(5)");
	protected By editButton = By.xpath("(//i[@class='fa-regular fa-pen-to-square ng-star-inserted'])[1]");
	protected By updateVendorButton = By.xpath("//button[normalize-space()='Update Vendor']");

	public void addVendor(String VendorCompany, String ContactPerson, String VendorGST, String VendorWebsite,
			String BuildingNo, String StreetName, String VendorCity, String VendorFAX, String VendorPostal,
			String VendorEmail, String Cellphone, String VendorOffice, String VendorNSC, String VendorWCB)
			throws InterruptedException {
		clickElement(vendor);
		clickElement(addVendor);
		enterData(vendorCompany, VendorCompany);
		enterData(contactPerson, ContactPerson);
		enterData(vendorGST, VendorGST);
		enterData(vendorWebsite, VendorWebsite);
		enterData(buildingNo, BuildingNo);
		enterData(streetName, StreetName);
		enterData(vendorCity, VendorCity);
		moveToElementClick(province);
		clickElement(stateFromDropdown);
		enterData(vendorPostal, VendorPostal);
	//	enterData(vendorFAX, VendorFAX);
		enterData(vendorEmail, VendorEmail);
		enterData(vendorCellphone, Cellphone);
	//	enterData(vendorOfficeNo, VendorOffice);
		enterData(vendorNSC, VendorNSC);
	//	enterData(vendorWCB, VendorWCB);
	//	clickElement(addFavourite);
		hardWait(3000);
		clickElement(addVendorButton);
		hardWait(1000);

	}


	public void dashboardVendor() {
		
		clickElement(home);
		clickElement(vendor);
		hardWait(2000);
	
	}
	
	public void updateVendor() {
		clickElement(master);
		hardWait(1000);
		clickElement(dropdownVendor);
		hardWait(2000);
		clickElement(editButton);
		hardWait(1000);
		clickElement(addFavourite);
		hardWait(2000);
		clickElement(updateVendorButton);

	}
}
