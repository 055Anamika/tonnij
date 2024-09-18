package extentREPORTS;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import web.pages.BaseMethods;

public class ExtentReport  extends BaseMethods{
	

	public ExtentReport(WebDriver _driver) {
		super(_driver);
	}

	public static ExtentReports getReports() {
		String path= System.getProperty("user.dir") + "\\report\\index.html";
		ExtentSparkReporter extent =new ExtentSparkReporter(path);
		extent.config().setDocumentTitle("Tonnij");
		extent.config().setReportName("Jyoti");
		
		 
        ExtentReports report = new ExtentReports();
        report.attachReporter(extent);
        report.setSystemInfo("Test", "Tester");
        return report;	
	}
}
