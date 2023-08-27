package qsp;

import java.lang.String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver ,10);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		System.out.println( driver.getCurrentUrl());
		}
	}



