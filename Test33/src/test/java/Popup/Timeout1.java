package Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeout1 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		
		driver.get("https://learn-automation.com/");
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		//river.manage().timeouts().scriptTimeout(Duration.ofSeconds(300));
		
		

	}

}
