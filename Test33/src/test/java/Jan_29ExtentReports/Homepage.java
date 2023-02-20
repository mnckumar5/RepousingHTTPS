package Jan_29ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage 
{
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By lgbt=By.xpath("//button[contains(.,'Log in')]");
	
	public void clickonloginbutton()
	{
		driver.findElement(lgbt).click();
	}

}
