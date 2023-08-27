import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertyFileAssignment {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			FileInputStream fis = new FileInputStream("./Data/commondata.properties");
			Properties pobj = new Properties();
			pobj.load(fis);
			String url = pobj.getProperty("url");
			String un = pobj.getProperty("username");
			String pw = pobj.getProperty("password");
			driver.get(url);
			Thread.sleep(4000);
			driver.findElement(By.id("username")).sendKeys(un);
			Thread.sleep(4000);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
