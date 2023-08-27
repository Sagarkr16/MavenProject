package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AssignmentOnPrintPopup {
	 static {
		 System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	 }
	 public static void main(String[] args) throws InterruptedException, AWTException {
		 
		 WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.get("https://www.selenium.dev/");
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_P);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(4000); 
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_1);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_MINUS);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_2);
		 Thread.sleep(4000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		
		 
	 } 
}
