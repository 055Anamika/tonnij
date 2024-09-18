package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrailerPage extends BasePage {

	public TrailerPage(WebDriver driver) {
		super(driver);
	}

	protected By trailer = By.xpath("//p[normalize-space()='Trailer(s)']");
	protected By addTrailer = By.xpath("//button[normalize-space()='+ Add Trailer']");
	protected By unitNo = By.id("Unit_Number");
	protected By trailerMake = By.xpath("//input[@id='Trailer_Make']");
	protected By model = By.xpath("//span[normalize-space()='Please Select Model...']");
	protected By trailerLicensePlate = By.id("Trailer_License_Plate");
	protected By trailerVIN = By.xpath("//input[@id='Truck_VIN']");
	protected By addTrailerButton = By.xpath("//button[normalize-space()='Add Trailer']");
	protected By anextDriverButton = By.xpath("//button[@aria-label='Next month']//span[@class='mat-mdc-button-touch-target']");	


	// update
	protected By dropdownTrailer = By.cssSelector("div[class='sub-menu d-flex flex-column'] span:nth-child(3)");
	protected By editButton = By.xpath("(//i[@class='fa-regular fa-pen-to-square ng-star-inserted'])[1]");
	protected By updateTrailerButton = By.xpath("//button[normalize-space()='Update Trailer']");

	public void AddTrailer(String UnitNo, String LicensePlateNum, String TrailerVIN, String TrailerMake) throws Exception {
		clickElement(trailer);
		clickElement(addTrailer);
		enterData(unitNo, UnitNo);
		hardWait(1000);
		enterData(trailerMake, TrailerMake);
		 clickElement(model);
		 clickElement(modelYear);
		enterData(trailerLicensePlate, LicensePlateNum);
		enterData(trailerVIN, TrailerVIN);
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
		moveToElementClick(addTrailerButton);
		hardWait(3000);

}
	

	public void dashboardTrailer() {
		
		clickElement(home);
		clickElement(trailer);
		hardWait(2000);
	
	}
	

public void updateTrailer() {
	clickElement(master);
	clickElement(dropdownTrailer);
	hardWait(2000);
	clickElement(editButton);
	clickElement(lisenceExpiryDate);
	hardWait(1000);
	clickElement(lisenceExpiryDate);
	hardWait(2000);
	clickElement(selectLisenceExpiryDate);
	hardWait(2000);
	clickElement(updateTrailerButton);
	moveToElementClick(home);
	hardWait(2000);
}
	}
