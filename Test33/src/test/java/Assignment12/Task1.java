package Assignment12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		Actions act=new Actions(driver);
		
		//WebElement element4=driver.findElement(By.xpath("//div[@id='mCSB_3']"));
		
		WebElement element5=driver.findElement(By.xpath("//div[@class='mCSB_dragger_bar']"));
		
		Actions bar=act.moveToElement(element5);
		
		bar.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		//act.sendKeys(Keys.PAGE_DOWN).perform();
	}

}
