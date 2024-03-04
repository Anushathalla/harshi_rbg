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

public class TestNGAnnotationDemo2 
{
	@Test
	public void funA()
	{
		System.out.println(" funA of  TestNGAnnotationDemo2");	
	}

	@Test
	public void funB()
	{
		System.out.println("funB of TestNGAnnotationDemo2");
	}

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass  of TestNGAnnotationDemo2");
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println(" afterclass of TestNGAnnotationDemo2");
	}

	@BeforeMethod

	public void beforemethod()
	{
		System.out.println("beforemethod  of TestNGAnnotationDemo2");

	}

	@AfterMethod
	public void  aftermethod()
	{
		System.out.println(" aftermethod of TestNGAnnotationDemo2");
	}

	@BeforeSuite
	public void  beforesuite()
	{
		System.out.println(" beforesuite of TestNGAnnotationDemo2");
	}

	@AfterSuite
	public void aftersuite ()
	{
		System.out.println("aftersuite of TestNGAnnotationDemo2");
	}

	@BeforeTest
	public void beforeTets()
	{
		System.out.println("beforeTets of TestNGAnnotationDemo2");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("afteTest of TestNGAnnotationDemo2");
	}


}
