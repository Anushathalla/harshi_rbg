package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGgroupDemo1 
{


	@Test(groups = "Sanity")
	public void funA()
	{
		System.out.println(" FunA of TestNGgroupDemo1 ");
	}
	
	@Test(groups = "Sanity")
	public void funB()
	{
		System.out.println(" FunB of TestNGgroupDemo1");

	}
	
	@Test(groups = "Regression")
	public void funC()
	{
		System.out.println(" FunC of TestNGgroupDemo1");
	}
	
	@Test(groups = "Regression")
	public void funD()
	{
		System.out.println(" FunD of TestNGgroupDemo1");

	}

}
