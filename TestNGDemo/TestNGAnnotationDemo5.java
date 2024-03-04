package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationDemo5 
{
	@Test
	public void funA()
	{
		System.out.println("funA of TestNGAnnotationDemo5");
	}

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass of  TestNGAnnotationDemo5");	
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass of TestNGAnnotationDemo5");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod of TestNGAnnotationDemo5");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod of TestNGAnnotationDemo5");
	}

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite of TestNGAnnotationDemo5");
	}

	@AfterSuite
	public void aftersuite()
	{
		System.out.println("aftersuite of TestNGAnnotationDemo5");
	}

	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforemethod of TestNGAnnotationDemo5");
	}
	@AfterTest

	public void aftertest()
	{
		System.out.println("aftermethod of TestNGAnnotationDemo5");
	}
}










