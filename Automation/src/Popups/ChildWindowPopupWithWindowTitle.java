package Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopupWithWindowTitle {
	 static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 }
	 public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.linkText("actiTIME Inc.")).click();
			Set<String> wid = driver.getWindowHandles();
			int count = wid.size();
			System.out.println(count);
			
			for(String w:wid) {
				String title = driver.switchTo().window(w).getTitle();
				System.out.println(title);
				Thread.sleep(4000);
				driver.close(); 
			}
			
			

}
}
