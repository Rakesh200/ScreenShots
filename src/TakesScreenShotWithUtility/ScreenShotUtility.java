package TakesScreenShotWithUtility;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenShotUtility {
	
	public static void ScreenShot(WebDriver driver,String Shots) {
		try {
		File Scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(Scr,new File("./ScreenShot/"+Shots+".png"));
		} catch (Exception e) {
			
			System.out.println("ScreenShot Error because of "+e.getMessage());
		}
	}

}
