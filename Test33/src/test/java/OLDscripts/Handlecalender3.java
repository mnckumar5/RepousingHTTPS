

package OLDscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecalender3 {

	public static void main(String[] args) throws InterruptedException 
	
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'24')]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//h3[contains(text(),'How to handle calendar in Selenium Webdriver')]")).click();
		
		Thread.sleep(3000);
		
		WebElement text=driver.findElement(By.xpath("//h3[contains(text(),'How to handle calendar in Selenium Webdriver')]"));
		
		String text1=text.getText();
		
		System.out.println("text value is :"+text1);
		
		driver.quit();
		
		
		


	}

}
