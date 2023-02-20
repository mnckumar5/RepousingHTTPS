package Jan_29ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.Utility;

public class Logintestusingpom extends Baseclass

{
    @Test
	public void login()
	{
    	Homepage home=new Homepage(driver);
    	
    	home.clickonloginbutton();
		loginpage obj=new loginpage(driver);
		
		obj.logintoapplication("ineuron@ineuron.ai","ineuron");
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[contains(.,'Sign out')]")).isDisplayed());
		
		
	}
	
	
	
	
	
}
