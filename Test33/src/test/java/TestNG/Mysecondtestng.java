package TestNG;

import org.testng.annotations.Test;

public class Mysecondtestng 

{
	@Test(priority=1)
	public void login()
	{
		System.out.println("logged in Successfully");
	}
	@Test(priority=2)
	public void Createaccount()
	{
		System.out.println("Created account Successfully");
	}
	@Test(priority=3)
	public void Payment()
	{
		System.out.println("Payment done Successfully");
	}
	@Test(priority=4)
	public void logout()
	{
		System.out.println("Logged out  Successfully");

	}
	

}
