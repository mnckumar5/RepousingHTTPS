package Jan07class;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Webelementscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
WebDriver driver=new ChromeDriver();
		

driver.get("https://www.google.com/");
Thread.sleep(10);
WebElement element = driver.findElement(By.xpath("//input[@name='btnK']"));
Screenshot screenshotHeader = new AShot().coordsProvider(new WebDriverCoordsProvider()).shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver, element);
 try {
     ImageIO.write(screenshotHeader.getImage(),"jpg" ,new File("./Google.jpg"));
 } catch (IOException e) {
     e.printStackTrace();
 }
	}


	}


