package com.inetBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Page Object Model for Login page
public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){//remote driver
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}//constructor
	@FindBy(name="uid")
	WebElement txtuname;
	@FindBy(name="password")
	WebElement txtpwd;
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	//@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	//@FindBy(xpath="//a[contains(text(),'Log out')]")
	@FindBy(xpath="//a[text()='Log out']")
	WebElement btnlogout;
	
	
	
	

	//action methods for all 3 WebElements
	
	public void setUname(String uname) {
		txtuname.sendKeys(uname);
	}
	public void setPwd(String pwd) {
		txtpwd.sendKeys(pwd);
	}
	public void clickSubmit() {
		/*WebElement btnLogin = ldriver.findElement(By.xpath("//input[@name=\"btnLogin\"]"));
		JavascriptExecutor jse =(JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()",btnLogin);*/
		btnLogin.submit();
		
	
	}

	public void clickLogout() {
		// TODO Auto-generated method stub
		JavascriptExecutor jse =(JavascriptExecutor)ldriver;
		jse.executeScript("arguments[0].click()",btnlogout);
		
		//btnlogout.click();
		
	}
	
	

}
