package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateLoadPage extends BasePage {

	public CreateLoadPage(WebDriver driver) {
		super(driver);
	}

	// customer info
	protected By isMyLoad = By.xpath("//label[@for='favourite']");
	protected By createLoad = By.xpath("//span[normalize-space()='Create Load']");
	protected By company = By.xpath("//input[@formcontrolname='company_name']");
	protected By contactPersonName = By.xpath("//input[@formcontrolname='company_person_name']");
	protected By buildingNo = By.xpath("//input[@id='buildingName']");
	protected By streetNo = By.id("Street_Number");
	protected By loadCity = By.id("Load_City");
	protected By province = By.xpath("//span[normalize-space()='Please Select Province']");
	protected By selectState = By.xpath("//span[normalize-space()='Alberta']");
	protected By postalCode = By.id("Postal_Code");
	protected By cellphoneNo = By.id("Driver_Cellphone");
	protected By officeNo = By.id("Office_Number");
	protected By loadEmail = By.id("Load_Email");
	protected By nextButton = By.xpath("//button[normalize-space()='Next']");
	protected By customerFromDropdown = By.xpath("(//span[@class='mdc-list-item__primary-text'])[1]");


//	protected By jobSiteName = By.id("Jobsite_Name");
	protected By pickupBuilding = By.xpath("(//input[@id='buildingName'])[1]");
	protected By pickupStreet = By.xpath("//input[@id='Pickup_Street']");
	protected By pickupCity = By.xpath("//input[@id='Pickup_City']");
	protected By pickupPostal = By.xpath("//input[@id='Pickup_Postal']");
	protected By pickupPrivince = By.xpath("(//span[normalize-space()='Please Select Province...'])[1]");
	protected By Alberta = By.xpath("//span[normalize-space()='Alberta']");
	protected By dumpName = By.xpath("//input[@id='dumpname']");  
	protected By dropBuilding = By.xpath("(//input[@id='buildingName'])[2]");
	protected By dropCity = By.xpath("//input[@id='Drop_City']");
	protected By dropPostal = By.xpath("//input[@id='Drop_Postal']");
	protected By dropProvince = By.xpath("(//span[normalize-space()='Please Select Province...'])[2]");
	protected By customerInfo = By.xpath("//span[contains(text(),'Customer Info')]");
//	protected By dropProvince = By.cssSelector(".ng-tns-c1154042729-35[viewBox='0 0 24 24']");

	protected By britishColombia = By.xpath("//span[normalize-space()='British Columbia']");
	protected By dropStreet = By.xpath("//input[@id='Drop_Street']");

	// order info
	protected By selectEquipment = By.xpath("//span[normalize-space()='Please Select Equipment...']");
	protected By equipmentType = By.xpath("//span[normalize-space()='Truck and Transfer']");
	protected By agreedRate = By.xpath("//input[@id='Agreed_Date']");
	protected By TurckQuantity = By.xpath("//input[@id='Truck_Quantity']");
	protected By loadType = By.xpath("//span[normalize-space()='Please Select Rate Type...']");
	protected By selectLoadType = By.xpath("//span[normalize-space()='Rate By Hour']");
	protected By addLoad = By.xpath("//button[normalize-space()='+ Add']");
	protected By customerOrderNumber = By.xpath("//input[@id='Order_Number']");
	protected By customerconfirmationNo = By.xpath("//input[@id='Confirmation_Number']");
	protected By saveLoad = By.xpath("//button[normalize-space()='Save']");

	// Dispatch board 1
	protected By dispatchBoard = By.xpath("//span[normalize-space()='Dispatch Board']");
	protected By actionButton = By.xpath("(//button[@class='mat-mdc-menu-trigger btn'])[1]");
	protected By dispatchLoad = By.xpath("//span[normalize-space()='Dispatch Load']");
	protected By selectDriver = By.xpath("(//span[normalize-space()='Please Select Driver...'])[1]");
	protected By selectTruck = By.xpath("(//span[normalize-space()='Please Select Truck...'])[1]");
	protected By selectfromList = By.xpath("(//mat-option[@role='option'])[2]");
	protected By selectTrailer = By.xpath("(//span[normalize-space()='Please Select Trailer...'])[1]");
	protected By sendDispatch = By.xpath("//button[normalize-space()='Send Dispatch']");
	protected By confirmDuplicate =By.xpath("//button[normalize-space()='Confirm']");
	
	// Dispatch board 2
	
	protected By selectDriver1 = By.xpath("(//span[normalize-space()='Please Select Driver...'])[2]");
	protected By selectTruck1 = By.xpath("(//mat-option[@role='option'])[2]");
	protected By selectfromList1 = By.xpath("(//mat-option[@role='option'])[3]"); 
	protected By selectTrailer1 = By.xpath("(//span[@class='mdc-list-item__primary-text'])[2]");

		
		protected By selectDriver2 = By.xpath("(//span[normalize-space()='Please Select Driver...'])[2]");
		protected By selectTruck2 = By.xpath("(//span[normalize-space()='7881330693 [8099]'])[1]");
		protected By selectfromList2 = By.xpath("(//mat-option[@role='option'])[3]");
		protected By selectTrailer2 = By.xpath("(//span[normalize-space()='4259187965 [6714]'])[1]");
	
	// assign to vendor
		protected By assignVendor = By.xpath("//span[normalize-space()='Assign Vendor']");
		protected By selectVendor = By.xpath("(//span[normalize-space()='Please Select Vendor...'])[1]");
		protected By vendorRate =By.xpath("(//input[@id='vendorRate'])[1]");
		protected By remarks = By.xpath("//textarea[@id='remarks']");
		protected By assignloadToVendor = By.xpath("//button[normalize-space()='Assign']");

	public void CustomerInfo(String CompanyName, String ContactPersonName, String BuildingNo, String Street,
			String City, String PostalCode, String CellphoneNo, String OfficeNo, String LoadEmail) throws Exception {

		hardWait(2000);
		clickElement(createLoad);
		enterData(company, CompanyName);
		enterData(contactPersonName, ContactPersonName);
		enterData(buildingNo, BuildingNo);
		enterData(streetNo, Street);
		enterData(loadCity, City);
		hardWait(1000);
		clickElement(province);
		clickElement(selectState);
		hardWait(1000);
		enterData(postalCode, PostalCode);
		enterData(cellphoneNo, CellphoneNo);
		enterData(officeNo, OfficeNo);
		enterData(loadEmail, LoadEmail);
		hardWait(3000);
		clickElement(nextButton);

	}

	public void CustomerLoadInfo( String PickupBuilding, String PickupStreet,
			String PickupPostalCode, String PickupCity, String DropStreet, String DropPostalCode, String DropDumpName,
			String DropBuildingNo, String DropCity) throws Exception {

		hardWait(2000);
	//	enterData(jobSiteName, JobsiteName);
		hardWait(1000);
		enterData(pickupBuilding, PickupBuilding);
		clickElement(dropProvince);
		hardWait(1000);
		clickElement(Alberta);
		hardWait(1000);
		enterData(pickupStreet, PickupStreet);
		enterData(pickupCity, PickupCity);
		hardWait(1000);
		enterData(pickupPostal, PickupPostalCode);
		clickElement(pickupPrivince);
		hardWait(1000);
		clickElement(britishColombia);
		enterData(dumpName, DropDumpName);
		enterData(dropBuilding, DropBuildingNo);
		enterData(dropStreet, DropStreet);
		enterData(dropCity, DropCity);
		enterData(dropPostal, DropPostalCode);
		hardWait(3000);
		clickElement(nextButton);

	}

	public void CustomerOrderInfo(String AgreedRate, String TruckQuantity, String PONumber,
			String CustomerOrderConfirmationNo) throws Exception {

		hardWait(2000);
		clickElement(selectEquipment);
		clickElement(equipmentType);
		enterData(agreedRate, AgreedRate);
		enterData(TurckQuantity, TruckQuantity);
		clickElement(loadType);
		clickElement(selectLoadType);
		clickElement(addLoad);
		hardWait(1000);
		enterData(customerOrderNumber, PONumber);
		enterData(customerconfirmationNo, CustomerOrderConfirmationNo);
		hardWait(2000);
		clickElement(saveLoad);
		hardWait(4000);

	}
	
	
	public void createLoadByDropdown(String PickupBuilding, String PickupStreet, String PickupPostalCode, String PickupCity,
			String DropStreet, String DropPostalCode, String DropDumpName, String DropBuildingNo, String DropCity,
			String TruckQuantity) throws Exception {

		hardWait(2000);
		clickElement(createLoad);
		enterData(company, "byte");
		hardWait(2000);
		clickElement(customerFromDropdown);
		hardWait(2000);
		clickElement(nextButton);
		hardWait(2000);
		enterData(pickupBuilding, PickupBuilding);
		clickElement(dropProvince);
		hardWait(1000);
		clickElement(Alberta);
		hardWait(1000);
		enterData(pickupStreet, PickupStreet);
		enterData(pickupCity, PickupCity);
		hardWait(1000);
		enterData(pickupPostal, PickupPostalCode);
		enterData(dumpName, DropDumpName);
		enterData(dropBuilding, DropBuildingNo);
		enterData(dropStreet, DropStreet);
		enterData(dropCity, DropCity);
		clickElement(pickupPrivince);
		hardWait(1000);
		clickElement(britishColombia);
		enterData(dropPostal, DropPostalCode);
		hardWait(3000);
		clickElement(nextButton);
		hardWait(1000);
	}

	public void MyLoad(String PickupBuilding, String PickupStreet, String PickupPostalCode, String PickupCity,
			String DropStreet, String DropPostalCode, String DropDumpName, String DropBuildingNo, String DropCity,
			String TruckQuantity) throws Exception {

		hardWait(2000);
		clickElement(createLoad);
		clickElement(isMyLoad);
		hardWait(2000);
		clickElement(nextButton);
		hardWait(2000);
		enterData(pickupBuilding, PickupBuilding);
		clickElement(dropProvince);
		hardWait(1000);
		clickElement(Alberta);
		hardWait(1000);
		enterData(pickupStreet, PickupStreet);
		enterData(pickupCity, PickupCity);
		hardWait(1000);
		enterData(pickupPostal, PickupPostalCode);
		enterData(dumpName, DropDumpName);
		enterData(dropBuilding, DropBuildingNo);
		enterData(dropStreet, DropStreet);
		enterData(dropCity, DropCity);
		clickElement(pickupPrivince);
		hardWait(1000);
		clickElement(britishColombia);
		enterData(dropPostal, DropPostalCode);
		hardWait(3000);
		clickElement(nextButton);
		hardWait(2000);
		clickElement(selectEquipment);
		clickElement(equipmentType);
		enterData(TurckQuantity, TruckQuantity);
		clickElement(loadType);
		clickElement(selectLoadType);
		clickElement(addLoad);
		hardWait(1000);
		clickElement(saveLoad);
		hardWait(3000);
	}

	public void dispatchBoard(String Remarks) {
		
		clickElement(dispatchBoard);
		hardWait(2000);
		clickElement(actionButton);
		clickElement(dispatchLoad);
		clickElement(selectDriver);
		clickElement(selectfromList);
		clickElement(selectTruck);
		clickElement(selectTruck1);
		clickElement(selectTrailer);
		clickElement(selectTrailer1);
		enterData(remarks,Remarks);
		hardWait(3000);
		clickElement(sendDispatch);
		hardWait(4000);
		clickElement(actionButton);
		clickElement(dispatchLoad);
		clickElement(selectDriver);
		clickElement(selectfromList2);
		clickElement(selectTruck);
		clickElement(selectTruck1);
		clickElement(selectTrailer);
		clickElement(selectTrailer1);
		enterData(remarks,Remarks);
		hardWait(3000);
		clickElement(sendDispatch);
		hardWait(4000);
	}
	
	public void assignLoadToVendor(String Remarks, String rate) {
		clickElement(dispatchBoard);
		hardWait(2000);
		clickElement(actionButton);
		clickElement(assignVendor);
		clickElement(selectVendor);
		enterData(vendorRate, rate);
		enterData(remarks,Remarks);
		clickElement(selectfromList);
		hardWait(2000);
		clickElement(assignloadToVendor);
		hardWait(4000);

	}
	
	public void assignLoadToBoth(String Remarks, String rate) {
		
		clickElement(dispatchBoard);
		hardWait(2000);
		clickElement(actionButton);
		clickElement(dispatchLoad);
		clickElement(selectDriver);
		clickElement(selectfromList);
		clickElement(selectTruck);
		clickElement(selectTruck1);
		clickElement(selectTrailer);
		clickElement(selectTrailer1);
		enterData(remarks,Remarks);
		hardWait(3000);
		clickElement(sendDispatch);
		clickElement(dispatchBoard);
		hardWait(2000);
		clickElement(actionButton);
		clickElement(assignVendor);
		clickElement(selectVendor);
		enterData(vendorRate, rate);

		enterData(remarks,Remarks);
		clickElement(selectfromList);
		hardWait(2000);
		clickElement(assignloadToVendor);
		hardWait(2000);
	}
}
