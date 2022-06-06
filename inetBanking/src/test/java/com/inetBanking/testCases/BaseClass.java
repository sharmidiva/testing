package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	public static WebDriver driver;
	public static Logger logger;
	
	ReadConfig readconfig=new ReadConfig();//creating object for ReadConfig
	//it comes from ReadConfig.java and imports from utilities package

	public String baseURL=readconfig.getURL();
	public String username=readconfig.getUname();
	public String password=readconfig.getPwd();

	@Parameters("browser")	
	@BeforeClass
	public void setup(String br) {//browser variable is br
	//logger is used to display the details of performance in separate log file
	logger=Logger.getLogger("Used Logger");
	PropertyConfigurator.configure("log4j.properties");
	
	if(br.equals("chrome")) {//it should pass to testng.xml file 
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	else if(br.equals("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	}
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(baseURL);
	driver.manage().deleteAllCookies();

	
	}
	@AfterClass
	public void teardown() {
	driver.quit();
	}

	public void captureScreeShot(WebDriver driver,String name) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target= new File(System.getProperty("user.dir")+ "/Screenshots/"+name+".png");
	FileUtils.copyFile(source, target);
	System.out.println("ScreenShot has taken");
	}
	

}

