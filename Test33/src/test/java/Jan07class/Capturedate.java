package Jan07class;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.devtools.v106.database.Database;

public class Capturedate {

	public static void main(String[] args) 
	
	{
		Date d=new Date();
		
		System.out.println(d);
		
		SimpleDateFormat customDateFormat=new SimpleDateFormat("HH:mm : dd_MM");
		
		String date=customDateFormat.format(d);
		
		System.out.println(date);

	}

}
