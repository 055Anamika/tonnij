package web.init;

import javax.print.DocFlavor.URL;

import org.junit.Assert;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import web.config.WebConfig;

public class DriverFactory {
	
	private WebDriver driver;
	private String isheadless = WebConfig.HEADLESS;
	private String browser = WebConfig.BROWSER;
	
	public WebDriver initialize() {
		try {
			driver=setDriver(browser);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
				return driver;
	}
	
	private WebDriver setDriver(String browser) {
		switch(browser.toLowerCase()) {
		case "chrome":
			driver = initChromeDriver(isheadless);
		break;
		case "ie":
			driver = initIEDriver(isheadless);
		break;
		case "firefox":
			driver = initFirefoxDriver(isheadless);
		break;
		default :
			driver = initChromeDriver(isheadless);
		}	
		return driver;		
	}

	private WebDriver initChromeDriver(String isheadless) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		if (isheadless.toLowerCase().equals("false")) {
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
		     // Add arguments to disable the save password prompt
	        options.addArguments("--disable-save-password-bubble");
		//	driver = new RemoteWebDriver((CommandExecutor) new URL("TUY"), options);
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		} else {
			options.addArguments("--isheadless");
			options.addArguments("--window-size=1920,1080");
		}
		driver =new ChromeDriver(options);
		return driver;
	}

	private WebDriver initFirefoxDriver(String isheadless) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		if (isheadless.toLowerCase().equals("false")) {
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
		     // Add arguments to disable the save password prompt
	        options.addArguments("--disable-save-password-bubble");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		} else {
			options.addArguments("--isheadless");
			options.addArguments("--window-size=1920,1080");
		}
		driver =new FirefoxDriver(options);
		return driver;	
	}
	
	
    private WebDriver initIEDriver(String isheadless) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		if (isheadless.toLowerCase().equals("false")) {
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
		     // Add arguments to disable the save password prompt
	        options.addArguments("--disable-save-password-bubble");
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		} else {
			options.addArguments("--isheadless");
			options.addArguments("--window-size=1920,1080");
		}
		driver =new EdgeDriver(options);
		return driver;	
	}
    
  public void AfterTest() {
	  driver.quit();
  }
}

