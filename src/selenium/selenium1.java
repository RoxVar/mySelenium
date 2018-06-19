package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class selenium1 {
	public static void main(String[]args) {
	
	String path = "C:/Users/ovarz/Desktop/chromedriver.exe";
	String url = "https://www.google.com";
    System.setProperty("webdriver.chrome.driver",path);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.get("https://accounts.google.com/signin");
	WebElement element = driver.findElement(By.name("identifier"));
	element.sendKeys("roxvarzari@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	WebDriverWait wait = new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.elementToBeClickable(password));
    password.sendKeys("888888888");
    driver.findElement(By.id("passwordNext")).click();; 
    driver.findElement(By.className("WaidBe")).click();
    WebDriverWait wait1 = new WebDriverWait(driver,5);
    driver.findElement(By.cssSelector(".T-I.J-J5-Ji.T-I-KE.L3")).click();
    driver.findElement(By.id(":5y")).sendKeys("roxvarzari@gmail.com");
    driver.findElement(By.id(":6f")).sendKeys("hi,i'm a test mail");
    WebDriverWait wait3 = new WebDriverWait(driver,5);
    driver.findElement(By.cssSelector("T-I J-J5-Ji aoO T-I-atl L3 T-I-Zf-aw2")).click();;
       
    
	
} 
}