package Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement warning1=driver.findElement(By.xpath("(//span[text()='Required'])[1]"));
		
		String text1=warning1.getText();
		
		System.out.println("Required field is present for username:"+text1);
		
		WebElement warning2=driver.findElement(By.xpath("(//span[text()='Required'])[2]"));
		
		String text2=warning2.getText();
		
		System.out.println("Required field is present for password:"+text2);
		
		WebElement UN=driver.findElement(By.xpath("//input[@name='username']"));
		
		String px1=UN.getCssValue("border");
		
		System.out.println("Border for UN:"+px1);
		
		WebElement Pwd=driver.findElement(By.xpath("//input[@name='password']"));
		
		String px2=UN.getCssValue("border");
		
		System.out.println("Border for Pwd:"+px2);

	}

}
