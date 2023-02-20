package Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrip2 {

	public static void main(String[] args) throws InterruptedException 
	
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
       WebElement warning2=driver.findElement(By.xpath("//span[text()='Required']"));
		
		String text2=warning2.getText();
		
		System.out.println("Required field is present for password:"+text2);
		
	}

}
