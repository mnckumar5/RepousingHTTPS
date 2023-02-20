package Jan14th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Helper.Utility;

public class Headless1 {

	public static void main(String[] args) 
	
	{
		ChromeOptions opt=new ChromeOptions();
		
		opt.setHeadless(true);
		
		
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
		
		Utility.waitforseconds(6);
		
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		System.out.println("Title is"+driver.getTitle());
		
		System.out.println("URL is"+driver.getCurrentUrl());
		
		//System.out.println("Title is"+driver.getPageSource());
		
		
		
		

	}

}
