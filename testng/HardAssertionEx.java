package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionEx {
//Hard Assert
	@Test
	void m() {
      	System.out.println("Before Hard Assert");
		Assert.assertEquals(true, true);  //failed
		System.out.println("After Hard Assert");
	}
	
// SoftAssert 	
	@Test
	void m1() {
	
	SoftAssert sf= new 	SoftAssert();
	System.out.println("Before Soft Assert");

		sf.assertEquals(false, true);
		System.out.println("After Soft Assert");

	    sf.assertAll();
	}

}	
	
	
	
	
	
	

