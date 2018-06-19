package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationPractice {
	public static void main(String[] args) {
		String driverPath = "C:/Users/ovarz/Desktop/Automation tek/geckodriver.exe";
		String url = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();
		// id="email"
		driver.findElement(By.id("email")).sendKeys("roxvarzari@gmail.com");
		// passwd
		driver.findElement(By.id("passwd")).sendKeys("1234567890");
		driver.findElement(By.id("SubmitLogin")).click();
		// sf-with-ul
		driver.findElement(By.className("sf-with-ul")).click();
		driver.findElement(By.id("layered_category_4")).click();
		//layered_id_attribute_group_1
		driver.findElement(By.id("layered_id_attribute_group_1")).click();
        //layered_id_attribute_group_13
		driver.findElement(By.id("layered_id_attribute_group_13")).click();
		//color_1
		driver.findElement(By.id("color_1")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		By.xpath("//buttonclass[contains(text(),'exclusive')]");
		
		
	
	
	
	}
	
	
	
	
}