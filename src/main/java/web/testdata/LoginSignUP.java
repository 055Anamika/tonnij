package web.testdata;
import jsonHelper.json;
import web.pages.BaseMethods;

public interface LoginSignUP {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "LoginSignUP";
	
	String FIRST_NAME = json.getTestDataString(FOLDER_NAME, FILE_NAME, "First_Name");
	String LAST_NAME = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Last_Name");
	String MAILPOST_FIX = BaseMethods.generatePrefix(5) + json.getTestDataString(FOLDER_NAME, FILE_NAME, "MaiLPostfix");
	String EMAIL =json.getTestDataString(FOLDER_NAME, FILE_NAME, "MaiL");
	String CELLPHONE_NUMBER = BaseMethods.generatePhoneNumber();
	String PASSWORD = json.getTestDataString(FOLDER_NAME, FILE_NAME, "passWord");
	String CONFIRM_PASSWORD = json.getTestDataString(FOLDER_NAME, FILE_NAME, "confirm_Password");
	String OTP_1 = json.getTestDataString(FOLDER_NAME, FILE_NAME, "One");
	String OTP_2 = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Two");
	String OTP_3 = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Three");
	String OTP_4 = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Four");
	String ADMIN_ID=json.getTestDataString(FOLDER_NAME, FILE_NAME, "adminUserName");
	String ADMIN_PASS=json.getTestDataString(FOLDER_NAME, FILE_NAME, "adminpass");
	
}
