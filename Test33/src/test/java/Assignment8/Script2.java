package Assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) 
	
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		
		for (WebElement var3:alllinks) 
		
		{
			String text1=var3.getText();
			System.out.println("Links are :"+text1);
			if(text1.contains("Create a Page")) 
			{
				System.out.println("Create a Page is present- Clicking on the Link");
				
				driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
				
				break;
			}
		}

	}

}
