package Jan08class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPrograms {

	public static void main(String[] args) 
	
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById(\"login-username\").value='Narayana'");
		
		js.executeScript("document.getElementById(\"persistent\").click()");
	
	}

}
