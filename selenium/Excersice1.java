package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excersice1 {
	//locators to practice 

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new  ChromeDriver();
		
		//WebDriver driver1= WebDriverManager.chromedriver().create(); 
		//driver1.get("https://www.toolsqa.com/");
		
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		//1. find the element by (id) for the name and sending the keys into it
		driver.findElement(By.id("firstName")).sendKeys("ssss");
		
		//2. find the element by (css selector) for last name 
		driver.findElement(By.cssSelector("input[id=lastName]")).sendKeys("dddd");
		
		//3.by class name
		driver.findElement(By.className("practice-form-wrapper"));
		
		//4.cssSelector for mobile number
		
		driver.findElement(By.cssSelector("#userNumber")).sendKeys("1111");
		
		//5.by xpath for email
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("hello@hello.com");
		
		//6.css selector for current address
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Welcome");
		
		//7.radio button for gender
		WebElement w1=driver.findElement(By.xpath("//label[text()='Female']"));
		w1.click();
		
		
		//8.checkbox for hobbies
		
		
		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-2\"]")).click();
		Thread.sleep(3000);
		
		//9.upload a file 
		WebElement uploadf=driver.findElement(By.id("uploadPicture"));
		//input[@id="uploadPicture"]
		uploadf.sendKeys("/Users/diva/javascript/index.html");
		
		
	
		

	}

}
