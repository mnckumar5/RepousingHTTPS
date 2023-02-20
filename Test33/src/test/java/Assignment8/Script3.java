package Assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

	public static void main(String[] args) 
	
	{
		 WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Test");
		
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("user");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9999999999");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password");
		
		driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		driver.findElement(By.xpath("//select[@id='year']"));
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.xpath("//label[text()='Male']"));
		
		driver.findElement(By.xpath("//label[text()='Custom']"));
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		

	}

}
