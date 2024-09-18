package web.testdata;

import web.pages.BaseMethods;

public interface Trailer {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Trailer";
	
	String TRAILER_UNITNO = BaseMethods.generateRandomDigits(4) ;
	String LICENSE_PLATENO = BaseMethods.generateAlphaNumericCode(10) ;
	String VIN_NO = BaseMethods.generateAlphaNumericCode(10) ;
	String TRAILER_MAKE = BaseMethods.generatePrefix(5) ;

	
	}
