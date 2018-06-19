package selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	
	    public class GeckoDriver {
		// http://newtours.demoaut.com/
		public static void main(String[] args) {
			String driverPath = "C:/Users/ovarz/Desktop/geckodriver.exe";
			String url = "http:// /";
			System.setProperty("webriver.gecko.driver", driverPath);
			WebDriver driver = new FirefoxDriver();
			driver.get(url);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("userName")).sendKeys("invalidUN");
			driver.findElement(By.name("password")).sendKeys("invalidPW");
			driver.findElement(By.name("login")).click();
			
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
			driver.findElement(By.name("reserveFlights")).click();
			driver.findElement(By.name("passFirst0")).sendKeys("Jimmy");
			driver.findElement(By.name("passLast0")).sendKeys("Azmat");
			driver.findElement(By.name("passFirst1")).sendKeys("Raiden");
			driver.findElement(By.name("passLast1")).sendKeys("Venus");
			
			Select card = new Select(driver.findElement(By.name("creditCard")));
			card.selectByIndex(3);
			
			driver.findElement(By.name("creditnumber")).sendKeys("123654798452131");
			
			Select mnth = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
			mnth.selectByIndex(9);
			
			Select year = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
			year.selectByIndex(10);
			
			driver.findElement(By.name("buyFlights")).click();
			
		}
	}
