package Assignment5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addanddelete {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		Boolean button=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		
		System.out.println(button);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
	driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]")).click();
	
	//driver.findElement(By.xpath("//div[@id='Account']//option[@value='22']")).click();
	
	driver.findElement(By.xpath("//span[contains(text(),'Admin')]")).click();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement element1=driver.findElement(By.xpath("(//div[contains(@class,'oxd-autocomplete-text')])[1]"));
	
	//driver.findElement(By.xpath("(//div[contains(@class,'oxd-autocomplete-text')])[1]")).sendKeys("A");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].value='A'",element1);
	
	Thread.sleep(12000);
	
	driver.findElement(By.xpath("//span[contains(text(),'Odis  Adalwin')]")).click();
	
	Thread.sleep(12000);
	
	driver.findElement(By.xpath("(//div[text()='-- Select --'])[2]")).click();
	
	driver.findElement(By.xpath("//span[text()='Enabled']")).click();
	
	
		
				

	}

}
