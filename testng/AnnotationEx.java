package testng;

import org.testng.annotations.Test;

public class AnnotationEx {

	@Test(priority=4)
	
	void m1() {
	System.out.println("m1 method");	
	}	
	@Test(priority=3)

void m2() {
	System.out.println("m2 method");	

	}	
	
	@Test(priority=1)

void m3() {
	System.out.println("m3 method");	

}	
	@Test(priority=2)

void m4() {
	System.out.println("m4 method");	

}	

		
}
