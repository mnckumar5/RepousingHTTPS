package Jan07class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class Screenshot4 {

	public static void main(String[] args) 
	
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		
		Utility.captureScreenshot(driver);
		
		Utility.waitforseconds(3);
		
        Utility.captureScreenshot(driver);
		
		Utility.waitforseconds(3);
		
        Utility.captureScreenshot(driver);
		
		Utility.waitforseconds(3);
		
		Utility.captureScreenshot(driver);
		
				
		driver.quit();

	}

}
