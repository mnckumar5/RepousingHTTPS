package Jan08class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS1 {

	public static void main(String[] args) 
	
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		//driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]")).click();
		
		driver.findElement(By.xpath("//label[.='Stay signed in']")).click();
		
		
		

	}

}
