package Browserstack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BIGSUR {

	public static void main(String[] args) throws MalformedURLException 
	
	{
DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setCapability("os", "OS X");
		caps.setCapability("osVersion", "Big Sur");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("browserVersion", "108.0");
		
		URL SG=new URL("http://chandankumar_XGhP6K:jGpNVBFk2cQCUyqyb3iS@hub.browserstack.com/wd/hub");
	
		WebDriver driver=new RemoteWebDriver(SG,caps);
		
		driver.get("https://learn-automation.com/");
		
		System.out.println("Title is"+driver.getTitle());
		
		System.out.println("Title is"+driver.getCurrentUrl());
		
		System.out.println("Title is"+driver.hashCode());
		driver.quit();

	}

}
