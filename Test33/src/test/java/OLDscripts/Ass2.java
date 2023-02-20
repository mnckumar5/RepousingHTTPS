
package OLDscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass2 {

	public static void main(String[] args) throws InterruptedException 
	
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/signup");
		
		Thread.sleep(3000);
		
		boolean statusBefore=driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).isEnabled();
		
		System.out.println("Status before entering values "+statusBefore);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mukesh Otwani");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MukeshOtwaniselenium5@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mukesh1489");
		
		driver.findElement(By.xpath("//label[normalize-space()='Testing']")).click();
		
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		new Select(driver.findElement(By.xpath("//select[@id='state']"))).selectByVisibleText("Goa");
		
		boolean statusAfter=driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).isEnabled();
		
		System.out.println("Status before entering values "+statusAfter);
		
	}

}
