package seleniumtest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HandleCalendar {
	
	HandleCalendar() {
		this(10);	
	}
	
	HandleCalendar(int a) {
		
	}
	
	void show() {
		
	}

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); 
		WebDriver driver = new HtmlUnitDriver();
		//driver.manage().window().maximize(); // used to maximize the browser
		driver.get("https://www.tnstc.in/TNSTCOnline/");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
//		
//		Thread.sleep(5000);
//		
//		System.out.println(driver.switchTo().alert().getText());
//		
//		driver.switchTo().alert().accept();
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String id : ids) {
			driver.switchTo().window(id);
		}
		
		
		//Anonymous object
		new HandleCalendar().show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String firstTab = driver.getWindowHandle();
//		System.out.println("First tab unique id: " + firstTab);
//		String secondTab = null;
//		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
//		
//		for(String s : driver.getWindowHandles()) {
//			if(!firstTab.equals(s)) {				
//			  driver.switchTo().window(s);
//			  secondTab = driver.getWindowHandle();
//			  System.out.println("Second tab unique id: " + secondTab);
//			}
//		}
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Hotel Stay')]")).click();
//		
//		for(String s : driver.getWindowHandles()) {
//			if(!firstTab.equals(s) && !secondTab.equals(s)) {				
//			  driver.switchTo().window(s);
//			  String ThirdTab = driver.getWindowHandle();
//			  System.out.println("Third tab unique id: " + ThirdTab);
//			}
//		}
//		
//		driver.switchTo().window(firstTab);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Thread.sleep(6000);
		
//		WebElement ele1 = driver.findElement(By.xpath("//div[@id='box1']"));
//		WebElement ele2 = driver.findElement(By.xpath("//div[@id='box101']"));
//		
//		Actions act = new Actions(driver);
		//act.moveToElement(ele).build().perform();
		
		//act.click(ele).keyDown(Keys.SHIFT).sendKeys("chennai").keyUp(Keys.SHIFT).build().perform();
		//act.contextClick(ele).sendKeys(Keys.ARROW_DOWN.ENTER).build().perform();
		//act.dragAndDrop(ele1, ele2).build().perform();
		
//		act.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
		
		
		
		
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		
		//driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement listBox = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
//		
//		Select sel = new Select(listBox);
//		sel.selectByVisibleText("Browser Commands");
//		sel.selectByVisibleText("Switch Commands");
//		//sel.deselectByVisibleText("Browser Commands");
//		sel.deselectAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
//		Thread.sleep(10000);
//		for(int j=1; j<3; j++) {
//			driver.findElements(By.xpath("//td[@class='next']/button")).get(1).click();
//		}
//		List<WebElement> ele = driver.findElements(By.cssSelector(".rb-monthTable.first.last>tbody>tr>td"));
//		int eleCount = ele.size();
//		for(int i=0; i<eleCount; i++) {
//				String date = ele.get(i).getText();
//				if(date.equals("20")) {
//					ele.get(i).click();
//				}
//		}

	}

}
