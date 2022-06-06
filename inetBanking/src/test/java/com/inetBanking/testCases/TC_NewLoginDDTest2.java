package com.inetBanking.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.NewXLUtils;
import com.inetBanking.utilities.XLUtils;

public class TC_NewLoginDDTest2 extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUname(user);
		logger.info("user name provided");
		lp.setPwd(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		Thread.sleep(3000);
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-popup-blocking");

		driver = new ChromeDriver(options);
		lp.clickLogout();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		/*if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}*/
		
		
	}
	
	
	/*public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}*/
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetBanking/testData/OneLoginData.xlsx";
		int noofrow=XLUtils.getRowCount(path,"Sheet1");
		int noofcol=XLUtils.getCellCount(path,"Sheet1",1);
		List<List<String>> logindata = new ArrayList<>();
		int maxCols = 0;
		for(int i=1;i<=noofrow;i++)//here row starts from 1
		{
			List<String> cols = new ArrayList<>();
			for(int j=0;j<noofcol;j++) {
				String value = XLUtils.getCellData(path, "Sheet1", i, j);
				
				if (value != null && value.trim().length()> 0) {
					cols.add(value);	
				}
				//in array(here loginData is array), index will starts with 0,thats y[i-1]
						//whereas in the excel sheet [0][0]=uname,[0][1]=pwd
						//it will fetch the data from excel sheet [1][0]=mngr123 and [1][1]=ushhge

			}	//for j

			if (cols.size() > 0) {
				logindata.add(cols);
				
				if (maxCols < cols.size()) {
					maxCols = cols.size();
				}
			}

		}//for i
		
		String[][] logingDataArr = new String[logindata.size()][maxCols];
		for (int i = 0; i < logindata.size(); i++) {
			for (int j = 0; j < logindata.get(i).size(); j++) {
				logingDataArr[i][j] = logindata.get(i).get(j);
			}
		}
		
		return logingDataArr;
	}//getdata
	
	
}
