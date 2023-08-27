package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static WebDriver driver;
@BeforeClass(groups={"RegressionTest","SmokeTest"})
public void openBrowser() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://demo.actitime.com");
	Reporter.log("openBrowser",true);
}
@AfterClass(groups={"RegressionTest","SmokeTest"})
public void closeBrowser() {
	driver.quit();
	Reporter.log("closeBrowser",true);
}
@BeforeMethod(groups={"RegressionTest","SmokeTest"})
public void login() {
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Reporter.log("login",true);
}
@AfterMethod(groups={"RegressionTest","SmokeTest"})
public void logout() {
	driver.findElement(By.id("logoutLink")).click();
	Reporter.log("logout",true); 
	
}
}
