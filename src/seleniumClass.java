package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumClass {
	public static void main(String[] args) {
        //open google
		//search amazon
		//in amazon let search alexa 
		//click on one of the item
		//get the title validation
		
		String path = "C:/Users/ovarz/Desktop/chromedriver.exe";
		String url = "https://www.google.com";
	    System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.get ("http://toolsqa.com/automation-practice-form/");
		WebElement element = driver.findElement(By.name("firstname"));
		element.sendKeys("Oxana");
		WebElement element1 = driver.findElement(By.name("lastname"));
		element1.sendKeys("Vanzari");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("datepicker")).sendKeys("05/28/2018");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		Select ctry =new Select(driver.findElement(By.id("continents")));
		ctry.selectByVisibleText("North America");
		
		
		
}
}
