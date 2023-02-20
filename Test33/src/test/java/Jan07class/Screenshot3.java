package Jan07class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class Screenshot3 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Utility.captureScreenshot(driver);
		
		driver.quit();

	}

}
