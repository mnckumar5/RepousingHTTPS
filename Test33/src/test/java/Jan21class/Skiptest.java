package Jan21class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skiptest 

{
    @Test
	public void login()
	{
    	Assert.assertTrue(false);
		Reporter.log("Login Successfull",true);
	}
	
    @Test(dependsOnMethods="login")
	public void logout()
	{
		Reporter.log("Logout Successfull",false);
	}
}
