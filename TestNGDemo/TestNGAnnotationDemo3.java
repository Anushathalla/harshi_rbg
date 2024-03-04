package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo3 
{
	@Test
	public void funA()
	{
		System.out.println(" funA of TestNGAnnotationDemo3");
	}
	@AfterClass()
	public void  afterclas()
	{
		System.out.println("afterclas of TestNGAnnotationDemo3");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod of TestNGAnnotationDemo3");
	}

	@AfterSuite
	public void aftersuite()
	{
		System.out.println("aftersuite of TestNGAnnotationDemo3");

	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest of TestNGAnnotationDemo3");
	}

}
