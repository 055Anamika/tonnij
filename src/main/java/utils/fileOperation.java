package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.naming.ConfigurationException;

import org.apache.commons.configuration.PropertiesConfiguration;

public class fileOperation {
	public static String getValuePropertyFromFile(String path, String key) {
		Properties prop =new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		}	catch(IOException e) {
				e.printStackTrace();
			}
			return prop.getProperty(key);
	      }
	
		public static void updatePropertyFileValue(String path, String key, String value) throws ConfigurationException, 
		org.apache.commons.configuration.ConfigurationException {
			PropertiesConfiguration config =null;
			config = new PropertiesConfiguration(path);
			config.setProperty(key, value);
			config.save();	
		}		
	}      