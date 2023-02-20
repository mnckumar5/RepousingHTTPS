package Helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Utilityagain 

{
	
	public static Alert webdriverwait(WebDriver driver)
	{
		Alert alt=null;
		for (int i=0;i<15;i++)
		{
		try
		{
			alt=driver.switchTo().alert();
			break;
		}
		catch(NoAlertPresentException e)
		{
			System.out.println();
			waitinsec(15);
		
		}
		}
		return alt;
	}
	
	public static void waitinsec(int seconds)

	
	{
		try
		{
			Thread.sleep(seconds*1000);
		}
		catch(InterruptedException  e)
		{
			
		}
	}

	
	public static Alert webdriverwaitg(WebDriver driver,int num)
	
	{
		Alert alt=null;
		for (int i=0;i<num;i++)
		{
	   try
	   {
		   
	   }catch(NoAlertPresentException e)
	   {
		   System.out.println("waiting for alert");
		   waitinsec(20);
	   }
		}
		return alt;
	}
	
}
	
	