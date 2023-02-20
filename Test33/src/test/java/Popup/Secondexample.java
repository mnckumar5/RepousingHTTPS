package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Secondexample {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Click to see after 5s']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", element);
		
		for (int i=0;i<10;i++)
		{
		
		try
		{
		   Thread.sleep(1000);
		   org.openqa.selenium.Alert alt1=driver.switchTo().alert();
		   String text=alt1.getText();
		   System.out.println(text);
		   alt1.accept();
		   if (text.contains("code"))
		   {
			   break;
		   }
		} 
		catch(Exception e)
		{
			
			//System.out.println("Pop up not found");
			
			System.out.println("Pop up not found");
		}
		
		}
		//driver.quit();
		
}}

