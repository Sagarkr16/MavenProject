package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnDropdown {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
			driver.findElement(By.id("policynumber")).sendKeys("123");
			driver.findElement(By.id("dob")).click();
		//	ele.click();
			Thread.sleep(4000);
			WebElement y = driver.findElement(By.className("ui-datepicker-year"));
			Select s = new Select (y);
			s.selectByIndex(29);
			Thread.sleep(4000);
			WebElement m = driver.findElement(By.className("ui-datepicker-month"));
			Select month = new Select(m);
			month.selectByIndex(2);
			driver.findElement(By.xpath("//a[text()='29']")).click();
			driver.findElement(By.id("alternative_number")).sendKeys("98765438");

			
			
			
		}

	}