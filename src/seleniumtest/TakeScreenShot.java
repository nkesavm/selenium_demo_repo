package seleniumtest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
	
	public static void captureImage(WebDriver driver, String imageName) throws Exception {
	
		TakesScreenshot ts = (TakesScreenshot) driver; // down casting
		
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
		Date d = new Date();
		String timeStamp = sdf.format(d);
		System.out.println("Current time is: " + timeStamp);
		
		File destFile = new File(System.getProperty("user.dir")+"/screenshots/"+imageName+"_"+timeStamp+".png");
		FileHandler.copy(scrFile, destFile);
		
	}

}
