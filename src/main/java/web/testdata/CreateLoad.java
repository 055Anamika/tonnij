package web.testdata;

import jsonHelper.json;
import web.pages.BaseMethods;

public interface CreateLoad {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "CreateLoad";
	
	
	String COMPANY_NAME = BaseMethods.generatePrefix(6);
	String COMPANY_NAMEE = json.getTestDataString(FOLDER_NAME, FILE_NAME, "comp_name");

	String CONTACT_PERSON_NAME = BaseMethods.generatePrefix(8);
	String BUILDING_NUMBER = BaseMethods.generateRandomDigits(3);
	String STREET_NAME = BaseMethods.generatePrefix(6);
	String CITY = BaseMethods.generatePrefix(6);
	String POSTAL_CODE = BaseMethods.generateRandomDigits(7);
	String CUSTOMER_CELLPHONE_NO = BaseMethods.generatePhoneNumber();
	String OFFICE_NO = BaseMethods.generatePhoneNumber() ;
	String EMAIL = BaseMethods.generatePrefix(4) + json.getTestDataString(FOLDER_NAME, FILE_NAME, "MailPrefix");
	
	//String lOAD_QUANTITY = json.getTestDataString(FOLDER_NAME, CITY, "quantity");
	String JOBSITE_NAME = BaseMethods.generatePrefix(6);
	String PICKUP_BUILDING_NUMBER = BaseMethods.generateRandomDigits(3);
	String PICKUP_STREET_NAME = BaseMethods.generatePrefix(6);
	String PICKUP_CITY = BaseMethods.generatePrefix(6);
	String PICKUP_POSTAL_CODE = BaseMethods.generateAlphaNumericCode(6);

	String DROP_NAME = BaseMethods.generatePrefix(6);
	String DUMP_BUILDING_NUMBER = BaseMethods.generateRandomDigits(3);
	String DUMP_STREET_NAME = BaseMethods.generatePrefix(6);
	String DUMP_CITY = BaseMethods.generatePrefix(6);
	String DUMP_POSTAL_CODE = BaseMethods.generateAlphaNumericCode(6);		

	String AGREED_RATE = BaseMethods.generateRandomDigits(4);
	String TRUCK_QUANTITY = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Truck_QTY");
	String PO_NUMBER = BaseMethods.generateRandomDigits(4);
	String CONFIRMATION_NO = BaseMethods.generateRandomDigits(4);
	String REMARKS = BaseMethods.generatePrefix(7);

	String UNIT_1 = BaseMethods.generateAlphaNumericCode(4);
	String UNIT_2 = BaseMethods.generateAlphaNumericCode(4);
	String TKT_1 = BaseMethods.generateAlphaNumericCode(4);
	String TKT_2 = BaseMethods.generateAlphaNumericCode(4);
	String UPLOAD_PDF = json.getTestDataString(FOLDER_NAME, FILE_NAME, "PDF");

}
