package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alignment {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int X1 = driver.findElement(By.id("username")).getLocation().getX();
		Thread.sleep(5000);
		int X2 = driver.findElement(By.name("pwd")).getLocation().getX();
		Thread.sleep(5000);
		if(X1==X2)
		{
			System.out.println("it is aligned properly");
		}
		else {
			System.out.println("it is not aligned properly");
		}
		driver.close();

	}

}
