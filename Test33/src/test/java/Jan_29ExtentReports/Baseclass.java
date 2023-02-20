package Jan_29ExtentReports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Helper.Utility;

public class Baseclass 

{
	WebDriver driver;
	@BeforeClass
	public void Setupapplication()
	{
		driver=Utility.startBrowser("chrome", "https://ineuron-courses.vercel.app/");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
