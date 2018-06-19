package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homeDepotPractice {
	public static void main(String[]args) {
		
		String path = "C:/Users/ovarz/Desktop/geckodriver.exe";
		String url = "https://www.google.com";
	    System.setProperty("webdriver.gecko.driver",path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.get("http://www.costco.com");
		WebDriverWait wait = new WebDriverWait(driver,5);
		driver.findElement(By.id("header_sign_in")).click();
		//logonId
		  driver.findElement(By.id("logonId")).sendKeys("vievar1@gmail.com");
		//logonPassword
		  driver.findElement(By.id("logonPassword")).sendKeys("*****");
		  driver.findElement(By.className("primary")).click();
		//myaccount-d
			WebDriverWait wait1 = new WebDriverWait(driver,3);
			driver.findElement(By.id("myaccount-d")).click();
			WebDriverWait wait2 = new WebDriverWait(driver,3);
		  Select Myorders = new Select(driver.findElement(By.id("myaccount-d")));
		  Myorders.selectByIndex(5);
		  
		
		
		
		
}}

