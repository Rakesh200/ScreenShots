package drivers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class demo {
	static WebDriver driver;
	
	@Test
	public void open1(){
		
		drivers.chromebrowser();
		
		System.out.println("opend");
	}

}
