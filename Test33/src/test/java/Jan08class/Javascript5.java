package Jan08class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class Javascript5 {

	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		WebElement UN=driver.findElement(By.xpath("//input[@id='login-username']"));
		
		WebElement CB=driver.findElement(By.xpath("//input[@id='persistent']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		
		js.executeScript("arguments[0].value=arguments[2]", UN,"Chandan@gmail.com","narayana@yahoo.com");
		
		js.executeScript("arguments[0].click()", CB);
		
	
		
		Utility.waitforseconds(9);
		
		driver.quit();

	}

}
