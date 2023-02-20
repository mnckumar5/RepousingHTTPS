package TestNG;

import org.testng.annotations.Test;

public class MyfirsttestngTest 

{
    @Test(description="First Test")
	public void test1()
	{
		System.out.println("Test1 Executed");
	}
	
    @Test(description="Second Test")
	public void test2()
	{
		System.out.println("Test2 Executed");
	}
	
    @Test(description="Third Test")
	public void test3()
	{
		System.out.println("Test3 Executed");
	}
}
