package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo1 
{
	@Test
	public void funA()
	{
		System.out.println("funA of HardAssertionsDemo1");
		String expected = "selenium";
		String actual  = "selenium";
		Assert.assertEquals(actual,expected);
		System.out.println("funA is Done");
	}

	@Test
	public void funB()
	{
		System.out.println("funB of HardAssertionsDemo1");
		String expected = "selenium";
		String actual  = "java";
		Assert.assertEquals(actual,expected);
		System.out.println("funB is Done");
	}
	@Test
	public void funC()
	{
		System.out.println("funC of HardAssertionsDemo1");
		String expected = "selenium";
		String actual  = "java";
		Assert.assertEquals(actual,expected);
		System.out.println("funC is Done");


	}

	@Test
	public void funD()
	{
		System.out.println("funD of HardAssertionsDemo1");
		String expected = "selenium";
		String actual  = "java";
		Assert.assertEquals(actual,expected);
		System.out.println("funD is Done");
	}
	@Test
	public void funE()
	{
		System.out.println("funE of HardAssertionsDemo1");
		Assert.assertTrue(true);
		System.out.println("funE of Done");

	}

	@Test
	public void funF()
	{
		System.out.println("funF of HardAssertionsDemo1");
		Assert.assertTrue(false);
		System.out.println("funF of Done");
	}	

	@Test
	public void funG()
	{
		System.out.println("funG of HardAssertionsDemo1");
		Assert.assertFalse(false);
		System.out.println("funG of Done");

	}

	@Test
	public void funH()
	{
		System.out.println("funH of HardAssertionsDemo1");
		Assert.assertFalse(true);
		System.out.println("funH of Done");


	}
}

