package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	public static void main(String[] args) throws InterruptedException 
	
	{

		{
	        WebDriver driver=new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(4000);		
			WebElement Linkedin=driver.findElement(By.xpath("(//a)[1]"));
			String text=Linkedin.getAttribute("href");
			
			System.out.println("Linkedin URL :"+text);
			
											
			
			
	        WebElement Facebook=driver.findElement(By.xpath("(//a)[2]"));
	        
	        String text1=Facebook.getAttribute("href");
	        System.out.println("Facebook URL :"+text1);
	          
			
		
			
	        WebElement Twitter=driver.findElement(By.xpath("(//a)[3]"));
	        
	        String text2=Twitter.getAttribute("href");
	        System.out.println("Twitter URL :"+text2);
			
			
			
			 WebElement Youtube=driver.findElement(By.xpath("(//a)[4]"));
			 String text3=Youtube.getAttribute("href");
			 System.out.println("Youtube URL :"+text3);
				
				
				
				driver.quit();
		}

	}
	}


