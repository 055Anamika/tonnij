package extentREPORTS;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class ListenerClass implements ITestListener {
    
    ExtentReport et;
    ExtentTest test;
    ExtentReports report = ExtentReport.getReports();
    WebDriver _driver;

    // No-argument constructor
    public ListenerClass() {
        // You can initialize non-driver fields here if needed
    }
    

    // Constructor with WebDriver
    public ListenerClass(WebDriver driver) {
        this._driver = driver;
        this.et = new ExtentReport(driver);
    }
    
    
    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
        };

		
	@Override
	 public void onTestStart(ITestResult result) {
		 test = report.createTest(result.getMethod().getMethodName());
		  }
	
	
	@Override
	 public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test has been Passed Successfully");
		  }
	
	
	



	@Override
	  public void onTestSkipped(ITestResult result) {
		    test.log(Status.SKIP, result.getTestName());
		  }
	
	@Override
	  public void onFinish(ITestContext context) {
		  report.flush();
	}
	
	
}
