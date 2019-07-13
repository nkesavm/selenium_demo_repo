package seleniumtest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
//		
//		ChromeOptions options = new ChromeOptions();
//		options.merge(cap);
//		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.101:4444/wd/hub"), cap);
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("window-size=1400,800");
		//options.addArguments("headless");
		//WebDriver driver = new ChromeDriver(options); 
		//WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize(); // used to maximize the browser
		driver.get("https://www.facebook.com/");
		System.out.println("The browser title: " + driver.getTitle());
		System.out.println("The URL is " + driver.getCurrentUrl());
		
		driver.findElement(By.cssSelector("input[id=u_0_j]")).sendKeys("Payilagam");
		System.out.println("The first name text box value is :" + driver.findElement(By.cssSelector("input[id=u_0_j]")).getAttribute("value"));
		
		System.out.println("The text is: " + driver.findElement(By.cssSelector(".mbs._52lq.fsl.fwb.fcb>span")).getText());
		
		Select sel = new Select(driver.findElement(By.cssSelector("#day")));
		sel.selectByVisibleText("30");
		
		Select sel1 = new Select(driver.findElement(By.cssSelector("#month")));
		sel1.selectByValue("11");
		
		Select sel2 = new Select(driver.findElement(By.cssSelector("#year")));
		sel2.selectByIndex(20);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//input[@id='Form_submitForm_FirstName']")).sendKeys("Payilagam");
//		
//		driver.findElements(By.xpath("//input[starts-with(@id,'Form')]")).get(2).sendKeys("facebook");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
//		driver.findElement(By.partialLinkText("account?")).click();
//		
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("afafffefef");
		
		
//		WebElement firstNameTextBox = driver.findElement(By.id("u_0_j"));
//		
//		firstNameTextBox.sendKeys("Payilagam");
//		Thread.sleep(3000);
//		firstNameTextBox.clear();
//		Thread.sleep(3000);
//		firstNameTextBox.sendKeys("Payilagam1");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.className("inputtext")).sendKeys("Payilagam1");
//		driver.findElement(By.className("inputtext")).sendKeys("Payilagam2");
//		driver.findElements(By.className("inputtext")).get(0).sendKeys("ehfjfifafhehe");
//		driver.findElements(By.className("inputtext")).get(1).sendKeys("ehfjfifafhehe");
		
//		int count = driver.findElements(By.tagName("a")).size();
//		System.out.println("No.of links: " + count);
//		
//		//driver.findElement(By.id("u_0_j")).sendKeys("Payilagam");
//		driver.findElement(By.id("u_0_l")).sendKeys("Payilagam");
//		driver.findElement(By.name("reg_email__")).sendKeys("1231231234");
//		driver.findElement(By.name("reg_passwd__")).sendKeys("test@123");
		
		//driver.close();
		
	}

}
