package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Log in ']")).click();
		
		driver.switchTo().defaultContent();
		
		

	}

}
