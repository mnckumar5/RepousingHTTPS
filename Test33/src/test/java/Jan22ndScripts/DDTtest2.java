package Jan22ndScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helper.Utility;

public class DDTtest2 
{

WebDriver driver;


@BeforeMethod
public void setup()
{
	Reporter.log("Opening the Application",true);
	driver=Utility.startBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}


@AfterMethod	
public void closesession()
{
	Reporter.log("Closing the Application",true);
	driver.quit();
}
	
	
	
	
	
	@Test(dataProvider="logindata")

		public void test1(String UN,String PWD)

	{
		
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PWD);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		
		Utility.waitforseconds(5);
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		Utility.waitforseconds(2);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("rangehrmlive"));
	}
		
		@DataProvider(name="logindata")
		public Object[][] getdata()
		{
			Object[][] arr=new Object[5][2];
			
			arr[0][0]="Admin4";
			arr[0][1]="admin123";
			
			arr[1][0]="Admin4";
			arr[1][1]="admin123345";
			
			arr[2][0]="Admin2";
			arr[2][1]="admin123";
			
			arr[3][0]="Admin";
			arr[3][1]="admin123d";
			
			arr[4][0]="Admin";
			arr[4][1]="admin123";
			
			
			
			return  arr;
			
			
		}
	

}
