package Jan28DDTviaExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.testng.annotations.Test;


public class Seleniumupdate 

{
	@Test
	public void test33()
	{
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--headless");
		opt.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
	}
	

}
