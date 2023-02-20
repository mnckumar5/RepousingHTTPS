package Assignment12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Helper.Utility;

public class Task2 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://api.jquery.com/contextmenu/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe"));
		
		
		
		driver.switchTo().frame(frame);
		
		Utility.waitforseconds(4);
		
		WebElement Webelement=driver.findElement(By.xpath("//div"));
		
		Actions act=new Actions(driver);
		
		String colorbefore=Webelement.getCssValue("background-color");
		System.out.println("color before is"+colorbefore);
		
		act.contextClick(Webelement).perform();
		
		String colorafter=Webelement.getCssValue("background-color");
		System.out.println("color after is"+colorafter);
		
		driver.quit();

	}

}
