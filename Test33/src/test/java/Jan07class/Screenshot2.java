package Jan07class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File  dest=new File("./screen2.png");
		
		try
		{
			FileHandler.copy(src, dest);
			//FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("./screen2.png"));
			
		}catch(IOException e)
		{
			System.out.println("Some issue is there,Please check");
		}
		
		
        driver.quit();
	}

	
}
