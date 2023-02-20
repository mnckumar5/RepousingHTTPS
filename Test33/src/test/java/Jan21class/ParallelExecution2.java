package Jan21class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Helper.Utility;

public class ParallelExecution2 

{
	@Test
	public void test1()
	{
		System.out.println("Thread number 1 "+Thread.currentThread().getId());
		
		System.out.println("Thread name of 1 is "+Thread.currentThread().getName());
		
		Utility.waitforseconds(5);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
	
	@Test
	public void test2()
	{
		System.out.println("Thread number 2 "+Thread.currentThread().getId());
		
		System.out.println("Thread name of 2 is "+Thread.currentThread().getName());
		
		Utility.waitforseconds(5);
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.quit();
	}
	
	@Test
	public void test3()
	{
		System.out.println("Thread number 3 "+Thread.currentThread().getId());
		
		System.out.println("Thread name of 3 is "+Thread.currentThread().getName());
		
		Utility.waitforseconds(5);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.quit();
	}

}
