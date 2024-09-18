package utils;

public class GenericMethods {

	public static String getProjectRootDirectory() {
		String currentDirectory =System.getProperty("user.dir");		
		return currentDirectory;
	}

}
