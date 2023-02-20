package Assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement var3=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));

		String text=var3.getText();
		
		if(text.contains("Facebook helps you connect ")) 
		{
			System.out.println("Captured text is Present");
		}
		else
		{
			System.out.println("Captured text is not Present");
		}
	}

}
