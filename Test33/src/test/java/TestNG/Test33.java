package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class Test33 {

	public static void main(String[] args) 
	
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		Utility.waitforseconds(5);
		
		
		List<WebElement>   emnt=driver.findElements(By.xpath("//img"));
		
		int count=emnt.size();
		
		System.out.println(count);
	}

}
