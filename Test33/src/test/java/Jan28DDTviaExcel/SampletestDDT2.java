package Jan28DDTviaExcel;


import org.testng.annotations.Test;

import Helper.CustomDataProvider;

import Helper.Excelreadercorrect;

public class SampletestDDT2 

{
	@Test(dataProvider = "EmpDataSet",dataProviderClass =CustomDataProvider.class)
	public void sample(String fname,String lname,String mailid,String Cost,String Location)
	{
		System.out.println("**********Test Started*********");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(mailid);
		System.out.println(Cost);
		System.out.println(Location);
		
		System.out.println("**********Test Ended*********");
	}}
	