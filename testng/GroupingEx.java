package testng;

import org.testng.annotations.Test;

public class GroupingEx {
@Test(groups="sanity")
	void Cat() {
		System.out.println("Sanity");
	}
@Test(groups="Regression")
void Dog() {
	System.out.println("Regression");

	}
@Test(groups="Functional")
void Monkey() {
	System.out.println("Functional");

}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
