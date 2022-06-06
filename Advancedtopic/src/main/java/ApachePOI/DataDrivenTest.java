package ApachePOI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider="LoginData")
	public void loginTest(String user,String pwd,String exp) {
		System.out.println(user+pwd+exp);
//		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//		WebElement txtemail=driver.findElement(By.id("Email"));
//		txtemail.clear();
//		txtemail.sendKeys(user);
//		
//		WebElement txtpwd=driver.findElement(By.id("Password"));
//		txtpwd.clear();
//		txtpwd.sendKeys(pwd);
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();//login button click
		
		
	}
	@DataProvider(name="LoginData")
	public String[][] getData(){
		String loginData[][]= {
				{"admin@yourstore.com","admin","Valid"},
				{"admin@yourstore.com","adm","Invalid"},
				{"adm@yourstore.com","admin","Invalid"},
				{"adm@yourstore.com","adm","Invalid"}
		};
		return loginData;
		
	}
	@AfterClass
	void tearDown() {
		driver.close();
	}
	

}
