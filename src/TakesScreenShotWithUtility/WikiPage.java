package TakesScreenShotWithUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WikiPage {

	WebDriver driver;
	@Test(priority=1)
  public void OpenPage(){
	  
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\chromedriver_win32\\chromedriver.exe");

		driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		
  }
	@Test(priority=2)
	  public void getUrl(){
	 driver.get("https://en.wikipedia.org/wiki/Finance_Commission");
	 
	 WebElement tenth=driver.findElement(By.xpath("//*[@id='mw-content-text']/div/table[2]/tbody/tr[11]/td[1]/a"));
	 JavascriptExecutor obj=(JavascriptExecutor)driver;
	 obj.executeScript("arguments[0].scrollIntoView(true)",tenth);
			
	 ScreenShotUtility.ScreenShot(driver, "tenth");
	 
	}

	@Test(priority=3)
	  public void clickonTalk() throws Exception{
	
		driver.findElement(By.xpath("//*[@id='ca-talk']/span/a")).click();
		Thread.sleep(2000);
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("scroll(0,650)");
		 ScreenShotUtility.ScreenShot(driver, "TalkPagedown");
		obj.executeScript("scroll(0,10)");
		 ScreenShotUtility.ScreenShot(driver, "TalkPageup");
		 
		

	}
	@Test(priority=3)
	  public void close(){
		driver.quit();
	}
	
}
