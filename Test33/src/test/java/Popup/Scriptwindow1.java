package Popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptwindow1 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		String pwindow=driver.getWindowHandle();
		
		System.out.println(pwindow);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		Set<String> handles=driver.getWindowHandles();
		
		System.out.println(handles);
		
		driver.switchTo().window(pwindow);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
	}

}
