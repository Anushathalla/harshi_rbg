package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGDemo3 
{

	@Test(priority = 2)
	public void funA()
	{
		System.out.println(" FunA of TestNGDemo3");
	}
	
	@Test(priority = 4)
	public void funB()
	{
		System.out.println(" FunB of TestNGDemo3");

	}
	
	@Test( priority = 1)
	public void funC()
	{
		System.out.println(" FunC of TestNGDemo3");
	}
	
	@Test(priority =3)
	public void funD()
	{
		System.out.println(" FunD of TestNGDemo3");

	}
}
