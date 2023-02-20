package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.Utility;

public class SeleniumwithTestNG 

{
	
	WebDriver driver;
		
	@Test(priority=1)
	public void URL()
	{
		driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
	}
	
	@Test(priority=2)
	public void title()
	{
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Courses"));
	}
	
	@Test(priority=3)
	public void URLAddress()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("vercel"));
		
	}
	
	@Test(priority=7)
	public void quit()
	{
		driver.quit();
	}
	
	@Test(priority=4)
	public void footercount()
	{
        System.out.println("Thread number 2 "+Thread.currentThread().getId());
		
		System.out.println("Thread name of 2 is "+Thread.currentThread().getName());
		Utility.waitforseconds(5);
		List<WebElement>  emnt=driver.findElements(By.xpath("//img"));
		int count=emnt.size();
	    Assert.assertEquals(4, 4);
	}

	@Test(priority=5)
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("ineuron@ineuron.ai");
		
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("ineuron");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		String text=driver.findElement(By.xpath("//h1[.='iNeuron Courses']")).getText();
		
		Assert.assertTrue(text.contains("Neuron"));
	}
	@Test(priority=6)
	public void logout()
	{
		Utility.waitforseconds(5);
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		Utility.waitforseconds(5);
		String text=driver.findElement(By.xpath("//h2[@class='header']")).getText();
		Utility.waitforseconds(5);
		Assert.assertTrue(text.contains("IN"));
		
	}
	
	
	
	
	
}
