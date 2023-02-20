package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitanother {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://ineuron-courses.vercel.app/practise");
		
		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("dddd"));
	}

}
