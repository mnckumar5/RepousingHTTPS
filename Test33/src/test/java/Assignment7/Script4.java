package Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {

	public static void main(String[] args) 
	
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String url=driver.getCurrentUrl();
		
		if(url.contains("dashboard"))
		{
			System.out.println("URL contains Dashboard");
		}
		
		driver.findElement(By.xpath("(//img[@alt='profile picture'])[1]")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		
        String url1=driver.getCurrentUrl();
		
		if(url1.contains("login"))
		{
			System.out.println("Login Page");
		}
	
	}

}
