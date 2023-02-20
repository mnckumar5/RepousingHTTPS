package Popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindowexample {

	public static void main(String[] args) 
	
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		String Parentwin=driver.getWindowHandle();
		
		System.out.println(Parentwin);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.facebook.com/");
		
		Set<String> set5=driver.getWindowHandles();
		
		System.out.println(set5);
		
		driver.switchTo().window(Parentwin);
		
		

	}

}
