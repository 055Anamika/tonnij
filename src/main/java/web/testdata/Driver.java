
package web.testdata;

import jsonHelper.json;
import web.pages.BaseMethods;

public interface Driver {
	

	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Driver";
	
	
	String DRIVER_NAME = BaseMethods.generatePrefix(5);
	String CELLPHONE_NO = BaseMethods.generatePhoneNumber();
	String EMAIL = BaseMethods.generatePrefix(5) + json.getTestDataString(FOLDER_NAME, FILE_NAME, "_email");
	String BUILDING_NAME = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Building_Name");
	String STREET_NAME = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Street_Name");
	String CITY = json.getTestDataString(FOLDER_NAME, FILE_NAME, "_City");
	String POSTAL_CODE = BaseMethods.generateAlphaNumericCode(15);
	String SIN = BaseMethods.generateRandomDigits(9) ;
	String LICENSE_NO = BaseMethods.generateRandomDigits(9) ;
	String UPLOAD_LICENSE = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Upload_Image") ;
	String DRIVER_FILE = json.getTestDataString(FOLDER_NAME, FILE_NAME, "driver_file") ;

	
}
