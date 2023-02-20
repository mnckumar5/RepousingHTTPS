package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit222 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebElement ele=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		String text=ele.getText();
		
		System.out.println(text);
		
		System.out.println(ele.isDisplayed());
		
		driver.quit();
		
		
	}

}
