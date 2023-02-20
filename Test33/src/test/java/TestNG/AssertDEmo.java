package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDEmo 

{
	@Test
  public void test1()
  {
	  Assert.assertEquals(12, 12,"Mismatch is there in test1");	  
	    
  }
	@Test
	public void test2()
	{
		Assert.assertEquals(22, 22, "Mismatch is there in test2");
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("Selenium for", "Selenium for");
	}
	@Test
	public void test4()
	{
		String cst="Empid is 6789";
		
		Assert.assertEquals(cst.contains("89"), true);
	}
	@Test
	public void test5()
	{
		String cus="Customer id is 6789";
		
		Assert.assertTrue(cus.contains("6789"));
		//Assert.assertTrue(cus.contains("456"));
				
	}
	
	
	
	
}
