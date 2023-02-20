package Jan07class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverwait4 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
        	
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		boolean var=wait.until(ExpectedConditions.titleContains("tetx"));
		
		boolean var2=wait.until(ExpectedConditions.urlContains("tetx"));
		
	
	}

}
