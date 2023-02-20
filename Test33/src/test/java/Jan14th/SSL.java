package Jan14th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL {

	public static void main(String[] args) 
	
	{
		ChromeOptions opt=new ChromeOptions();
		
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.cacert.org/");
		
		System.out.println("Title is"+driver.getTitle());
		
		

	}

}
