package Jan08class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Helper.Utility;

public class Action1 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame1);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		
		Utility.waitforseconds(4);
		
		Actions act=new Actions(driver);
		
		//act.dragAndDrop(drag, drop).perform();
		
		//act.clickAndHold(drag).pause(2000).moveToElement(drop).release(drop).build().perform();
		
		act.clickAndHold(drag).pause(3000).moveToElement(drop).pause(2000).release(drop).build().perform();
		
		
		Utility.waitforseconds(9);

		 driver.quit();
	}

}
