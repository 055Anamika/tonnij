package web.testdata;

import web.pages.BaseMethods;

public interface Truck {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Truck";

	String TRUCK_UNITNO = BaseMethods.generateRandomDigits(4) ;
	String Truck_LICENSE_PLATENO = BaseMethods.generateAlphaNumericCode(10) ;
	String TRUCK_VIN_NO = BaseMethods.generateAlphaNumericCode(10) ;
	String TRUCK_MAKE = BaseMethods.generatePrefix(5) ;


}
