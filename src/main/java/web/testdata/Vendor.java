package web.testdata;
import jsonHelper.json;
import web.pages.BaseMethods;

public interface Vendor {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Vendor";
	
	String VENDOR_COMPANY = BaseMethods.generatePrefix(6);
	String CONTACT_PERSON_NAME = BaseMethods.generatePrefix(6);
	String BUILDING_NUMBER = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Building_No");
	String STREET_NAME = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Street_Name");
	String VENDOR_CITY = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Vendor_City");
	String POSTAL_CODE = BaseMethods.generateAlphaNumericCode(6);
	String VENDOR_CELLPHONE_NO = BaseMethods.generatePhoneNumber();
	String OFFICE_NO = BaseMethods.generatePhoneNumber() ;
	String MAIL = BaseMethods.generatePrefix(5) + json.getTestDataString(FOLDER_NAME, FILE_NAME, "MaiLPostfix");	
	String CUSTOMER_WEBSITE = BaseMethods.generatePrefix(9) ;
	String VENDOR_FAX = BaseMethods.generateAlphaNumericCode(25);
	String VENDOR_GST = BaseMethods.generateAlphaNumericCode(9);	
	String VENDOR_NSC = BaseMethods.generatePhoneNumber();
	String VENDOR_WCB = BaseMethods.generateAlphaNumericCode(9);	
}
