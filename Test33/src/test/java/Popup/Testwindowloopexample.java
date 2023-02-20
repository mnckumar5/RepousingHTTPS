package Popup;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testwindowloopexample {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		String Pwindow=driver.getWindowHandle();
		
		System.out.println(Pwindow);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		Set<String> group=driver.getWindowHandles();
		
		System.out.println(group);
		
		Iterator<String> itr=group.iterator();
		
		while(itr.hasNext())
		{
			String child=itr.next();
			if (!Pwindow.equals(child))
				
			{
				driver.switchTo().window(child);
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
		
		

	}

}
