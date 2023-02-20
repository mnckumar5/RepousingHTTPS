package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1again {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Log in ']")).click();
		
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//button[text()='Log in ']")).click();

	}

}
