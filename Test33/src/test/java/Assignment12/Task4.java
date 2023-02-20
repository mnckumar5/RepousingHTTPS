package Assignment12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) 
	
	{
WebDriver driver=new ChromeDriver();
		
		//driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
				
		String s = "https://ineuron-courses.vercel.app/";
	      String scrpt = "window.location = \'"+s+"\'";
	      js.executeScript(scrpt);
	      System.out.println("Page navigated to:" + driver.getTitle());
	      
	      
	}

}
