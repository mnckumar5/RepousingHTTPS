package Jan14th;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) 
	
	{
       ChromeOptions opt=new ChromeOptions();
		
		opt.setHeadless(true);
		
		
       WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		WebDriverWait var=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		Alert alt=var.until(ExpectedConditions.alertIsPresent());
		
		String text=alt.getText();
		
		System.out.println(text);
		
		alt.accept();
		
		driver.quit();

	}

}
