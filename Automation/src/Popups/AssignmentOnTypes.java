package Popups;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnTypes {
	 static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 }
	 public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[@class='topMenuButton preventPanelsHiding'][3]")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Set<String> wid = driver.getWindowHandles();
		for(String w:wid)	{
		
			driver.switchTo().window(w);
			
		}	
		List<WebElement> ele = driver.findElements(By.xpath("//h2"));
		for(WebElement e1:ele) {
			String text = e1.getText();
			System.out.println(text);
		}
	 }

}