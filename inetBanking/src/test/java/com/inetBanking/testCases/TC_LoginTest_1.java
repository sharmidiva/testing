package com.inetBanking.testCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
//setup , tear down method will extends from base class
public class TC_LoginTest_1  extends BaseClass{
	@Test
	public void loginTest() throws IOException {
		
		logger.info("URL is opened");
		//use of POM and it will use all methods from loginPage
		LoginPage lp=new LoginPage(driver);
		
		lp.setUname(username);
		logger.info("Uname is entered");
		lp.setPwd(password);
		logger.info("Pwd is entered");
		
		lp.clickSubmit();
		//Assert.assertEquals("Guru99 Bank Manager HomePage", driver.getTitle());
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			AssertJUnit.assertTrue(true);
			System.out.println("title is matched");
			logger.info("LoginTest Passed");
		}
		else
		{
			//if the test is failed it should capture the screenshot
			captureScreeShot(driver,"loginTest");
			AssertJUnit.assertTrue(false);
			logger.info("LoginTest Failed");
		}
	}

}
