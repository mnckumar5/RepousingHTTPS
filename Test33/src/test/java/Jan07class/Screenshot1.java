package Jan07class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("./Screen1.png");
		
		try
		{
			FileHandler.copy(src, Destination);
		}catch(IOException e)
		{
			System.out.println("Some error is present");
		}
		         
		
		driver.quit();
	}

}
