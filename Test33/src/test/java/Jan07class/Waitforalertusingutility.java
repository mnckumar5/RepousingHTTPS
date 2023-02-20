package Jan07class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;


public class Waitforalertusingutility {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alt=Utility.waitforalert(driver,15);
		
		String text=alt.getText();
		
		System.out.println(text);
				
		driver.quit();
		
		

	}

}
