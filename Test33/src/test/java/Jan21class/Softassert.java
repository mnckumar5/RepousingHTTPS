package Jan21class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert 

{
	@Test
	public void test1()
	{
		Reporter.log("Test1 started",true);
		Assert.assertTrue(false);
		Reporter.log("Test1 ended",true);
	}
    @Test
	public void test2()
	{
		Reporter.log("Test2 started",true);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(false);
		
		Reporter.log("Test2 ended",true);
		sa.assertAll();
	}
	
	
}
