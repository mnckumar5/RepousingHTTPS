

package OLDscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecalender4 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		List<WebElement> alloptions=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		
		for (WebElement var:alloptions)
		{
			String text=var.getText();
			
			System.out.println(text);
			
			if (text.contains("20"))
			{
				System.out.println("clicking on element");
				var.click();
				break;
			}
		}
		
		
		WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
		System.out.println("Date value is"+date.getAttribute("value"));
		
		driver.quit();

	}

}
