package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HighlightWebElement {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(); 
				driver.manage().window().maximize(); // used to maximize the browser
				driver.get("https://www.facebook.com");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(driver.getTitle());
				WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Cookies')]"));
				//hightLight(ele,driver); // highlight the web element
				//drawBorder(ele,driver);
				//generateAlert(driver,"Some issue in login button");
				//clickElementByJavaScript(ele,driver);
				ele.click();
				//scrollPage(driver);
				WebElement ele1 = driver.findElement(By.xpath("//h3[contains(text(),'Where do we use cookies?')]"));
				scrollIntoView(ele1,driver);
	}
	
	public static void hightLight(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgcolour = element.getCssValue("backgroundColor");
		for(int i=0; i<100; i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolour,element,driver);
		}
	}
	
	public static void changeColor(String color, WebElement ele, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", ele);
		try {
			Thread.sleep(20);
		} catch(Exception e) {
			
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJavaScript(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void scrollPage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}

}
