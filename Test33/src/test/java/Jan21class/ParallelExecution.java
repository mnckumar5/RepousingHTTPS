package Jan21class;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution 

{
	@Test
	public void test1()
	{
	 System.out.println("Thread number 1 is "+Thread.currentThread().getId());	
	 Reporter.log("Test1 is executed",true);
	 System.out.println("Thread number 1 is "+Thread.currentThread().getName());
	}
	
	@Test
	public void test2()
	{
	 System.out.println("Thread number 2 is "+Thread.currentThread().getId());	
	 Reporter.log("Test2 is executed",true);
	 System.out.println("Thread number 1 is "+Thread.currentThread().getName());
	}
	
	@Test
	public void test3()
	{
	 System.out.println("Thread number 3 is "+Thread.currentThread().getId());	
	 Reporter.log("Test3 is executed",true);
	 System.out.println("Thread number 1 is "+Thread.currentThread().getName());
	}
	
	
	
	
	

}
