package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public ExtentSparkReporter reporter;
	public ExtentReports extent;
	public static ExtentTest newUser;
	
	@BeforeSuite
	public void initExtentReport() {
		reporter = new ExtentSparkReporter("./reports/final.html");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		}
	
	@BeforeTest
	public void executeTestLevel() {
	newUser = extent.createTest("TC001_Leads", "This Test Case will Create & Edit Leads");
	newUser.assignAuthor("Maheshwaran");
	newUser.assignCategory("UnitTesting");
	newUser.assignDevice("Windows 10");
}
	
@AfterSuite
public void closeFlush() {
	extent.flush();
}
	
}
