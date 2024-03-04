package TestNGDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class SoftAssertionDemo1 
{
	public void funA()
	{
		System.out.println("funA of  SoftAssertionDemo1");
		String expected = "Selenium";
		String  actaul  = "selenium";
		SoftAssert sAssert = new  SoftAssert();
		sAssert.assertEquals(actaul,expected);	
		System.out.println("Testcase1 is completed");

		String expected2 = "selenium";
		String actual2 = " selenium";
		sAssert.assertEquals(expected2, actual2);
		System.out.println("Testcase2 is completed");

		String expected3 = "selenium";
		String actual3 = " selenium";
		sAssert.assertTrue(true);
		System.out.println("Testcase3 is completed");

		String expected4 = "selenium";
		String actual4 = " selenium";
		sAssert.assertTrue(false);
		System.out.println("Testcase4 is completed");

		String expected5 = "selenium";
		String actual5 = " selenium";
		sAssert.assertTrue(false);
		System.out.println("Testcase5 is completed");


		String expected6 = "selenium";
		String actual6 = " selenium";
		sAssert.assertTrue(true);
		System.out.println("Testcase6 is completed");
		sAssert.assertAll();
	}
}




