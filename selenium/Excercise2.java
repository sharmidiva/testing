package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excercise2 {

	//this is for subjects textbox
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new  ChromeDriver();
		//driver.findElement(By.xpath("//div[@id=\"subjectsContainer\"]")).sendKeys("testing");
		//driver.findElement(By.cssSelector("input[id='subjectsContainer']")).sendKeys("xxxx");
		//driver.findElement(By.id("subjectsContainer")).sendKeys("xxxx");
		//driver.findElement(By.xpath("//div[@class=\" css-2b097c-container\"]")).sendKeys("ccccc");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]")).sendKeys("zzzz");
		//*[@id="subjectsContainer"]/div/div[1]
		
		//Creating the JavascriptExecutor interface object by Type casting		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		driver.get("https://demoqa.com/automation-practice-form");

		

		//js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		
	
		

	}

}
