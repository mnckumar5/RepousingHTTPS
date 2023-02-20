
package OLDscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement element3=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act1=new Actions(driver);
		
		act1.moveToElement(element3).perform();
		
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
				

	}

}
