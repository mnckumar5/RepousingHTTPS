package Jan08class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Helper.Utility;

public class Actions2 {

	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame3=driver.findElement(By.xpath("//iframe"));
		
		driver.switchTo().frame(frame3);
		
		WebElement Src=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		
		Utility.waitforseconds(4);
		
		//act.dragAndDrop(Src, dest).perform();
		
		Utility.waitforseconds(4);
		
		act.clickAndHold(Src).pause(4).moveToElement(dest).pause(5).release(dest).build().perform();
		
		driver.quit();
		
		
		
		
	}

}
