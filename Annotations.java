package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@AfterMethod
	public void am()
	{
		System.out.println("After Method");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method");
	}
	@Test
	public void amethod()
	{
		System.out.println("Second Method");
	}
	@Test                                                                                                                                                                                                                                                    
	public void myntra()
	{
		System.out.println("Myntra");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void ac()
	{                                
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void bs()
	{
	     System.out.println("Before Suite");	
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("After Suite");
	}
}



