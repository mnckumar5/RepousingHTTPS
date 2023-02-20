package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG2 

{
	
	WebDriver driver;
	
	@Test(priority=1)
	public void Startbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=2)
	public void verifytitle()
	{
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Google"),"Wrong title");
	}

	@Test(priority=3)
	public void VerifyURL()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("com"),"Wrong URL");
		 System.out.println("Thread number 3 "+Thread.currentThread().getId());
			
			System.out.println("Thread name of 3 is "+Thread.currentThread().getName());
		
		driver.quit();
	}
	
}
