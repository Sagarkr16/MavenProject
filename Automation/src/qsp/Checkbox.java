package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean checkbox = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
		if(checkbox==true)
		{
			System.out.println("is present");
		}
		else {
			System.out.println("is absent");
		}
		driver.close();
	}

}
