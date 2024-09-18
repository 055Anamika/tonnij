package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TruckPage extends BasePage {

	public TruckPage(WebDriver driver) {
		super(driver);
	}

	protected By truck = By.xpath("//p[normalize-space()='Truck(s)']");
	protected By addTruck = By.xpath("//button[normalize-space()='+ Add Truck']");
	protected By truckUnit = By.id("Truck_Unit");
	protected By truckMake = By.xpath("//input[@id='Truck_Make']");
	protected By model = By.xpath("//span[normalize-space()='Please Select Model...']");
	protected By licensePlate = By.id("Truck_License_Plate");
	protected By truckVIN = By.id("Truck_VIN");
	protected By addTruckButton = By.xpath("//button[normalize-space()='Add Truck']");
	protected By anextDriverButton = By.xpath("//button[@aria-label='Next month']//span[@class='mat-mdc-button-touch-target']");	

	
	//update 
	protected By dropdownTruck = By.cssSelector("div[class='sub-menu d-flex flex-column'] span:nth-child(2)");
	protected By editButton = By.xpath("(//i[@class='fa-regular fa-pen-to-square ng-star-inserted'])[1]");
    protected By updateTruckButton = By.xpath("//button[normalize-space()='Update Truck']");



	public void addTruck(String UnitNo, String LicensePlateNo, String VIN, String TruckMake) {
		clickElement(truck);
		clickElement(addTruck);
		enterData(truckUnit, UnitNo);
		hardWait(1000);
		enterData(truckMake, TruckMake);
		clickElement(model);
		clickElement(modelYear);
		enterData(licensePlate, LicensePlateNo);
		enterData(truckVIN, VIN);
		hardWait(1000);
		clickElement(lisenceExpiryDate);
		hardWait(1000);
		clickElement( anextDriverButton);
		hardWait(1000);
		clickElement(selectLisenceExpiryDate);
		clickElement(hiringDate);
		hardWait(1000);
		clickElement( anextDriverButton);
		hardWait(1000);
		clickElement(selectMVIExpDate);	
		hardWait(1000);
		moveToElementClick(addTruckButton);
		hardWait(3000);

	}

	public void dashboardTruck() {
		
		clickElement(home);
		clickElement(truck);
		hardWait(2000);
	
	}
	
	
	public void updateTruck() {
		clickElement(master);
		clickElement(dropdownTruck);
		hardWait(2000);
		clickElement(editButton);
		hardWait(1000);
		clickElement(lisenceExpiryDate);
		hardWait(1000);
		clickElement(selectLisenceExpiryDate);
		hardWait(2000);
		clickElement(updateTruckButton);
		hardWait(1000);
		moveToElementClick(home);
		hardWait(2000);
	}
}
