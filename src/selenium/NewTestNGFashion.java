package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

@Test (priority = 1)
 public class NewTestNGFashion {
	static WebDriver driver;
  public void login() {
	  driver.findElement(By.className("login")).click();
		// id="email"
		driver.findElement(By.id("email")).sendKeys("roxvarzari@gmail.com");
		// passwd
		driver.findElement(By.id("passwd")).sendKeys("1234567890");
		driver.findElement(By.id("SubmitLogin")).click();}
		
 @Test (priority = 2)
		public void choseItem() {
	 driver.findElement(By.className("sf-with-ul")).click();
		driver.findElement(By.id("layered_category_4")).click();
		//layered_id_attribute_group_1
		driver.findElement(By.id("layered_id_attribute_group_1")).click();
     //layered_id_attribute_group_13
		driver.findElement(By.id("layered_id_attribute_group_13")).click();
		//color_1
		driver.findElement(By.id("color_1")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);}
 @Test (priority =3)
 public void addToCart() {
	 By by = By.xpath("//span[.='Button']");
 }
 @Test (priority = 4)
 public void Checkout() {
	 By by1 = By.xpath("//span[.='btn btn-default button button-medium']");
 //button btn btn-default standard-checkout button-medium
	 By by2 = By.xpath("//span[.='button btn btn-default standard-checkout button-medium']");
	
	 By.xpath("//button[contains(text(),'Submit')]");
	 //<input name="cgv" id="cgv" value="1" type="checkbox">
	 driver.findElement(By.xpath("input[@value='2']")).click();
	 
	
	 
 }

@BeforeMethod
		  public void beforeMethod() {
			  String path = "C:/Users/ovarz/Desktop/Automation tek/geckodriver.exe";
				String url = "http://automationpractice.com/index.php";
				System.setProperty("webdriver.gecko.driver",path);
			 driver = new FirefoxDriver();
				driver.get(url);
		  }  
		@AfterMethod
		  public void afterMethod() {
			  driver.close();
		  }
}
			
		
		
		
		
