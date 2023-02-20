

package OLDscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentsecondtenth {

	public static void main(String[] args) throws InterruptedException 
	
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		Thread.sleep(6000);
		
		boolean disabled=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		
		System.out.println(disabled);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Chandan Kumar");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mnc.kumar54333@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		
		WebElement RB=driver.findElement(By.xpath("//label[text()='Male']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()", RB);
		
		//Thread.sleep(5000);
		
		
		WebElement state=driver.findElement(By.xpath("//select[@id='state']"));
		
		//js.executeScript("arguments[0].click()", state);
		
		Select obj=new Select(state);
		
		obj.selectByVisibleText("Karnataka");
		
		boolean Enabled=driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
		
		System.out.println(Enabled);
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("mnc.kumar54333@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		
		driver.quit();
		

	}

}
