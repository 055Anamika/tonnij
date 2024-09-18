package web.testdata;

import jsonHelper.json;
import web.pages.BaseMethods;;

public interface User {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "User";
	
	
	String COMPANY_NAME = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Company_Name");
	String BUILDING_NO = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Building_No");
	String STREET_NAME = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Street_Name");
	String CITY = json.getTestDataString(FOLDER_NAME, FILE_NAME, "CITY");
	String POSTAL_CODE = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Postal_Code");
	String COMPANYPH_NO = BaseMethods.generatePhoneNumber();
	String COMPANY_FAX = BaseMethods.generateAlphaNumericCode(15);
	String COMPANY_GST = BaseMethods.generateRandomDigits(9) ;
	String COMPANY_NSC = BaseMethods.generateRandomDigits(9) ;
	String COMPANY_WCB = BaseMethods.generateRandomDigits(9) ;

	String UPLOAD_LOGO = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Company_Logo");
	String UPLOAD_COI = json.getTestDataString(FOLDER_NAME, FILE_NAME, "COI_Docs");
	String UPLOAD_WCB = json.getTestDataString(FOLDER_NAME, FILE_NAME, "WCB_Docs");
	String UPLOAD_NSC = json.getTestDataString(FOLDER_NAME, FILE_NAME, "NSC_Docs");
	String UPLOAD_BUSINESS_CERFICATION = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Business_Certification");
	
	


	String HOUSE_NO = json.getTestDataString(FOLDER_NAME, FILE_NAME, "house_Number");
	String STREET_ADDRESS = json.getTestDataString(FOLDER_NAME, FILE_NAME, "street_Address");
	String COMPANY_PHONE_NO = json.getTestDataString(FOLDER_NAME, FILE_NAME, "company_Phone_No");

	String WCB_DOCS = json.getTestDataString(FOLDER_NAME, FILE_NAME, "WCB_Docs");
	String COI_DOCS = json.getTestDataString(FOLDER_NAME, FILE_NAME, "COI_Docs");
	String NSC_DOCS = json.getTestDataString(FOLDER_NAME, FILE_NAME, "NSC_Docs");
	String BUSINESS_CERTIFICATION = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Business_Certification");
	String PREFIX_AMOUNT = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Prefix_Amount");
	String SERIAL_NUMBER = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Serial_Number");
	String TAX_RATE = json.getTestDataString(FOLDER_NAME, FILE_NAME, "TAX_Rate");
          		 

}
