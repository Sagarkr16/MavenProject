package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	String tag = driver.findElement(By.id("pass")).getTagName();
	System.out.println(tag);
	if(tag.equals("a"))
	{
		System.out.println("a is present");
	}
	else
	{
		System.out.println("a is absent");
	}

}
}
