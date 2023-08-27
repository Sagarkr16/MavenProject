package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       driver.findElement(By.linkText("Create new account")).click();
       driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Virat");
       driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("kohli");
       driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("test@test.com");
       driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("test@test.com");
       driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Ac123");
      WebElement day = driver.findElement(By.id("day"));
      Select s = new Select(day);
      //selectByIndex starts from 0
     s.selectByIndex(11);
     Thread.sleep(4000);
     WebElement month = driver.findElement(By.id("month"));
     Select s1 =new Select(month);
     s1.selectByIndex(0);
     Thread.sleep(4000);
   WebElement year = driver.findElement(By.id("year"));
   Select s2 = new Select(year);
   s2.selectByIndex(34);
   driver.findElement(By.xpath("//label[text()='Female']")).click();
     
     
}
}













//public static void main(String[] args) throws InterruptedException {
//	WebDriver driver=new ChromeDriver();
//    driver.get("https://www.facebook.com/");
//    boolean logo = driver.findElement(By.xpath("//img")).isDisplayed();
//    Thread.sleep(3000);
//    if(logo==true)
//    {
//    	System.out.println("logo is displayed");
//    }
//    else {
//    	System.out.println("logo is not displayed");
//    }
//    driver.quit();
//}
