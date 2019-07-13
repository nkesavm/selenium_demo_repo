package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	@Parameters({"browserName"})
	@BeforeMethod
	  public void browserSetup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		  	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\firefoxdriver\\geckodriver.exe");
			  driver = new FirefoxDriver();
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	
	@Parameters({"username","password"})
	@Test
	  public void crmproLoginPageTitleTest(String username, String password) {
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	  }
}
