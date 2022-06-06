package ExtentReports;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class extentdemo {
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport() {
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/MyReport.html",true);
		extent.addSystemInfo("Host Name","LocalHost");
		extent.addSystemInfo("Environment","QA");	
		extent.addSystemInfo("User Name","Sharmila");	
		extent.loadConfig(new File(System.getProperty("/Users/diva/eclipse-workspace/inetBanking/extent-config.xml")));
	}
	@Test
	public void passTest(){

	test = extent.startTest("passTest");
	Assert.assertTrue(true);
	//To generate the log when the test case is passed
	test.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
	@Test
	public void failTest(){
		test = extent.startTest("failTest");
	Assert.assertTrue(false);
	test.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	}
	@Test
	public void skipTest(){
		test = extent.startTest("skipTest");
	throw new SkipException("Skipping - This is not ready for testing ");
	}
	@AfterMethod
	public void getResult(ITestResult result){
	if(result.getStatus() == ITestResult.FAILURE){
		test.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
		test.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
	}else if(result.getStatus() == ITestResult.SKIP){
		test.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	}
	// ending test
	//endTest(logger) : It ends the current test and prepares to create HTML report
	extent.endTest(test);
	}
	@AfterTest
	public void endReport(){
	// writing everything to document
	//flush() - to write or update test information to your report.
	                extent.flush();
	             
	                extent.close();
	    }
	

}
