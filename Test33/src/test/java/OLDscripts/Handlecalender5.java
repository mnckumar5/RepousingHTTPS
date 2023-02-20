

package OLDscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Handlecalender5 {

	public static void main(String[] args)
	
	{
		
         WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
       List<WebElement> months=driver.findElements(By.xpath("//span[contains(@class,'month')]"));
        
        for (WebElement var1:months) 
        
        {
        	String text=var1.getText();
        	System.out.println(text);
        	driver.findElement(By.xpath("//span[text()='Next']")).click();
        	if(text.contains("November"))
        	{
        		break;
        	}
        	
        }
		
		//String year=driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();

	}

}
