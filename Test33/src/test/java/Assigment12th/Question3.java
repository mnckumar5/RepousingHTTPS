package Assigment12th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Helper.Utility;
public class Question3 

{
@Parameters("Browser")
@Test
public void login(String browserName)
{
		
	{
		
	
		WebDriver driver=Utility.startBrowser(browserName, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Utility.waitforseconds(9);	
			WebElement Linkedin=driver.findElement(By.xpath("(//a)[1]"));
			
			String text5=driver.getTitle();
			Reporter.log(text5,true);	
			
							
							
				driver.quit();
		}

	}


	}


