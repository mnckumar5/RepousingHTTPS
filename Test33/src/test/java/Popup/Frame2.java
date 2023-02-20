package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement framepath=driver.findElement(By.xpath("//iframe[contains(@src,'ineuron')]"));
		
				
		driver.switchTo().frame(framepath);
		
		driver.findElement(By.xpath("//button[text()='Log in ']")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='Log in ']")).click();
		
		
		
		
		

	}

}
