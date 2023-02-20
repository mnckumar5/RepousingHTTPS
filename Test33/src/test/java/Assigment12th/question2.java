package Assigment12th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Helper.Utility;

public class question2 
{


@Parameters("Browser")
@Test
public void login(String browserName)
{
		
	{
		
		WebDriver driver=Utility.startBrowser(browserName, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
        //WebDriver driver=new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Utility.waitforseconds(9);
		
		
		//WebElement logo=driver.findElement(By.xpath("//img"));
		
		List<WebElement> logos=driver.findElements(By.xpath("//img"));
		
		     int size=logos.size();
				
		Assert.assertEquals(size=3, 3, "wrong number of images");	
		
		
		driver.quit();

	}

}}
