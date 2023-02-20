package Jan28DDTviaExcel;

import org.testng.annotations.Test;

import Helper.ConfigReader;

public class ReadingConfiguration3 

{
    @Test
	public void test()
	{
		String port=ConfigReader.getProperty("port");
		
		String prodURL=ConfigReader.getProperty("prodURL");
		
		System.out.println(port);
		
		System.out.println(prodURL);
	}
	
}
