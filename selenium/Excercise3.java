package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excercise3 {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		//select month
		WebElement selmonth=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select sem=new Select(selmonth);
		sem.selectByIndex(4);
		Thread.sleep(3000);		


		//select year
		WebElement selyr=driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
		
		Select sey=new Select(selyr);
		sey.selectByValue("2022");
		Thread.sleep(5000);	
		
		//select may-1-2022
		driver.findElement(By.xpath("//*[@aria-label=\"Choose Sunday, May 1st, 2022\"]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		

		

	}
	}


