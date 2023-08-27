package Popups;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AssignmentNotificationPopup {
	 static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 }
	 public static void main(String[] args) throws InterruptedException {
			ChromeOptions options = new ChromeOptions();
		 	options.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://pib.gov.in/indexd.aspx");
			Thread.sleep(4000);
			driver.switchTo().alert().accept();
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//a[text()='Ministry of Commerce & Industry ']")).click();
			//Thread.sleep(4000);
			driver.switchTo().alert().accept();
			
	 }

}

