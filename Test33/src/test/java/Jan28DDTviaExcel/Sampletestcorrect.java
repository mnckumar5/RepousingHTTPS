package Jan28DDTviaExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helper.Excelreader;
import Helper.Excelreadercorrect;

public class Sampletestcorrect

{
	@Test(dataProvider = "Sampletest")
	public void sample(String Fname,String Lname,String Mailid,String Cost,String Location)
	{
		System.out.println("**********Test Started*********");
		
		System.out.println(Fname);
		System.out.println(Lname);
		System.out.println(Mailid);
		System.out.println(Cost);
		System.out.println(Location);
		
		System.out.println("**********Test Ended*********");
	}
	
	
	
	@DataProvider(name="Sampletest")
	public Object[][] getData()
	{
		Object[][]arr=Excelreadercorrect.getDataFromSheet("EMP1");
		return arr;	
	}

}
