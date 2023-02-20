package Jan14th;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadDirectory {

	public static void main(String[] args) 
	
	{
ChromeOptions op=new ChromeOptions();
		
		Map<String, Object> map=new HashMap<String,Object>();
		
		
			
		map.put("download.default_directory","C:\\Users\\W8.1\\Desktop\\MP3");
		
		op.setExperimentalOption("prefs",map);
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://the-internet.herokuapp.com/download");
		
		driver.findElement(By.xpath("//a[normalize-space()='1.png']")).click();
		

	}

}
