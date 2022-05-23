package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {

	public static void main(String[] args) throws IOException,InterruptedException {
	
		
		
		FileInputStream fis=new FileInputStream("/Users/diva/eclipse-workspace/Framework1/src/test/java/Utils/configproperties.file");
		Properties pro=new Properties();
		pro.load(fis);
		
		
		String uname_l =pro.getProperty("uname1");
		String pass_l=pro.getProperty("pass1");

		String login_l=pro.getProperty("login1");
		String logout_l=pro.getProperty("logout2");
		String welcome_l=pro.getProperty("welcome1");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		driver.findElement(By.xpath(uname_l)).sendKeys("Admin");
		driver.findElement(By.xpath(pass_l)).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(login_l)).click();
		
		
		Actions act=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath(welcome_l));
		act.moveToElement(w1).perform();//mouse over for welcome button
		
		w1.click();//click for welcome
		Thread.sleep(3000);
		
		WebElement log= driver.findElement(By.xpath(logout_l));//logout
		log.click();//logout button click 
		Thread.sleep(2000);
		
		driver.quit();


		
	}

}
