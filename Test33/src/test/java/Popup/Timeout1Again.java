package Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeout1Again {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
		
		driver.get("https://learn-automation.com/");
		
		
	}

}
