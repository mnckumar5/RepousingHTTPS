package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException 
	
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/practise");
		
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Click to show']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", element);
		
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		
		System.out.println(text);
		
		alert.accept();
		
		driver.quit();
		
		alert.dismiss();
		
		

	}

}
