package seleniumtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TesngTest {
	WebDriver driver;
	
  @Test(priority=1, invocationCount=3)
  public void crmproLoginPageTitleTest() {
	  String loginPageTitle = driver.getTitle();
	  Assert.assertEquals(loginPageTitle, "CRMPRO - CRM software for customer relationship management, sales, and support.");
  }
  
  @Test(priority=2)
  public void loginToApplicationTest() {
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("nkesav");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("kavish@123");
		WebElement ele = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver; // down casting
		js.executeScript("arguments[0].click();",ele);
		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO");
  }
  
  @BeforeMethod
  public void browserSetup() {
	  	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.crmpro.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
}
