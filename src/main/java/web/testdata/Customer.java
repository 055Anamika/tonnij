package web.testdata;
import jsonHelper.json;
import web.pages.BaseMethods;

public interface Customer {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Customer";
	
	String COMPANY_NAME = BaseMethods.generatePrefix(6);
	String CONTACT_PERSON_NAME = BaseMethods.generatePrefix(8);
	String BUILDING_NUMBER = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Building_No");
	String STREET_NAME = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Street_Name");
	String CUSTOMER_CITY = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Customer_City");
	String POSTAL_CODE = BaseMethods.generateAlphaNumericCode(6);
	String CUSTOMER_CELLPHONE_NO = BaseMethods.generatePhoneNumber();
	String OFFICE_NO = BaseMethods.generatePhoneNumber() ;
	String MAIL = BaseMethods.generatePrefix(5) + json.getTestDataString(FOLDER_NAME, FILE_NAME, "MailPrefix");
	String CUSTOMER_WEBSITE = BaseMethods.generatePrefix(9) ;
	String CUSTOMER_FAX = BaseMethods.generateRandomDigits(20);
	String CUSTOMER_GST = BaseMethods.generateAlphaNumericCode(15);	
}
