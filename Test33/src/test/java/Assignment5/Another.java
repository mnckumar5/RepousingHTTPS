package Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Another {

	public static void main(String[] args) throws InterruptedException 
	
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
		WebElement Linkedin=driver.findElement(By.xpath("(//a)[1]"));
		String text=Linkedin.getAttribute("href");						
		
		
        WebElement Facebook=driver.findElement(By.xpath("(//a)[2]"));
        
        String text1=Facebook.getAttribute("href");
        
		
        WebElement Twitter=driver.findElement(By.xpath("(//a)[3]"));
        
        String text2=Twitter.getAttribute("href");
        
		
		
		 WebElement Youtube=driver.findElement(By.xpath("(//a)[4]"));
		 String text3=Youtube.getAttribute("href");
		 
		 String Var[]= {text,text1,text2,text3};
		 
		 int Var4[]= {10,20,30,40};
		 
		 for (String var2:Var)
		 {
			 System.out.println("Value is :"+var2);
			 
		 }
		 
		 for (int var5:Var4)
		 {
			 System.out.println("Value is :"+var5);
		 }
		 
		 
		 driver.quit();
	}

	}


