package Log4JBrowser;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4JXML {
		
		public static void main(String args[]) {
			Logger logger=Logger.getLogger("Log4JXML");
			
			//DOMConfigurator.configure("log4j2.xml");
			PropertyConfigurator.configure("log4j.properties");
			WebDriverManager.chromedriver().setup();
			
			logger.info("starting of test");
			WebDriver driver= new ChromeDriver();
			logger.info("browser opens");
			driver.get("http://whiteboxqa.com/index.php");
			logger.info("navigate to whitebox");
			driver.quit();
			
			
			
		}
	}
