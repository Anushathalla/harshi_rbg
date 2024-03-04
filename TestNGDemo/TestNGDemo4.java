package TestNGDemo;


import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDemo4 
{

	@Test
	public void funA()
	{
		System.out.println(" FunA of TestNGDemo4");
	}

	@Test
	public void funB()
	{
		System.out.println(" FunB of TestNGDemo4");
		System.out.println(0/0);
	}

	@Test
	public void funC() throws Exception
	{
		System.out.println(" FunC of TestNGDemo4");
		//throw new Exception();
		throw new SkipException("skipexcption error message");
	}

	@Test(enabled  = false)
	public void funD()
	{
		System.out.println(" FunD of TestNGDemo2");

	}
}
