package Jan21class;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterdemo 

{
	
	@Parameters("Browser")
    @Test
	public void test1(@Optional("chrome") String browser)
	{
		Reporter.log("Browser name is "+browser,true);
	}
	
	
}
