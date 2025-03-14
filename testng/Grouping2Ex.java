package testng;

import org.testng.annotations.Test;

public class Grouping2Ex {
	@Test(groups="Functional")

	void Tanya() {
		System.out.println("Functional");

	}
	@Test(groups="sanity")

void Kumari() {
	System.out.println("sanity");

	}
	@Test(groups="regression")

void Gupta() {
	System.out.println("regression");

}
	
	
	
	
	
	
	
}
