package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage extends BasePage {

	public CustomerPage(WebDriver driver) {
		super(driver);
	}

	protected By customer = By.xpath("//p[normalize-space()='Customer(s)']");
	protected By addCustomer = By.xpath("//button[normalize-space()='+ Add Customer']");
	protected By companyName = By.xpath("//input[@formcontrolname='company_name']");
	protected By contactPersonName = By.xpath("//input[@formcontrolname='company_person_name']");
	protected By buildingNo = By.id("Building_Number");
	protected By streetNo = By.id("Street_Number");
	protected By customerCity = By.id("Customer_City");
	protected By province = By.xpath("//span[normalize-space()='Please Select Province...']");
	protected By customerPostal = By.id("Customer_Postal");
	protected By customerCellphone = By.xpath("(//input[@id='Driver_Cellphone'])[1]");
	protected By customerOfficeNo= By.xpath("(//input[@id='Driver_Cellphone'])[2]");
	protected By customerEmail = By.id("Customer_Email");
	protected By customerWebsite = By.id("Customer_Website");
	protected By customerFAX = By.id("Customer_Fax");
	protected By customerGST = By.id("Customer_GST");
	protected By addCustomerButton = By.xpath("//button[normalize-space()='Add Customer']");

	//update
		protected By dropdownCustomer = By.cssSelector("div[class='sub-menu d-flex flex-column'] span:nth-child(4)");
		protected By editButton = By.xpath("(//i[@class='fa-regular fa-pen-to-square ng-star-inserted'])[1]");
	    protected By updateCustomerButton = By.xpath("//button[normalize-space()='Update Customer']");

		
	public void addCustomer(String CompanyName, String ContactPerson, String BuildingNo, String StreetName,
			String CustomerCity, String PostalCode, String CustomerCellphoneNo, String OfficeNumber, String Email,
			String CustomerWebsite, String CustomerFAX, String CustomerGST) throws Exception {
		
		hardWait(2000);
		clickElement(customer);
		clickElement(addCustomer);
		enterData(companyName, CompanyName);
		enterData(contactPersonName, ContactPerson);
		enterData(buildingNo, BuildingNo);
		enterData(streetNo, StreetName);
		enterData(customerCity, CustomerCity);
		clickElement(province);
		clickElement(stateFromDropdown);
		enterData(customerPostal, PostalCode);
		enterData(customerCellphone, CustomerCellphoneNo);
		enterData(customerOfficeNo, OfficeNumber);
		enterData(customerEmail, Email);
		enterData(customerWebsite, CustomerWebsite);
		enterData(customerFAX, CustomerFAX);
		enterData(customerGST, CustomerGST);
	//	clickElement(addFavourite);
		hardWait(3000);
		clickElement(addCustomerButton);
		hardWait(1000);

	}
	
	public void dashboardCustomer() {
		clickElement(home);
		clickElement(customer);
		hardWait(2000);
	
	}
	
	
	
	public void updateCustomer() {
		clickElement(master);
		clickElement(dropdownCustomer);
		hardWait(2000);
		clickElement(editButton);
		hardWait(1000);
		clickElement(addFavourite);
		hardWait(2000);
		clickElement(updateCustomerButton);
		moveToElementClick(home);
		hardWait(2000);
	}

}
