package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

@Test (priority = 1)
public class NewTestTestNG {
	static WebDriver driver;
  public void login() {
	  driver.findElement(By.name("userName")).sendKeys("invalidUN");
	  driver.findElement(By.name("password")).sendKeys("invalidPW");
	  driver.findElement(By.name("login")).click();
	  }
 @Test (priority = 2)
	  public void findFlight() {

		Select passcount = new Select(driver.findElement(By.name("passCount")));
		passcount.selectByIndex(1);
		
		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByVisibleText("New York");
		
		Select toPort = new Select(driver.findElement(By.name("toPort")));
		toPort.selectByVisibleText("San Francisco");
		
		driver.findElement(By.name("servClass")).click();
		
		Select airLine = new Select(driver.findElement(By.name("airline")));
		airLine.selectByVisibleText("Blue Skies Airlines");

		driver.findElement(By.name("findFlights")).click();
 }
	  		 
 
  @BeforeMethod
  public void beforeMethod() {
	  String path = "C://Users/ovarz/Desktop/Automation tek/chromedriver.exe";
		String url = "https://www.google.com";
	    System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[contains(text(),’NO,THANKS’)]"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
