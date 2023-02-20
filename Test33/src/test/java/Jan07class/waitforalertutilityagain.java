package Jan07class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utilityagain;

public class waitforalertutilityagain {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alt1=Utilityagain.webdriverwait(driver);
		
		String text=alt1.getText();
		
		System.out.println(text);
		
		alt1.accept();
		
		driver.quit();

	}

}
