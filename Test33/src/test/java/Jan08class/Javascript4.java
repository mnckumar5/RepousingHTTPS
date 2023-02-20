package Jan08class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class Javascript4 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement emnt=driver.findElement(By.xpath("//input[@id='pass']"));
		
		WebElement emnt1=driver.findElement(By.xpath("//input[@id='fname']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].click", emnt);
		
		js.executeScript("arguments[0].value=arguments[1]", emnt1,"Ravi","Madhu");
		
		js.executeScript("arguments[0].value=arguments[2]", emnt,"chandan","Narayana");
		
		
		Utility.waitforseconds(12);
		
		
		
		driver.quit();
		
		
		
		

	}

}
