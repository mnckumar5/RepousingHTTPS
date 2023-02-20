

package OLDscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment10thdec {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("ineuron@ineuron.ai");
		
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("ineuron");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		
		WebElement element5=driver.findElement(By.xpath("//span[text()='Manage']"));
		
		Actions act5=new Actions(driver);
		
		act5.moveToElement(element5).perform();
		
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//span[text()='Manage Courses']")).click();
		
		//driver.findElement(By.xpath("//th[text()='Course Name']")).click();
		Thread.sleep(3000);
		
		WebElement course1=driver.findElement(By.xpath("//button[text()='Add New Course ']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",course1);
		
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='thumbnail']")).sendKeys("C:\\Users\\W8.1\\Desktop\\test3.jpg");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("testcourse3");
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Chandan Kumar");
		
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Description");
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("1000");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='startDate']")).click();
		
		driver.findElement(By.xpath("//div[text()='25']")).click();
		
        driver.findElement(By.xpath("//input[@name='endDate']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'18')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Select Category')]")).click();

		
		driver.findElement(By.xpath("//button[contains(.,'Testing')]")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(4000);
		
		WebElement text=driver.findElement(By.xpath("(//input[@type='checkbox'])[10]//following::td[1]"));
		
		String text1=text.getText();
		
		if (text1.contains("testcourse3"))
		{
			System.out.println("course is present");
		}
			else
			{
				System.out.println("course is not present");
			}
		
		Thread.sleep(6000);
		
		//WebElement clickCB=driver.findElement(By.xpath("(//input[@type='checkbox'])[10]"));
			
		
		WebElement DeleteB=driver.findElement(By.xpath("(//button[@class='action-btn delete-btn'])[10]"));
		
		js.executeScript("arguments[0].click()", DeleteB);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
				
		driver.quit();
		
			}

}
