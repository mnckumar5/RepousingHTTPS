package Jan21class;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterdemoagain 

{
	
	@Parameters("Parametersname")
	@Test
	public void test33(@Optional("Firefox") String browser)
	{
		System.out.println("Thread id is"+Thread.currentThread().getId());
		
		System.out.println("Thread id is"+Thread.currentThread().getName());
		Reporter.log("Browser name is "+browser,true);
	}

}
