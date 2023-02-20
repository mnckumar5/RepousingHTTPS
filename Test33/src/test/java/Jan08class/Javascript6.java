package Jan08class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class Javascript6 {

	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("\r\n"
				+ "https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		WebElement texta=driver.findElement(By.xpath("//textarea[text()='textarea']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", texta);
		
		Utility.waitforseconds(4);
		
		texta.clear();
		
		texta.sendKeys("Om Namo Narayana");

	}

}
