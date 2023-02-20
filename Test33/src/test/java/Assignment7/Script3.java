package Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

	public static void main(String[] args) 
	
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mukesh");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement error=driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
		
		String text=error.getText();
		
		System.out.println(text);
		
	

	}

}
