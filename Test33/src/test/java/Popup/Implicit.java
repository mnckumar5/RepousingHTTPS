package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		driver.manage().window().maximize();
		
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Click to see after 5s']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);
		
		
		Thread.sleep(7000);
		String alt=driver.switchTo().alert().getText();
		System.out.println(alt);
		
		driver.switchTo().alert().accept();
		
		

	}

}
