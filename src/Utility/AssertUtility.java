package Utility;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertUtility
{

	public static void main(String[] a)
	{
		int x = 10, y=20;
		
		String expected = "London";
		String actual = "Paris";
		
		//compares actual vs expected parameter
		//Assert.assertEquals(actual, expected);
	
		
		//compares for not equal
		//Assert.assertNotEquals(actual, expected);
		
		boolean b = false;
		//will check wether the parameter has false value or not
		//Assert.assertFalse(b);
		
		
		// will check whether the parameter has true
		//Assert.assertTrue(b);
		
		
		//explicit fail
		//Assert.fail();
		
		//explicit fail with a message
		//Assert.fail("This is explicit fail");
		
		String str = null;
		//check for Null in the object
		//Assert.assertNull(str);
		
		//check for not null
		//Assert.assertNotNull(str);
		
		SoftAssert s = new SoftAssert();
		s.assertNull(str);
		
		
		System.out.println("After assertion passes");
	}
	
}
