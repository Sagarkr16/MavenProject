package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentOnMouseHover {
	 static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 }
	 public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.vtiger.com/");
			 Actions action = new Actions(driver);
			 WebElement element = driver.findElement(By.partialLinkText("Resources"));
			 action.moveToElement(element).perform();
			 driver.findElement(By.partialLinkText("Customers")).click();
			 WebElement ele = driver.findElement(By.id("loginspan"));
			 action.doubleClick(ele).perform();
			// driver.findElement(By.xpath("//button[text()='Sign in']"));
			String text = driver.getTitle();	
			Boolean bool = wait.until(ExpectedConditions.titleContains("Login - Vtiger"));
			 System.out.println(text);
			//System.out.println(bool);
			 

}
}
