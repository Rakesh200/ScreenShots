package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class drivers {
  static WebDriver driver;
	public static  void chromebrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\chromedriver_win32\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		
			}
	
	public  static void firefox(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		
	}
	
	public static void maximize(){
		 driver.manage().window().maximize();
	}

}
