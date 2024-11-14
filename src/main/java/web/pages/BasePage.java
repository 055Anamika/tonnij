package web.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends BaseMethods {	
	
//	    protected By CompanyName = By.xpath("//input[@formcontrolname='company_name']");
//		protected By City = By.xpath("//input[@formcontrolname='city']");
	    protected By modelYear = By.xpath("//span[normalize-space()='2023']");
	    protected By modelYear2 = By.xpath("//span[normalize-space()='2024']");
	     protected By tostMessage = By.xpath("//div[@id='toast-container']");


		protected By dropdown = By.xpath("//mat-select[@formcontrolname='province']");
		protected By stateFromDropdown = By.xpath("//span[normalize-space()='Alberta']");
	    protected By addFavourite = By.id("favourite");
		protected By companyFAX = By.xpath("//input[@formcontrolname='company_fax']");
		protected By companyGST = By.xpath("//input[@formcontrolname='company_gst']");
		protected By companyNSC = By.xpath("//input[@formcontrolname='company_nsc']");
		protected By companyWCB = By.xpath("//input[@formcontrolname='company_wcb']");
		protected By companyPhNo = By.xpath("//input[@formcontrolname='company_cell']");
		protected By userHouseNo = By.xpath("//input[@formcontrolname='house_number']");
	    protected By lisenceExpiryDate = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[1]");  
	    protected By selectLisenceExpiryDate = By.xpath("//span[normalize-space()='30']");
	    protected By hiringDate = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[2]");
	    protected By selectHiringDate = By.xpath("//span[normalize-space()='10']");
	    protected By selectMVIExpDate = By.xpath("//span[normalize-space()='30']");
	     protected By master = By.xpath("//span[normalize-space()='Masters']");

	    protected By leavingDate = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[3]");
	    protected By selectLeavingDate = By.xpath("//span[normalize-space()='31']");  
	    protected By dateOfBirth = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[4]");
	    protected By selectDateOfBirth = By.xpath("//span[normalize-space()='11']");
		protected By makeTrailer = By.xpath("//span[normalize-space()='Toyota']");
	    protected By selectLastServiceDate = By.xpath("//span[normalize-space()='17']"); 
		protected By nextServiceDueOn = By.xpath("//span[normalize-space()='31']");
		protected By home = By.xpath("//img[@class='pointer']");

		


	
     protected By resetButton = By.xpath("//button[normalize-space()='Reset']");
	 protected By statusUpdateButton = By.xpath("//label[@for='1']//div[@class='slider round']");
	 protected By conformationModalYes = By.xpath("//button[@class='btn btn-primary']");
	 protected By filter = By.xpath("(//button[@mattooltip='Filter'])[1]");
	 protected By closeUpdateBox = By.xpath("//i[@class='large material-icons']");
	 protected By searchFilter = By.xpath("//button[normalize-space()='Search']");
	 protected By resetFilter = By.xpath("//button[normalize-space()='Reset']");
	 protected By filterCloseButton = By.xpath("//button[@class='btn btn-close']");
     protected By uploadFile = By.cssSelector("input[id='uploadBtn']");
     protected By proceedUploadFile = By.xpath("//button[normalize-space()='Proceed']");
     protected By ZonalDistributorTitle =By.xpath("//ol[@class='breadcrumb']");
     protected By DocumntDetails = By.xpath("//span[contains(text(),'Document Details')]");
   	 protected By cognito = By.xpath("//div[@class='slider round']");
     protected By update = By.xpath("//button[normalize-space()='Update']");
     protected By save = By.xpath("//button[normalize-space()='Save']");




	 public BasePage(WebDriver driver) {
		super(driver);

	}
	 
	public void clickOnAddBtn()
	{
		
	}
	
	public void clickStatusUpdateButton() {
		waitForElementInVisibility(statusUpdateButton, TIMEOUT, false);
		clickElement(statusUpdateButton);
	}
	
	public String getTostMessage() {
		return getElementText(tostMessage);
	}
	
	public void clicOnConformationModalVisibility() {
		waitForElementInVisibility(conformationModalYes, TIMEOUT, false);
		clickElement(conformationModalYes);
	}
	
	public void clickOnFilter() {
		waitForElementInVisibility(filter, TIMEOUT, false);
		clickElement(filter);
	}
	
	/*
	 * public void clickOnEditButton() {
	 * 
	 * waitForElementInVisibility(editButton, TIMEOUT, false);
	 * clickElement(editButton); waitForElementInVisibility(DocumntDetails, TIMEOUT,
	 * false); clickElement(DocumntDetails);
	 * 
	 * }
	 */

	/*
	 * public void clickOnUpdateEditBtn() { clickElement(updateEditedItem); }
	 */

	public void clickOnCloseUpdateBtn()
	{
		waitForElementClickable(closeUpdateBox, SHORT_TIMEOUT, false);
		clickElement(closeUpdateBox);
	}
	
	public void filterSearch()
	{
		clickElement(searchFilter);
	}
	
	public void clickOnUpdateFileBtn()
	{
		waitForElementClickable(uploadFile, SHORT_TIMEOUT, false);
		clickElement(uploadFile);
	}
	
	public void clickOnFilterCloseBtn()
	{
		waitForElementClickable(filterCloseButton, SHORT_TIMEOUT, false);
		clickElement(filterCloseButton);
	}
	
	public void clickOnProceedUploadFile()
	{
		waitForElementClickable(proceedUploadFile, SHORT_TIMEOUT, false);
		clickElement(proceedUploadFile);
	}
	
	
	public void clickOnEditBtn(By locator, String tableHeaderName)
	{
		waitForElementClickable(locator, SHORT_TIMEOUT, false);
		clickElement(locator);
	}
	
	public int getTableRowCount(By locator)
	{
		List <WebElement> rows = _driver.findElements(locator); 
        int rowSize= rows.size();
        return rowSize;
	}
	
	public int getTableColCount(By locator)
	{
		List <WebElement> col = _driver.findElements(locator); 
        int colSize= col.size();
        return colSize;	
	}
	
//	public void enterDataInCategoryModalField(String name,String definition) {
//		enterData(categoryTextField, name);
//		enterData(definitionTxtField, definition);			
//	}
	
	
	public boolean verifyCategoryIsDeleted(String categoryName) {
		By category = By.xpath("//tbody/tr/td[text()='"+categoryName+"']");
		boolean isCategoryPresent = isElementPresentShort(category, true);
		return isCategoryPresent;
	}
	
}

