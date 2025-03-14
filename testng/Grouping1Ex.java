package testng;

import org.testng.annotations.Test;

public class Grouping1Ex  {
	@Test(groups="sanity")
	void Milk() {
		System.out.println("Regression");

	}
	@Test(groups="regression")

void Curd() {
	System.out.println("Regression");

	} 
	@Test(groups="functional")

	
void Ghee() {
	System.out.println("Regression");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
