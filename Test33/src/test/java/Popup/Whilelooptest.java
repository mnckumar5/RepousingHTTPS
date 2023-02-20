package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whilelooptest {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		String parent=driver.getWindowHandle();
		
		System.out.println(parent);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//img)[3]")).click();
		
		Set<String> ALlwind=driver.getWindowHandles();
		
		System.out.println(ALlwind);
		
		
		Iterator<String> itr=ALlwind.iterator();
		
		while(itr.hasNext())
		{
			String child=itr.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
				
			}
			
			driver.switchTo().window(parent);
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
		}
		
		

	}

}
