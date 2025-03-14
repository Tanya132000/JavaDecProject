package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuit {
	
@BeforeSuite
void a() {
	System.out.println("A");
}


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
	    @AfterSuite
	    void b() {
	    	System.out.println("B");
	    }
		
}
