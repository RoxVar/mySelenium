package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon {
	public static void main(String[] args) {
		/**
		 * Open google
		 * insert amazon
		 * click search btn
		 * on amazon insert alexa
		 * click on search
		 * verify title
		 * 
		 * */ 
		String driverPath = "C:/Users/sarda/Desktop/chromedriver.exe";
		String url = "https://www.google.com";
		System.setProperty("wedriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//lst-ib
		driver.findElement(By.id("lst-ib")).sendKeys("amazon");
		//btnK
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.partialLinkText("Amazon.com: Online Shopping")).click();
		//twotabsearchtextbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("alexa");
		//nav-input
		driver.findElement(By.className("nav-input")).click();
		//Echo Dot
		driver.findElement(By.partialLinkText("Echo Dot")).click();
		String title = driver.getTitle();
		if (title.contains("Echo Dot")) {
		System.out.println("Test Pass");
		} else {
		System.out.println("Test Fail");
		}
		driver.close();
		}
		}


