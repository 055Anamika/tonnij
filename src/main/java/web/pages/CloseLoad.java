package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloseLoad extends BasePage {

	public CloseLoad(WebDriver driver) {
		super(driver);
	}

	// mark as deliver dispatch load
	protected By markDeliverd = By.xpath("//span[normalize-space()='Mark Delivered']");
	protected By confirmDeliver = By.xpath("//button[normalize-space()='Confirm']");
	protected By completedOrder = By.xpath("//span[normalize-space()='Completed Orders']");

	// close load
	protected By closeLoad = By.xpath("//span[normalize-space()='Close Load']");
	protected By unit1 = By.xpath("(//input[@id='unit_number'])[1]");
	protected By unit2 = By.xpath("(//input[@id='unit_number'])[2]");
	protected By ticket1 = By.xpath("(//input[@id='ticket'])[1]");
	protected By ticket2 = By.xpath("(//input[@id='ticket'])[4]");
	protected By uploadTicket = By.xpath("//input[@type='file']");
	protected By closeOrder = By.xpath("//button[normalize-space()='Close Order']");
	protected By actionButton = By.xpath("(//button[@class='mat-mdc-menu-trigger btn'])[1]");

	public void closeVendorLoad(String uploadPDF, String UT1, String UT2, String TKT1, String TKT2) { 

		clickElement(actionButton);
		hardWait(2000);
		clickElement(markDeliverd);
		clickElement(confirmDeliver);
		clickElement(completedOrder);
		clickElement(actionButton);
		hardWait(1000);
		clickElement(closeLoad);
		enterData(uploadTicket, uploadPDF);

		hardWait(2000);
		enterData(unit1, UT1);
		hardWait(2000);
		enterData(unit2, UT2);
		hardWait(2000);
		enterData(ticket1, TKT1);
		hardWait(2000);
		enterData(ticket2, TKT1);
		hardWait(2000);
		clickElement(closeOrder);
		hardWait(2000);
	}

	
	public void closeMyLoadBothCases(String uploadPDF, String UT1, String TKT1) { 

		clickElement(actionButton);
		hardWait(2000);
		clickElement(markDeliverd);
		clickElement(confirmDeliver);
		clickElement(completedOrder);
		clickElement(actionButton);
		hardWait(1000);
		clickElement(closeLoad);
		enterData(uploadTicket, uploadPDF);
		hardWait(2000);
		enterData(unit1, UT1);
		hardWait(2000);
		enterData(ticket1, TKT1);
		hardWait(2000);
		clickElement(closeOrder);
		hardWait(2000);
	}
	
	public void closeCustomerLoadtoDriver(String uploadPDF, String TKT1, String TKT2) { 

		clickElement(actionButton);
		hardWait(2000);
		clickElement(markDeliverd);
		clickElement(confirmDeliver);
		clickElement(completedOrder);
		clickElement(actionButton);
		hardWait(1000);
		clickElement(closeLoad);
		enterData(uploadTicket, uploadPDF);
		hardWait(2000);
		enterData(ticket1, TKT1);
		hardWait(2000);
		enterData(ticket2, TKT1);
		hardWait(2000);
		clickElement(closeOrder);
		hardWait(2000);
	}
	
	public void closeCustomerLoadBothCases(String uploadPDF, String UT1, String TKT1, String TKT2) { 

		clickElement(actionButton);
		hardWait(2000);
		clickElement(markDeliverd);
		clickElement(confirmDeliver);
		clickElement(completedOrder);
		clickElement(actionButton);
		hardWait(1000);
		clickElement(closeLoad);
		enterData(uploadTicket, uploadPDF);
		hardWait(2000);
		enterData(unit1, UT1);
		hardWait(2000);
		enterData(ticket1, TKT1);
		hardWait(2000);
		enterData(ticket2, TKT1);
		hardWait(2000);
		clickElement(closeOrder);
		hardWait(2000);
	}
	
	public void closeMyLoadDriver() { 

		clickElement(actionButton);
		hardWait(2000);
		clickElement(markDeliverd);
		clickElement(confirmDeliver);
		clickElement(completedOrder);
		hardWait(2000);
	}

}
