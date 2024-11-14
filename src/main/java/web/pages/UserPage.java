package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage extends BasePage {

	public UserPage(WebDriver driver) {
		super(driver);

	}
	
	protected By companyName = By.xpath("//input[@formcontrolname='company_name']");
	protected By streetName = By.xpath("(//input[@id='Street_Name'])[1]");
	protected By buildingNo = By.xpath("//input[@id='Building_Number']"); 
	protected By city = By.xpath("//input[@formcontrolname='city']");
	protected By dropdown = By.xpath("//mat-select[@formcontrolname='province']");
	protected By stateFromDropdown = By.xpath("//span[normalize-space()='Alberta']");
	protected By postalCode = By.xpath("(//input[@id='Profile_Postal'])[1]"); 
	protected By companyPhNo = By.xpath("//input[@formcontrolname='company_cell']");
	protected By companyFAX = By.xpath("//input[@formcontrolname='company_fax']");
	protected By companyGST = By.xpath("//input[@formcontrolname='company_gst']");
	protected By companyNSC = By.xpath("//input[@formcontrolname='company_nsc']");
	protected By companyWCB = By.xpath("//input[@formcontrolname='company_wcb']");
	
	protected By uploadDocument = By.xpath("//span[contains(text(),'Upload Document')]");
	protected By updateButton = By.xpath("(//button[normalize-space()='Update'])[1]");
	protected By uploadButton = By.xpath("(//button[normalize-space()='Upload'])[1]");
	protected By addButton = By.xpath("//button[normalize-space()='Add']");


	protected By uploadCompanyLogo = By.xpath("//input[@type='file']");
	protected By uploadImageButton = By.xpath("//button[@class='btn btn-primary float-right']");
	protected By uploadLogo = By.xpath("(//input[@type='file'])[1]");
	protected By uploadWCB = By.xpath("(//input[@type='file'])[2]");
	protected By uploadCOI = By.xpath("(//input[@type='file'])[3]");
	protected By uploadNSC = By.xpath("(//input[@type='file'])[4]");
	protected By uploadBusinessRegistrationCertificate = By.xpath("(//input[@type='file'])[5]");
	protected By nextButton = By.xpath("//button[normalize-space()='Next']");

	protected By orderPrefix = By.xpath("//input[@formcontrolname='order_prefix']");
	protected By orderSerialNo = By.xpath("//input[@id='Order_Series_Number']");
	protected By dateFormat = By.cssSelector(".ng-tns-c1154042729-4[viewBox='0 0 24 24']");
	protected By selectDate = By.xpath("//span[normalize-space()='dd-MMM-yyyy']");
	protected By timeFormat = By.cssSelector(".ng-tns-c1154042729-6[viewBox='0 0 24 24']");
	protected By selectTime = By.xpath("//span[normalize-space()='HH:mm']");
	
	protected By masterSettings = By.xpath("//span[contains(text(),'Master Settings')]");
	protected By taxClass = By.xpath("//span[contains(text(),'Tax Class')]");	
	protected By addTaxClass = By.xpath("//button[normalize-space()='+ Add Class']");
	protected By taxStatusButton = By.xpath("(//div[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin'])[2]");	
	protected By taxRate = By.xpath("//input[@formcontrolname='applicable_tax_percentage']");
	protected By GST = By.xpath("(//span[normalize-space()='GST'])[1]");
	protected By TaxClassList = By.xpath("//span[normalize-space()='Please Select Tax...']");
	protected By addTaxClassButton = By.xpath("//button[normalize-space()='Add']");
	protected By masterSetting = By.xpath("//span[contains(text(),'Master Settings')]");

	protected By logout = By.xpath("(//span[@class='logout'])[1]");
	protected By pendingDocument = By.xpath("//p[normalize-space()='Pending Approval(s)']");
	protected By preview = By.xpath("(//button[@class='btn'][normalize-space()='PREVIEW'])[1]");
	protected By BRCapprove = By.xpath("//label[@for='BRCapprove']");
	protected By NSCapprove = By.xpath("//label[@for='NSCapprove']");
	protected By COiapprove = By.xpath("//label[@for='COiapprove']");
	protected By WCBapprove = By.xpath("//label[@for='WCBapprove']");
	protected By submit = By.xpath("//button[normalize-space()='Submit']");



		public void Company_Info(String CompanyName, String PostalCode, String BuildingNo, String StreetName, String City,
				String companyPhoneNo, String FAX, String GST, String WCB, String NSC,String CompanyLogo)	throws InterruptedException {
			hardWait(7000);
			uploadFile(uploadLogo,CompanyLogo );
			enterData(companyName, CompanyName);
			enterData(buildingNo, BuildingNo);
			enterData(streetName, StreetName);
			enterData(city, City);
			hardWait(1000);
			clickElement(dropdown);
			clickElement(stateFromDropdown);
			enterData(postalCode, PostalCode);
			enterData(companyPhNo, companyPhoneNo);
			enterData(companyFAX, FAX);
			enterData(companyGST, GST);
			enterData(companyNSC, NSC);
			enterData(companyWCB, WCB);
			hardWait(2000);
			clickElement(updateButton);
			hardWait(4000);
		}

		public void Upload_Document(String WCBDocs, String COIDocs, String NSCDocs, String BusinessCertificate) {
			hardWait(2000);
			uploadFile(uploadWCB, WCBDocs);
			hardWait(1000);
			uploadFile(uploadCOI, COIDocs);
			hardWait(1000);
			uploadFile(uploadNSC, NSCDocs);
			hardWait(1000);
			uploadFile(uploadLogo, BusinessCertificate);
			hardWait(1000);
			clickElement(addButton);		
			hardWait(3000);
		}
		

		public void Master_Settings( String serialNoAmount) {
		//	enterData(orderPrefix, prefixAmount);
			enterData(orderSerialNo, serialNoAmount);
			hardWait(2000);
		//	clickElement(dateFormat);
		//	clickElement(selectDate);
		//	hardWait(2000);
		//	clickElement(timeFormat);
		//	moveToElementClick(selectTime);
			clickElement(updateButton);
		//	hardWait(2000);

		}
		
		public void Tax_Class(String TAXRate) {
			hardWait(2000);
			clickElement(addTaxClass);
			hardWait(1000);
			clickElement(TaxClassList);
			hardWait(1000);
			clickElement(GST);
			hardWait(1000);
			enterData(taxRate, TAXRate);
			hardWait(1000);
		    clickElement(addTaxClassButton);	
		    hardWait(3000);	    

		}
		
		public void Approve_From_Admin() {
			clickElement(pendingDocument);
			hardWait(2000);
			clickElement(preview);
			hardWait(2000);
			clickElement(BRCapprove);
			hardWait(1000);
			clickElement(NSCapprove);
			hardWait(1000);
			clickElement(COiapprove);
			hardWait(1000);
			clickElement(WCBapprove);
			hardWait(3000);
			clickElement(submit);
			hardWait(2000);
			
		}

	}
