package TestNGDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo4 
{
	@Test
	public void funA()
	{
		System.out.println("funA of TestNGAnnotationDemo4");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass of TestNGAnnotationDemo4");
	}

	@BeforeMethod	
	public void beforemethod()
	{
		System.out.println("beforemethod of TestNGAnnotationDemo4");
	}
	@BeforeSuite	
	public void beforesuite()
	{
		System.out.println("beforesuite of TestNGAnnotationDemo4");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest of  TestNGAnnotationDemo4");
	}
}
