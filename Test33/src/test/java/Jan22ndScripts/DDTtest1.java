package Jan22ndScripts;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTtest1 

{
	@Test(dataProvider="logindata")
	public void test1(String UN,String PWD)
	{
		Reporter.log(UN,true);
		
		Reporter.log(PWD,true);
		
		//DataProvider - Data Driven Test
		//Everyday in our Framework we will be using Dataprovider
		//DataProvider is nothing but it will provide the Data to the Test.
		
	}
		
		@DataProvider(name="logindata")
		public Object[][] getdata()
		{
			Object[][] arr=new Object[3][2];
			
			arr[0][0]="Rishi1";
			arr[0][1]="Ravi1";
			
			arr[1][0]="Rishi2";
			arr[1][1]="Ravi2";
			
			arr[2][0]="Rishi3";
			arr[2][1]="Ravi3";
			
			
			return  arr;
			
			
		}
	

}
