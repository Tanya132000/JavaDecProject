package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnimalsEx {

	@BeforeTest
	void dog() {
		System.out.println("Dog");
	}
	
	@Test
	void monkey() {
		System.out.println("monkey");

	}
	
	
    @AfterTest	
	void cat() {
		
		System.out.println("Cat");
		
	}
	
	
}
