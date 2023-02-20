package Jan22ndScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Helper.Utility;

public class Crossbrowser 

{
	@Parameters("Browser")
	@Test
	public void login(String browserName)
	{
		WebDriver driver=Utility.startBrowser(browserName, "https://login.yahoo.com/");
		Reporter.log(driver.getCurrentUrl(),true);
		Reporter.log(driver.getTitle(),true);
		System.out.println("Thread id is"+Thread.currentThread().getId());
		System.out.println("Thread name is"+Thread.currentThread().getName());
		driver.quit();
	}

}
