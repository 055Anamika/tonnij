package web.config;
import utils.fileOperation;
import web.constant.Constant;

public class WebConfig {
	public static String URL = getWebConfig("URL");
	public static String BROWSER = getWebConfig("Browser");
	public static String HEADLESS = getWebConfig("Headless");
	public static String TIMEOUT = getWebConfig("TIMEOUT");
	public static String LONGTIMEOUT = getWebConfig("LONG_TIMEOUT");
	public static String SHORTTIMEOUT = getWebConfig("SHORT_TIMEOUT");
	

	private static String getWebConfig(String key) {
		return fileOperation.getValuePropertyFromFile(Constant.CONFIG_WEBFILE_PATH, key);
	}	
}
