package Assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {

	public static void main(String[] args) 
	
	{
		 WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector("a[ajaxify$='/reg/spotlight/']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.findElement(By.cssSelector("input[aria-label$='First name']")).sendKeys("Test");
			
			driver.findElement(By.cssSelector("input[aria-label$='Surname']")).sendKeys("user");
			
			driver.findElement(By.cssSelector("input[aria-label$='Mobile number or email address']")).sendKeys("9999999999");
			
			//driver.findElement(By.cssSelector(""));
			
			driver.findElement(By.cssSelector("input[aria-label*='New password']")).sendKeys("password");
			
			driver.findElement(By.cssSelector("select[aria-label$='Day']"));
			
			driver.findElement(By.cssSelector("select[aria-label$='Month']"));
			
			driver.findElement(By.cssSelector("select[aria-label$='Year']"));
			
			driver.findElement(By.cssSelector("label[class$='_58mt']")).click();
			
			driver.findElement(By.cssSelector("label[class$='_58mt']"));
			
			//driver.findElement(By.xpath("//label[text()='Custom']"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.findElement(By.cssSelector("button[name$='websubmit']")).click();
			
			

	}

}
