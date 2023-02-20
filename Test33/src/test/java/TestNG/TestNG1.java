package TestNG;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG1 

{
	WebDriver driver;
	
	@Test(priority=1)
public void startbrowser()
{
    driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
}
	@Test(priority=3)
	public void VerifyURL()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"),"Wrong URL");
	}
	@Test(priority=2)
	public void Verifytitle()
	{
		String title=driver.getTitle();
		
		Assert.assertTrue(title.contains("Google"),"Wrong Title");
	}
	@Test(priority=4)
	public void quit()
	{
		driver.quit();
	}
}
