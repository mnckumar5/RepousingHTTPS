package Popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anotherwindow9 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		driver.manage().window().maximize();
		
		String Phan=driver.getWindowHandle();
		
		System.out.println(Phan);
		
        driver.findElement(By.xpath("(//img)[3]")).click();
		
		driver.findElement(By.xpath("(//img)[2]")).click();
		
		Set<String> Var4=driver.getWindowHandles();
		
		List<String> Allhan=new ArrayList<String>(Var4);
		
		System.out.println(Allhan);
		
		driver.switchTo().window(Phan);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(Allhan.get(1));
		
		Thread.sleep(3000);
		
         driver.switchTo().window(Allhan.get(2));
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
