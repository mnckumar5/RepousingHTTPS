package Jan28DDTviaExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helper.Excelreader;

public class SampletestDDT 

{
	@Test(dataProvider = "Sampletest")
	public void sample(String fname,String lname,String mailid)
	{
		System.out.println("**********Test Started*********");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(mailid);
		
		System.out.println("**********Test Ended*********");
	}
	
	
	
	@DataProvider(name="Sampletest")
	public Object[][] getData()
	{
		Object[][]arr=Excelreader.getDataFromSheet("EMP1");
		return arr;	
	}

}
